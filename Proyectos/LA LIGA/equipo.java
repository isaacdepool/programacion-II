/*
	Objeto
	ATRIBUTOS: ? Código del equipo
			   ? Nombre del equipo
			   ? Juegos Realizados
			   ? Juegos Ganados
			   ? Juegos Empatados
			   ? Juegos Perdidos
			   ? Marcador a Favor
			   ? Marcador en Contra
			   ? Puntos Acumulados
*/
public class equipo
{
	String CD;
	String NB;
	int  GF;
	int  GC;
	byte  JR;
	byte  JRR;
	byte  JG;
	byte  JE;
	byte  JP;
	byte  PC;
	int GA;
	boolean aux=false;
	boolean auxi=false;

	//CONSTRUCTOR
public equipo(String CD, String NB,int  GF,int  GC,byte  JR, byte  JRR, byte  JG, byte  JE, byte  JP, byte  PC, int GA)
{
	this.CD = CD;
	this.NB = NB;
	this.GF = GF;
	this.GC = GC;
	this.GA = GA;
	this.JR = JR;
	this.JRR = JRR;
	this.JG = JG;
	this.JE = JE;
	this.JP = JP;
	this.PC = PC;
}
public void Mostrar(int pos, String Texto)
{

				int i=0;
				MCursor.TCen(10, "==========================================================================================");
				MCursor.TCen(pos, Texto +"\t"+ CD +"\t" +NB+"   \t"+JR+"\t"+JG+"\t"+JE+"\t"+JP+"\t"+GF+"\t"+GC+"\t"+GA+"\t"+PC);
				i++;
				return;
}
public void Local(int pos, String Texto)
{
 					MCursor.TCen(10, "==========================================================================================");
					MCursor.TCen(pos, Texto);
					MCursor.TCen(10, "------------------------------------------------------------------------------------------");
					MCursor.TCen(10, " "+NB+" ");


}
public void Visitante(int pos, String Texto)
{

					MCursor.TCen(10, "==========================================================================================");
					MCursor.TCen(pos, Texto);
					MCursor.TCen(10, "------------------------------------------------------------------------------------------");
					MCursor.TCen(30, " "+NB+" ");
					MCursor.TCen(10, "==========================================================================================");

}


}
