package net.eduardososa.odmr;

import net.eduardososa.odmr.item.ModItems;
import net.eduardososa.odmr.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OresDropMoresThreeMod implements ModInitializer {
	public static final String MOD_ID = "odmr";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModLootTableModifiers.modifyLootTables();
		ModItems.registerModItems();
	}
}
