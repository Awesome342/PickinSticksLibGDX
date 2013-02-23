package com.hellolibgdx;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class DesktopLauncher {
	public static void main(String[] args) {
		new LwjglApplication(new HelloLibGDX(), "Application Title", 480, 320, false);
	}
}
