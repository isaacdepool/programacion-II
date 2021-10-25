public class getCharsDemo
{	public static void main(String arg[])
	{	String s = "ESTO ES UNA DEMOSTRACION DEL METODO GETCHARS";
		char buf[] = new char[5];
		s.getChars(12, (12+5), buf, 0);
		System.out.println("TEXTO ORIGINAL = "+s);
		System.out.print("TEXTO EXTRAIDO = ");
		System.out.println(buf);
	}
}


