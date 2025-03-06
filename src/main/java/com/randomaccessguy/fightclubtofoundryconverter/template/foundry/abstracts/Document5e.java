package com.randomaccessguy.fightclubtofoundryconverter.template.foundry.abstracts;

import com.randomaccessguy.fightclubtofoundryconverter.template.foundry.abstracts.stats.Stats;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Document5e {

    private String name;
    private String type;
    private String img;
    private System system;
    private Map<String, Object> flags;
    private String _id;
    private Stats _stats;

}