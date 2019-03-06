package com.eversis.spaceagency.dtos;

import com.eversis.spaceagency.entities.Footprint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    private String mission;
    private Date date;
    private Footprint footprint;
    private Double price;
}
