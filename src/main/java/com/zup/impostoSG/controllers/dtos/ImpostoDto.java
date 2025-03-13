package com.zup.impostoSG.controllers.dtos;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ImpostoDto {

    private Long id;
    private String name;
    private String description;
    private Double rate;

}
