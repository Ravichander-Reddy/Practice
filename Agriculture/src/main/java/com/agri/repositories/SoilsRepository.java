package com.agri.repositories;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.agri.bo.Soils;

public interface SoilsRepository extends ElasticsearchRepository<Soils, Integer> {

}
