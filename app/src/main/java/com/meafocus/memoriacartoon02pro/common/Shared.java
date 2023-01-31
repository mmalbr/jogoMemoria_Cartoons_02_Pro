package com.meafocus.memoriacartoon02pro.common;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;

import com.meafocus.memoriacartoon02pro.engine.Engine;
import com.meafocus.memoriacartoon02pro.events.EventBus;

public class Shared {

	@SuppressLint("StaticFieldLeak")
	public static Context context;
	public static FragmentActivity activity; // it's fine for this app, but better move to weak reference
	@SuppressLint("StaticFieldLeak")
	public static Engine engine;
	public static EventBus eventBus;

}
