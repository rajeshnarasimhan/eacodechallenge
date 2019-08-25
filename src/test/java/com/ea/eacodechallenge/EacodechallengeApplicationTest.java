package com.ea.eacodechallenge;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ea.eacodechallenge.model.Band;
import com.ea.eacodechallenge.model.Festival;

/**
 * Test class for EacodechallengeApplication
 * @author Rajesh
 *
 */
public class EacodechallengeApplicationTest {
	
	private static final String URI = "http://eacodingtest.digital.energyaustralia.com.au/api/v1/festivals";

	/**
	 * Test method for readDataFromApi
	 */
	@Test
	public final void testReadDataFromApi(){
		assertTrue(null == EacodechallengeApplication.readDataFromApi(null));
		assertTrue(null != EacodechallengeApplication.readDataFromApi(URI));
	}

	/**
	 * Test method for transformData
	 */
	@Test
	public final void testTransformData() {
		Festival festivalA = new Festival();
		festivalA.setName("festivalA");
		Band bandA = new Band();
		bandA.setName("bandA");
		bandA.setRecordLabel("recordLabelA");
		Band bandB = new Band();
		bandB.setName("bandB");
		bandB.setRecordLabel("recordLabelB");
		festivalA.setBands(new ArrayList<>());
		festivalA.getBands().add(bandB);
		festivalA.getBands().add(bandA);
		
		Festival festivalB = new Festival();
		festivalB.setName("festivalB");
		Band bandC = new Band();
		bandC.setName("bandC");
		bandC.setRecordLabel("recordLabelC");
		Band bandD = new Band();
		bandD.setName("bandD");
		bandD.setRecordLabel("recordLabelD");
		festivalB.setBands(new ArrayList<>());
		festivalB.getBands().add(bandD);
		festivalB.getBands().add(bandC);
		
		List<Festival> festivals = new ArrayList<>();
		festivals.add(festivalB);
		festivals.add(festivalA);
		assertTrue(EacodechallengeApplication.transformData(festivals).get("recordLabelA").get("bandA").get(0).equals("festivalA"));
		
		
	}

}
