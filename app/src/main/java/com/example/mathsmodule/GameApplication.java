package com.example.mathsmodule;

import android.app.Application;
import com.example.mathsmodule.utils.FontLoader;
import android.app.Activity;


public class GameApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		FontLoader.loadFonts(this);

	}
}
