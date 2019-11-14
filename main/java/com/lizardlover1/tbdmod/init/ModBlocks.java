package com.lizardlover1.tbdmod.init;

import java.util.ArrayList;
import java.util.List;

import com.lizardlover1.tbdmod.blocks.BlockBase;
import com.lizardlover1.tbdmod.blocks.CopperBlock;
import com.lizardlover1.tbdmod.blocks.OreBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block COPPER_BLOCK = new CopperBlock("copper_block", Material.IRON);
	public static final Block ALUMINUM_BLOCK = new CopperBlock("aluminum_block", Material.IRON);
	public static final Block TIN_BLOCK = new CopperBlock("tin_block", Material.IRON);
	public static final Block COPPER_ORE = new OreBlock("copper_ore", Material.ROCK);
}