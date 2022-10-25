package jd.com.bancodedados.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@Entity
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "dim_funcionario")
public class Funcionario {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "version")
    private Long version;

    @Column(name = "date_from")
    private Date dateFrom;

    @Column(name = "date_to")
    private Date dateTo;

    @Column(name = "idoriginal_funcionario")
    private Long idOriginal;

    @Column(name = "nome_funcionario")
    private String nome;

    @Column(name = "bairro_funcionario")
    private String bairro;

    @Column(name = "cidade_funcionario")
    private String cidade;

    @Column(name = "pais_funcionario")
    private String pais;
}
