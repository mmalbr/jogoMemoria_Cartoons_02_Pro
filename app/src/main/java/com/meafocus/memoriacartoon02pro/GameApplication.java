package com.meafocus.memoriacartoon02pro;

import android.app.Application;

import com.meafocus.memoriacartoon02pro.utils.FontLoader;

public class GameApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		FontLoader.loadFonts(this);

	}
}
