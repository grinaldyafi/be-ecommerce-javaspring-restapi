package com.yafirasyad.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yafirasyad.ecommerce.entity.Produk;

public interface ProdukRepository extends JpaRepository<Produk, String> {

}