package com.agri.utility;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({ "status", "url", "map", "message" })
@Data
public class ResultData {
	private String message;
	private StatusMessage status;
	private String url;
	private Map<?, ?> map;

}
