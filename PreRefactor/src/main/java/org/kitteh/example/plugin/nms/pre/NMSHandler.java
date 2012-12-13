package org.kitteh.example.plugin.nms.pre;

import net.minecraft.server.NBTTagCompound;

import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;
import org.kitteh.example.plugin.api.NMS;

public class NMSHandler implements NMS {

    @Override
    public void setName(ItemStack stack, String name) {
        NBTTagCompound tag = ((CraftItemStack) stack).getHandle().tag;
        if (!tag.hasKey("display")) {
            tag.setCompound("display", new NBTTagCompound());
        }
        tag.getCompound("display").setString("Name", name);
    }

}
