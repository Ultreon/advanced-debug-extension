package com.example.advdbg.ext.compat.advanceddebug.imgui;

import com.example.advdbg.ext.ExampleExtensionMod;
import imgui.ImGui;
import imgui.type.ImBoolean;

public class ADExtensionImGui {
    private static final ImBoolean MOD_UTILS_OPEN = new ImBoolean(false);

    public static void handle() {
        if (ImGui.begin(ExampleExtensionMod.MOD_ID, MOD_UTILS_OPEN)) {
            if (ImGui.button("Hello World"))
                System.out.println("Hello World!");

            ImGui.end();
        }
    }
}
