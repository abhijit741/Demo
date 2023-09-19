package com.example.demo.controller;

import java.util.ListIterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repo.ProductRepo;
import com.fasterxml.jackson.databind.ObjectMapper;



@RestController
public class Controller {
	@Autowired
	ProductRepo productRepo;
	
	@GetMapping("/")
	public String a() {
		try {
			System.out.println(productRepo.findAll());
			System.out.println("product name= " + productRepo.findById(2));
			
			String[] products = {"ipad","a"};
			String[] prices = {"30000", "10"};
			int cnt = 0;
			for (ListIterator<?> it = ((JSONArray) new JSONParser()
					.parse(new ObjectMapper().writeValueAsString(productRepo.findAll()))).listIterator();it.hasNext();) {
				System.out.println(products[it.nextIndex()]);
				System.out.println(((JSONObject) it.next()).get("productName").toString());
				// System.out.println("in loop");
				System.out.println();
				cnt++;
				if (cnt>20)
					break;
			}
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return "Hi";
	}
}
