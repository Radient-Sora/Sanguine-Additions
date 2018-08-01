package sora.sanguine.item.sigil;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import sora.sanguine.SanguineAdditions;
import sora.sanguine.gui.GuiHandler;

public class ItemSigilForge extends ItemSigilBase {
    public ItemStack input_stack;
    public ItemStack output_stack;

    public ItemSigilForge() {
        super("sigil_of_forge", 0);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        if (!worldIn.isRemote) {
            if (playerIn.isSneaking()) {
                playerIn.openGui(SanguineAdditions.INSTANCE, GuiHandler.FORGE_SIGIL_GUI, worldIn,handIn.ordinal(),0,0);
            }
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
