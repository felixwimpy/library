package com.tqt.library.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Stream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

//    @RequestMapping("/")
//    public String index(Principal principal) {
//        return principal != null ? "home/homeSigned" : "home/homeUnsigned";
//    }
//
//	
//    @RequestMapping("/greeting")
//    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
//        model.addAttribute("name", name);
//        return "greeting";
//    }
//    
	@RequestMapping("/user")
	public Principal user(Principal user) {
		return user;
	}
	
	@RequestMapping("/resource")
	public Map<String, Object> home() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("id", UUID.randomUUID().toString());
		model.put("content", "Hello World");
		return model;
	}

    @RequestMapping("/coba")
    public String getFile(@RequestParam(value="path", required=false, defaultValue="E:\\Vid\\Files") String path, Model model) throws Exception {
    	StringBuilder sb = new StringBuilder();
    	try(Stream<Path> paths = Files.walk(Paths.get(path))) {
    	    paths.forEach(filePath -> {
    	        if (Files.isRegularFile(filePath)) {
    	        	sb.append(filePath);
    	        	sb.append("\n");
    	        }
    	    });
    	} 
    	model.addAttribute("name", sb.toString());
    	return "coba";
    }
    
}