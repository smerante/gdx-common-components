package com.studios.screens;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public interface NewScreenInterface extends Screen{
	
	SpriteBatch batch = new SpriteBatch();
	ShapeRenderer shapes = new ShapeRenderer();
	InputMultiplexer mp = new InputMultiplexer();
	@Override
	public void show();
	@Override
	public void render(float delta);

	
	@Override
	public void resize(int width, int height) ;
	@Override
	public void pause() ;
	@Override
	public void resume();
	@Override
	public void hide() ;
	@Override
	public void dispose() ;
	
}
