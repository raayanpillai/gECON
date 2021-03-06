package gecon.mod.alpha.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockTradingTable extends BlockGECON
{
	public BlockTradingTable(int id, Material par2Material) {
		super(id, par2Material);
		
	}
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
    	  if (par1World.isRemote)
          {
              return true;
          }
          else
          {
              TileEntityFurnace tileentityfurnace = (TileEntityFurnace)par1World.getBlockTileEntity(par2, par3, par4);

              if (tileentityfurnace != null)
              {
                  par5EntityPlayer.displayGUIFurnace(tileentityfurnace);
              }

              return true;
          }   }
}
