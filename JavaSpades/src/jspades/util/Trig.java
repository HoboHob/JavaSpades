package jspades.util;

import java.lang.Math;

public class Trig {
	public static double lengthDirX(double len, double dir)
	{
		return Math.cos(dir*Math.PI/180)*len;
	}
	
	public static double lengthDirY(double len, double dir)
	{
		return -Math.sin(dir*Math.PI/180)*len;
	}
}
