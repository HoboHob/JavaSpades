package jspades.util;

import static org.lwjgl.opengl.GL11.GL_DEPTH_TEST;
import static org.lwjgl.opengl.GL11.GL_LEQUAL;
import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
import static org.lwjgl.opengl.GL11.GL_NICEST;
import static org.lwjgl.opengl.GL11.GL_PERSPECTIVE_CORRECTION_HINT;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;
import static org.lwjgl.opengl.GL11.GL_SMOOTH;
import static org.lwjgl.opengl.GL11.GL_VERSION;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL11.glClearDepth;
import static org.lwjgl.opengl.GL11.glDepthFunc;
import static org.lwjgl.opengl.GL11.glEnable;
import static org.lwjgl.opengl.GL11.glGetString;
import static org.lwjgl.opengl.GL11.glHint;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glMatrixMode;
import static org.lwjgl.opengl.GL11.glShadeModel;
import static org.lwjgl.util.glu.GLU.gluPerspective;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

/*
 * Class description:
 * A utility class for anything related to intializing the game
 * Last Changed:
 * 11/13/2012
 * Reason:
 * Created
 */

public class init {
	public static void initDisplay()
	{
		//Initialize the window
		try {
			Display.setDisplayMode( new DisplayMode(800,600) );
			Display.setTitle("JavaSpades");
			Display.create();
			System.out.println(glGetString(GL_VERSION));
		} catch (LWJGLException e) {
			System.out.println("Error creating display");
			e.printStackTrace();
		}
	}
	
	public static void initOpenGL()
	{
		//Create an openGL projection
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
				
		gluPerspective((float) 45, 640f/480f, 0.1f,100.0f);
				
		glMatrixMode(GL_MODELVIEW);
		glLoadIdentity();
		
		//Misc OpenGL stuff
		glShadeModel(GL_SMOOTH); //Smooth shading enabled
		glClearColor(1.0f,0.0f,0.0f,0.0f); //Set a nice black background
		glClearDepth(1.0f); //Depth stuff that I know nothing about :P
		glEnable(GL_DEPTH_TEST);
		glDepthFunc(GL_LEQUAL);
		glHint(GL_PERSPECTIVE_CORRECTION_HINT, GL_NICEST);
	}
}
