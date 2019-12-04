package com.agri.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agri.bo.Soils;
import com.agri.repositories.SoilsRepository;
import com.agri.soil.vo.SoilVo;
import com.agri.utility.Constants;
import com.agri.utility.ElasticSearchutility;

@Service
public class SoilServiceImpl implements SoilService {

	@Autowired
	private SoilsRepository soilsRepository;

	@Autowired
	private ElasticSearchutility elasticSearchutility;

	@Override
	public String addNewSoil(SoilVo vo) {
		Soils isExists = elasticSearchutility.checkSoilExistence(vo.getName());
		if (isExists != null)
			return Constants.EXISTS;
		else {
			Soils soils = new Soils();
			soils.setName(vo.getName());
			soils.setColor(vo.getColor());
			soils.setDeficientIn(vo.getDeficientIn());
			soils.setRichIn(vo.getRichIn());
			soils.setTexture(vo.getTexture());
			soils.setAvailabilityAreas(vo.getAvailabilityAreas());
			soilsRepository.save(soils);
			return Constants.SUCCESS;
		}
	}

}
