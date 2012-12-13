package jspades.util;

import static org.lwjgl.opengl.GL11.*;
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
		glClearColor(0.0f,0.5f,0.7f,0.0f); //Set a nice black background
		glClearDepth(1.0f); //Depth stuff that I know nothing about :P
		glEnable(GL_DEPTH_TEST);
		glDepthFunc(GL_LEQUAL);
		glHint(GL_PERSPECTIVE_CORRECTION_HINT, GL_NICEST);
	}
}
