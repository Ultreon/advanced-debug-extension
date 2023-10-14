package com.example.advdbg.ext;

import com.ultreon.libs.commons.v0.Identifier;
import dev.architectury.event.events.client.ClientLifecycleEvent;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExampleExtensionMod implements ClientModInitializer {

    public static final String MOD_ID = "advanced_debug_ext";
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    public static Identifier coreLibsId(String path) {
        return new Identifier(MOD_ID, path);
    }

    /**
     * Initializes the mod on the client side.
     */
    @Override
    public void onInitializeClient() {
        ClientLifecycleEvent.CLIENT_SETUP.register(this::setup);
    }

    /**
     * Handler for {@link ClientLifecycleEvent#CLIENT_SETUP}
     *
     * @param minecraft the Minecraft instance.
     */
    private void setup(Minecraft minecraft) {

    }
}
