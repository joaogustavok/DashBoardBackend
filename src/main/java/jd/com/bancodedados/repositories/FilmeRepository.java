package jd.com.bancodedados.repositories;

import jd.com.bancodedados.entities.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}
