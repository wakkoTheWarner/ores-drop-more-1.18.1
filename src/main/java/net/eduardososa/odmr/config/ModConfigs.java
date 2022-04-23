package net.eduardososa.odmr.config;

import com.mojang.datafixers.util.Pair;
import net.eduardososa.odmr.OdmrMod;

public class ModConfigs {
    public static SimpleConfig CONFIG;
    private static ModConfigProvider configs;

    public static String ANCIENTDEBRIS_DROP;
    public static double CHANGE_MINCOALVALUE;
    public static double CHANGE_MAXCOALVALUE;

    public static void registerConfigs() {
        configs = new ModConfigProvider();
        createConfigs();

        CONFIG = SimpleConfig.of(OdmrMod.MOD_ID + "config").provider(configs).request();

        assignConfigs();
    }

    private static void createConfigs() {
        configs.addKeyValuePair(new Pair<>("change.ancientdebris", "Ancient Debris Shard"), "String");
        configs.addKeyValuePair(new Pair<>("change.mincoalvalue", 0.0f), "double");
        configs.addKeyValuePair(new Pair<>("change.maxcoalvalue", 2.0f), "double");
    }

    private static void assignConfigs() {
        ANCIENTDEBRIS_DROP = CONFIG.getOrDefault("change.ancientdebris", "Ancient Debris Shard");
        CHANGE_MINCOALVALUE = CONFIG.getOrDefault("change.mincoalvalue", 0.0f);
        CHANGE_MAXCOALVALUE = CONFIG.getOrDefault("change.maxcoalvalue", 2.0f);

        System.out.println("All " + configs.getConfigsList().size() + " have been set properly");
    }
}