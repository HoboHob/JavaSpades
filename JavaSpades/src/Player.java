import static org.lwjgl.opengl.GL11.*;
import org.lwjgl.input.Mouse;
import org.lwjgl.input.Keyboard;
import jspades.util.Trig;

public class Player {
	public float x,y,z,cy; //X/Y/Z are the player coords. CY is y -0.5f and is the y the player is at when the player crouches
	public float rotY, rotX;
	
	public Player(float sx, float sy, float sz, float ry)
	{
		Mouse.setGrabbed(true);
		x = sx;
		y = sy;
		z = sz;
		rotY = ry;
	}
	
	public void update()
	{
		//Move forward
		if(Keyboard.isKeyDown(Keyboard.KEY_W))
		{
			x += Trig.lengthDirX(0.01, rotY+90);
			z -= Trig.lengthDirY(0.01, rotY+90);
		}
		//Move backwards
		if(Keyboard.isKeyDown(Keyboard.KEY_S))
		{
			x -= Trig.lengthDirX(0.01, rotY+90);
			z += Trig.lengthDirY(0.01, rotY+90);
		}
		//Strafing
		if(Keyboard.isKeyDown(Keyboard.KEY_A))
		{
			x += Trig.lengthDirX(0.01, rotY);
			z -= Trig.lengthDirY(0.01, rotY);
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_D))
		{
			x -= Trig.lengthDirX(0.01, rotY);
			z += Trig.lengthDirY(0.01, rotY);
		}
		//Crouching
		if(Keyboard.isKeyDown(Keyboard.KEY_LCONTROL))
		{
			y = 0.05f;
		}
		else
		{
			y = 0.0f;
		}
		//Mouse controlled FPS cam
		rotY += Mouse.getDX()/2; //Should be self explanatory
		rotX -= Mouse.getDY()/2; //You can divide by more to make the camera less sensitive
		if(rotX > 90)
			rotX = 90;
		else if(rotX < -90)
			rotX = -90;
		//Mouse.setCursorPosition(410,310);
		if(Mouse.getX() > 410 || Mouse.getX() < 390)
		{
			Mouse.setCursorPosition(400, Mouse.getY());
		}
		if(Mouse.getY() > 310 || Mouse.getY() < 290)
		{
			Mouse.setCursorPosition(Mouse.getX(), 300);
		}
	}
	
	public void render()
	{
		//Translate and rotate the world to move around the player
		glMatrixMode(GL_MODELVIEW);
		glLoadIdentity();
		glRotatef(rotY,0.0f,1.0f,0.0f);
		glRotatef(rotX,1.0f,0.0f,0.0f); //This doesn't work very well oddly :/
		glTranslatef(x,y,z);
	}
}
