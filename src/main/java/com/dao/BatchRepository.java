package com.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.model.Batch;

public interface BatchRepository extends CrudRepository<Batch, Integer>{
	
	public Batch findByBatchId(int batchId);

}
