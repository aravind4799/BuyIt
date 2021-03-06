package com.lti.finance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.finance.beans.BuyProduct;
import com.lti.finance.services.BuyProductServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("buyproduct")
public class BuyProductController {

	@Autowired
	BuyProductServiceImpl BuyProductService;

	@GetMapping("/hello")
	public String hello() {
		return "hello world";
	}

	@GetMapping("/{user_id}")
	public List<BuyProduct> getProductDetailsById(@PathVariable("user_id") long userId) {
		return BuyProductService.getProductListById(userId);
	}

	@PostMapping("/addbuyproduct")
	public BuyProduct addEmi(@RequestBody BuyProduct buyprod) {
		System.out.println("inside controller");
		System.out.println("inside controller" + buyprod);

		return BuyProductService.addEmi(buyprod);

	}

}