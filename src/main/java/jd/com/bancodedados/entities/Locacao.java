package jd.com.bancodedados.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@Entity
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "fato_locacoes")
public class Locacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_originallocacao")
    private Long idOriginalLocacao;

    @Column(name = "id_datadw")
    private Long idData;

    @Column(name = "id_clientedw")
    private Long idCliente;

    @Column(name = "id_originalcliente")
    private Long idOriginalCliente;

    @Column(name = "id_funcionariodw")
    private Long idFuncionario;

    @Column(name = "id_originalfuncionario")
    private Long idOriginalFuncionario;

    @Column(name = "id_lojadw")
    private Long idLoja;

    @Column(name = "id_originalloja")
    private Long idOriginalLoja;

    @Column(name = "id_filmedw")
    private Long idFilme;

    @Column(name = "id_originalfilme")
    private Long idOriginalFilme;

    @Column(name = "id_atordw")
    private Long idAtor;

    @Column(name = "id_originalator")
    private Long idOriginalAtor;

    @Column(name = "data_locacao")
    private Date dataLocacao;

    @Column(name = "valor_locacao")
    private Double valorLocacao;

    @Column(name = "valor_total")
    private Double valorTotal;
}
