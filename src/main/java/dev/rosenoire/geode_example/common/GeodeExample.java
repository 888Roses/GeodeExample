package dev.rosenoire.geode_example.common;

import net.collectively.geode.Geode;
import net.fabricmc.api.ModInitializer;

public class GeodeExample implements ModInitializer {
    public static final String MOD_ID = "geode_example";
    public static final Geode geode = Geode.create(MOD_ID);

    @Override
    public void onInitialize() {
        geode.register();
    }
}
