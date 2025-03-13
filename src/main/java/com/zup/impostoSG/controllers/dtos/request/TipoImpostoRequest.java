package com.zup.impostoSG.controllers.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TipoImpostoRequest {

    private String nome;
    private String descricao;
    private Double aliquota;

}
