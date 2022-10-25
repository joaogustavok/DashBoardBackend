package jd.com.bancodedados.repositories;

import jd.com.bancodedados.entities.Filme;
import jd.com.bancodedados.entities.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository  extends JpaRepository<Funcionario, Long> {
}
