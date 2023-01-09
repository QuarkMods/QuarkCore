package me.uquark.quarkcore.item;

import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public abstract class AbstractToolItem extends ToolItem {
    public final Identifier id;

    public AbstractToolItem(String modid, String name, ToolMaterial material, Settings settings) {
        super(material, settings);
        id = new Identifier(modid, name);
    }

    public void register() {
        Registry.register(Registries.ITEM, id, this);
    }
}
