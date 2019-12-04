package com.agri.soil.vo;

import com.agri.bo.Crops;

import lombok.Data;

@Data
public class SoilVo {

	private int id;
	private String name;
	private String color;
	private String texture;
	private String richIn;
	private String deficientIn;
	private Crops crops;
	private String availabilityAreas;
}
