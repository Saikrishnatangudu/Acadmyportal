package com.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Batch;
import com.service.BatchService;

@RestController
public class PortalControll {
	
	@Autowired
	private BatchService batchService;
	
	@GetMapping(value = "/")
	public String fun() {
		
		return "Saikrishna....,Welcome to Spring Tool Suite Acadamyportal";
	}
	
	
	@GetMapping(value = "/readbyid/{batchId}")
	public Batch readById(@PathVariable int batchId) {
		
		return this.batchService.readById(batchId);
	}
	
	@RequestMapping(value = "/create")
	public Batch createbyid(@RequestBody @Valid Batch batch) {
		
		return this.batchService.createBatch(batch);
	}
	
	@RequestMapping(value = "/update")
	public Batch updatebyid(@RequestBody Batch batch) {
		
		return this.batchService.updateBatch(batch);
	}
	
	@RequestMapping(value = "/viewall")
	public List<Batch> viewBatches( Batch batch) {
		
		return batchService.viewBatches();
	}
	
	

}
