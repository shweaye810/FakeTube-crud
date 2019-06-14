package com.shwe.faketube.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@org.springframework.data.annotation.Id
	// @JsonProperty(value = "userId")
	private String id;
	
	public String getDbId() {
		return id;
	}

	@NotNull
	private String name;
	
	private List<Video> video;

}
