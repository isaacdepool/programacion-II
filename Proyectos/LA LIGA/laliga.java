public class laliga{
	static equipo equi[] = new equipo [10];
	static equipo part[] = new equipo [10];
	static int posicion [] = {1,2,3,4,5,6,7,8,9,10};
	static int C = 0;
	static int i =0;
	static int d = 0;
	static int j=0;
	static int p=0;
	static int IS=0;
	static int G=0;
	static int ep1 =0;
	static int ep2 =0;
	static int Z=0;
	static int gf = 0;
	static int gc = 0;
	static byte jr = 0;
	static byte jrr = 0;
	static byte jg = 0;
	static byte je = 0;
	static byte ax = 0;
	static byte jp = 0;
	static int ga = 0;
	static byte W = 0;
	static byte  JR;
	static byte  JRR;
	static byte  JG;
	static byte  JE;
	static byte  JP;
	static byte  PC;
	static int X = 0;
	static int A1[] = new int [10];
	static int A2[] = new int [10];
	static byte A3[] = new byte [10];
	static byte A4[] = new byte [10];
	static byte A5[] = new byte [10];
	static byte A6[] = new byte [10];
	static byte A7[] = new byte [10];
	static byte A8[] = new byte [10];
	static int A9[] = new int [10];
	static int GF = 0;
	static int GC = 0;
	static int GA = 0;
	static String cd;
	static String nb;
	static String CD;
	static String NB;
	boolean aux=false;
	boolean auxi=false;
public static void main(String arg[]){
		Equipo();
		char opc;
		do{ opc = menu();
		switch(opc)
		{
			case 'E' : Juegos();	break;
			case 'T' : Equipos();	break;
			case 'G' : Ganador();	break;
			case 'V' : Ver();       break;
		}
		}while(opc != 'S');
}//main

//MENU
public static char menu()
{
		MCursor.BLinea(30);
		portada(30,"MENU DE OPCIONES");
		MCursor.TCen(10, "==========================================================================================");
		MCursor.TCen(30, "V.- VER TABLA DE ENCUENTROS");
		MCursor.TCen(30, "E.- ENCUENTROS");
		MCursor.TCen(30, "T.- TABLA DE POSICIONES");
		if(W==1)
		{MCursor.TCen(30, "G.- GANADOR DE LA LIGA");}
		MCursor.TCen(10, "==========================================================================================");
		MCursor.TCen(30, "S.- SALIR DEL SISTEMA");
		MCursor.TCen(10, "==========================================================================================");
		MCursor.UCursor(30);
		return Character.toUpperCase(Leer.CChar("ESCOJA SU OPCION ="));
	}//menu

public static void Equipo()
	{
					portada(15,"INGRESE LOS DATOS DE LA LIGA");
					MCursor.TCen(10, "==========================================================================================");
					do{
						MCursor.UCursor(15);
						C = LByte("INGRESE CANTIDAD DE EQUIPOS = ");
						MCursor.TCen(10, "==========================================================================================");
						if((C<3)||(C>10)){
							MCursor.TCen(25, " E	R	R	O	R!! ");
							MCursor.TCen(30, "INGRESE DE 3 A 10 EQUIPOS");
							MCursor.TCen(10, "==========================================================================================");
							MCursor.UCursor(15);}
					}while((C<3)||(C>10));
					do{ boolean aux=false;
						boolean auxi=false;
						do{ aux=false;
						MCursor.UCursor(15);
						CD = Leer.CString("INGRESE CODIGO DEL EQUIPO = ").toUpperCase();
						for(int i=0; i<d; i++)
						if(CD.compareTo(equi[i].CD)==0){
						MCursor.TCen(10, "==========================================================================================");
						MCursor.TCen(25, "***CODIGO YA REGISTRADO***");aux=true;
						MCursor.TCen(10, "==========================================================================================");}
						}while(aux == true);
											do{ auxi=false;

											MCursor.UCursor(15);
											NB = Leer.CString("INGRESE NOMBRE DEL EQUIPO = ").toUpperCase();
											for(int i=0; i<d; i++)
											if(NB.compareTo(equi[i].NB)==0){
											MCursor.TCen(10, "==========================================================================================");
											MCursor.TCen(25, "***NOMBRE YA REGISTRADO***");auxi=true;
											MCursor.TCen(10, "==========================================================================================");}
											}while(auxi == true);
											MCursor.TCen(10, "==========================================================================================");
					equi[d] = new equipo(CD,NB,GF,GC,JR,JRR,JG,JE,JP,PC,GA);
					i++;
					d++;
					}while(i!=C);
					return;
}//INGRESO

public static void Juegos()
{
					Dev();
					if(j==C){p++; j=0; X++; A8[p-1]+=2; A8[p]-=1;}
					if(p==j){j++;}
					if(p==C-1 && j==C){W=1;}
					if(W==1){
					MCursor.BLinea(30);
					portada(48, "FIN DE LA LIGA");
					MCursor.TCen(10, "==========================================================================================");
					MCursor.TCen(43, "SIN PARTIDOS DISPONIBLES");
					MCursor.UCursor(40);
					MCursor.Salida();}
					else{
					//if(j==C){p++; j=0; X++;}
					MCursor.BLinea(30);
					portada(10, " ***** JORNADA "+ (p+1)+ " *****");
					MCursor.TCen(10, "==========================================================================================");
					MCursor.TCen(40,"LOCAL [" + equi[p].NB + "] 0 - 0 [" + equi[j].NB + "] VISITANTE");
					MCursor.TCen(10, "==========================================================================================");
					do{
					MCursor.UCursor(40);
					GF = X = LInt("LOCAL = ");
					}while(X<0);
					do{
					MCursor.UCursor(61);
					GC = Z = LInt("VISITANTE = ");
					}while(Z<0);

					MCursor.UCursor(10);
					MCursor.TCen(10, "==========================================================================================");
										byte m = 0;
										byte n = 0;
										byte l = 0;
										byte o = 0;
										byte r = 0;
										byte s = 0;
					m++;
					if(X>Z){n++; s=3;}else if(X==Z){r++; s=1;}else if(X<Z){o++; s=0;}
					//AUXILIARES LOCALES
					A1[p]+=X; GF=A1[p];
					A2[p]+=Z; GC=A2[p];
					A3[p]+=m; JR=A3[p];
					A4[p]+=n; JG=A4[p];
					A5[p]+=r; JE=A5[p];
					A6[p]+=o; JP=A6[p];
					A7[p]+=s; PC=A7[p];
					A8[p]+=m+1; JRR=A8[p];
					A9[p]=A1[p]-A2[p]; GA=A9[p];
					equi[p] = new equipo(equi[p].CD, equi[p].NB, GF, GC,JR,JRR,JG,JE,JP,PC,GA);

					//AUXILIARES VISITANTES
										byte M = 0;
										byte N = 0;
										byte L = 0;
										byte O = 0;
										byte R = 0;
										byte S = 0;
					M++;
					if(X<Z){N++; S=3;}else if(X==Z){R++; S=1;}else if(X>Z){O++; S=0;}

					A1[j]+=Z; GF=A1[j];
					A2[j]+=X; GC=A2[j];
					A3[j]+=M; JR=A3[j];
					A4[j]+=N; JG=A4[j];
					A5[j]+=R; JE=A5[j];
					A6[j]+=O; JP=A6[j];
					A7[j]+=S; PC=A7[j];
					A8[j]+=M; JRR=A8[j];
					A9[j]=A1[j]-A2[j]; GA=A9[j];
					equi[j] = new equipo(equi[j].CD, equi[j].NB, GF, GC,JR,JRR,JG,JE,JP,PC,GA);
					j++;}
					return;
				}

public static void Equipos()
	{
			 Burb();
			 MCursor.BLinea(30);
			 portada(10,"TABLA DE POSICIONES");
			 MCursor.TCen(10, "==========================================================================================");
			 MCursor.TCen(10, "JORNADA "+(p+1));
			 MCursor.TCen(10, "==========================================================================================");
			 MCursor.TCen(10, "pos\tCODIGO \tNOMBRE  \tJR\tJG\tJE\tJP\tGF\tGC\tGA\tPTS");
			 for(int i=0; i<d; i++)
			 {
			 equi[i].Mostrar(10,""+(i+1));
			 }//for
			 MCursor.Salida();

		return;
	}//Mostrar ingresados

//PORTADA
public static void portada(int F, String T)
{
			MCursor.TCen(10, "==========================================================================================");
			MCursor.TCen(43, "  ****             **** ");
			MCursor.TCen(43, " [|  |]  LA LIGA  [|  |]");
			MCursor.TCen(43, "  _||_             _||_");
		    MCursor.TCen(10, "==========================================================================================");
			MCursor.TCen(F,T);
}
public static void Ganador()
{
	if(W==1){


			 Burb();
		if(equi[G].GA==equi[G+1].GA && IS==0){IS++;
		MCursor.BLinea(30);
		portada(10,"");
		MCursor.TCen(10, "==========================================================================================");
		MCursor.TCen(48, "ENCUENTRO FINAL");
		MCursor.TCen(10, "==========================================================================================");
		MCursor.TCen(40,"LOCAL [" + equi[G].NB + "] 0 - 0 [" + equi[G+1].NB + "] VISITANTE");
		MCursor.TCen(10, "==========================================================================================");
					do{
					MCursor.UCursor(40);
					ep1 = LInt("LOCAL = ");
					}while(ep1<0);
					do{
					MCursor.UCursor(61);
					ep2 = LInt("VISITANTE = ");
					}while(ep2<0);
					if(ep1==ep2){
					MCursor.BLinea(30);
					portada(10,"");
					MCursor.TCen(10, "==========================================================================================");
					MCursor.TCen(52, "PENALES");
					MCursor.TCen(10, "==========================================================================================");
					MCursor.TCen(40,"LOCAL [" + equi[G].NB + "] 0 - 0 [" + equi[G+1].NB + "] VISITANTE");
					MCursor.TCen(10, "==========================================================================================");
					do{
					do{
					MCursor.UCursor(40);
					ep1 = LInt("LOCAL = ");
					}while(ep1<0);
					do{
					MCursor.UCursor(61);
					ep2 = LInt("VISITANTE = ");
					}while(ep2<0);
					}while(ep1==ep2);
					Camp();}
					else {Camp();}}
		else if(IS!=0){
		Camp();}
		else{
		MCursor.BLinea(30);
		MCursor.TCen(10, "==========================================================================================");
		MCursor.TCen(48, "!!!"+equi[G].NB+"!!!");
		MCursor.TCen(10, "==========================================================================================");
		MCursor.TCen(52, "[|  |]");
		MCursor.TCen(53, "_||_");
		MCursor.TCen(47, "CAMPEONES DE LIGA");
		MCursor.TCen(10, "==========================================================================================");
		MCursor.Salida();}}
}
public static void Ver()
{
				 Dev();
				 MCursor.BLinea(30);
				 portada(10, "TABLA DE ENCUENTROS");
				 MCursor.TCen(10, "==========================================================================================");
				 MCursor.TCen(40, "LOCAL\t\t        VISITANTE");
				 int k=0;
				 int ii=0;
				 int ww=0;
				 for(int j=0; j<C*C-C; j++)
				 {
					if(k==ii){ii++;}
					if(ii==C){k++; ii=0;  X++;}

				 MCursor.TCen(25,"JORNADA "+(k+1)+"      ["+equi[k].NB + "] \tVS\t[" + equi[ii].NB+"]" );
					ii++;
				 }//for
				 MCursor.TCen(10, "==========================================================================================");
			 MCursor.Salida();
}

public static int LInt(String tex)
		{	int val=0;
			boolean aux;
			do{
				try{
					System.out.print(tex);
					val = Integer.parseInt(KbInput.read());
					aux = true;
				}
				catch(NumberFormatException ex)
				{	 MCursor.TCen(10, "==========================================================================================");
					 MCursor.TCen(10,"E	R	R	O	R!!!, 	VALOR NO PERMITIDO");
					 MCursor.TCen(10, "==========================================================================================");
					 MCursor.UCursor(40);
					aux = false;
				}
			}while(aux == false);
			return val;
	}
public static byte LByte(String tex)
		{	byte valor=0;
			boolean aux;
			do{
				try{
					System.out.print(tex);
					valor = Byte.parseByte(KbInput.read());
					aux = true;
				}
				catch(NumberFormatException exc)
				{	MCursor.TCen(10, "======================================================================================");
					 MCursor.TCen(10,"E	R	R	O	R!!!, 	VALOR NO PERMITIDO");
					 MCursor.TCen(10, "======================================================================================");
					 MCursor.UCursor(15);
					aux = false;
				}
			}while(aux == false);
			return valor;
	}

public static void Burb()
{
	for(int i=0; i<(C-1); i++)
				 	for(int j=0; j<(C-1); j++)
				 	{
				 		if(equi[j].PC<equi[j+1].PC)
				 	{
				 		byte aux = equi[j].PC;
				 		equi[j].PC=equi[j+1].PC;
				 		equi[j+1].PC=aux;

					nb=equi[j].NB;
					equi[j].NB=equi[j+1].NB;
			  		equi[j+1].NB=nb;

			  		cd=equi[j].CD;
					equi[j].CD=equi[j+1].CD;
			  		equi[j+1].CD=cd;

			  		ga=equi[j].GA;
					equi[j].GA=equi[j+1].GA;
			  		equi[j+1].GA=ga;

					gf=equi[j].GF;
					equi[j].GF=equi[j+1].GF;
			  		equi[j+1].GF=gf;

			  		gc=equi[j].GC;
					equi[j].GC=equi[j+1].GC;
			  		equi[j+1].GC=gc;

			  		jr=equi[j].JR;
					equi[j].JR=equi[j+1].JR;
			  		equi[j+1].JR=jr;

			  		jg=equi[j].JG;
					equi[j].JG=equi[j+1].JG;
			  		equi[j+1].JG=jg;

			  		je=equi[j].JE;
					equi[j].JE=equi[j+1].JE;
			  		equi[j+1].JE=je;

			  		jp=equi[j].JP;
					equi[j].JP=equi[j+1].JP;
			  		equi[j+1].JP=jp;

			  		jrr=equi[j].JRR;
					equi[j].JRR=equi[j+1].JRR;
			  		equi[j+1].JRR=jrr;

			}
				else if(equi[j].PC==equi[j+1].PC)
								 	{
									if(equi[j].GA<equi[j+1].GA)
													 	{
													 	byte aux = equi[j].PC;
													 	equi[j].PC=equi[j+1].PC;
													 	equi[j+1].PC=aux;

														nb=equi[j].NB;
														equi[j].NB=equi[j+1].NB;
												  		equi[j+1].NB=nb;

												  		cd=equi[j].CD;
														equi[j].CD=equi[j+1].CD;
												  		equi[j+1].CD=cd;

												  		ga=equi[j].GA;
														equi[j].GA=equi[j+1].GA;
												  		equi[j+1].GA=ga;

														gf=equi[j].GF;
														equi[j].GF=equi[j+1].GF;
												  		equi[j+1].GF=gf;

												  		gc=equi[j].GC;
														equi[j].GC=equi[j+1].GC;
												  		equi[j+1].GC=gc;

												  		jr=equi[j].JR;
														equi[j].JR=equi[j+1].JR;
												  		equi[j+1].JR=jr;

												  		jg=equi[j].JG;
														equi[j].JG=equi[j+1].JG;
												  		equi[j+1].JG=jg;

												  		je=equi[j].JE;
														equi[j].JE=equi[j+1].JE;
												  		equi[j+1].JE=je;

												  		jp=equi[j].JP;
														equi[j].JP=equi[j+1].JP;
												  		equi[j+1].JP=jp;

												  		jrr=equi[j].JRR;
														equi[j].JRR=equi[j+1].JRR;
												  		equi[j+1].JRR=jrr;

			}
			}}
}

public static void Dev()
{
	for(int i=0; i<(C-1); i++)
				 			 	for(int j=0; j<(C-1); j++)
				 			 	{
				 			 		if(equi[j].JRR<equi[j+1].JRR)
				 			 	{
				 			 		byte aux = equi[j].PC;
				 			 		equi[j].PC=equi[j+1].PC;
				 			 		equi[j+1].PC=aux;

				 				nb=equi[j].NB;
				 				equi[j].NB=equi[j+1].NB;
				 		  		equi[j+1].NB=nb;

								ga=equi[j].GF;
													equi[j].GA=equi[j+1].GA;
			  		equi[j+1].GA=ga;

				 		  		cd=equi[j].CD;
				 				equi[j].CD=equi[j+1].CD;
				 		  		equi[j+1].CD=cd;

				 				gf=equi[j].GF;
				 				equi[j].GF=equi[j+1].GF;
				 		  		equi[j+1].GF=gf;

				 		  		gc=equi[j].GC;
				 				equi[j].GC=equi[j+1].GC;
				 		  		equi[j+1].GC=gc;

				 		  		jr=equi[j].JR;
				 				equi[j].JR=equi[j+1].JR;
				 		  		equi[j+1].JR=jr;

				 		  		jg=equi[j].JG;
				 				equi[j].JG=equi[j+1].JG;
				 		  		equi[j+1].JG=jg;

				 		  		je=equi[j].JE;
				 				equi[j].JE=equi[j+1].JE;
				 		  		equi[j+1].JE=je;

				 		  		jp=equi[j].JP;
				 				equi[j].JP=equi[j+1].JP;
				 		  		equi[j+1].JP=jp;

				 		  		jrr=equi[j].JRR;
				 				equi[j].JRR=equi[j+1].JRR;
				 		  		equi[j+1].JRR=jrr;

			}}
}
public static void Camp()
{
	MCursor.BLinea(30);
			MCursor.TCen(10, "==========================================================================================");
			if(ep1>ep2){MCursor.TCen(48, "!!!"+equi[G].NB+"!!!");}
			else{MCursor.TCen(48, "!!!"+equi[G+1].NB+"!!!");}
			MCursor.TCen(10, "==========================================================================================");
			MCursor.TCen(52, "[|  |]");
			MCursor.TCen(53, "_||_");
			MCursor.TCen(47, "CAMPEONES DE LIGA");
			MCursor.TCen(10, "==========================================================================================");
		MCursor.Salida();
}








}