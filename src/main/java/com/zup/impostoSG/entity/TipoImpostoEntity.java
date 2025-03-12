package com.zup.impostoSG.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Table(name = "tipo_impostos")
@Entity
public class TipoImpostoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nome;

    @Column(nullable = false, unique = true)
    private String descricao;

    @Column(nullable = false, unique = true)
    private Double aliquota;

}
