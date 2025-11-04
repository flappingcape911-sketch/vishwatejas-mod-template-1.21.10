package net.vishwateja.vishwatejasmod.Items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.vishwateja.vishwatejasmod.VishwatejasMod;

public class itemgroup {
    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(VishwatejasMod.MOD_ID,"item_group"));
    public static final ItemGroup CUSTOM_ITEM_GROUP = FabricItemGroup.builder().build();
}
