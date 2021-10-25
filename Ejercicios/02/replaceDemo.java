public class replaceDemo
{
	public static void main(String arg[])
	{
		StringBuffer s = new StringBuffer("ESTO ES UNA PRUEBA");
		System.out.println("TEXTO ORIGINAL = "+s);
		s.replace(5, 7, "ERA");
		System.out.println("TEXTO MODIFICADO = "+s);
	}
}