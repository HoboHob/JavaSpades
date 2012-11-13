package jspades.util;

import static org.lwjgl.opengl.GL11.*;

/*
 * Class description:
 * A utility class used for rendering primitives
 * Last Changed:
 * 11/13/2012
 * Reason:
 * Created
 */

public class Drawing {
	public static void Cube(float x,float y,float z,float rot, float xvec,float yvec,float zvec,float r,float g,float b)
	{
		//Do the correct translations
		glTranslatef(x,y,z); //Translate to the x/y/z coords
		glRotatef(rot, xvec, yvec, zvec); //Rotate with angle rot on axis xvec, yvec and svec
		//Draw cube
		glColor3f(r,g,b); //Set cube color
		glBegin(GL_QUADS);
			//Top Face
			glVertex3f( 1.0f, 1.0f,-1.0f); //Top right corner
			glVertex3f( -1.0f,1.0f,-1.0f); //Top left corner
			glVertex3f( -1.0f, 1.0f,1.0f); //Bottom left corner
			glVertex3f( 1.0f, 1.0f, 1.0f); //Bottom right corner
			//Bottom face
			glVertex3f( 1.0f, -1.0f,1.0f); //Top right corner
			glVertex3f( -1.0f,-1.0f,1.0f); //Top left corner
			glVertex3f(-1.0f,-1.0f,-1.0f); //Bottom left corner
			glVertex3f( 1.0f,-1.0f,-1.0f); //Bottom right corner
			//Front face
			glVertex3f( 1.0f, 1.0f, 1.0f); // Top right corner
			glVertex3f( -1.0f, 1.0f,1.0f); // Top left corner
			glVertex3f( -1.0f,-1.0f,1.0f); // Bottom left corner
			glVertex3f( 1.0f, -1.0f,1.0f); // Bottom right corner
			//Back face
			glVertex3f( 1.0f,-1.0f,-1.0f); // Top right corner
			glVertex3f(-1.0f,-1.0f,-1.0f); // Top left corner
			glVertex3f(-1.0f, 1.0f,-1.0f); // Bottom left corner
			glVertex3f( 1.0f, 1.0f,-1.0f); // Bottom right corner
			//Left face
			glVertex3f(-1.0f, 1.0f, 1.0f); // Top right corner
			glVertex3f(-1.0f, 1.0f,-1.0f); // Top left corner
			glVertex3f(-1.0f,-1.0f,-1.0f); // Bottom left corner
			glVertex3f(-1.0f,-1.0f, 1.0f); // Bottom right corner
			//Right face
			glVertex3f( 1.0f, 1.0f,-1.0f); // Top right corner
			glVertex3f( 1.0f, 1.0f, 1.0f); // Top left corner
			glVertex3f( 1.0f,-1.0f, 1.0f); // Bottom left corner
			glVertex3f( 1.0f,-1.0f,-1.0f); // Bottom right corner
		glEnd();
		
		glLoadIdentity();
	}
}
