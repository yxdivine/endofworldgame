package com.yxdivine.game.components;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.utils.Align;

public class LabelHelper {
    public static Label getLabel(int posX, int posY, int rowHeight, String text) {
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("truetypefont/Amble-Light.ttf"));
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = 30;
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

}
