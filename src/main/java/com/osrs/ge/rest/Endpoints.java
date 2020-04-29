package com.osrs.ge.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.osrs.ge.client.RunescapeApiClient;

@RestController
public class Endpoints {
	
	@Autowired
	RunescapeApiClient runescapeApi;
	
	@GetMapping("/getCategory")
	public String getCategory()
	{
		return runescapeApi.getCategory("1");
	}
	
	@GetMapping("/getItems")
	public String getCatAlphPage(@RequestParam String category, @RequestParam String alpha, @RequestParam String page)
	{
		return runescapeApi.getCatAlphPage(category, alpha, page);
	}
	
	@GetMapping("/getItem")
	public String getItem(@RequestParam String item)
	{
		return runescapeApi.getItem(item);
	}
	
	@GetMapping("/getGraph")
	public String getGraph(@RequestParam String item)
	{
		return runescapeApi.getItem(item + ".json");
	}
}
