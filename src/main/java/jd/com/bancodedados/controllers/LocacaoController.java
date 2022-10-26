package jd.com.bancodedados.controllers;

import jd.com.bancodedados.entities.Locacao;
import jd.com.bancodedados.repositories.LocacaoRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/locacao")
public class LocacaoController {

    private final LocacaoRepository repository;

    @GetMapping
    public List<Locacao> findAll() {
        return repository.findAll();
    }
}
