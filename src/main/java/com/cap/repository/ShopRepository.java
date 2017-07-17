package com.cap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cap.model.Shop;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Integer> {

}
