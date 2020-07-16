package com.keepcoding.limitsservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigController {

	@GetMapping("limits")
	public LimitsConfig getLimits() {
		return new LimitsConfig(10, 100);
	}
}
