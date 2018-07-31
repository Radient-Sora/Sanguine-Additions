package sora.sanguine.handler;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import sora.sanguine.Info;
import sora.sanguine.init.ModItems;

@Mod.EventBusSubscriber(modid = Info.MODID)
public class RegistryHandler {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event ){
        event.getRegistry().register(ModItems.itemSigilForge);


    }
}
