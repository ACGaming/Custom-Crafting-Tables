package net.thedragonteam.cct.blocks;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IStringSerializable;
import net.thedragonteam.cct.tileentity.*;

import javax.annotation.Nonnull;

import static net.thedragonteam.cct.CCTConfig.cctNames;

public enum EnumCCT implements IStringSerializable {
    CCT_1X1("cct_1x1", 0, new TileEntityOneByOne()),
    CCT_2X2("cct_2x2", 1, new TileEntityTwoByTwo()),
    CCT_3X3("cct_3x3", 2, new TileEntityThreeByThree()),
    CCT_4X4("cct_4x4", 3, new TileEntityFourByFour()),
    CCT_5X5("cct_5x5", 4, new TileEntityFiveByFive()),
    CCT_6X6("cct_6x6", 5, new TileEntitySixBySix()),
    CCT_7X7("cct_7x7", 6, new TileEntitySevenBySeven()),
    CCT_8X8("cct_8x8", 7, new TileEntityEightByEight()),
    CCT_9X9("cct_9x9", 8, new TileEntityNineByNine()),
    CCT_10X10("cct_10x10", 9, new TileEntityTenByTen()),;

    private final String name;
    private final int blockNumber;
    private final TileEntity tileEntity;

    EnumCCT(String nameIn, int blockNumberIn, TileEntity tileEntityIn) {
        this.name = nameIn;
        this.blockNumber = blockNumberIn;
        this.tileEntity = tileEntityIn;
    }

    public String toString() {
        return this.name;
    }

    @Override
    @Nonnull
    public String getName() {
        return this.name;
    }

    public int getBlockNumber() {
        return blockNumber;
    }

    public TileEntity getTileEntity() {
        return tileEntity;
    }

    public EnumCCT getCCT() {
        return this;
    }

    public String getDisplayName() {
        return cctNames[this.getBlockNumber()];
    }

}
