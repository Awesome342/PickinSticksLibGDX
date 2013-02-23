package com.hellolibgdx;

import java.awt.Color;

import java.awt.Graphics;
import java.util.Random;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

//importing seperatly to emphasize class usage
import com.hellolibgdx.Player;
import com.hellolibgdx.Sound;

public class HelloLibGDX implements ApplicationListener {
	private Player Playering;
	private Sound Soundzz;
	private Random rand = new Random();

	public boolean Collide(int s1x, int s2x, int s1y, int s2y) {
		if (s1x > s2x - 32 && s1x < s2x + 32 && s1y > s2y - 32 && s1y < s2y + 32) {
			return true;
		} else {
			return false;
		}
	}

	
	@Override
	public void create() {
		Playering = new Player();
		Soundzz = new Sound();
		Playering.create_graphics();
		Soundzz.createSound();
		Soundzz.playMusic();
	}
	
	@Override
	public void dispose() {
		
	}
	
	@Override 
	public void pause() {
		
	}
	
	@Override 
	public void render() {
		Playering.get_input();
		Playering.update();
		Playering.draw_graphics();
		
		if (Collide(Playering.x, Playering.StickX, Playering.y, Playering.StickY)) {
			Playering.StickX = rand.nextInt(462);
			Playering.StickY = rand.nextInt(282);
		}
		
		if (Collide(Playering.x, Playering.Stick2x, Playering.y, Playering.Stick2y)) {
			Playering.Stick2x = rand.nextInt(462);
			Playering.Stick2y = rand.nextInt(282);
		}
		
		if (Collide(Playering.x, Playering.Stick3x, Playering.y, Playering.Stick3y)) {
			Playering.Stick3x = rand.nextInt(462);
			Playering.Stick3y = rand.nextInt(282);
		}
	}
	
	@Override
	public void resize(int arg0, int arg1) {
		
	}
	
	@Override
	public void resume() {
		
	}
}
