package com.zup.impostoSG.controllers.dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CalculoImpostoDto {

    private String tipoImposto;
    private Double valorBase;
    private Double valorCalculado;

}
