package fr.neocraft.main.Proxy.Client.Render.EntityRender.TileEntity;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import fr.neocraft.main.Init.BlockMod;
import fr.neocraft.main.Proxy.Client.ClientProxy;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.world.IBlockAccess;

public class DivinTotemRender implements ISimpleBlockRenderingHandler{
	 @Override
	    public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer)
	    {
	        if(block == BlockMod.BlockDivinTotem)
	        {
	            GL11.glPushMatrix();
	            GL11.glRotatef(180F, 0F, 0F, 1F);
	            GL11.glTranslatef(0F, -1F, 0F);
	             
	             Minecraft.getMinecraft().getTextureManager().bindTexture(DivinTotemTileEntityRenderer.texture);
	             DivinTotemTileEntityRenderer.model.render();
	            GL11.glPopMatrix();

	        }
	    }

	    @Override
	    public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer)
	    {
	        return false;
	    }

	    @Override
	    public boolean shouldRender3DInInventory(int modelId)
	    {
	        return true;
	    }

	    @Override
	    public int getRenderId()
	    {
	        return ClientProxy.renderDivinTotem;
	    }
}
