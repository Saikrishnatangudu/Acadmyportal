package com.service;

import java.util.List;

import com.model.Batch;

public interface BatchService {
	public Batch readById(int batchId);
	public Batch createBatch(Batch batch);
	public Batch updateBatch(Batch batch);
	public List<Batch> viewBatches();

}
