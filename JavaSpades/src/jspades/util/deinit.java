package jspades.util;

import org.lwjgl.opengl.Display;

/*
 * Class description:
 * A utility class for anything related to closing the game
 * Last Changed:
 * 11/13/2012
 * Reason:
 * Created
 */

public class deinit {
	public static void destroyDisplay()
	{
		Display.destroy();
		System.exit(0);
	}
}
