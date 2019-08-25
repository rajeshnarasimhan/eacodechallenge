package com.ea.eacodechallenge.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Band implements Serializable {
	
	/**
	 * default value for serial version uid
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String recordLabel;
	
	public String getName() {
		return name;
	}
	public Band setName(String name) {
		this.name = name;
		return this;
	}
	public String getRecordLabel() {
		return recordLabel;
	}
	public Band setRecordLabel(String recordLabel) {
		this.recordLabel = recordLabel;
		return this;
	}
	
	@Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}