package com.keepcoding.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keepcoding.limitsservice.model.LimitsConfig;
import com.keepcoding.limitsservice.properties.LimitsProperties;

@RestController
public class LimitsConfigController {
	
	@Autowired
	LimitsProperties limitsProperties;

	@GetMapping("limits")
	public LimitsConfig getLimits() {
		return new LimitsConfig(limitsProperties.getMin(), limitsProperties.getMax());
	}
}
