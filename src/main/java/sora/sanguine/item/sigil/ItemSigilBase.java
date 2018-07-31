package sora.sanguine.item.sigil;

import WayofTime.bloodmagic.client.IVariantProvider;
import WayofTime.bloodmagic.item.ItemSigil;
import WayofTime.bloodmagic.util.helper.TextHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ItemSigilBase extends ItemSigil implements IVariantProvider {

    public ItemSigilBase(String name, int lpUsed) {
        super(lpUsed);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);

    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        if (!stack.hasTagCompound()) {
            return;
        } else {
            tooltip.add(TextHelper.localizeEffect("tooltip.bloodmagic.currentOwner", getBinding(stack).getOwnerName()));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
