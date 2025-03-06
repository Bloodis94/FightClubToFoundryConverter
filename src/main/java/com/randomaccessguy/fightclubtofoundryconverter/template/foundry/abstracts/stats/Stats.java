package com.randomaccessguy.fightclubtofoundryconverter.template.foundry.abstracts.stats;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Stats {

    private String duplicateSource;
    private String coreVersion;
    private String systemId;
    private String systemVersion;
    private Long createdTime;
    private Long modifiedTime;
    private String lastModifiedBy;
}
