package net.romeosnowblitz.hmh2.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.entity.mob.*;

public class MobEntities {
    public static final EntityType<PenguinEntity> PENGUIN = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "penguin"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, PenguinEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 0.3f)).build());

    public static final EntityType<ShadowCreatureEntity> SHADOW_CREATURE = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "shadow_creature"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, ShadowCreatureEntity::new)
                    .dimensions(EntityDimensions.fixed(0.8f, 1.6f)).build());

    public static final EntityType<SoldierBeeEntity> SOLDIER_BEE = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "soldier_bee"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, SoldierBeeEntity::new)
                    .dimensions(EntityDimensions.fixed(1.5f, 3.0f)).build());

    public static final EntityType<TheGreatHungerEntity> THE_GREAT_HUNGER = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "the_great_hunger"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, TheGreatHungerEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 0.6f)).build());

    public static final EntityType<QueenBeeEntity> QUEEN_BEE = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "queen_bee"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, QueenBeeEntity::new)
                    .dimensions(EntityDimensions.fixed(1.5f, 3.0f)).build());

}
