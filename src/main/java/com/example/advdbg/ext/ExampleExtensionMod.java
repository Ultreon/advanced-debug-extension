package com.example.advdbg.ext;

import com.ultreon.libs.commons.v0.Identifier;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ExampleExtensionMod.MOD_ID)
public class ExampleExtensionMod {

    public static final String MOD_ID = "advanced_debug_ext";
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();

    public ExampleExtensionMod() {
        // Register the setup method for mod-loading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static ResourceLocation res(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    public static Identifier coreLibsId(String path) {
        return new Identifier(MOD_ID, path);
    }

    /**
     * Client setup event. Used for initializing the debug pages in the init class.
     */
    private void setup(final FMLClientSetupEvent event) {

    }
}
