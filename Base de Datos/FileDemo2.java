import java.io.File;

public class FileDemo2
{
	static File f1;

	public static void main(String arg[])
	{	w("NOMBRE DEL DIRECTORIO: ");
		String nombre = KbInput.read();
		wln("\n");
		 f1 = new File(nombre);
		if(f1.exists())
		{	ListaD();
			w("NOMBRE DEL ARCHIVO A BORRAR: ");
			nombre = KbInput.read();
			File f2 = new File(nombre);
			if(f2.exists())
			{	//delete() => Borrar un archivo
				f2.delete();
				wln("ARCHIVO BORRADO");
				ListaD();
			}//if
			else
				wln("ARCHIVO NO EXISTE");
			KbInput.read();
		}
		else
			w("DIRECTORIO NO EXISTE");
	}//main

	//METODO PARA MOSTRAR LISTADO DE DIRECTORIO
	public static void ListaD()
	{	String NDir[];
		//list() => Devuelve un arreglo con los nombres de los archivos del directorio
		NDir = f1.list();
		for(int i=0; i < NDir.length; i++)
			wln("ARCHIVO["+(i+1)+"] = " + NDir[i]);
		wln("\n\nPRESIONE ENTER PARA CONTINUAR");
		KbInput.read();
		return;
	}//ListaD


	static void w(String s)
	{	System.out.print(s);
	}//w

	static void wln(String s)
	{	System.out.println(s);
	}//wln

}//class