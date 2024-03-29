package com.steffy.mines.resources.mines;

public class MinePosition {

    private int x, y, z;

    public MinePosition(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return x + ":" + y + ":" + z;
    }
}