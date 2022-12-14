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
@Table(name = "dim_filme")
public class Filme {

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

    @Column(name = "idoriginal_filme")
    private Long idOriginal;

    @Column(name = "nome_filme")
    private String nome;

    @Column(name = "idiomaoriginal_filme")
    private Long idIdioma;

    @Column(name = "categoria_filme")
    private String categoria;

    @Column(name = "vlraluguel_filme")
    private Double valorAluguel;

    @Column(name = "anolancamento_filme")
    private Integer anoLancamento;
}
