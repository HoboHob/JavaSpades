import jspades.util.Drawing;
import jspades.util.Types;
import jspades.util.Collisions;

/*
 * Class description:
 * A basic cube class, will probably be deleted later on.
 * Last changed:
 * 11/13/2012
 * Reason:
 * Created
 */

public class Cube {
	public float x, y, z;
	private float r, g, b;
	public Types.CubeState state;
	public int id;
	
	public Cube(float sx, float sy, float sz, float sr, float sg, float sb, Types.CubeState ss, int sid)
	{
		x = sx;
		y = sy;
		z = sz;
		r = sr;
		g = sg;
		b = sb;
		id = sid;
		state = ss;
	}
	
	public void update(Player player)
	{
		if(state == Types.CubeState.VISIBLE)
		{
			if(Collisions.cubeCollide(x, y, z, 0.05f, 0.05f, 0.05f, player.x, player.y, player.z, 0.05f, 0.1f, 0.05f))
			{
				System.out.println("Collision with block " + id);
			}
		}
		
	}
	
	public void render()
	{
		if(state == Types.CubeState.VISIBLE)
		{
			Drawing.Block(x, y, z, r, g, b, 0.05f);
		}
	}
}
