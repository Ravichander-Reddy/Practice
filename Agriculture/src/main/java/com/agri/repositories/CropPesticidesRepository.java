package com.agri.repositories;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.agri.bo.CropPesticides;

public interface CropPesticidesRepository extends ElasticsearchRepository<CropPesticides, Integer> {

}
