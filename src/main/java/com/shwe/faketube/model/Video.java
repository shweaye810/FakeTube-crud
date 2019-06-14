package com.shwe.faketube.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Video {
	@org.springframework.data.annotation.Id
	private String id;
	
	public String getDbId() {
		return id;
	}
	String title;
	String mediaLoc;
	
	private User user;

}
