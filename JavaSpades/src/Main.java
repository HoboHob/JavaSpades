/*
 * JavaSpades Iceball/Ace of Spades client built for Java
 * By HoboHob
 * Copyright (C) 2012
 */

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import jspades.util.init;
import jspades.util.deinit;
import jspades.util.tick;

/*
 * Class description:
 * The main class used for creating, updating and destroying the game
 * Last changed:
 * 11/13/2012
 * Reason:
 * Created
 */

public class Main {
	private static Map map = new Map();
	private static Player player = new Player(0.0f,0.0f,0.0f, 0.0f);
	
	public static void main(String[] args) {
		run();
	}
	
	private static void run()
	{
		//Initialize the display
		init.initDisplay();
		
		//Initialize OpenGL
		init.initOpenGL();
		
		//Main loop
		while(!Display.isCloseRequested())
		{
			//Check if the escape key is pressed
			if( Keyboard.isKeyDown(Keyboard.KEY_ESCAPE) ){
				deinit.destroyDisplay();
			}
			update();
			render();
		}
		
		//Destroy the display
		Display.destroy();
	}
	
	private static void update()
	{
		map.update();
		player.update();
	}
	
	private static void render()
	{
		tick.clearBuffers();
		
		map.render(player);
		
		tick.updateDisplay();
	}

}
