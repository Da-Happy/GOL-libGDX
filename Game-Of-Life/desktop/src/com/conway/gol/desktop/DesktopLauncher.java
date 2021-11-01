package com.conway.gol.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.conway.gol.conway;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new conway(), config);
		config.title = "GOL";
		config.width = 400;
		config.height = 400;
		new LwjglApplication(new conway(), config);
	}
}
