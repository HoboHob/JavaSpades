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
	public static void Block(float x,float y,float z, float r,float g,float b, float size)
	{
		//Do the correct translations
		glTranslatef(x,y,z); //Translate to the x/y/z coords
		//Draw cube
		glColor3f(r,g,b); //Set cube color
		glBegin(GL_QUADS);
			//Top Face
			glVertex3f( size, size,-size); //Top right corner
			glVertex3f( -size,size,-size); //Top left corner
			glVertex3f( -size, size,size); //Bottom left corner
			glVertex3f( size, size, size); //Bottom right corner
			//Bottom face
			glVertex3f( size, -size,size); //Top right corner
			glVertex3f( -size,-size,size); //Top left corner
			glVertex3f(-size,-size,-size); //Bottom left corner
			glVertex3f( size,-size,-size); //Bottom right corner
			//Front face
			glVertex3f( size, size, size); // Top right corner
			glVertex3f( -size, size,size); // Top left corner
			glVertex3f( -size,-size,size); // Bottom left corner
			glVertex3f( size, -size,size); // Bottom right corner
			//Back face
			glVertex3f( size,-size,-size); // Top right corner
			glVertex3f(-size,-size,-size); // Top left corner
			glVertex3f(-size, size,-size); // Bottom left corner
			glVertex3f( size, size,-size); // Bottom right corner
			//Left face
			glVertex3f(-size, size, size); // Top right corner
			glVertex3f(-size, size,-size); // Top left corner
			glVertex3f(-size,-size,-size); // Bottom left corner
			glVertex3f(-size,-size, size); // Bottom right corner
			//Right face
			glVertex3f( size, size,-size); // Top right corner
			glVertex3f( size, size, size); // Top left corner
			glVertex3f( size,-size, size); // Bottom left corner
			glVertex3f( size,-size,-size); // Bottom right corner
		glEnd();
		
		glLoadIdentity();
	}
}
