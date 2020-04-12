package com.studios.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.studios.splash.Splash;
/*
 ********************************************* Class Description***********************************************
	This Starter Screen is a menu to get to other screens such as level select, ball select, cannon select.
 ********************************************* Class Description***********************************************
 */
public class StartScreen implements NewScreenInterface {
	BitmapFont fpsFONT;
	int showFPSDelay,FPS;
	float width = Splash.screenW, height = Splash.screenH;
	
	public void show() {
		Splash.camera.zoom=1;
		Splash.camera.update();
	
		System.out.println("Construct StartScreen");
		shapes.setAutoShapeType(true);
		fpsFONT = new BitmapFont();
		Gdx.input.setInputProcessor(mp); // set the default input processor to the multiplex processor from NewScreenInterface
		
		//((Game)Gdx.app.getApplicationListener()).setScreen(new Button1Screen());
		
	}
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(Color.MAGENTA.r,Color.MAGENTA.g,Color.MAGENTA.b,Color.MAGENTA.a);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.setProjectionMatrix(Splash.camera.combined);
		shapes.setProjectionMatrix(Splash.camera.combined);

		batch.begin();
			
		batch.end();
		
		
		shapes.begin();
		
		shapes.end();
		
		//comment out on release 
		showFPS(delta);
		updateButtons(delta);
	}
	void updateButtons(float deltaT){
	
	}
	void showFPS(float delta)
	{
		showFPSDelay++;

		if(showFPSDelay>=20)
		{
			showFPSDelay=0;
			FPS = (int)Math.ceil(1/delta);
		}
		batch.begin();
		fpsFONT.draw(batch, "FPS "+FPS, width - 100, height - 50);
		batch.end();
	}
	
	
	
	@Override
	public void resize(int width, int height) {}
	@Override
	public void pause() {}
	@Override
	public void resume() {}
	@Override
	public void hide() {}
	@Override
	public void dispose() {}
	
}
