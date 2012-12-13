import java.lang.String;
import jspades.util.Types;

public class Map {
	private Cube[] cubes = new Cube[10];
	private Cube[] specialCubes = new Cube[2];
	
	public Map()
	{
		//Create the map
		initMap();
	}
	
	private boolean loadMap(String fname)
	{
		
		return true;
	}
	
	private boolean initMap()
	{
		Types.CubeState initialState = Types.CubeState.VISIBLE;
		//Create special cubes
		specialCubes[0] = new Cube(0.0f,-3.0f,0.0f,1.0f,1.0f,1.0f,initialState,11);
		specialCubes[1] = new Cube(0.0f,3.0f,0.0f,1.0f,1.0f,1.0f,initialState,12);
		//Finish making the map loader and stuff
		loadMap("normandie.vxl");
		float sx = 0.0f; //This will be the starting X for the cubes
		for(int i = 0; i < 10; i++)
		{
			cubes[i] = new Cube( sx, 0.0f, -1.0f, 0.7f, 0.5f, 0.0f, initialState, i);
			sx += 0.05f;
		}
		return true;
	}
	
	public void update(Player player)
	{
		specialCubes[0].update(player);
		specialCubes[1].update(player);
		for(int i = 0; i < 10; i++)
		{
			cubes[i].update(player);
		}
	}
	
	public void render(Player camera)
	{
		camera.render();
		specialCubes[0].render();
		camera.render();
		specialCubes[1].render();
		for(int i = 0; i < 10; i++)
		{
			camera.render();
			cubes[i].render();
		}
	}
}
