package com.lizardlover1.tbdmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CopperBlock extends BlockBase {

	public CopperBlock(String name, Material material) {
		
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(4.5f);
		setResistance(25.0f);
		setHarvestLevel("pickaxe", 1);
	}
}