package net.romeosnowblitz.hmh2;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.client.render.RenderLayer;
import net.romeosnowblitz.hmh2.block.MagicBlocks;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.block.WoodworkBlocks;
import net.romeosnowblitz.hmh2.entity.MobEntities;
import net.romeosnowblitz.hmh2.entity.client.*;
import net.romeosnowblitz.hmh2.fluid.ModFluids;
import net.romeosnowblitz.hmh2.screen.BackpackScreen;
import net.romeosnowblitz.hmh2.screen.ModScreenHandlers;
import net.romeosnowblitz.hmh2.util.ModModelPredicateProvider;

public class Hmh2ClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_SPIDER_LILY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ULTRAMARINE_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ULTRAMARINE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POISON_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ROSE_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ROSE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WOLFSBANE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VIOLET_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VIOLET_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.NEW_GREEN_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.NEW_GREEN_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPRING_GREEN_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPRING_GREEN_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUEBERRY_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRAWBERRY_BUSH, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.AMBER_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.ANDALUSITE_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.AQUAMARINE_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.CITRINE_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.DIOPSIDE_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.GARNET_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.HESSONITE_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.MALICHITE_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.MOONSTONE_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.OPAL_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.PERIDOT_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.PREHNITE_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.RUBY_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.SAPPHIRE_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.SMOKY_QUARTZ_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.SPESSARITE_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.SPHENE_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.SPINEL_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.TANZANITE_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.TOPAZ_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.TORMALINE_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.TSAVORITE_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.ZIRCON_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.AMETHYST_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.CHARCOAL_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.COAL_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.COPPER_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.DIAMOND_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.EMERALD_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.FLINT_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.GOLD_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.IRON_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.LAPIS_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.XRAY, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MIDAS_TOUCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENDER_CORN_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ROYAL_JELLY, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ICED_BUCKET, RenderLayer.getTranslucent());

        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.BANANA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.BANANA_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.BANANA_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.BANANA_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.CHERRY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.CHERRY_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.CHERRY_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.CHERRY_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.CORK_OAK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.CORK_OAK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.CORK_OAK_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.CORK_OAK_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.JACARANDA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.JACARANDA_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.JACARANDA_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.JACARANDA_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.MAHOE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.MAHOE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.MAHOE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.MAHOE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.MANGO_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.MANGO_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.MANGO_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.MANGO_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.WILLOW_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.WILLOW_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.WILLOW_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.WILLOW_TRAPDOOR, RenderLayer.getCutout());

        ModModelPredicateProvider.registerModModels();
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.CHOCOLATE_MILK_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x976746));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.CHOCOLATE_MILK_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x976746));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.HEATED_OIL_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x423b2f));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.HEATED_OIL_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x423b2f));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.HONEY_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0xdd760f));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.HONEY_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0xdd760f));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.OIL_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x423b2f));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.OIL_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x423b2f));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.ABSORPTION_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x2552A5));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.ABSORPTION_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x2552A5));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.BAD_LUCK_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0xC0A44D));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.BAD_LUCK_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0xC0A44D));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.BAD_OMEN_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x0b6138));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.BAD_OMEN_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x0b6138));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.BLINDNESS_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x1F1F23 ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.BLINDNESS_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x1F1F23 ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.CONDUIT_POWER_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x1DC2D1));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.CONDUIT_POWER_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x1DC2D1));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.DARKNESS_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x292721));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.DARKNESS_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x292721));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.DOLPHINS_GRACE_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x88A3BE));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.DOLPHINS_GRACE_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x88A3BE));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.FIRE_IMMUNITY_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0xE49A3A));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.FIRE_IMMUNITY_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0xE49A3A));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.GLOWING_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x94A061));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.GLOWING_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x94A061 ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.HASTE_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0xD9C043));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.HASTE_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0xD9C043));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.HEALTH_BOOST_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0xF87D23));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.HEALTH_BOOST_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0xF87D23));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.HUNGER_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x587653));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.HUNGER_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x587653));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.INSTANT_DAMAGE_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x430A09));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.INSTANT_DAMAGE_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x430A09));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.INSTANT_HEALTH_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0xF82423));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.INSTANT_HEALTH_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0xF82423));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.INVISIBILITY_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x7F8392));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.INVISIBILITY_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x7F8392));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.JUMP_BOOST_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x22FF4C));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.JUMP_BOOST_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x22FF4C));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.LEVITATION_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0xCEFFFF));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.LEVITATION_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0xCEFFFF));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.LUCK_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x339900));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.LUCK_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x339900));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MINING_FATIGUE_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x4A4217));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MINING_FATIGUE_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x4A4217));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.NAUSEA_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x551D4A));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.NAUSEA_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x551D4A));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.NIGHT_VISION_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x1F1FA1));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.NIGHT_VISION_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x1F1FA1));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.POISON_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x4E9331));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.POISON_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x4E9331));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.REGENERATION_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0xCD5CAB));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.REGENERATION_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0xCD5CAB));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.RESISTANCE_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x99453A));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.RESISTANCE_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x99453A));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.SATURATION_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0xF82421));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.SATURATION_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0xF82421));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.SLOW_FALLING_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0xFFEFD1));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.SLOW_FALLING_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0xFFEFD1));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.SLOWNESS_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x5A6C81));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.SLOWNESS_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x5A6C81));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.SPEED_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x7CAFC6));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.SPEED_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x7CAFC6));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STRENGTH_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x932423));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STRENGTH_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x932423));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.VILLAGE_HERO_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x44FF44));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.VILLAGE_HERO_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x44FF44));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.WATER_BREATHING_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x2E5299));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.WATER_BREATHING_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x2E5299));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.WEAKNESS_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x484D48));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.WEAKNESS_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x484D48));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.WITHER_FLUID_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x352A27));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.WITHER_FLUID_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x352A27));

        EntityRendererRegistry.register(MobEntities.PENGUIN, PenguinRenderer::new);
        EntityRendererRegistry.register(MobEntities.QUEEN_BEE, QueenBeeRenderer::new);
        EntityRendererRegistry.register(MobEntities.SHADOW_CREATURE, ShadowCreatureRenderer::new);
        EntityRendererRegistry.register(MobEntities.SOLDIER_BEE, SoldierBeeRenderer::new);
        EntityRendererRegistry.register(MobEntities.THE_GREAT_HUNGER, TheGreatHungerRenderer::new);
        EntityRendererRegistry.register(MobEntities.HELLMITE, HellmiteRenderer::new);
        EntityRendererRegistry.register(MobEntities.MAGMITE, MagmiteRenderer::new);
        EntityRendererRegistry.register(MobEntities.CAL, CalRenderer::new);
        EntityRendererRegistry.register(MobEntities.SCULKMITE, SculkmiteRenderer::new);

        ScreenRegistry.register(ModScreenHandlers.BACKPACK_SCREEN_HANDLER, BackpackScreen::new);
        /*
        ScreenRegistry.register(ModScreenHandlers.CHEESE_PRESS_SCREEN_HANDLER, CheesePressScreen::new);
        ScreenRegistry.register(ModScreenHandlers.FREEZER_SCREEN_HANDLER, FreezerScreen::new);
         */

    }
}
