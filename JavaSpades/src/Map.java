import java.lang.String;

public class Map {
	private Cube[] cubes = new Cube[10];
	
	public Map()
	{
		//Create the map
		initMap();
	}
	
	private boolean loadMap(String fname)
	{
		//TODO
		return true;
	}
	
	private boolean initMap()
	{
		//Finish making the map loader and stuff
		loadMap("normandie.vxl");
		for(int i = 0; i < 10; i++)
		{
			cubes[i] = new Cube( (float) i/10, 0.0f, -1.0f, 1.0f, 0.5f, 0.0f);
		}
		return true;
	}
	
	public void update()
	{
		for(int i = 0; i < 10; i++)
		{
			cubes[i].update();
		}
	}
	
	public void render(Player camera)
	{
		for(int i = 0; i < 10; i++)
		{
			camera.render();
			cubes[i].render();
		}
	}
}
