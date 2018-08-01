package sora.sanguine.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnaceOutput;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.SlotItemHandler;

import javax.annotation.Nonnull;


public class ContainerForgeSigil extends Container {
    public ItemStack sigilItem;
    public ItemStackHandler itemStackHandler;

    public ContainerForgeSigil(ItemStack stack, InventoryPlayer player) {
        this.sigilItem = stack;
        this.itemStackHandler = new ItemStackHandler(2);
        if(stack.hasTagCompound() && stack.getTagCompound().hasKey("furnaceInventory")) {
            this.itemStackHandler.deserializeNBT(stack.getTagCompound().getCompoundTag("furnaceInventory"));
        }
        addSlotToContainer(new SlotItemHandler(itemStackHandler, 0, 56, 35));
        addSlotToContainer(new SlotOutput(itemStackHandler, 1, 116, 35));
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlotToContainer(new Slot(player, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for (int k = 0; k < 9; ++k) {
            this.addSlotToContainer(new Slot(player, k, 8 + k * 18, 142));
        }
    }


    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
        return ItemStack.EMPTY;
    }

    @Override
    public void onContainerClosed(EntityPlayer playerIn) {
        super.onContainerClosed(playerIn);
        if (!sigilItem.hasTagCompound()) {
            sigilItem.setTagCompound(new NBTTagCompound());
        }
        sigilItem.getTagCompound().setTag("furnaceInventory",itemStackHandler.serializeNBT());

    }
    public static class SlotOutput extends SlotItemHandler{

        public SlotOutput(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
            super(itemHandler, index, xPosition, yPosition);
        }

        @Override
        public boolean isItemValid(@Nonnull ItemStack stack) {
            return false;
        }
    }

}
