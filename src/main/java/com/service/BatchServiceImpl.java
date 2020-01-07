package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.BatchRepository;
import com.model.Batch;

@Service
public class BatchServiceImpl implements BatchService {

	@Autowired
	private BatchRepository batchRepository;
	
	@Override
	public Batch readById(int batchId) {
		
		return this.batchRepository.findByBatchId(batchId);
	}

	@Override
	public Batch createBatch(Batch batch) {
		
		return this.batchRepository.save(batch);
	}

	@Override
	public Batch updateBatch(Batch batch) {
		return this.batchRepository.save(batch);
	}

	@Override
	public List<Batch> viewBatches() {
		return (List<Batch>) batchRepository.findAll();
	}

}
