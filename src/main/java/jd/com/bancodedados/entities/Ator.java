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
@Table(name = "dim_ator")
public class Ator {

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

    @Column(name = "idoriginal_ator")
    private Long idOriginal;

    @Column(name = "nome_ator")
    private String nome;

    @Column(name = "primeironome_ator")
    private String primeiroNome;

    @Column(name = "sobrenome_ator")
    private String ultimoNome;
}
