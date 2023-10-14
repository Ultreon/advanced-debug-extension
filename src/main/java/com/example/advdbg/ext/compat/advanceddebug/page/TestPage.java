package com.example.advdbg.ext.compat.advanceddebug.page;

import com.ultreon.mods.advanceddebug.api.client.menu.DebugPage;
import com.ultreon.mods.advanceddebug.api.client.menu.IDebugRenderContext;
import com.example.advdbg.ext.util.Foo;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.core.Vec3i;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public class TestPage extends DebugPage {
    public TestPage() {
        super();
    }

    @Override
    public void render(@NotNull GuiGraphics gfx, IDebugRenderContext ctx) {
        ctx.left("Example empty left string.");
        ctx.left("Example left entry (string)", "String Value LOL");
        ctx.left("Example left entry (int)", 123456789);
        ctx.left("Example left entry (float)", 12345.6789f);
        ctx.left("Example left entry (double)", 12345.6789);
        ctx.left("Example left entry (item stack)", new ItemStack(Items.TORCH, 37));
        ctx.left();
        ctx.left("Example left entry (vec3i)", new Vec3i(123, 456, 789));
        ctx.left("Example left entry (vec3)", new Vec3(12.3, 45.6, 78.9));
        ctx.left();
        ctx.left("Example left entry (item)", Items.POTATO);
        ctx.left("Example left entry (pose)", Pose.SLEEPING);
        ctx.left("Example left entry (foo)", new Foo("Test", 8192));

        ctx.right("Example right entry (boolean 1)", true);
        ctx.right();
        ctx.right("Example right entry (boolean 2)", false);

        ctx.top("Example top text 1");
        ctx.top("Example top text 2");
        ctx.top();
        ctx.top("Example top text 3");
    }
}
