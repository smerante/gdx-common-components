package com.studios.splash;

import com.badlogic.gdx.Game;

public class Starter extends Game{
	
	public Starter()
	{
		super();
	}

	@Override
	public void create() {
		setScreen(new Splash());
	}

}
