public class compareToDemo
{	public static void main(String arg[])
	{	String s1 = "HOLA";
		String s2 = "CHAO";
		String s3 = "holas";
		int resp;
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		System.out.println("s3 = "+s3);
		resp = s1.compareTo(s2);
		System.out.println("s1.compareTo(s2) = "+resp);
		KbInput.read();
		resp = s1.compareTo(s3);
		System.out.println("s1.compareTo(s3) = "+resp);
		KbInput.read();
		resp = s1.compareToIgnoreCase(s3);
		System.out.println("s1.compareToIgnoreCase(s3) = "+resp);
	}
}