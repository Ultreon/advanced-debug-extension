package com.ultreon.mods.advanceddebugextension.compat.advanceddebug;

import com.ultreon.mods.advanceddebug.api.client.registry.IFormatterRegistry;
import com.ultreon.mods.advanceddebug.api.events.IInitPagesEvent;
import com.ultreon.mods.advanceddebug.api.extension.AdvDebugExt;
import com.ultreon.mods.advanceddebug.api.extension.IAdvDebugExt;
import com.ultreon.mods.advanceddebugextension.Main;
import com.ultreon.mods.advanceddebugextension.compat.advanceddebug.init.ExtFormatters;
import com.ultreon.mods.advanceddebugextension.compat.advanceddebug.page.TestPage;

/**
 * Basic extension class for Advanced Debug
 */
@AdvDebugExt(modId = Main.MOD_ID)
public class AdvancedDebugExtension implements IAdvDebugExt {

    @Override
    public void initPages(IInitPagesEvent evt) {
        // Register a test page.
        evt.register(new TestPage());
    }

    @Override
    public void initFormatters(IFormatterRegistry registry) {
        // Initialize formatters.
        ExtFormatters.initClass();
    }
}
