import java.io.*;

public class PracExam{

static String Ruta = "C:\\Users\\isac\\Desktop\\isaac\\Universidad\\Programacion II\\Practica\\Exam\\";
static char abc [] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' '};
static String texto;
static char p[];
static int pl=0;
static int s=0;
static int c=0;
static int l=0;
static int o=0;
static int q=0;
	public static void main(String isaac[])throws IOException{
	//crear();
	palabras();

}
	public static void crear()
{

	MCursor.UCursor(30);
	String nombre = Leer.CString("INGRESE NOMBRE DEL ARCHIVO = ");
	File F1 = new File (Ruta + nombre);

	try{
	if(!F1.exists()){
	File F2 = new File (Ruta + nombre );
	BufferedWriter wF2;// buffer de escritura.
	wF2 = new BufferedWriter(new FileWriter(F2));
    PrintWriter wr = new PrintWriter(wF2);
    texto = Leer.CString("INGRESE TEXTO DEL ARCHIVO = ");
		        	wr.write(texto);
					wr.flush();
            		wr.close(); // CERRAMOS EL PRINTWRITER
            		wF2.close(); // CERRAMOS EL BUFFER DE ESCRITURA
  }
  else System.out.println("hola");}
  catch (Exception ex){System.out.println("ALGO VA MAL....");}
}//crear

public static void palabras(){

		MCursor.UCursor(30);
		String nombre = Leer.CString("INGRESE NOMBRE DEL ARCHIVO = ");
		File F1 = new File (Ruta + nombre);

		try{
			if(F1.exists()){
BufferedReader rF1;// buffer de lectura.
rF1 = new BufferedReader(new FileReader(F1));
String t = "";
while((t = rF1.readLine())!=null){
	System.out.println("ALGO VA bien....");
	t = t.toUpperCase();
for(int i=0; i<t.length(); i++){
boolean aux=false;

	for(int j=0; j<abc.length; j++){
			if(t.charAt(i)==abc[j])
			{  l++; aux=true; }//if
			}//for
			if(!aux){s++;}
			if(aux){c++;}


	if(i==0){if(t.charAt(i)!=' ') {pl++;}}

			else{
				if(t.charAt(i-1)==' ' && t.charAt(i)!=' ')
			pl++;}

			}//IF

			char cara;
			char carac[] = new char [t.length()];
			char caracT[] = new char [t.length()];
			int total[] = new int [t.length()];
			for(int u=0; u<t.length(); u++){caracT[u] = t.charAt(u);}

				for (int qq=0; qq<t.length(); qq++)
				{
					cara = caracT[qq];
					carac[qq] = cara;
					for(int ww=0; ww<t.length(); ww++){

					if(caracT[ww]==cara){
						total[qq]++;
						caracT[ww]=' ';
						}
	}}


			System.out.println();
			System.out.println("PALABRAS = "+pl+ " LETRAS = "+l+ " SIGNOS = "+s);

			for(int Y=0; Y<t.length(); Y++){
				if(carac[Y]!= ' '){
			System.out.print(total[Y]+"  " +carac[Y]);}
			System.out.print("\r\n");}



	  //else {System.out.println("hola");}
	}//WHILE
	rF1.close(); // CERRAMOS EL BUFFER DE LECTURA
			}//IF
			}//TRY



  catch (Exception ex){System.out.println("ALGO VA MAL....");}








}
public static void repetir()
{









}
}