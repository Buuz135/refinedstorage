package com.raoulvdberge.refinedstorage.inventory.listener;

import com.raoulvdberge.refinedstorage.inventory.item.BaseItemHandler;
import net.minecraft.tileentity.TileEntity;

public class TileInventoryListener implements InventoryListener<BaseItemHandler> {
    private TileEntity tile;

    public TileInventoryListener(TileEntity tile) {
        this.tile = tile;
    }

    @Override
    public void onChanged(BaseItemHandler handler, int slot, boolean reading) {
        if (!reading) {
            tile.markDirty();
        }
    }
}
