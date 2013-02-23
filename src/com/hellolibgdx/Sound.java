package com.hellolibgdx;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.*;

public class Sound {
	Music backGround;
	
	public void createSound() {
		backGround = Gdx.audio.newMusic(Gdx.files.internal("data/ShallowWater_tgfcoder.mp3"));
	}
	
	public void playMusic() {
		backGround.setLooping(true);
	    backGround.play();
	}
}
