package name.lockdown.mod.block;


import name.lockdown.mod.Mod;
import name.lockdown.mod.api.Constants;
import name.lockdown.mod.client.IVariantProvider;
import name.lockdown.mod.tile.TileTestTile;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class BlockTestTile extends Block implements IVariantProvider {


    public BlockTestTile()
    {
        super(Material.IRON);

        setUnlocalizedName(Constants.Mod.MODID + ".blocktesttile");
        setCreativeTab(Mod.tabMod);
        setHardness(2.0F);
        setResistance(5.0F);
        setHarvestLevel("pickaxe", 1);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) { return false; }

    @Override
    public boolean isFullCube(IBlockState state) { return false; }

    @Override
    public boolean causesSuffocation(IBlockState state) { return false; }


    @Override
    public boolean hasTileEntity(IBlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileTestTile();
    }

    // IVariantProvider
    @Override
    public List<Pair<Integer, String>> getVariants()
    {
        List<Pair<Integer, String>> ret = new ArrayList<Pair<Integer, String>>();
        ret.add(new ImmutablePair<Integer, String>(0, "normal"));
        return ret;
    }
}
