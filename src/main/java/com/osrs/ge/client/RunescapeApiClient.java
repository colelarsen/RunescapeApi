package com.osrs.ge.client;

import javax.websocket.server.PathParam;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "RunescapeApiClient", url = "https://secure.runescape.com/m=itemdb_oldschool/api")
public interface RunescapeApiClient {
	
	@RequestMapping(method = RequestMethod.GET, value = "/catalogue/category.json")
    String getCategory(@RequestParam String category);
	
	@RequestMapping(method = RequestMethod.GET, value = "/catalogue/items.json")
    String getCatAlphPage(@RequestParam String category, @RequestParam String alpha, @RequestParam String page);
	
	@RequestMapping(method = RequestMethod.GET, value = "/catalogue/detail.json")
    String getItem(@RequestParam String item);
	
	@RequestMapping(method = RequestMethod.GET, value = "/catalogue/{item}")
    String getGraph(@PathParam(value = "item") String item);
}
