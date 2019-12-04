package com.agri.utility;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ResponseUtility {

	public static ResponseEntity<String> setResponse(StatusMessage statusMessage, Map<?, ?> map,
			String message, String url, HttpStatus httpStatus) {
		ResultData resultData = new ResultData();
		ObjectMapper mapper = new ObjectMapper();
		String body = null;
		resultData.setMap(map);
		resultData.setUrl(url);
		resultData.setMessage(message);
		resultData.setStatus(statusMessage);
		try {
			body = mapper.writeValueAsString(resultData);
		} catch (JsonProcessingException e) {
			e.printStackTrace();

		}
		return ResponseEntity.status(httpStatus).body(body);
	}
}
