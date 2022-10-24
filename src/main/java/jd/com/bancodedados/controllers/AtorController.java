package jd.com.bancodedados.controllers;

import jd.com.bancodedados.entities.Ator;
import jd.com.bancodedados.repositories.AtorRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/ator")
public class AtorController {

    private final AtorRepository repository;

    @GetMapping
    public List<Ator> findAll() {
        return repository.findAll();
    }
}
