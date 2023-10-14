package com.example.advdbg.ext.compat.advanceddebug.init;

import com.ultreon.mods.advanceddebug.api.IAdvancedDebug;
import com.ultreon.mods.advanceddebug.api.client.formatter.IFormatterContext;
import com.ultreon.mods.advanceddebug.api.client.menu.Formatter;
import com.ultreon.mods.advanceddebug.api.client.registry.IFormatterRegistry;
import com.ultreon.mods.advanceddebug.api.common.IFormatter;
import com.example.advdbg.ext.ExampleExtensionMod;
import com.example.advdbg.ext.util.Foo;

public class ExtFormatters {
    private static final IFormatterRegistry REGISTRY = IAdvancedDebug.get().getFormatterRegistry();

    public static final IFormatter<Foo> FOO = REGISTRY.register(new Formatter<Foo>(Foo.class, ExampleExtensionMod.res("foo")) {
        @Override
        public void format(Foo foo, IFormatterContext ctx) {
            ctx.classValue(Foo.class).operator(": ").stringEscaped(foo.bar()).operator(" ").intValue(foo.baz());
        }
    });

    public static void nopInit() {

    }
}
