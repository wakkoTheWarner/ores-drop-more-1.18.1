package net.eduardososa.odmr.util;

import net.eduardososa.odmr.item.ModItems;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.item.Items;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;


public class ModLootTableModifiers {
    private static final Identifier COAL_BLOCK_ID
            = new Identifier("minecraft", "blocks/coal_ore");
    private static final Identifier DEEPSLATE_COAL_BLOCK_ID
            = new Identifier("minecraft", "blocks/deepslate_coal_ore");

    private static final Identifier IRON_BLOCK_ID
            = new Identifier("minecraft", "blocks/iron_ore");
    private static final Identifier DEEPSLATE_IRON_BLOCK_ID
            = new Identifier("minecraft", "blocks/deepslate_iron_ore");

    private static final Identifier DIAMOND_BLOCK_ID
            = new Identifier("minecraft", "blocks/diamond_ore");
    private static final Identifier DEEPSLATE_DIAMOND_BLOCK_ID
            = new Identifier("minecraft", "blocks/deepslate_diamond_ore");

    private static final Identifier GOLD_BLOCK_ID
            = new Identifier("minecraft", "blocks/gold_ore");
    private static final Identifier DEEPSLATE_GOLD_BLOCK_ID
            = new Identifier("minecraft", "blocks/deepslate_gold_ore");

    private static final Identifier EMERALD_BLOCK_ID
            = new Identifier("minecraft", "blocks/emerald_ore");
    private static final Identifier DEEPSLATE_EMERALD_BLOCK_ID
            = new Identifier("minecraft", "blocks/deepslate_emerald_ore");

    private static final Identifier COPPER_BLOCK_ID
            = new Identifier("minecraft", "blocks/copper_ore");
    private static final Identifier DEEPSLATE_COPPER_BLOCK_ID
            = new Identifier("minecraft", "blocks/deepslate_copper_ore");

    private static final Identifier NETHER_GOLD_BLOCK_ID
            = new Identifier("minecraft", "blocks/nether_gold_ore");
    private static final Identifier NETHER_QUARTZ_BLOCK_ID
            = new Identifier("minecraft", "blocks/nether_quartz_ore");

    private static final Identifier LAPIZ_BLOCK_ID
            = new Identifier("minecraft", "blocks/lapis_ore");
    private static final Identifier DEEPSLATE_LAPIZ_BLOCK_ID
            = new Identifier("minecraft", "blocks/deepslate_lapis_ore");


    public static void modifyLootTables() {
        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            if (COAL_BLOCK_ID.equals(id) || DEEPSLATE_COAL_BLOCK_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f)) // Drops 100% of the time
                        .with(ItemEntry.builder(Items.COAL)) // drops coal
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0f, 2.0f)).build());
                supplier.withPool(poolBuilder.build());
            }

            if (IRON_BLOCK_ID.equals(id) || DEEPSLATE_IRON_BLOCK_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f)) // Drops 100% of the time
                        .with(ItemEntry.builder(Items.RAW_IRON))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0f, 2.0f)).build());
                supplier.withPool(poolBuilder.build());
            }

            if (DIAMOND_BLOCK_ID.equals(id) || DEEPSLATE_DIAMOND_BLOCK_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f)) // Drops 100% of the time
                        .with(ItemEntry.builder(Items.DIAMOND))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0f, 2.0f)).build());
                supplier.withPool(poolBuilder.build());
            }

            if (GOLD_BLOCK_ID.equals(id) || DEEPSLATE_GOLD_BLOCK_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f)) // Drops 100% of the time
                        .with(ItemEntry.builder(Items.RAW_GOLD))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0f, 2.0f)).build());
                supplier.withPool(poolBuilder.build());
            }

            if (EMERALD_BLOCK_ID.equals(id) || DEEPSLATE_EMERALD_BLOCK_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f)) // Drops 100% of the time
                        .with(ItemEntry.builder(Items.EMERALD))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0f, 2.0f)).build());
                supplier.withPool(poolBuilder.build());
            }

            if (COPPER_BLOCK_ID.equals(id) || DEEPSLATE_COPPER_BLOCK_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f)) // Drops 100% of the time
                        .with(ItemEntry.builder(Items.RAW_COPPER))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0f, 3.0f)).build());
                supplier.withPool(poolBuilder.build());
            }

            if (NETHER_GOLD_BLOCK_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(Items.GOLD_NUGGET))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());
                supplier.withPool(poolBuilder.build());
            }

            if (NETHER_QUARTZ_BLOCK_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f)) // Drops 100% of the time
                        .with(ItemEntry.builder(Items.QUARTZ))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0f, 2.0f)).build());
                supplier.withPool(poolBuilder.build());
            }

            if (LAPIZ_BLOCK_ID.equals(id) || DEEPSLATE_LAPIZ_BLOCK_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f)) // Drops 100% of the time
                        .with(ItemEntry.builder(Items.LAPIS_LAZULI))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0f, 2.0f)).build());
                supplier.withPool(poolBuilder.build());
            }

        }));
    }
}
