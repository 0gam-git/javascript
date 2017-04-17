package com.test.urong.javascript;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavascriptInJava {

	public static void main(String[] args) throws ScriptException, NoSuchMethodException, FileNotFoundException {
		JavascriptInJava js = new JavascriptInJava();

		js.runHollo();
		js.runGeolocation();
	}

	// String function
	public void runHollo() throws ScriptException, NoSuchMethodException {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("nashorn");

		// JavaScript code in a String
		String script = funcHello();

		// evaluate script
		engine.eval(script);

		Invocable inv = (Invocable) engine;

		// invoke the global function named "hello"
		inv.invokeFunction("hello2", "Scripting!!");
	}

	// file reader
	public void runGeolocation() throws ScriptException, NoSuchMethodException, FileNotFoundException {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		engine.eval(new FileReader("D:/stsProject/JavascriptLibraryTest/src/main/webapp/js/script.js"));

		Invocable inv = (Invocable) engine;

		inv.invokeFunction("getScript");
	}

	public String funcHello() {
		return "function hello2(name) { print('Hello, ' + name); }";
	}

	public String funcGeolocation() {
		return "function geolocation() { " + "if (navigator.geolocation) { "
				+ " var id = navigator.geolocation.watchPosition(function(pos) { "
				+ "var latitude = pos.coords.latitude; " + "var longitude = pos.coords.longitude;" + "}";
	}

}
