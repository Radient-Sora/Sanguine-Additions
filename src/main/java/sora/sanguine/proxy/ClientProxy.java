package sora.sanguine.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import sora.sanguine.Info;
import sora.sanguine.init.ModItems;
@Mod.EventBusSubscriber(modid = Info.MODID)
@SideOnly(Side.CLIENT)
public class ClientProxy extends  CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event){
        super.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event){
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event){
        super.postInit(event);
    }

    @SubscribeEvent
    public static void rendModel(ModelRegistryEvent event){
        regItem(ModItems.itemSigilForge);


    }

    public static void regItem(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
