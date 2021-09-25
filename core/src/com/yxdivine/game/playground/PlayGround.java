package com.yxdivine.game.playground;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class PlayGround {
    public static void createLabel(){
        Stage stage = new Stage(new ScreenViewport());
        int Help_Guides = 36;
        int row_height = Gdx.graphics.getWidth() / Help_Guides;
        int col_width = Gdx.graphics.getWidth() / Help_Guides;
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
        Label.LabelStyle label1Style = new Label.LabelStyle();
        label1Style.font = new BitmapFont(Gdx.files.internal("bitmapfont/Amble-Regular-26.fnt"));
        label1Style.fontColor = Color.RED;
        Label label = new Label("test test", label1Style);
        label.setSize(Gdx.graphics.getWidth(), row_height);
        label.setPosition(0, Gdx.graphics.getHeight() - row_height * 2);
        label.setAlignment(Align.center);
        // label
        Label label2 = new Label("True Type Font (.ttf) - Gdx FreeType测试", labelStyle);
        label2.setSize(Gdx.graphics.getWidth() / Help_Guides * 5, row_height);
        label2.setPosition(col_width * 2, Gdx.graphics.getHeight() - row_height * 4);
        stage.addActor(label2);

        Skin mySkin = new Skin(Gdx.files.internal("skin/glassy-ui.json"));

        Label label3 = new Label("This is a Label (skin) on  5 columns 测试", mySkin, "black");
        label3.setSize(Gdx.graphics.getWidth() / Help_Guides, row_height);
        label3.setPosition(col_width * 2, Gdx.graphics.getHeight() - row_height * 6);
        stage.addActor(label3);

        Label label4 = new Label("This is a Label (skin) with a 5 columns width but WITH wrap测试", mySkin, "black");
        label4.setSize(Gdx.graphics.getWidth() / Help_Guides * 5, row_height);
        label4.setPosition(col_width * 2, Gdx.graphics.getHeight() - row_height * 7);
        label4.setWrap(true);
        stage.addActor(label4);
    }

}
