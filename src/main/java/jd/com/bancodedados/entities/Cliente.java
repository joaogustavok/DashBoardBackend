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
@Table(name = "dim_cliente")
public class Cliente {

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

    @Column(name = "idoriginal_cliente")
    private Long idOriginal;

    @Column(name = "nome_cliente")
    private String nome;

    @Column(name = "bairro_cliente")
    private String bairro;

    @Column(name = "cidade_cliente")
    private String cidade;

    @Column(name = "pais_cliente")
    private String pais;
}
