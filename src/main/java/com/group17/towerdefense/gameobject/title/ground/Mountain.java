package com.group17.towerdefense.gameobject.title.ground;

public class Mountain extends AbstractGround {
    private double posX, posY, width, height;

    public Mountain(double x, double y, double width, double height) {
        this.posX = x;
        this.posY = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPosX() {
        return posX;
    }

    @Override
    public double getPosY() {
        return posY;
    }

    @Override
    public double getAngle() {
        return 0;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void doUpdate(long tick) {
    }

    @Override
    public boolean isExist() {
        return true;
    }
}
