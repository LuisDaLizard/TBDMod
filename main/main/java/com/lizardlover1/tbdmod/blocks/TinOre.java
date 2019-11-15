package com.lizardlover1.tbdmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TinOre extends BlockBase{
	public TinOre(String name, Material material) {
		
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(4.5f);
		setResistance(25.0f);
		setHarvestLevel("pickaxe", 1);
	}
}
