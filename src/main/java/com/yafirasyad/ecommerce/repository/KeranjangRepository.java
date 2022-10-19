package com.yafirasyad.ecommerce.repository;

import java.util.Optional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.yafirasyad.ecommerce.entity.Keranjang;

public interface KeranjangRepository extends JpaRepository<Keranjang, String> {

    Optional<Keranjang> findByPenggunaIdAndProdukId(String username, String produkId);

    List<Keranjang> findByPenggunaId(String username);

}