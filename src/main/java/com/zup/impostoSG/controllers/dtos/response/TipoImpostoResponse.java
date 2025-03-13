package com.zup.impostoSG.controllers.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TipoImpostoResponse {
    private Long id;
    private String nome;
    private String descricao;
    private Double aliquota;
}
