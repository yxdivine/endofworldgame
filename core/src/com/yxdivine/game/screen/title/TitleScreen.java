package com.yxdivine.game.screen.title;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;

public class TitleScreen extends ScreenAdapter {
    TitleStage titleStage;

    public TitleScreen() {
        super();
        titleStage = new TitleStage();
        Gdx.input.setInputProcessor(titleStage);
    }

    @Override
    public void show() {
        System.out.println(this.getClass() + ".show");
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        titleStage.act();
        titleStage.draw();
    }

    @Override
    public void resize(int width, int height) {
        System.out.println(this.getClass() + ".resize " + width + " " + height);
    }

    @Override
    public void pause() {
        System.out.println(this.getClass() + ".pause");
    }

    @Override
    public void resume() {
        System.out.println(this.getClass() + ".resume");

    }

    @Override
    public void hide() {
        System.out.println(this.getClass() + ".hide");

    }

    @Override
    public void dispose() {
        System.out.println(this.getClass() + ".dispose");
        titleStage.dispose();
    }
}
