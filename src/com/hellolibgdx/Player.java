package com.hellolibgdx;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Player {
	int x = 20;
	int y = 200;
	private int frame = 0;
	private int dir = 0;
	private TextureRegion PlayerClip;
	private Texture player;
	private Texture Background;
	private Texture stick;
	private SpriteBatch batch;
	int StickX = 20;
	int StickY = 20;
	int Stick2x = 50;
	int Stick2y = 50;
	int Stick3x = 80;
	int Stick3y = 100;
	
	public void get_input() {
		// Update Input
				if(Gdx.input.isKeyPressed(Keys.LEFT)) {
					x -= 2;
					dir = 2;
					PlayerClip = new TextureRegion(player, frame/10 * 22, dir * 32, 22, 32);
					frame += 1;
				}
				if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
					x += 2;
					dir = 3;
					PlayerClip = new TextureRegion(player, frame/10 * 22, dir * 32, 22, 32);
					frame += 1;
				}
				if(Gdx.input.isKeyPressed(Keys.UP)) {
					y += 2;
					dir = 1;
					PlayerClip = new TextureRegion(player, frame/10 * 22, dir * 32, 22, 32);
					frame += 1;
				}
				if(Gdx.input.isKeyPressed(Keys.DOWN)) {
					y -= 2;
					dir = 0;
					PlayerClip = new TextureRegion(player, frame * 22, dir * 32, 22, 32);
					frame += 1;
				}
	}
	
	public void create_graphics() {
		player = new Texture(Gdx.files.internal("data/Coa2.png"));
		Background = new Texture(Gdx.files.internal("data/Blacknesss.png"));
		stick = new Texture(Gdx.files.internal("data/Stick_Moosader.png"));
		batch = new SpriteBatch();
		
		//refine Player from sprite Sheet
		PlayerClip = new TextureRegion(player, frame/10 * 32, dir * 32, 22, 32);
	}
	
	public void draw_graphics() {
		batch.begin();
		batch.draw(Background, 0, 0);
		batch.draw(stick, StickX, StickY);
		batch.draw(stick, Stick2x, Stick2y);
		batch.draw(stick, Stick3x, Stick3y);
		batch.draw(PlayerClip, x, y);
		batch.end();
	}
	
	public void update() {
		if (frame > 20) {
			frame = 0;
		}
		PlayerClip = new TextureRegion(player, frame/10 * 22, dir * 32, 22, 32);
		
		//refine Player from sprite Sheet
		PlayerClip = new TextureRegion(player, frame/10 * 22, dir * 32, 22, 32);
	}
}
