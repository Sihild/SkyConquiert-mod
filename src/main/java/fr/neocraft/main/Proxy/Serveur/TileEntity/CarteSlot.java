package fr.neocraft.main.Proxy.Serveur.TileEntity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class CarteSlot extends Slot{

	public int idStageWidth = 16;
	
	public CarteSlot(IInventory p_i1824_1_, int p_i1824_2_, int p_i1824_3_, int p_i1824_4_, int idstage) {
		super(p_i1824_1_, p_i1824_2_, p_i1824_3_, p_i1824_4_);
		// TODO Auto-generated constructor stub
		this.idStageWidth =idstage;
	}
	public boolean canTakeStack(EntityPlayer p_82869_1_)
    {
        return false;
    }
	public boolean isItemValid(ItemStack p_75214_1_)
    {
        return false;
    }
}
