package it.rebirthproject.gdx.tiledmap.tiled.utils;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import org.junit.jupiter.api.Test;

public abstract class GdxTestJUnit extends GdxTest {
    @Test
    public void launch() {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setWindowedMode(640, 480);
        config.setTitle(getClass().getSimpleName().replace("JUnitTest", ""));
        new Lwjgl3Application(this, config);
    }
}
