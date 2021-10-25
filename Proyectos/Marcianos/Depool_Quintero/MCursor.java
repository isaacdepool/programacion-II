// Autor M.Sc. Maria Eugenia Fossi Medina

public class MCursor{

	// METODO PARA BAJAR N NUMEROS DE LINEAS
	public static void BLinea(int nl){
		for(int i=1; i<=nl; i++)
			System.out.println();
		return;
	}//BLinea

	// METODO PARA UBICAR EL CURSOR EN UN LUGAR ESPECIFICO DE LA LINEA
	public static void UCursor(int nc){
		System.out.print("\r");
		for(int i=1; i<=nc; i++)
			System.out.print(" ");
		return;
	}//UCursor

	// METODO PARA RETROCEDER EL CURSOR EN N ESPACIOS ESPECIFICOS DE LA LINEA
	public static void RCursor(int ne){
		for(int i=1; i<=ne; i++)
			System.out.print("\b");
		return;
	}//RCursor

	// METODO PARA CENTRAR UN TEXTO
	public static void TCen(int m, String texto){
		UCursor(m); System.out.println(texto);
		return;
	}

	// METODO PARA CENTRAR UN TEXTO DENTRO DE OTRO TEXTO XD
	public static String TCent(int p, String T){
		String tt = T;
	    for(int i=1;i<=p;i++)
			tt =" "+tt+" ";
		return tt;
	}

	// METODO PARA MOSTRAR LA SEÑAL DE SALIDA
	public static void Salida(){
		BLinea(2);
		TCen(26,"PRESIONE ENTER PARA CONTINUAR");
		KbInput.read();
		return;
	}

	public static void Tex(int p, String T){
    	UCursor(69);   System.out.print("|");
    	UCursor(p);    System.out.print(T);
    	UCursor(10);   System.out.print("|");
    	System.out.println();
	    return;
    }

	public static String tp(String n, int pp){
	    if(n.length()<pp){
	    for(int i=n.length();i<pp;i++)
	    n+=" ";
	    }
	return n;
    }
	public static void error(int p, String T){
		BLinea(25);
		TCen(10, "+==========================================================+");
		TCen(10, "|                 E     R     R     O     R                |");
		TCen(10, "|----------------------------------------------------------|");
        Tex(p,T);
		TCen(10, "+==========================================================+");
		Salida();
    } // Error

	public static void Good(int p, String T){
		BLinea(25);
		TCen(10, "+==========================================================+");
		TCen(10, "|                 G     O     O     D     !                |");
		TCen(10, "|----------------------------------------------------------|");
        Tex(p,T);
		TCen(10, "+==========================================================+");
		Salida();
    } // Good
}//class