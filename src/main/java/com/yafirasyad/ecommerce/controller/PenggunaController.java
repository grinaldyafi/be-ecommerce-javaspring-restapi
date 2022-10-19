package com.yafirasyad.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.yafirasyad.ecommerce.entity.Pengguna;
import com.yafirasyad.ecommerce.service.PenggunaService;


@RestController
@RequestMapping("/api")
public class PenggunaController {

    @Autowired
    private PenggunaService penggunaService;

    @GetMapping("/users")
    public List<Pengguna> findAll() {
        return penggunaService.findAll();
    }

    @GetMapping("/users/{id}")
    public Pengguna findById(@PathVariable("id") String id) {
        return penggunaService.findById(id);
    }

    @PostMapping("/users")
    public Pengguna create(@RequestBody Pengguna pengguna) {
        return penggunaService.create(pengguna);
    }

    @PutMapping("/users")
    public Pengguna edit(@RequestBody Pengguna pengguna) {
        return penggunaService.edit(pengguna);
    }

    @DeleteMapping("/users/{id}")
    public void deleteById(@PathVariable("id") String id) {
        penggunaService.deleteById(id);
    }

}