package com.group17.towerdefense.gameobject.title.ground;

public class Road extends AbstractGround {
    private double x, y, width, height;

    public Road(int x, int y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPosX() {
        return x;
    }

    @Override
    public double getPosY() {
        return y;
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
