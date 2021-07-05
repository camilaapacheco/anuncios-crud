package com.br.capgemini.resources;

import com.br.capgemini.entities.Anuncio;

import com.br.capgemini.repositories.AnuncioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/anuncios")
public class AnuncioResource {

    @Autowired
    private AnuncioRepository anuncioRepository;

    @GetMapping
    public List<Anuncio> listarTodos() {
        return this.anuncioRepository.findAll();
    }

    @GetMapping("/{id}")
    public Anuncio findById(@PathVariable Long id) {
        return this.anuncioRepository.findById(id).get();
    }

    @PostMapping
    public Anuncio create(@RequestBody Anuncio anuncio) {
        return this.anuncioRepository.save(anuncio);
    }

    @PutMapping ("/{id}")
    public Anuncio update(@PathVariable Long id, @RequestBody Anuncio anuncio) {
        Anuncio anuncioDataBase = this.anuncioRepository.findById(id).get();
        return this.anuncioRepository.save(anuncioDataBase);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.anuncioRepository.deleteById(id);
    }

}
