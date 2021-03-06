/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.cct.proxy;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.thedragonteam.cct.CCTConfig;
import net.thedragonteam.cct.registry.ModBlocks;
import net.thedragonteam.cct.registry.ModCompatibility;
import net.thedragonteam.cct.tileentity.*;
import net.thedragonteam.thedragonlib.config.ModConfigProcessor;
import net.thedragonteam.thedragonlib.util.LogHelper;

import static net.thedragonteam.cct.compat.ICompatibility.InitializationPhase.INIT;
import static net.thedragonteam.cct.compat.ICompatibility.InitializationPhase.POST_INIT;
import static net.thedragonteam.cct.compat.ICompatibility.InitializationPhase.PRE_INIT;

public class CommonProxy {

    public static ModConfigProcessor configProcessor = new ModConfigProcessor();
    public static Configuration configuration;

    public void preInit(FMLPreInitializationEvent event) {
        ModBlocks.init();
        configuration = new Configuration(event.getSuggestedConfigurationFile());
        configProcessor.processConfig(CCTConfig.class, configuration);
        registerTileEntities();
        ModCompatibility.registerModCompat();
        ModCompatibility.loadCompat(PRE_INIT);
        LogHelper.INSTANCE.info("Finished PreInitialization");
    }

    public void init(FMLInitializationEvent event) {
        ModCompatibility.loadCompat(INIT);
        LogHelper.INSTANCE.info("Finished Initialization");
    }

    public void postInit(FMLPostInitializationEvent event) {
        ModCompatibility.loadCompat(POST_INIT);
        LogHelper.INSTANCE.info("Finished PostInitialization");
    }

    public void registerTileEntities() {
        GameRegistry.registerTileEntityWithAlternatives(TileEntityOneByOne.class, "OneByOne", "BenchOneByOne", "CCT_1x1", "1x1", "cct_1x1", "cct_one_by_one");
        GameRegistry.registerTileEntityWithAlternatives(TileEntityTwoByTwo.class, "TwoByTwo", "BenchTwoByTwo", "CCT_2x2", "2x2", "cct_2x2", "cct_two_by_two");
        GameRegistry.registerTileEntityWithAlternatives(TileEntityThreeByThree.class, "ThreeByThree", "BenchThreeByThree", "CCT_3x3", "3x3", "cct_3x3", "cct_three_by_three");
        GameRegistry.registerTileEntityWithAlternatives(TileEntityFourByFour.class, "FourByFour", "BenchFourByFour", "CCT_4x4", "4x4", "cct_4x4", "cct_four_by_four");
        GameRegistry.registerTileEntityWithAlternatives(TileEntityFiveByFive.class, "FiveByFive", "BenchFiveByFive", "CCT_5x5", "5x5", "cct_5x5", "cct_five_by_five");
        GameRegistry.registerTileEntityWithAlternatives(TileEntitySixBySix.class, "SixBySix", "BenchSixBySix", "CCT_6x6", "6x6", "cct_6x6", "cct_six_by_six");
        GameRegistry.registerTileEntityWithAlternatives(TileEntitySevenBySeven.class, "SevenBySeven", "BenchSevenBySeven", "CCT_7x7", "7x7", "cct_8x8", "cct_seven_by_seven");
        GameRegistry.registerTileEntityWithAlternatives(TileEntityEightByEight.class, "EightByEight", "BenchEightByEight", "CCT_8x8", "8x8", "cct_8x8", "cct_eight_by_eight");
        GameRegistry.registerTileEntityWithAlternatives(TileEntityNineByNine.class, "NineByNine", "BenchNineByNine", "CCT_9x9", "9x9", "cct_9x9", "cct_nine_by_nine");
        GameRegistry.registerTileEntityWithAlternatives(TileEntityTenByTen.class, "TenByTen", "BenchTenByTen", "CCT_10x10", "10x10", "cct_10x10", "cct_ten_by_ten");
    }
}