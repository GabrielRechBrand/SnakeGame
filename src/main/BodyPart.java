package main;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BodyPart {

    private int xCoor, yCoor, width, height;
    private static List<Color> colors = new ArrayList<Color>();
    private int indexCor = 0;

    public BodyPart(int xCoor, int yCoor, int tileSize) {
        this.xCoor = xCoor;
        this.yCoor = yCoor;
        width = tileSize;
        height = tileSize;

    }

    public void tick() {

    }

    public void draw(Graphics g) {
        g.setColor(colors.get(0));
        Color first = colors.get(0);
        colors.remove(0);
        colors.add(first);
        g.fillRect(xCoor * width, yCoor * height, width, height);

    }
    static {
        for (int r=0; r<100; r++) colors.add(new Color(r*255/100,       255,         0));
        for (int g=100; g>0; g--) colors.add(new Color(      255, g*255/100,         0));
        for (int b=0; b<100; b++) colors.add(new Color(      255,         0, b*255/100));
        for (int r=100; r>0; r--) colors.add(new Color(r*255/100,         0,       255));
        for (int g=0; g<100; g++) colors.add(new Color(        0, g*255/100,       255));
        for (int b=100; b>0; b--) colors.add(new Color(        0,       255, b*255/100));
        colors.add(new Color(        0,       255,         0));

    }

    public int getxCoor() {
        return xCoor;
    }

    public void setxCoor(int xCoor) {
        this.xCoor = xCoor;
    }

    public int getyCoor() {
        return yCoor;
    }

    public void setyCoor(int yCoor) {
        this.yCoor = yCoor;
    }


}
