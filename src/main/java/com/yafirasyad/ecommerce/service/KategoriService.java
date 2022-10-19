package com.yafirasyad.ecommerce.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yafirasyad.ecommerce.entity.Kategori;
import com.yafirasyad.ecommerce.exception.ResourceNotFoundException;
import com.yafirasyad.ecommerce.repository.KategoriRepository;

import java.util.List;

@Service
public class KategoriService {

    @Autowired
    private KategoriRepository kategoriRepository;

    public Kategori findById(String id) {
        return kategoriRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Kategori dengan id " + id + " tidak ditemukan"));
    }

    public List<Kategori> findAll() {
        return kategoriRepository.findAll();
    }

    public Kategori create(Kategori kategori) {
        kategori.setId(UUID.randomUUID().toString());
        return kategoriRepository.save(kategori);
    }

    public Kategori edit(Kategori kategori) {
        return kategoriRepository.save(kategori);
    }

    public void deleteById(String id) {
        kategoriRepository.deleteById(id);
    }
}
