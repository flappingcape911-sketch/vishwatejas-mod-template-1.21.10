package net.vishwateja.vishwatejasmod.Items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.vishwateja.vishwatejasmod.VishwatejasMod;
import net.minecraft.registry.RegistryKey;

import java.util.function.Function;

public class ModItems {

    public static final Item GIANT_ZOMBIE_SPAWNER = register("giant_zombie_spawner", Item::new, new Item.Settings());

    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
            // Create the item key.
           final RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(VishwatejasMod.MOD_ID, name));

            // Create the item instance.
            Item item = itemFactory.apply(settings.registryKey(itemKey));

            // Register the item.
            Registry.register(Registries.ITEM, itemKey, item);

            return item;
        }
private static void customIngredients(FabricItemGroupEntries entries){
        entries.add((GIANT_ZOMBIE_SPAWNER));
}
    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::customIngredients);
    }
    }