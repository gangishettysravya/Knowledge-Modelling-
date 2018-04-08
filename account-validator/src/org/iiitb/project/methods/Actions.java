package org.iiitb.project.methods;
import org.json.JSONObject;

public class Actions {

	public static void accept(JSONObject obj)
	{
		System.out.println(obj.toString());
	}
	public static void reject(JSONObject obj)
	{
		System.out.println(obj.toString());
	}
	public static void method3(JSONObject obj)
	{
		System.out.println("method3");
	}
}
