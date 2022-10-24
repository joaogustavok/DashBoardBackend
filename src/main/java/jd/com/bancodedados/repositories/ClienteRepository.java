package jd.com.bancodedados.repositories;


import jd.com.bancodedados.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
