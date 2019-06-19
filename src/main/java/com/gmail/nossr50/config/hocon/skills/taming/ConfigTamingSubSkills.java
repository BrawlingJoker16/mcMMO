package com.gmail.nossr50.config.hocon.skills.taming;

import ninja.leaping.configurate.objectmapping.Setting;
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable;

@ConfigSerializable
public class ConfigTamingSubSkills {

    @Setting(value = "Gore")
    private ConfigTamingGore gore = new ConfigTamingGore();

    @Setting(value = "Call-Of-The-Wild")
    private ConfigTamingCallOfTheWild callOfTheWild = new ConfigTamingCallOfTheWild();

    @Setting(value = "Sharpened-Claws")
    private ConfigTamingSharpenedClaws sharpenedClaws = new ConfigTamingSharpenedClaws();

    @Setting(value = "Shock-Proof")
    private ConfigTamingShockProof shockProof = new ConfigTamingShockProof();

    @Setting(value = "Thick-Fur")
    private ConfigTamingThickFur thickFur = new ConfigTamingThickFur();

    @Setting(value = "Environmentally-Aware")
    private ConfigTamingEnvironmentalllyAware environmentalllyAware = new ConfigTamingEnvironmentalllyAware();

    @Setting(value = "Fast-Food-Service")
    private ConfigTamingFastFoodService fastFoodService = new ConfigTamingFastFoodService();

    @Setting(value = "Pummel")
    private ConfigTamingPummel pummel = new ConfigTamingPummel();

    public ConfigTamingGore getGore() {
        return gore;
    }

    public ConfigTamingCallOfTheWild getCallOfTheWild() {
        return callOfTheWild;
    }

    public ConfigTamingSharpenedClaws getSharpenedClaws() {
        return sharpenedClaws;
    }

    public ConfigTamingShockProof getShockProof() {
        return shockProof;
    }

    public ConfigTamingThickFur getThickFur() {
        return thickFur;
    }

    public ConfigTamingEnvironmentalllyAware getEnvironmentalllyAware() {
        return environmentalllyAware;
    }

    public ConfigTamingFastFoodService getFastFoodService() {
        return fastFoodService;
    }

    public ConfigTamingPummel getPummel() {
        return pummel;
    }
}