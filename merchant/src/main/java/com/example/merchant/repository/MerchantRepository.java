package com.example.merchant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.merchant.model.Merchant;


@Repository
public interface MerchantRepository extends JpaRepository<Merchant, Long>{

}
