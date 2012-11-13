package jspades.util;

import static org.lwjgl.opengl.GL11.*;

import org.lwjgl.opengl.Display;

/*
 * Class description:
 * A utility class for functions called in either the render method or update method 
 * of the main class
 * Last Changed:
 * 11/13/2012
 * Reason:
 * Created
 */

public class tick {
	public static void clearBuffers()
	{
		glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
	}
	
	public static void updateDisplay()
	{
		Display.update();
		Display.sync(60);
	}
}
