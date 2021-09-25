package com.yxdivine.game.screen.title;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class TitleStage extends Stage {
    final int GRID_SIZE = 36;

    public TitleStage() {
        super(new ScreenViewport());
        init();
    }

    private static Label getLabel(int posX, int posY, int rowHeight, String text) {
//        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("truetypefont/Amble-Light.ttf"));
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("otf/NotoSansSC-Regular.otf"));
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = 120;
        parameter.borderWidth = 1;
        parameter.color = Color.YELLOW;
        parameter.shadowOffsetX = 3;
        parameter.shadowOffsetY = 3;
        parameter.shadowColor = new Color(0, 0.5f, 0, 0.75f);
        BitmapFont font24 = generator.generateFont(parameter); // font size 24 pixels
        generator.dispose();

        Label.LabelStyle labelStyle = new Label.LabelStyle();
        labelStyle.font = font24;
//        Label.LabelStyle label1Style = new Label.LabelStyle();
//        label1Style.font = new BitmapFont(Gdx.files.internal("bitmapfont/Amble-Regular-26.fnt"));
//        label1Style.fontColor = Color.RED;
        Label label = new Label(text, labelStyle);
        label.setSize(Gdx.graphics.getWidth(), rowHeight);
        label.setPosition(posX, posY);
        label.setAlignment(Align.center);
        return label;
    }

    private void init() {
        addBackgroundGuide(GRID_SIZE);
        addActor(getLabel(0, Gdx.graphics.getHeight() / 2 + GRID_SIZE * 2, GRID_SIZE, "Project End of the World终末"));
        addButtons();
    }

    /**
     * 添加辅助线
     *
     * @param columns 辅助线列数
     */
    private void addBackgroundGuide(int columns) {
        Texture texture = new Texture(Gdx.files.internal("background.jpg"));
        texture.setWrap(Texture.TextureWrap.MirroredRepeat, Texture.TextureWrap.MirroredRepeat);

        TextureRegion textureRegion = new TextureRegion(texture);
        textureRegion.setRegion(0, 0, texture.getWidth() * columns, texture.getWidth() * columns);
        Image background = new Image(textureRegion);
        background.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getWidth());
        background.setPosition(0, Gdx.graphics.getHeight() - background.getHeight());
        addActor(background);
    }

    private void addButtons() {
        Skin mySkin = new Skin(Gdx.files.internal("skin/glassy-ui.json"));
        Button quitButton = new ImageButton(mySkin);
        ImageButton.ImageButtonStyle quitButtonStyle = new ImageButton.ImageButtonStyle();
        quitButton.setStyle(quitButtonStyle);
        quitButton.setSize(100, 100);
        quitButton.setPosition(0, 0);
        addActor(quitButton);
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        System.out.println("TitleStage.mouseMove" + screenX + " " + screenY);
        return super.mouseMoved(screenX, screenY);
    }


}
