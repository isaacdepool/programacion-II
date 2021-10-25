import java.io.File;

public class FileDemo{
	public static void main(String arg[]){
		//w("ARCHIVO");
		System.out.print("INGRESE EL NOMBRE DEL ARCHIVO ");
		String nombre=KbInput.read();

		File f1 = new File( nombre );
		wln("NOMBRE DEL FICHER: "+f1.getName());

		wln("CAMINO DEL FICHER: "+f1.getPath());

		wln("CAMINO EXACTO DEL FICHER: "+f1.getAbsolutePath());

		wln("NOMBRE DEL PADRE FICHER: "+f1.getParent());

		wln(f1.exists()?"EXISTE":"NO EXISTE");

		wln(f1.canWrite()?"SE PUEDE ESCRIBIR":"NO SE PUEDE ESCRIBIR");

		wln(f1.canRead()?"SE PUEDE LEER":"NO SE PUEDE LEER");

		wln("IS"+(f1.isDirectory()?"":"NO "+"ES UN DIRECTORIO"));

		wln(f1.isFile()?"ES UN FICHERO NORMAL":"PODRIA SER UN ENLACE CC");

		wln("ULTIMA MODIFICACION: "+f1.lastModified());

		wln(" TAMA\2450 DEL FICHERO: "+f1.length());
	}//main

	static void w(String s){
		System.out.print(s);
	}

	static void wln(String s){
		System.out.println(s);
	}
}