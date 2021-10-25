public class StringBufferDemo
{	public static void main(String arg[])
	{	String texto;
		System.out.print("INGRESE EL TEXTO = ");
		texto = KbInput.read();
		//StringBuffer tex = new StringBuffer("HOLA MIS TORMENTOS");
		StringBuffer tex = new StringBuffer(texto);
		System.out.println("BUFFER = "+ tex);
		System.out.println("LONGITUD = "+ tex.length());
		System.out.println("CAPACIDAD = "+ tex.capacity());
	}
}
