package com.yxdivine.game.processor;

import com.badlogic.gdx.InputProcessor;

public class GameInputProcessor implements InputProcessor {
    @Override
    public boolean keyDown(int keycode) {
//        System.out.println("keydown " + keycode);
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
//        System.out.println("keyUp " + keycode);
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
//        System.out.println("keyTyped " + character);
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
//        System.out.println("touchDown ");
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
//        System.out.println("touchUp " + screenX + " " + screenY + " " + pointer);
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
//        System.out.println("touchDragged " + screenX + " " + screenY + " " + pointer);
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
//        System.out.println("mouseMoved " + screenX + " " + screenY);
        return false;
    }

    @Override
    public boolean scrolled(float amountX, float amountY) {
//        System.out.println("scrolled " + amountX + " " + amountY);
        return false;
    }
}
