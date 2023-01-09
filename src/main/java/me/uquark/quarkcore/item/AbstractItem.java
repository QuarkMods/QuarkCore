package me.uquark.quarkcore.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public abstract class AbstractItem extends Item {
    public final Identifier id;

    public AbstractItem(String modid, String name, Settings settings) {
        super(settings);
        id = new Identifier(modid, name);
    }

    public void register() {
        Registry.register(Registries.ITEM, id, this);
    }
}
