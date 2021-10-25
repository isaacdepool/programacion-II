public class indexOfDemo
{	public static void main(String arg[])
	{	String tex = "HOLA MIS CHICOS DESORDENADOS";
		int pos;
		System.out.println(tex+"\n");
		pos = tex.indexOf('E');
		System.out.println("LA PRIMERA 'E' = "+pos+"\n");
		pos = tex.lastIndexOf('E');
		System.out.println("LA ULTIMA 'E' = "+pos+"\n");
		pos = tex.indexOf("DE");
		System.out.println("LA PRIMERA 'DE'  = "+pos+"\n");
		pos = tex.lastIndexOf("DE");
		System.out.println("LA ULTIMA 'DE'  = "+pos+"\n");
		pos = tex.indexOf('O',10);
		System.out.println("tex.indexOf('O',10) = "+pos+"\n");
		pos = tex.lastIndexOf('ñ',24);
		System.out.println("tex.lastIndexOf('O',24) = "+pos+"\n");
	}
}
