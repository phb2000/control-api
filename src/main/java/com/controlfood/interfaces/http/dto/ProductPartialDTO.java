package com.controlfood.interfaces.http.dto;

import com.controlfood.interfaces.http.dto.validator.ValidEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductPartialDTO {

    @NotBlank
    private String name;

    @Positive
    private int quantity;

    @Size(min = 0, max = 255)
    private String description;

    @Positive
    private BigDecimal price;

    @Max(value = 255)
    private String url;

    @ValidEnum(enumType = StatusDto.class)
    private StatusDto status;

    private List<@ValidEnum(enumType = TagsDto.class) TagsDto> tags;

}
