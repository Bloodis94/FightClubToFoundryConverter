package com.randomaccessguy.fightclubtofoundryconverter.template.foundry.abstracts.system;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class System {

    private Description description;
    private Source source;

}
