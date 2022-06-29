package com.example.mustacheex.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class SectionListJsonRequest {
    private List<SectionJsonDto> names;

    public SectionListJsonRequest(List<SectionJsonDto> names) {
        this.names = names;
    }
}
