package net.romeosnowblitz.hmh2.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.romeosnowblitz.hmh2.block.MagicBlocks;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.block.WoodworkBlocks;
import net.romeosnowblitz.hmh2.item.MagicItems;
import net.romeosnowblitz.hmh2.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    /*
    List of things to figure out for data gen
    Tested:
    Dusts, Logs, Buttons, Fences, Pressure Plates, Saplings, Signs, Slabs, Stairs, Trapdoors, Flowers...
    Testing:
    Charcoal ore
     */

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.AMBER_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.ANDALUSITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.AQUAMARINE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.CHARCOAL_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.CITRINE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.DEEPSLATE_AMBER_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.DEEPSLATE_ANDALUSITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.DEEPSLATE_AQUAMARINE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.DEEPSLATE_CHARCOAL_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.DEEPSLATE_CITRINE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.DEEPSLATE_DIOPSIDE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.DEEPSLATE_GARNET_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.DEEPSLATE_HESSONITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.DEEPSLATE_MALICHITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.DEEPSLATE_MOONSTONE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.DEEPSLATE_OPAL_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.DEEPSLATE_PERIDOT_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.DEEPSLATE_PREHNITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.DEEPSLATE_SMOKY_QUARTZ_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.DEEPSLATE_SPESSARITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.DEEPSLATE_SPHENE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.DEEPSLATE_SPINEL_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.DEEPSLATE_TANZANITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.DEEPSLATE_TOPAZ_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.DEEPSLATE_TORMALINE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.DEEPSLATE_TSAVORITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.DEEPSLATE_ZIRCON_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.DIOPSIDE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.GARNET_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.HESSONITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.MALICHITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.MOONSTONE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.OPAL_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.PERIDOT_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.PREHNITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.RUBY_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.SAPPHIRE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.SMOKY_QUARTZ_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.SPESSARITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.SPHENE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.SPINEL_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.TANZANITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.TOPAZ_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.TORMALINE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.TSAVORITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MagicBlocks.ZIRCON_ORE);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANDESITE_BRICKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BEEF_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BEEF_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHICKEN_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHICKEN_NUGGET_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHISELED_MARBLE_BRICKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CORK_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_SILVER_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_TIN_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DIABASE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DIORITE_BRICKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRANITE_BRICKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRAPHITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.HELLSTONE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.HELLSTONE_BRICKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.HOT_PUMICE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ICED_BUCKET);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.INFESTED_HONEYCOMB_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIFE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIMESTONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LUCKY_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LUCKY_ITEM);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LUCKY_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MARBLE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MARBLE_BRICKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NETHER_PRISMARINE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NEW_GREEN_CONCRETE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NEW_GREEN_CONCRETE_POWDER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NEW_GREEN_STAINED_GLASS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NEW_GREEN_TERRACOTTA);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NEW_GREEN_WOOL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PEAT);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PUMICE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.QUAERITE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.QUICKSAND);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_BEEF_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_BEEF_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_CHICKEN_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_CHICKEN_NUGGET_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_PLATINUM_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_TITANIUM_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ROSE_CONCRETE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ROSE_CONCRETE_POWDER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ROSE_STAINED_GLASS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ROSE_TERRACOTTA);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ROSE_WOOL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ROYAL_JELLY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SALT_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SHALE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SILVER_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SNOW_BRICKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SPRING_GREEN_CONCRETE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SPRING_GREEN_CONCRETE_POWDER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SPRING_GREEN_STAINED_GLASS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SPRING_GREEN_TERRACOTTA);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SPRING_GREEN_WOOL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TIN_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ULTRAMARINE_CONCRETE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ULTRAMARINE_CONCRETE_POWDER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ULTRAMARINE_STAINED_GLASS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ULTRAMARINE_TERRACOTTA);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ULTRAMARINE_WOOL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VIOLET_CONCRETE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VIOLET_CONCRETE_POWDER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VIOLET_STAINED_GLASS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VIOLET_TERRACOTTA);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VIOLET_WOOL);

        blockStateModelGenerator.registerCubeAllModelTexturePool(WoodworkBlocks.BANANA_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(WoodworkBlocks.BANANA_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(WoodworkBlocks.CHERRY_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(WoodworkBlocks.CHERRY_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(WoodworkBlocks.CORK_OAK_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(WoodworkBlocks.CORK_OAK_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(WoodworkBlocks.JACARANDA_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(WoodworkBlocks.JACARANDA_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(WoodworkBlocks.MAHOE_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(WoodworkBlocks.MAHOE_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(WoodworkBlocks.MANGO_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(WoodworkBlocks.MANGO_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(WoodworkBlocks.WILLOW_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(WoodworkBlocks.WILLOW_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(WoodworkBlocks.UNBREAKABLE_LEAVES);
        blockStateModelGenerator.registerDoor(WoodworkBlocks.BANANA_DOOR);
        blockStateModelGenerator.registerDoor(WoodworkBlocks.CHERRY_DOOR);
        blockStateModelGenerator.registerDoor(WoodworkBlocks.CORK_OAK_DOOR);
        blockStateModelGenerator.registerDoor(WoodworkBlocks.JACARANDA_DOOR);
        blockStateModelGenerator.registerDoor(WoodworkBlocks.MAHOE_DOOR);
        blockStateModelGenerator.registerDoor(WoodworkBlocks.MANGO_DOOR);
        blockStateModelGenerator.registerDoor(WoodworkBlocks.WILLOW_DOOR);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(MagicItems.ALIGHT_CHARM, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLOUR, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLUE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUN_STONE, Models.GENERATED);
    }
}
