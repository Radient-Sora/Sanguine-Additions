package sora.sanguine.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import javax.annotation.Nullable;

public class GuiHandler implements IGuiHandler {
    public static final int FORGE_SIGIL_GUI = 0;
    @Nullable
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID == FORGE_SIGIL_GUI){
            return  new ContainerForgeSigil(player.getHeldItemMainhand(),player.inventory);
        }
        return null;
    }

    @Nullable
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID == FORGE_SIGIL_GUI){
            return new GuiForgeSigil(new ContainerForgeSigil(player.getHeldItemMainhand(),player.inventory));
        }
        return null;
    }
}
