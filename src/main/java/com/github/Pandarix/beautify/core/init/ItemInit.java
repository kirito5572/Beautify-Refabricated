package com.github.Pandarix.beautify.core.init;

import com.github.Pandarix.beautify.Beautify;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ItemInit {
	private ItemInit() {
	}

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Beautify.MODID);

	// BLOCK ITEMS
	public static final RegistryObject<BlockItem> ROPE_ITEM = ITEMS.register("rope",
			() -> new BlockItem(BlockInit.ROPE.get(), new Item.Properties().tab(Beautify.BEAUTIFY_TAB)));
	
	public static final RegistryObject<BlockItem> BOOKSTACK_ITEM = ITEMS.register("bookstack",
			() -> new BlockItem(BlockInit.BOOKSTACK.get(), new Item.Properties().tab(Beautify.BEAUTIFY_TAB)));
	
	public static final RegistryObject<BlockItem> HANGING_POT_ITEM = ITEMS.register("hanging_pot",
			() -> new BlockItem(BlockInit.HANGING_POT.get(), new Item.Properties().tab(Beautify.BEAUTIFY_TAB)));
	
		//picture frame
	public static final RegistryObject<BlockItem> OAK_PICTURE_FRAME_ITEM = ITEMS.register("oak_picture_frame",
			() -> new BlockItem(BlockInit.OAK_PICTURE_FRAME.get(), new Item.Properties().tab(Beautify.BEAUTIFY_TAB)));
	
	public static final RegistryObject<BlockItem> SPRUCE_PICTURE_FRAME_ITEM = ITEMS.register("spruce_picture_frame",
			() -> new BlockItem(BlockInit.SPRUCE_PICTURE_FRAME.get(), new Item.Properties().tab(Beautify.BEAUTIFY_TAB)));
}
