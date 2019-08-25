package com.ea.eacodechallenge.model;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Festival implements Serializable {
	
	/**
	 * default value for serial version uid
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private List<Band> bands;
	
	public String getName() {
		return name;
	}
	public Festival setName(String name) {
		this.name = name;
		return this;
	}
	
	public List<Band> getBands() {
		return bands;
	}
	public Festival setBands(List<Band> bands) {
		this.bands = bands;
		return this;
	}
	public Festival addBand(Band band) {
		this.getBands().add(band);
		return this;
	}
	
	@Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}