package me.uquark.quarkcore.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public abstract class AbstractHorizontalFacingBlock extends HorizontalFacingBlock {
    public final Identifier id;
    public final BlockItem item;

    protected AbstractHorizontalFacingBlock(String modid, String name, Settings blockSettings, Item.Settings itemSettings) {
        super(blockSettings);
        id = new Identifier(modid, name);
        item = new BlockItem(this, itemSettings);
    }

    public void register() {
        Registry.register(Registries.BLOCK, id, this);
        Registry.register(Registries.ITEM, id, item);
    }
}
