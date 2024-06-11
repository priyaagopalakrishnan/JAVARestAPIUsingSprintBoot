package com.example.merchant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.merchant.model.Merchant;
import com.example.merchant.repository.MerchantRepository;
import java.util.List;


@Service
public class MerchantService {
	
	@Autowired
	MerchantRepository merRepository;
	
	//CREATE
	public Merchant createMerchant(Merchant merchant) {
		return merRepository.save(merchant);
	}
	
	//READ
	public List<Merchant> getMerchants() {
		return merRepository.findAll();
	}
	
	//DELETE
	public void deleteMerchant(Long merchantId) {
		merRepository.deleteById(merchantId);
	}
	
	//UPDATE
	public Merchant updateMerchant(Long merchantId, Merchant merchantDetails) {
		Merchant mer = merRepository.findById(merchantId).get();
		mer.setFirstName(merchantDetails.getFirstName());
		mer.setLastName(merchantDetails.getLastName());
		mer.setAge(merchantDetails.getAge());
		
		return merRepository.save(mer);
		
	}
 
}
