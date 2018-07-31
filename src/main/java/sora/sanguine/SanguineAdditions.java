package sora.sanguine;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import sora.sanguine.proxy.CommonProxy;

@Mod(
        modid = Info.MODID,
        name = Info.NAME,
        version = Info.VERSION,
        dependencies = Info.DEPENDENCIES

)
public class SanguineAdditions {

    @Mod.Instance
    public static SanguineAdditions INSTANCE;

    @SidedProxy(clientSide = Info.CLIENTPROXY, serverSide = Info.COMMONPROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        proxy.preInit(event);

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init(event);

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);

    }
}
