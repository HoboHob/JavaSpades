import jspades.util.Drawing;

/*
 * Class description:
 * A basic cube class, will probably be deleted later on.
 * Last changed:
 * 11/13/2012
 * Reason:
 * Created
 */

public class Cube {
	private float x, y, z;
	private float r, g, b;
	
	public Cube(float sx, float sy, float sz, float sr, float sg, float sb)
	{
		x = sx;
		y = sy;
		z = sz;
		r = sr;
		g = sg;
		b = sb;
	}
	
	public void update()
	{
		//TODO
	}
	
	public void render()
	{
		Drawing.Block(x, y, z, r, g, b, 0.05f);
	}
}
