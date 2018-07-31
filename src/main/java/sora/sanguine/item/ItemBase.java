package sora.sanguine.item;

import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase(String name){
        super();
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }

}
