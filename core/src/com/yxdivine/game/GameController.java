package com.yxdivine.game;

import com.badlogic.gdx.Game;
import com.yxdivine.game.screen.title.TitleScreen;

public class GameController extends Game {

    public static GameController getInstance() {
        return GameSingleton.instance;
    }

    @Override
    public void create() {
        if (GameSingleton.instance == null) {
            GameSingleton.instance = this;
        }
        System.out.println("MyGdxGame.create");
        setScreen(new TitleScreen());
    }

    private static class GameSingleton {
        private static GameController instance;
    }
}