package com.agri.bo;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.Data;

@Document(indexName = "soils")
@Data
public class Soils {

	@Id
	private int id;
	private String name;
	private String color;
	private String texture;
	private String richIn;
	private String deficientIn;
	@Field(type = FieldType.Object, index = true)
	private Crops crops;
	private String availabilityAreas;
}
