package net.eduardososa.odmr.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.eduardososa.odmr.OdmrMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item ANCIENT_DEBRIS_SHARD = registerItem("ancient_debris_shard",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(OdmrMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + OdmrMod.MOD_ID);
    }
}
