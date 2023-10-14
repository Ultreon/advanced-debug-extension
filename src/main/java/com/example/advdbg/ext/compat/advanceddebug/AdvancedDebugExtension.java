package com.example.advdbg.ext.compat.advanceddebug;

import com.example.advdbg.ext.compat.advanceddebug.imgui.ADExtensionImGui;
import com.example.advdbg.ext.compat.advanceddebug.init.ExtFormatters;
import com.example.advdbg.ext.compat.advanceddebug.page.TestPage;
import com.ultreon.mods.advanceddebug.api.client.registry.IFormatterRegistry;
import com.ultreon.mods.advanceddebug.api.events.IInitPagesEvent;
import com.ultreon.mods.advanceddebug.api.extension.Extension;
import com.ultreon.mods.advanceddebug.api.extension.ExtensionInfo;
import com.example.advdbg.ext.ExampleExtensionMod;

/**
 * Basic extension class for Advanced Debug
 */
@ExtensionInfo(ExampleExtensionMod.MOD_ID)
public class AdvancedDebugExtension implements Extension {
    @Override
    public void initPages(IInitPagesEvent evt) {
        // Register a test page.
        evt.register(ExampleExtensionMod.coreLibsId("test"), new TestPage());
    }

    @Override
    public void initFormatters(IFormatterRegistry registry) {
        // Initialize formatters.
        ExtFormatters.nopInit();
    }

    @Override
    public void handleImGuiMenuBar() {
        ADExtensionImGui.handle();
    }
}
