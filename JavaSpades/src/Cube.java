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
	private float rot, xvec, yvec, zvec;
	
	public Cube()
	{
		x = y = 0.0f;
		z = -12.0f;
		r = g = b = 0.7f;
		rot = xvec = zvec = 0.0f;
		yvec = 1.0f;
	}
	
	public void update()
	{
		rot += 1.0f;
	}
	
	public void render()
	{
		Drawing.Cube(x, y, z, rot, xvec, yvec, zvec, r, g, b);
	}
}
