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
@Table(name = "dim_loja")
public class Loja {

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

    @Column(name = "idoriginal_loja")
    private Long idOriginal;

    @Column(name = "gerente_loja")
    private String gerente;

    @Column(name = "bairro_loja")
    private String bairro;

    @Column(name = "cidade_loja")
    private String cidade;

    @Column(name = "pais_loja")
    private String pais;
}
