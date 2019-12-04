package com.agri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agri.service.SoilService;
import com.agri.soil.vo.SoilVo;
import com.agri.utility.Constants;
import com.agri.utility.ResponseUtility;
import com.agri.utility.StatusMessage;

@RestController
@RequestMapping("/agri")
public class AgriController {

	@Autowired
	private SoilService soilService;
	
	@PostMapping
	public ResponseEntity<?> addSoil(@RequestBody SoilVo vo){
		String status = soilService.addNewSoil(vo);
		if(status!=null) {
			if(Constants.EXISTS.equalsIgnoreCase(status))
				return ResponseUtility.setResponse(StatusMessage.EXIST, null, "A Soil already exists with this name", null, HttpStatus.IM_USED);
			else if(Constants.SUCCESS.equalsIgnoreCase(status))
				return ResponseUtility.setResponse(StatusMessage.SUCCESS, null, "Soil Saved To ES SuccessFully", null, HttpStatus.OK);
		}else {
			return null;
		}
		return null;
	}
}
