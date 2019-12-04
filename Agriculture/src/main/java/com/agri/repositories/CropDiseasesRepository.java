package com.agri.repositories;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.agri.bo.CropDiseases;

public interface CropDiseasesRepository extends ElasticsearchRepository<CropDiseases, Integer> {

}
