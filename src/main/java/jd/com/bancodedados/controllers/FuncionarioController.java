package jd.com.bancodedados.controllers;

import jd.com.bancodedados.entities.Funcionario;
import jd.com.bancodedados.repositories.FuncionarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/funcionario")
public class FuncionarioController {

    private final FuncionarioRepository repository;

    @GetMapping
    public List<Funcionario> findAll() {
        return repository.findAll();
    }
}
