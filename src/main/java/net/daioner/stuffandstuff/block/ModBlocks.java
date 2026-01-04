package net.daioner.stuffandstuff.block;

import net.daioner.stuffandstuff.StuffAndStuff;
import net.daioner.stuffandstuff.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, StuffAndStuff.MOD_ID);

    public static final RegistryObject<Block> BISIOORE = registerBlock("bisio_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 5), BlockBehaviour.Properties.of()
            .strength(2.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> BISIETTOORE = registerBlock("bisietto_ore",
            () -> new DropExperienceBlock(UniformInt.of(1, 2), BlockBehaviour.Properties.of()
                    .strength(1.5F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> BISIOBLOCK = registerBlock("bisio_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(5.0F).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
