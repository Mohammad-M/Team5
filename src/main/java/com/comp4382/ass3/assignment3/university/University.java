package com.comp4382.ass3.assignment3.university;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class University {
	@JsonProperty(value = "name")
	private String name;
	@JsonProperty(value = "city")
	private String city;

	@JsonCreator
	public University(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

}