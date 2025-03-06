package com.randomaccessguy.fightclubtofoundryconverter.template.foundry.abstracts.system;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Source {

    private String custom;
    private String book;
    private String page;
    private String license;
    private String rules;
}
