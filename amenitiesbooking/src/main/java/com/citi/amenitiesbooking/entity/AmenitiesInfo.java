package com.citi.amenitiesbooking.entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AmenitiesInfo {
	
	private int amenitiesCode;
	private String amenitiesName;
	private Date bookingDate;
	private int totalCount;
	private int currentAvailableCount;
	

}
