package com.example.merchant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.merchant.model.Merchant;
import com.example.merchant.service.MerchantService;


@RestController
@RequestMapping("/api")
public class MerchantController {
	
	@Autowired
	MerchantService merchantService;
	
	@RequestMapping(value="/merchants", method=RequestMethod.POST)
	public Merchant createMerchant(@RequestBody Merchant merchant) {
		return merchantService.createMerchant(merchant);
	}
	
	
	@RequestMapping(value="/merchants", method=RequestMethod.GET)
	public List<Merchant> getMerchantList() {
		return merchantService.getMerchants();
	}
	
	
	@RequestMapping(value="/merchants/{merchantId}", method=RequestMethod.PUT)
	public Merchant updateMerchant(@PathVariable(value="merchantId") Long merchantId, @RequestBody Merchant merchantDetails) {
		System.out.println("merchantDetails firstname and lastname age =" + merchantDetails.getFirstName()+ " "+merchantDetails.getLastName()+ " "+merchantDetails.getAge());
		return merchantService.updateMerchant(merchantId, merchantDetails);
	}
	
	
	@RequestMapping(value="/merchants/{merchantId}", method=RequestMethod.DELETE)
	public void deleteMerchants(@PathVariable(value="merchantId") Long merchantId) {
		merchantService.deleteMerchant(merchantId);
	}
	

}
