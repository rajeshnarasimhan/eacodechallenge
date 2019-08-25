package com.ea.eacodechallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.ea.eacodechallenge.model.Festival;
import com.google.gson.Gson;

/**
 * Main class to sort Energy Australia festival API response as per required format 
 * @author Rajesh
 *
 */

public class EacodechallengeApplication {
	
	private static final Logger log = LoggerFactory.getLogger(EacodechallengeApplication.class);
	
	private static final String URI = "http://eacodingtest.digital.energyaustralia.com.au/api/v1/festivals";

	public static void main(String[] args) {
		log.info("Application Started.");
		List<Festival> festivals = readDataFromApi(URI);
		if(festivals != null && festivals.size()>0){
			printFestivalList(festivals);
			Map<String, Map<String, List<String>>> transformedData = new HashMap<String, Map<String,List<String>>>();
			transformedData = transformData(festivals);
			printTransformedDataAsJson(transformedData);
			printTransformedDataAsRequiredFormat(transformedData);
		}		
	}
	
	/**
	 * Read API response and returns list of Festivals object
	 * @param uri
	 * @return
	 */
	public static List<Festival> readDataFromApi(String uri) {
		List<Festival> festivals = null;
		if(uri != null && !uri.isEmpty()){
			try{
				log.info("Reading data from Api. API==[{}]", uri);
				RestTemplate restTemplate = new RestTemplate();
		        ResponseEntity<List<Festival>> response = restTemplate.exchange(uri, HttpMethod.GET, null, new ParameterizedTypeReference<List<Festival>>(){});
		        log.info("Response from Api is [{}]", response);
		        log.info("Response body==[{}]", response.getBody());
		        festivals = response.getBody();
		        log.info("FestivalList is [{}]", festivals);
			}catch(Exception e){
				festivals = new ArrayList<>();
			}			
		}
        return festivals;
	}
	
	/**
	 * Method to print response details
	 * @param festivals
	 */
	public static void printFestivalList(List<Festival> festivals) {
		log.info("Printing data from festival list. Size==[{}]", festivals.size());
		festivals.forEach( festival -> {
			log.info("***************************************************************************");
			log.info("Festival==[{}] Bands==[{}]", festival.getName(), festival.getBands().size());
			festival.getBands().forEach( band -> {
				log.info("\tBand==[{}] Label==[{}]", band.getName(), band.getRecordLabel());
			});
			log.info("***************************************************************************");
		});
	}
	
	/**
	 * Method to transform list of festivals object to nested map (with sorting) recordLabel as key of outerMap and bandName as key of innerMap
	 * @param festivals
	 * @return
	 */
	public static Map<String, Map<String, List<String>>> transformData(List<Festival> festivals) {
		log.info("Transforming Festival data.");
		Map<String, Map<String, List<String>>> transformedData = new TreeMap<String, Map<String,List<String>>>();
		festivals.forEach( festival -> {
			if(festival.getBands()!=null && festival.getBands().size() > 0){
				festival.getBands().forEach( band -> {
					log.info("***************************************************************************");
					String label = band.getRecordLabel() == null ? "[NULL]" : band.getRecordLabel();
					String bandName = band.getName() == null ? "[NULL]" : band.getName();
					String festivalName = festival.getName();
					log.info("Transforming data for Festival==[{}] Band==[{}] Label==[{}]", festivalName, bandName, label);
					Map<String, List<String>> bandMap;
					List<String> festivalList;
					if(transformedData.containsKey(label)) { 
						bandMap = transformedData.get(label);
						if(bandMap.containsKey(bandName)) {
							festivalList = bandMap.get(bandName);
							festivalList.add(festivalName);
							Collections.sort(festivalList);
						} else {
							festivalList = new ArrayList<String>();
							festivalList.add(festivalName);
							bandMap.put(bandName, festivalList);
						}
					} else {
						bandMap = new TreeMap<String, List<String>>();
						festivalList = new ArrayList<String>();
						festivalList.add(festivalName);
						bandMap.put(bandName, festivalList);
						transformedData.put(label, bandMap);
					}
					log.info("***************************************************************************");
				});
			}			
		});
		log.info("Transformed Festival data...");
		log.info("=============[{}]===========", transformedData);
		return transformedData;
	}
	
	/**
	 * Utility method to print transformed data as JSON string
	 * @param transformedData
	 */
	public static void printTransformedDataAsJson(Map<String, Map<String, List<String>>> transformedData) {
		if(transformedData != null && !transformedData.isEmpty()){
			log.info("Printing Transformed data in json.");
			Gson gson = new Gson();
			String jsonString = gson.toJson(transformedData);
			log.info("Json data...");
			log.info("=============[{}]===========", jsonString);
		}		
	}
	
	/**
	 * Utility method to print transformed data as per below format
	 * <
	 * Record Label 1
	 * 	Band X
	 * 		Omega Festival
	 * 	Band Y
	 * Record Label 2
	 * 	Band A
	 * 		Alpha Festival
	 * 		Beta Festival
	 * >  
	 * @param transformedData
	 */
	public static void printTransformedDataAsRequiredFormat(Map<String, Map<String, List<String>>> transformedData) {
		if(transformedData != null && !transformedData.isEmpty()){
			log.info("Printing Transformed data as Required Format in LOGGER/TERMINAL.");
			transformedData.forEach( (label, bandMap) -> {
				log.info("***************************************************************************");
				log.info("[{}]", label);
				bandMap.forEach((bandName,festivalList) -> {
					log.info("\t[{}]", bandName);
					festivalList.forEach( festival -> {
						log.info("\t\t[{}]", festival);
					});
				});
			});
		}		
	}
}