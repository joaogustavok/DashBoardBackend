package jd.com.bancodedados.repositories;

import jd.com.bancodedados.entities.Locacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocacaoRepository extends JpaRepository<Locacao, Long> {
}
