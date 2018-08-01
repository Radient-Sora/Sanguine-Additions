package sora.sanguine.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;
import sora.sanguine.Info;

public class GuiForgeSigil extends GuiContainer {

    public static final int WIDTH = 176;
    public static final int HEIGHT = 166;
    public static ResourceLocation resourceLocation = new ResourceLocation(Info.MODID, "textures/gui/forge_gui.png");

    public GuiForgeSigil(ContainerForgeSigil inventorySlotsIn) {
        super(inventorySlotsIn);
        xSize = WIDTH;
        ySize = HEIGHT;
    }

    @Override
    public void initGui() {
        super.initGui();
        this.guiLeft = (this.width - this.xSize)/2;
        this.guiTop =(this.height - this.ySize)/2;
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        this.drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        mc.getTextureManager().bindTexture(resourceLocation);
        drawTexturedModalRect(guiLeft,guiTop,0,0,xSize,ySize);

    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        String guiName = I18n.format("forge_sigil.name");
        this.fontRenderer.drawString(guiName, this.xSize / 2 - this.fontRenderer.getStringWidth(guiName) / 2, -8, 0x991c09);
    }
}
