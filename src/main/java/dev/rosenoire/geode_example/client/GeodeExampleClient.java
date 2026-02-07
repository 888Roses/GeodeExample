package dev.rosenoire.geode_example.client;

import dev.rosenoire.geode_example.common.GeodeExample;
import net.collectively.geode.GeodeClient;
import net.fabricmc.api.ClientModInitializer;

public class GeodeExampleClient implements ClientModInitializer {
    public static final GeodeClient geode = GeodeClient.create(GeodeExample.MOD_ID);

    @Override
    public void onInitializeClient() {
        geode.register();
    }
}
