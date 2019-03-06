package com.eversis.spaceagency.dtos;

import com.eversis.spaceagency.entities.Product;
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
public class MissionDto {

    private String name;
    private Date startDate;
    private Date finishDate;
//    private List<Product> products;

}
