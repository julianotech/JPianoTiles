package uk.jtech.game.jpianotiles;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;

/**
 * Created by julianotech on 12/02/2018.
 * This Class defines the statics values for screen, color, size, and tile
 */

public class Cons {
    public static Color green = new Color(0,0.4f,0,1);

    public static int screenx = Gdx.graphics.getWidth();
    public static int screeny = Gdx.graphics.getHeight();

    public static int tileWidth = screenx/4;
    public static int tileHeight = screeny/4;

    public static float startSpeed = 1*tileHeight/2f;
    public static float curSpeed = 0;
}
