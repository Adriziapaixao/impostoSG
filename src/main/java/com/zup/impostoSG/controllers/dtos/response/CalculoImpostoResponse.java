package com.zup.impostoSG.controllers.dtos.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CalculoImpostoResponse {

    private String tipoImposto;
    private Double valorBase;
    private Double aliquota;
    private Double valorImposto;

}
