package com.agri.repositories;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.agri.bo.Crops;

public interface CropsRepository extends ElasticsearchRepository<Crops, Integer> {

}
