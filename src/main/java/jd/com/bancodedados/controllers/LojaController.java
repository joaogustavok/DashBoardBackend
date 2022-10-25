package jd.com.bancodedados.controllers;

import jd.com.bancodedados.entities.Loja;
import jd.com.bancodedados.repositories.LojaRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/loja")
public class LojaController {

    private final LojaRepository repository;

    @GetMapping
    public List<Loja> findAll() {
        return repository.findAll();
    }
}
