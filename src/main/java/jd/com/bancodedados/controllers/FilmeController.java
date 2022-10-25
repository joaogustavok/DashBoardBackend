package jd.com.bancodedados.controllers;

import jd.com.bancodedados.entities.Filme;
import jd.com.bancodedados.repositories.FilmeRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/filme")
public class FilmeController {

    private final FilmeRepository repository;

    @GetMapping
    public List<Filme> findAll() {
        return repository.findAll();
    }
}
