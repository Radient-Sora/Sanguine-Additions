package sora.sanguine.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import sora.sanguine.SanguineAdditions;
import sora.sanguine.gui.GuiHandler;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {

    }

    public void init(FMLInitializationEvent event) {
        NetworkRegistry.INSTANCE.registerGuiHandler(SanguineAdditions.INSTANCE,new GuiHandler());

    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
