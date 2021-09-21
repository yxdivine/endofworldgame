package com.yxdivine.game.graphic;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GraphicGrid {
    private static Texture grid = new Texture("grid.bmp");

    public static void paintGrid(SpriteBatch batch) {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                batch.draw(grid, i * 64, j * 64, 64, 64);
            }
        }
    }

}
