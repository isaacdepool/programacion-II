import java.io.*;
public class Taller{
    static String ruta = "C:\\Users\\isac\\Desktop\\isaac\\Universidad\\Programacion II\\Proyectos\\Marcianos\\Depool_Quintero\\";
    static int cl, pe, cp; // CONTADORES DE LETRAS, LETRAS ERRONEAS Y CONTADOR DE PALABRAS
	static String Abecedario [][] = {
	{"A", ".....-"},
	{"B", "....-."},
	{"C", "...-.."},
	{"D", "..-..."},
	{"E", ".-...."},
	{"F", "-....."},
	{"G", "....--"},
	{"H", "...-.-"},
	{"I", "..-..-"},
	{"J", ".-...-"},
	{"K", "-....-"},
	{"L", "...--."},
	{"M", "..-.-."},
	{"N", ".-..-."},
	{"O", "-...-."},
	{"P", "..--.."},
	{"Q", ".-.-.."},
	{"R", "-..-.."},
	{"S", ".--..."},
	{"T", "-.-..."},
	{"U", "--...."},
	{"V", "...---"},
	{"W", "..-.--"},
	{"X", ".-..--"},
	{"Y", "-...--"},
	{"Z", "-..-.-"},
	{"1", "------"},
	{"2", ".-----"},
	{"3", "-.----"},
	{"4", "--.---"},
	{"5", "---.--"},
	{"6", "----.-"},
	{"7", "-----."},
	{"8", "..----"},
	{"9", "----.."},
	{"0", "......"}};

	public static void main(String[] DqId) throws IOException {
        byte opc;
    	do{
    	    opc = menu();
    	    switch(opc){
    	        case 1: Codificar();	   break;
    	        case 2: Decodificar();	   break;
    		    case 3: Mostrar();	       break;
    		    case 4: Acerca();	       break;
    	    }//switch
    	}while(opc != 0);
    }//main

    public static void Codificar(){
	    Title(31, "CODIFICAR ARCHIVO");
		MCursor.BLinea(1);
		MCursor.TCen(10, "--------  INGRESE EL NOMBRE DEL ARCHIVO A CODIFICAR: -------");
		MCursor.TCen(26, "SIN SU EXTENSIÓN (Ej: Texto)");
		MCursor.TCen(14, "RECUERDA QUE: LA EXTENSIÓN DEL ARCHIVO DEBE SER .TER");
		MCursor.BLinea(1); MCursor.UCursor(20);
	    String nombre = Leer.CString("ARCHIVO: ");
	    File ft = new File(ruta + nombre + ".ter"); // fichero terrestre
	    try{
	        if(ft.exists()){
				File fm = new File(ruta + nombre + ".mar"); // fichero marciano
				if(!fm.exists()){
					String lt, lm = "", lc = "";
					cl = 0; pe = 0; cp = 0;
		    		BufferedReader rft;// buffer de lectura.
		    		BufferedWriter wfm;// buffer de escritura.
		    		rft = new BufferedReader(new FileReader(ft));
            		wfm = new BufferedWriter(new FileWriter(fm));
            		PrintWriter wr = new PrintWriter(wfm);
            		while((lt = rft.readLine())!=null){
						lt = lt.toUpperCase(); // convertimos el texto terrestre en mayúscula
						cp += ContarPT(lt); // contador de palabras
						for(int i=0; i<lt.length(); i++){
					    	if(lt.charAt(i) == ' '){
						    	lm+="/";
						    	cl++;
							}else if(lt.charAt(i) == 'Ñ'){
						    	lm+=".-..-.";
						    	cl++;
					    	}else{
						    	lc += lt.charAt(i);
						    	if(lc.length() == 1){
									lm+= CodT(lc);
							    	lc= "";
						    	}
					    	}
						}
						lm = lm +"\r\n";
		        	}
		        	wr.write("+==========================================================+"+"\r\n");
		        	wr.write("                     SANTROCK TRANSLATOR                    "+"\r\n");
		        	wr.write("+==========================================================+"+"\r\n");
		        	wr.write(lm);
		        	wr.append("+==========================================================+"+"\r\n");
		        	wr.append("           CANTIDAD DE LETRAS CODIFICADAS ==> "+cl+"\r\n");
		        	wr.append("         CANTIDAD DE PALABRAS CODIFICADAS ==> "+cp+"\r\n");
		        	wr.append("CANTIDAD DE SIGNOS DE PUNTUACIÓN OMITIDOS ==> "+pe+"\r\n");
		        	wr.append("+==========================================================+"+"\r\n");
		        	wr.flush();
            		rft.close(); // CERRAMOS EL BUFFER DE LECTURA
            		wr.close(); // CERRAMOS EL PRINTWRITER
            		wfm.close(); // CERRAMOS EL BUFFER DE ESCRITURA
					MCursor.BLinea(25);
			    	MCursor.TCen(26, "POR FAVOR AGUARDE UN MOMENTO");
			    	MCursor.TCen(29, "ARCHIVO CODIFICANDOSE");
					try{
						MCursor.UCursor(29);
				    	System.out.print("[");
				    	for (int i=0;i<20;i++){
					    	System.out.print("*");
					    	Thread.sleep(98);
				    	}
				    	System.out.print("]");
					}catch(InterruptedException e){}
			   	 	MCursor.BLinea(2);
			    	MCursor.TCen(23, "ARCHIVO CODIFICADO EXITOSAMENTE :)");
			    	MCursor.Salida();
			    	// MOSTRAMOS LOS RESULTADOS DE LA CODIFICACIÓN
                	Results('c');
				} else{
	    			MCursor.BLinea(25);
	    			MCursor.TCen(19, "+========================================+");
	    			MCursor.TCen(19, "|          E    R    R    O    R         |");
	    			MCursor.TCen(19, "|----------------------------------------|");
	    			MCursor.TCen(19, "|  EL ARCHIVO YA SE ENCUENTRA CODIFICADO |");
	    			MCursor.TCen(19, "+========================================+");
	    			MCursor.Salida();
				}
	        } else{
	    		MCursor.BLinea(25);
	    		MCursor.TCen(13, "+====================================================+");
	    		MCursor.TCen(13, "|                E    R    R    O    R               |");
	    		MCursor.TCen(13, "|----------------------------------------------------|");
	    		MCursor.TCen(13, "|                ARCHIVO NO ENCONTRADO               |");
	    		MCursor.TCen(13, "| RECUERDA QUE: EL ARCHIVO DEBE TENER EXTENSIÓN .ter |");
	    		MCursor.TCen(13, "+====================================================+");
	    		MCursor.Salida();
	    	}
	    } catch (Exception ex){
	        System.out.println(ex.getMessage());
   		}
    }

    public static void Decodificar(){
	    Title(31, "DECODIFICAR ARCHIVO");
		MCursor.BLinea(1);
		MCursor.TCen(10, "-------  INGRESE EL NOMBRE DEL ARCHIVO A DECODIFICAR: ------");
		MCursor.TCen(26, "SIN SU EXTENSIÓN (Ej: Texto)");
		MCursor.TCen(14, "RECUERDA QUE: LA EXTENSIÓN DEL ARCHIVO DEBE SER .MAR");
		MCursor.BLinea(1); MCursor.UCursor(20);
	    String nombre = Leer.CString("ARCHIVO: ");
	    File fm = new File(ruta + nombre + ".mar"); // fichero marciano
	    try{
	        if(fm.exists()){
				File ft = new File(ruta + nombre + ".ter"); // fichero terrestre
				if(!ft.exists()){
			    	String lm, lt = "", lc = "";
					cl = 0; pe = 0; cp = 0;
		    		BufferedReader rfm;// buffer de lectura marciano.
		    		BufferedWriter wft;// buffer de escritura terrestre.
		    		rfm = new BufferedReader(new FileReader(fm));
            		wft = new BufferedWriter(new FileWriter(ft));
            		PrintWriter wrt = new PrintWriter(wft);
            		while((lm = rfm.readLine())!=null){
						cp += ContarPM(lm); // contador de palabras
						for(int i=0; i<lm.length(); i++){
					    	if(lm.charAt(i) == '/'){
						    	lt+=" ";
						    	cl++;
					    	}else{
						    	lc += lm.charAt(i);
						    	if(lc.length() == 6){
							    	lt+= CodM(lc);
							    	lc= "";
						    	}
					    	}
						}
                	lt = lt + "\r\n";
		        }
		        wrt.write("+==========================================================+"+"\r\n");
		        wrt.write("                     SANTROCK TRANSLATOR                    "+"\r\n");
		        wrt.write("+==========================================================+"+"\r\n");
		        wrt.write(lt);
		        wrt.append("+==========================================================+"+"\r\n");
		        wrt.append("  CANTIDAD DE LETRAS DECODIFICADAS ==> [ "+cl+" ]"+"\r\n");
				wrt.append("CANTIDAD DE PALABRAS DECODIFICADAS ==> [ "+cp+" ]"+"\r\n");
		        wrt.append("      CANTIDAD DE CÓDIGOS ERRÓNEOS ==> [ "+pe+" ]"+"\r\n");
		        wrt.append("+==========================================================+"+"\r\n");
		        wrt.flush();
            	rfm.close(); // CERRAMOS EL BUFFER DE LECTURA
            	wrt.close(); // CERRAMOS EL PRINTWRITER
            	wft.close(); // CERRAMOS EL BUFFER DE ESCRITURA
				MCursor.BLinea(25);
			    MCursor.TCen(26, "POR FAVOR AGUARDE UN MOMENTO");
			    MCursor.TCen(28, "ARCHIVO DECODIFICÁNDOSE");
				try{
					MCursor.UCursor(29);
				    System.out.print("[");
				    for (int i=0;i<20;i++){
					    System.out.print("*");
					    Thread.sleep(98);
				    }
				    System.out.print("]");
				}catch(InterruptedException e){}
			    MCursor.BLinea(2);
			    MCursor.TCen(22, "ARCHIVO DECODIFICADO EXITOSAMENTE :)");
			    MCursor.Salida();
			    // MOSTRAMOS LOS RESULTADOS DE LA CODIFICACIÓN
                Results('d');
				} else{
	    			MCursor.BLinea(25);
	    			MCursor.TCen(18, "+==========================================+");
	    			MCursor.TCen(18, "|           E    R    R    O    R          |");
	    			MCursor.TCen(18, "|------------------------------------------|");
	    			MCursor.TCen(18, "|  EL ARCHIVO YA SE ENCUENTRA DECODIFICADO |");
	    			MCursor.TCen(18, "+==========================================+");
	    			MCursor.Salida();
				}
	    	} else{
	    		MCursor.BLinea(25);
	    		MCursor.TCen(13, "+====================================================+");
	    		MCursor.TCen(13, "|                E    R    R    O    R               |");
	    		MCursor.TCen(13, "|----------------------------------------------------|");
	    		MCursor.TCen(13, "|                ARCHIVO NO ENCONTRADO               |");
	    		MCursor.TCen(13, "| RECUERDA QUE: EL ARCHIVO DEBE TENER EXTENSIÓN .mar |");
	    		MCursor.TCen(13, "+====================================================+");
	    		MCursor.Salida();
	    	}
	    } catch (Exception ex){
	        System.out.println(ex.getMessage());
   		}
    }

    public static void Mostrar(){
        Title(32, "MOSTRAR ARCHIVO");
		MCursor.BLinea(1);
		MCursor.TCen(10, "---------  ESCRIBA EL NOMBRE DEL ARCHIVO A MOSTRAR: --------");
		MCursor.TCen(23, "SIN SU EXTENSIÓN (Ej: Texto.ter)");
		MCursor.BLinea(1); MCursor.UCursor(20);
		String nombre = Leer.CString("ARCHIVO: ");
		File file = new File(ruta + nombre);
   		try{
		    if(file.exists()){
			    BufferedReader f = new BufferedReader(new FileReader(ruta + nombre));
           		String l;
           		Title(29, "CONTENIDO DEL ARCHIVO");
           		MCursor.BLinea(2);
           		while((l=f.readLine())!=null){
	                MCursor.TCen(10, l);
		        }
	            f.close();
	            MCursor.Salida();
	    	} else{
	    		MCursor.BLinea(25);
	    		MCursor.TCen(13, "+====================================================+");
	    		MCursor.TCen(13, "|                E    R    R    O    R               |");
	    		MCursor.TCen(13, "|----------------------------------------------------|");
	    		MCursor.TCen(13, "|                ARCHIVO NO ENCONTRADO               |");
	    		MCursor.TCen(13, "|  RECUERDA QUE: EL ARCHIVO DEBE TENER SU EXTENSIÓN  |");
	    		MCursor.TCen(13, "+====================================================+");
	    		MCursor.Salida();
	    	}
   		}catch (Exception ex) {
        	System.out.println(ex.getMessage());
   		}
    }

    public static void Acerca(){
		Title(30,"ACERCA DEL PROGRAMA");
		MCursor.Tex(14,"SANTROCK TRANSLATOR ES UN PROGRAMA PATROCINADO POR LA");
		MCursor.Tex(14,"EMPRESA FOMECA C.A, DISESEÑADO PARA TRADUCIR ARCHIVOS");
		MCursor.Tex(14,"Y TEXTOS DE NUESTRO IDIOMA TERRESTRE A MARCIANO Ó");
		MCursor.Tex(14,"VICEVERSA.");
		MCursor.TCen(10, "+==========================================================+");
		MCursor.Tex(14,"ROMPE LAS BARRERAS DEL IDIOMA!! DESCIFRA EL LENGUAJE");
		MCursor.Tex(14,"PROVENIENTE DE MARTE Y SORPRENDE A TUS AMIGOS :O :).");
		MCursor.TCen(10, "+==========================================================+");
		MCursor.Salida();
		MCursor.BLinea(25);
		Title(26,"ACERCA DE LOS PROGRAMADORES");
		MCursor.Tex(22,"       CÉDULA ==>  [ 27.236.609 ]");
		MCursor.Tex(22,"      NOMBRES ==>  [ DANIEL ALEJANDRO ]");
		MCursor.Tex(22,"    APELLIDOS ==>  [ QUINTERO FLORES ]");
		MCursor.TCen(10, "|----------------------------------------------------------|");
		MCursor.Tex(22,"       CÉDULA ==>  [ 26.937.386 ]");
		MCursor.Tex(22,"      NOMBRES ==>  [ ISAAC DANIEL DE JESUS ]");
		MCursor.Tex(22,"    APELLIDOS ==>  [ DEPOOL GONZALEZ ]");
		MCursor.TCen(10, "+==========================================================+");
		MCursor.Salida();
    }

    /*--------------------    TODOS LOS MÉTODOS AUXILIARES ------------------*/

	public static void Title(int p, String T){
        MCursor.BLinea(25);
		MCursor.TCen(10, "+==========================================================+");
		MCursor.TCen(10, "|                    SANTROCK TRANSLATOR                   |");
		MCursor.TCen(10, "|----------------------------------------------------------|");
		MCursor.Tex(p,T);
		MCursor.TCen(10, "+==========================================================+");
    }

	public static byte menu(){
		byte opc;
		Title(30, "MENU DE OPCIONES");
		MCursor.TCen(10, "|          1.- CODIFICAR ARCHIVO                           |");
		MCursor.TCen(10, "|          2.- DECODIFICAR ARCHIVO                         |");
		MCursor.TCen(10, "|          3.- MOSTRAR ARCHIVO                             |");
		MCursor.TCen(10, "|----------------------------------------------------------|");
		MCursor.TCen(10, "|          4.- ACERCA DEL PROGRAMA                         |");
		MCursor.TCen(10, "|          0.- SALIR DEL PROGRAMA                          |");
		MCursor.TCen(10, "+==========================================================+");
		MCursor.TCen(10, "|          DESARROLLADO POR: DEPOOL_I Y QUINTERO_D         |");
		MCursor.TCen(10, "+==========================================================+");
		MCursor.UCursor(21);
		opc = Leer.NByte("ESCOJA SU OPCIÓN [   ]\b\b\b", 21);
		return opc;
	}

    public static void Results(char t){
		MCursor.BLinea(25);
		if(t == 'c'){
        Title(25, "RESULTADOS DE LA CODIFICACIÓN");
		MCursor.Tex(24, "CANTIDAD DE LETRAS CODIFICADAS ==> [ "+cl+" ]");
		MCursor.Tex(22, "CANTIDAD DE PALABRAS CODIFICADAS ==> [ "+cp+" ]");
		MCursor.Tex(13, "CANTIDAD DE SIGNOS DE PUNTUACIÓN OMITIDOS ==> [ "+pe+" ]");
	    }else{
        Title(24, "RESULTADOS DE LA DECODIFICACIÓN");
		MCursor.Tex(22, "CANTIDAD DE LETRAS DECODIFICADAS ==> [ "+cl+" ]");
		MCursor.Tex(20, "CANTIDAD DE PALABRAS DECODIFICADAS ==> [ "+cp+" ]");
		MCursor.Tex(26, "CANTIDAD DE CÓDIGOS ERRÓNEOS ==> [ "+pe+" ]");
	    }
		MCursor.TCen(10, "+==========================================================+");
		MCursor.Salida();
    }

    // METODO PARA CODIFICAR LETRAS TERRESTRES A MARCIANAS
    public static String CodT(String T){
        for(int i=0; i<Abecedario.length; i++){
		    if(T.equals(Abecedario[i][0])){
			    cl++;
                return Abecedario[i][1];
		    }
        }
		pe++;
        return "";
    }

    // METODO PARA DECODIFICAR LETRAS MARCIANAS A TERRESTRES
    public static String CodM(String T){
		for(int i=0; i<Abecedario.length; i++){
		    if(T.equals(Abecedario[i][1])){
			    cl++;
                return Abecedario[i][0];
		    }
		}
		pe++;
	    return "?";
    }

// METODO PARA CONTAR PALABRAS EN EL LENGUAJE TERRESTRE
	public static int ContarPT(String T){
        int c = 0;
	    for(int i=0; i<T.length(); i++){
		    if(i==0){
	            if(T.charAt(i)!=' ')
	                c++;
		    }else{
			    if(T.charAt(i-1)==' ')
	                if(T.charAt(i)!=' ')
	                    c++;
		     }
	    } // for
	    return c;
	}
// METODO PARA CONTAR PALABRAS EN EL LENGUAJE MARCIANO
	public static int ContarPM(String T){
        int c = 0;
	    for(int i=0; i<T.length(); i++){
		    if(i==0){
	            if(T.charAt(i)!='/')
	                c++;
		    }else{
			    if(T.charAt(i-1)=='/')
	                if(T.charAt(i)!='/')
	                    c++;
		     }
	    } // for
	    return c;
	}

} // Taller