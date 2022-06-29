package com.example.mustacheex.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SectionJsonDto {
    private String key;

    public SectionJsonDto(String key) {
        this.key = key;
    }
}
