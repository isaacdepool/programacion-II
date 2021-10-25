import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo4
{
	static String ruta = "C:\\Users\\isac\\Desktop\\isaac\\Universidad\\Programacion II\\Base de Datos\\";

    public static void main(String[] args) throws IOException
    {	boolean aux = false;
		w("NOMBRE DEL ARCHIVO NUEVO: ");
		String nombre = KbInput.read();
		wln("\n");
		File f1 = new File(ruta + nombre);
		//Flujo de entrada de caracteres con buffer
		BufferedReader entrada;
		if(f1.exists())
		{	//FileReader() => Se usa para leer el contenido de un archivo
			entrada = new BufferedReader(new FileReader(f1));
			String linea;
			//ready() => retorna falso cuando llega al final del archivo
			while(entrada.ready())
			{	//readLine() => Devuelve el contenido de una linea guardada en un archivo
				linea = entrada.readLine();
				wln(linea);
			}//while
		}//if
		else
			wln("ERROR. ARCHIVO "+nombre+" NO EXISTE");
		wln("\n\n");
    }//main

	static void w(String s)
	{	System.out.print(s);
	}//w

	static void wln(String s)
	{	System.out.println(s);
	}//wln

}//class
