package org.blb.DTO.rent.productDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.blb.DTO.RegionDto;
import org.blb.DTO.rent.categoryDto.CategoryCreateRequestDto;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponseDto {

    private String name;
    private CategoryCreateRequestDto category;
    private Double price;
    private String description;
    private RegionDto region;
    private Boolean isInStock;

}