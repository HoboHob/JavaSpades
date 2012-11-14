import static org.lwjgl.opengl.GL11.*;
import org.lwjgl.input.Mouse;

public class Player {
	public float x,y,z;
	public float rotY, rotX;
	
	public Player(float sx, float sy, float sz, float ry)
	{
		x = sx;
		y = sy;
		z = sz;
		rotY = ry;
	}
	
	public void update()
	{
		//Mouse controlled FPS cam
		rotY += Mouse.getDX()/2; //Should be self explanatory
		rotX += Mouse.getDY(); //You can divide by more to make the camera less sensitive
		//Mouse.setCursorPosition(400, 300); //This sets the cursor position inside the screen. Unfortunately it also makes the camera really jerky
		//Looking for a fix
	}
	
	public void render()
	{
		//Translate and rotate the world to move around the player
		glMatrixMode(GL_MODELVIEW);
		glLoadIdentity();
		glRotatef(rotY,0.0f,1.0f,0.0f);
		glRotatef(rotX,1.0f,0.0f,0.0f); //This is really sensitive so you may want to comment this out
		glTranslatef(x,y,z);
	}
}
