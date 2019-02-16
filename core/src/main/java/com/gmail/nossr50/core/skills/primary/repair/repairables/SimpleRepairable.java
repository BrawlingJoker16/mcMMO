package com.gmail.nossr50.core.skills.primary.repair.repairables;

import com.gmail.nossr50.core.skills.ConfigItemCategory;
import com.gmail.nossr50.core.skills.MaterialType;
import org.bukkit.Material;


public class SimpleRepairable implements Repairable {
    private final Material itemMaterial, repairMaterial;
    private final int minimumQuantity, minimumLevel;
    private final short maximumDurability, baseRepairDurability;
    private final byte repairMetadata;
    private final ConfigItemCategory repairConfigItemCategory;
    private final MaterialType repairMaterialType;
    private final double xpMultiplier;
    private String repairMaterialPrettyName;

    protected SimpleRepairable(Material type, Material repairMaterial, byte repairMetadata, String repairMaterialPrettyName, int minimumLevel, int minimumQuantity, short maximumDurability, ConfigItemCategory repairConfigItemCategory, MaterialType repairMaterialType, double xpMultiplier) {
        this.itemMaterial = type;
        this.repairMaterial = repairMaterial;
        this.repairMetadata = repairMetadata;
        this.repairMaterialPrettyName = repairMaterialPrettyName;
        this.repairConfigItemCategory = repairConfigItemCategory;
        this.repairMaterialType = repairMaterialType;
        this.minimumLevel = minimumLevel;
        this.minimumQuantity = minimumQuantity;
        this.maximumDurability = maximumDurability;
        this.baseRepairDurability = (short) (maximumDurability / minimumQuantity);
        this.xpMultiplier = xpMultiplier;
    }

    @Override
    public Material getItemMaterial() {
        return itemMaterial;
    }

    @Override
    public Material getRepairMaterial() {
        return repairMaterial;
    }

    @Override
    public byte getRepairMaterialMetadata() {
        return repairMetadata;
    }

    @Override
    public String getRepairMaterialPrettyName() {
        return repairMaterialPrettyName;
    }

    @Override
    public ConfigItemCategory getRepairConfigItemCategory() {
        return repairConfigItemCategory;
    }

    @Override
    public MaterialType getRepairMaterialType() {
        return repairMaterialType;
    }

    @Override
    public int getMinimumQuantity() {
        return minimumQuantity;
    }

    @Override
    public short getMaximumDurability() {
        return maximumDurability;
    }

    @Override
    public short getBaseRepairDurability() {
        return baseRepairDurability;
    }

    @Override
    public int getMinimumLevel() {
        return minimumLevel;
    }

    @Override
    public double getXpMultiplier() {
        return xpMultiplier;
    }
}
