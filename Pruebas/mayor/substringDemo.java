public class substringDemo
{	public static void main(String arg[])
	{	String tex = "TU LOCURA NO TIENE CURA, PERO MI LOCURA SE CURA";
		String busca = "O";
		String cambia = "D";
		String result = "";
		int i;
		do{	System.out.println(tex);
			KbInput.read();
			i = tex.indexOf(busca);
			if(i != -1)
			{	result = tex.substring(0,i);
				result = result + cambia;
				result = result + tex.substring(i+busca.length());
				tex = result;
			}
		}while(i != -1);
	}
}
