package fr.neocraft.main.Proxy.Client.Render.EntityRender.Entity;

import fr.neocraft.main.neoreference;
import fr.neocraft.main.Proxy.Serveur.Entity.EntityAviator;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderAviator  extends RenderLiving
{
    private ResourceLocation texture = new ResourceLocation(neoreference.MOD_ID + ":textures/mobs/aviator.png");

    public RenderAviator(ModelBase p_i1262_1_, float p_i1262_2_)
    {
        super(p_i1262_1_, p_i1262_2_);
    }
    
    protected ResourceLocation getEntiyTexture(EntityLiving living)
    {
        return this.getEntityTexture((EntityAviator) living);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return texture;
    }
}
