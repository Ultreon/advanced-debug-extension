package com.ultreon.mods.advanceddebugextension.compat.advanceddebug.init;

import com.ultreon.mods.advanceddebug.api.IAdvancedDebug;
import com.ultreon.mods.advanceddebug.api.client.menu.Formatter;
import com.ultreon.mods.advanceddebug.api.client.registry.IFormatterRegistry;
import com.ultreon.mods.advanceddebugextension.Main;
import com.ultreon.mods.advanceddebugextension.common.Foo;
import net.minecraft.ChatFormatting;

public class ExtFormatters {
    private static final IFormatterRegistry REGISTRY = IAdvancedDebug.get().getFormatterRegistry();

    public static final Formatter<Foo> FOO = REGISTRY.register(new Formatter<>(Foo.class, Main.res("foo")) {
        @Override
        public void format(Foo foo, StringBuilder sb) {
            sb.append(ChatFormatting.LIGHT_PURPLE).append("foo: ");
            sb.append(format(foo.bar()));
            sb.append(ChatFormatting.WHITE).append(" ");
            sb.append(format(foo.baz()));
        }
    });

    public static void initClass() {

    }
}
