package jd.com.bancodedados.controllers;

import jd.com.bancodedados.entities.Cliente;
import jd.com.bancodedados.repositories.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/cliente")
public class ClienteController {

    private final ClienteRepository repository;

    @GetMapping
    public List<Cliente> findAll() {
        return repository.findAll();
    }
}
