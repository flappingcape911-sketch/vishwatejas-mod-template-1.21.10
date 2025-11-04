package net.vishwateja.vishwatejasmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.vishwateja.vishwatejasmod.Items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VishwatejasMod implements ModInitializer {
	public static final String MOD_ID = "vishwatejas-mod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    private static Item registerItem (String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(VishwatejasMod.MOD_ID,name), item);
    }
	@Override
	public void onInitialize() {
        LOGGER.info("Hello Fabric world! VishwatejasMod has been initialized!");
        ModItems.registerModItems();
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(ModItems.GIANT_ZOMBIE_SPAWNER));
	}
}