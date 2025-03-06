package com.randomaccessguy.fightclubtofoundryconverter.template.foundry.abstracts.system;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Description {

    private String value; // Corresponds to "system -> description -> value"
    private String chat;  // Corresponds to "system -> description -> chat"

}
