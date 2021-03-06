/*
 * Copyright (c) TheDragonTeam 2016-2017.
 */

package net.thedragonteam.cct.container.base;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

import javax.annotation.Nonnull;

public class ContainerBase extends Container {

    @Override
    public boolean canInteractWith(@Nonnull EntityPlayer player) {
        return true;
    }
}