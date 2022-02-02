package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Map {
    public static final int SIZE_X = 20;
    public static final int SIZE_Y = 15;

    public static final int CELL_SIZE = 40;

    private TextureRegion grassTexture;

    public Map(TextureAtlas atlas) {
        this.grassTexture = atlas.findRegion("grass32");
    }

    public void render(SpriteBatch batch) {
        for (int i = 0; i < SIZE_X; i++) {
            for (int j = 0; j < SIZE_Y; j++) {
                batch.draw(grassTexture, i * CELL_SIZE, j * CELL_SIZE);
            }
        }
    }
}
