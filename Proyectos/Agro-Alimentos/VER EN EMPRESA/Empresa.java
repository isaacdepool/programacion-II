public class Empresa{

//METODOS
static final int MAX = 10;
static producto PRO[] = 	new producto [MAX];
static PFresco FRE[] = 	new PFresco [MAX];
static PRefrigerado REF[] = new PRefrigerado [MAX];
static PCongelado CONG[] = new PCongelado  [MAX];

static boolean auxi=true;
static byte opc;
static byte opc1;
//STRING
static String 	D;
static String 	PO;
static String 	COSA;
static String	paises [] = {"AFGHANISTAN", "ALBANIA", "ARGELIA", "ALEMANIA", "AMERICAN SAMOA", "ANDORRA", "ANGOLA", "ANGUILLA", "ANTARTIDA", "ANTIGUA Y BARBUDA", "ARGENTINA", "ARMENIA", "ARUBA", "AUSTRALIA", "AUSTRIA", "AZERBAIJAN", "BAHAMAS", "BAHRAIN", "BANGLADESH", "BARBADOS", "BELARUS", "BELGIUM", "BELIZE", "BENIN", "BERMUDA", "BHUTAN", "BOLIVIA", "BOSNIA-HERZEGOVINA", "BOTSWANA", "BOUVET ISLAND", "BRASIL", "BRIT IND OCEAN TERRITORY", "BRUNEI DARUSSALM", "BULGARIA", "BURKINA FASO", "BURMA", "BURUNDI", "CAMBODIA", "CAMERUN", "CANADA", "CANARY ISLANDS", "CAPE VERDE", "CAYMEN ISLANDS", "CENTRAL AFRICAN REP", "CHAD", "CHILE", "CHINA", "CHRISTMAS ISLANDS", "COCOS ISLANDS", "COLOMBIA", "COMOROS", "CONGO", "COOK ISLANDS", "COSTA RICA", "CROACIA", "CUBA", "CHIPRE", "REPUBLICA DE KOREA", "DINAMARCA", "DJIBOUTI", "DOMINICA", "EAST TIMOR", "ECUADOR", "EGIPTO", "EL SALVADOR", "ERITREA", "ESPAÑA", "ESTADOS UNIDOS DE AMERICA", "ESTONIA", "ETIOPIA", "FALKLAND ISLANDS", "FAROE ISLANDS", "FIJI", "FINLAND", "FRANCIA", "GUAYANA FRANCESA", "POLYNESIA FRANCESA", "FRENCH SO. TERRITORIES", "GABON", "GAMBIA", "GEORGIA", "GHANA", "GIBRALTAR", "GUINEA EQUATORIAL", "GRECIA", "GREENLAND", "GRENADA", "GUADALUPE", "GUATEMALA", "GUINEA", "GUINEA BISSAU", "GUYANA", "HAITI", "HEARD, MCDONALD ISLAND", "HONDURAS", "HONG KONG", "HUNGARY", "ICELAND", "INDIA", "INDONESIA", "INGLATERRA", "IRAN", "IRAQ", "IRELAND", "ISLAS FILIPINAS", "ISRAEL", "ITALIA", "IVORY COAST", "JAMAICA", "JAPON", "JORDAN", "KAZAKHISTAN", "KENIA", "KIRIBATI", "KOREA DEL NORTE", "KUWAIT", "KYRQYZSTAN", "LAOS", "LATIVA", "LIBANO", "LESOTHO", "LIBERIA", "LIBYA", "LIECHTENSTEIN", "LITHUANIA", "LUXEMBOURG", "MACAU", "MADAGASCAR", "MALAWI", "MALAYSIA", "MALDIVAS", "MALI", "MALTA", "MARIANA ISLANDS", "MARRUECOS", "MARSHALL ISLANDS", "MARTINIQUE", "MAURITANIA", "MAURITIUS", "MAYOTTE", "MEXICO", "MICRONESIA", "MOLDOVA", "MONACO", "MONGOLIA", "MONTSERRAT", "MOZAMBIQUE", "MYANMAR", "NAMBIA", "NAURU", "NEPAL", "NETHERLAND ANTILLES", "HOLANDA", "NEW CALEDONIA", "NEW ZEALAND", "NICARAGUA", "NIGER", "NIGERIA", "NIUE ISLAND", "NORFOLK ISLAND", "NORTHERN MARIANA ISLAND", "NORWAY", "OCE", "OMAN", "PACIFIC ISLANDS", "PAKISTAN", "PALAU", "PANAMA", "PAPUA NEW GUINEA", "PARAGUAY", "PERU", "PITCAIRN", "POLAND", "PORTUGAL", "PUERTO RICO", "QATAR", "REINO UNIDO", "REPUBLICA DE COREA", "REPUBLICA DOMINICANA", "REUNION", "ROMANIA", "RUSIA", "RWANDA", "SOUTH GEORGIA SANDWICH", "SAINT PIERRE MIGUELON", "SAMOA", "SAN MARINO", "SAO TOMEE AND PRINCIPE", "SAUDI ARABIA", "SENEGAL", "SEYCHELLES", "SIERRE LEONE", "SINGAPORE", "SLOVAKIA", "SLOVENIA", "SOLOMON ISLANDS", "SOMALI REPUBLIC", "SOUTH AFRICA", "SOUTH KOREA", "SRI LANKA", "ST. HELENA", "ST. KITS-NEVIS", "ST. LUCIA", "ST. VINCENT/GRENADINES", "SUDAN", "SURINAME", "SVALBARD JAN MAYEN", "SWAZILAND", "SWEDEN", "SWITZERLAND", "SYRIA", "TAIWAN", "TAJIKISTAN", "TANZANIA", "THAILAND", "TOGO", "TOKEELAU", "TONGA", "TRINIDAD TOBAGO", "TUNISIA", "TURQUIA", "TURKMENISTAN", "TURKS CAICOS ISLANDS", "TUVALU", "UGANDA", "UKRANIA", "UNITED ARAB EMIRATES", "URUGUAY", "US MINOR OUTLYING IS.", "UZBEKISTAN", "VANUATU", "VATICAN CITY STATE", "VENEZUELA", "VIETNAM", "VIRGIN ISLANDS: BRITISH", "VIRGIN ISLANDS: US", "WALLIS FUTUNA ISLANDS", "WESTERN SAHARA", "WESTERN SAMOA", "YEMEN", "YUGOSLAVIA", "ZAIRE", "ZAMBIA", "ZIMBABWE"};

public static void main(String arg[]){
		do{ opc = menu();
		switch(opc)
		{
			case 1 : reg1();	break;
			case 2 : reg1();	break;
			case 3 : Tot();		break;
			case 4 : Busc();	break;
			case 5 : By();		break;

		}
		}while(opc != 0);

}//main

public static Byte menu()
{
		MCursor.BLinea(30);
		portada(10,"MENU DE OPCIONES");
		MCursor.TCen(10, "============================================================");
		MCursor.TCen(20, "1.- REGISTRAR PRODUCTOS");
		MCursor.TCen(10, "============================================================");
		MCursor.TCen(20, "2.- MOSTRAR INVENTARIO");
		MCursor.TCen(10, "============================================================");
		MCursor.TCen(20, "3.- GANANCIAS");
		MCursor.TCen(10, "============================================================");
		MCursor.TCen(20, "4.- BUSCAR POR PAISES");
		MCursor.TCen(10, "============================================================");
		MCursor.TCen(20, "5.- ACERCA DE...");
		MCursor.TCen(10, "============================================================");
		MCursor.TCen(20, "0.- SALIR DEL SISTEMA");
		MCursor.TCen(10, "============================================================");
		MCursor.UCursor(20);
		return Leer.NByte("ESCOJA SU OPCION = ");
}//menu
public static void Ingreso(){

	 MCursor.BLinea(30);
	 portada(10,"REGISTRO");
	 MCursor.TCen(10, "============================================================");
	 MCursor.UCursor(20);
	 D = Leer.CString("DESCRIPCION = ").toUpperCase();
	do{
	 MCursor.BLinea(30);
	 portada(10,"REGISTRO");
	 MCursor.TCen(10, "============================================================");
		MCursor.UCursor(20);
		   E = Leer.NInt("EXISTENCIA = ");
	}while(E<0);
	do{
	 MCursor.BLinea(30);
	 portada(10,"REGISTRO");
	 MCursor.TCen(10, "============================================================");
		MCursor.UCursor(20);
		   C = Leer.NFloat("COSTO = ");
	}while(PV<0);
	do{
	 MCursor.BLinea(30);
	 portada(10,"REGISTRO");
	 MCursor.TCen(10, "============================================================");
		MCursor.UCursor(20);
		   FEM = Leer.NByte("MES DE ENVASADO = ");
	}while(FEM<1 || FEM>12);
	do{
	 MCursor.BLinea(30);
	 portada(10,"REGISTRO");
	 MCursor.TCen(10, "============================================================");
		MCursor.UCursor(20);
			   FEA = Leer.NInt("AÑO DE ENVASADO = ");
	}while(FEA<2018);
	do{
		do{
	 MCursor.BLinea(30);
	 portada(10,"REGISTRO");
	 MCursor.TCen(10, "============================================================");
		MCursor.UCursor(20);
			   FCM = Leer.NByte("MES DE CADUCIDAD = ");
	}while(FCM<1 || FCM>12);
	do{
	 MCursor.BLinea(30);
	 portada(10,"REGISTRO");
	 MCursor.TCen(10, "============================================================");
		MCursor.UCursor(20);
			   FCA = Leer.NInt("AÑO DE CADUCIDAD = ");
	}while(FCA<2018);
	}while(FCM<=FEM && FCA<=FEA);
	do{
	 MCursor.BLinea(30);
	 portada(10,"REGISTRO");
	 MCursor.TCen(10, "============================================================");
		MCursor.UCursor(20);
			L = Leer.NInt("NUMERO DE LOTE = ");
	}while(L<0);
	 do{ auxi=true;
	 MCursor.BLinea(30);
	 portada(10,"REGISTRO");
	 MCursor.TCen(10, "============================================================");

	 											MCursor.UCursor(20);
	 											PO = Leer.CString("PAIS DE ORIGEN = ").toUpperCase();
	 											for(int i=0; i<244; i++)
	 											if(PO.compareTo(paises[i])==0){auxi=false;
	 											}
	 											if(auxi==true)
	 											{
	 											MCursor.TCen(10, "============================================================");
												MCursor.TCen(25, "***PAIS NO EXISTENTE***");
	 											MCursor.TCen(10, "============================================================");
	 											MCursor.Salida();}
											}while(auxi == true);

}
public static void Fresco(){
	if(fr<MAX){
	Ingreso();
	MCursor.TCen(10, "============================================================");
	MCursor.Salida();
	FRE[fr]= new PFresco(D,E,C,PV,FEM,FEA,FCM,FCA,L,PO);
	PRO[fr]= new PFresco(D,E,C,PV,FEM,FEA,FCM,FCA,L,PO);
	fr++;}
	if(r==MAX) error(30, "NO SE PUEDEN REGISTRAR MAS PRODUCTOS");

}

public static void Refrigerado(){

	if(r<MAX){
	Ingreso();
		 MCursor.BLinea(30);
		 portada(10,"REGISTRO");
	 MCursor.TCen(10, "============================================================");
	MCursor.UCursor(20);
	COSA = Leer.CString("CODIGO O.S.A = ");
		 MCursor.BLinea(30);
		 portada(10,"REGISTRO");
	 MCursor.TCen(10, "============================================================");
	MCursor.UCursor(20);
	TP = Leer.NFloat("TEMPERATURA DE MANTENIMIENTO RECOMENDADA = ");
	MCursor.TCen(10, "============================================================");
	MCursor.Salida();
	REF[r]= new PRefrigerado(D,E,C,PV,FEM,FEA,FCM,FCA,L,PO,COSA, TP);
	r++;}
	if(r==MAX) error(30, "NO SE PUEDEN REGISTRAR MAS PRODUCTOS");
}

public static void Congelado(){

	if(c<MAX){
	Ingreso();
		 MCursor.BLinea(30);
		 portada(10,"REGISTRO");
	 MCursor.TCen(10, "============================================================");
	MCursor.UCursor(20);
	TR = Leer.NFloat("TEMPERATURA DE MANTENIMIENTO RECOMENDADA = ");	 MCursor.BLinea(30);
	 portada(10,"REGISTRO");
	 MCursor.TCen(10, "============================================================");
	MCursor.TCen(20, "PRODUCTO CONGELADO POR");
	MCursor.TCen(20, "1.- AIRE");
	MCursor.TCen(20, "2.- AGUA");
	MCursor.TCen(20, "3.- NITROGENO");
	MCursor.TCen(10, "------------------------------------------------------------");
	do{
	MCursor.UCursor(20);
	t = Leer.NByte("OPCION = ");
	}while(t<1 || t>3);
	MCursor.TCen(10, "============================================================");
	MCursor.Salida();
	if(t==1){CONG[c]= new PCongelado(D,E,C,PV,FEM,FEA,FCM,FCA,L,PO, TR); c++;}
	if(t==2){CONG2[c2]= new PCongelado(D,E,C,PV,FEM,FEA,FCM,FCA,L,PO, TR); c2++;}
	if(t==3){CONG3[c3]= new PCongelado(D,E,C,PV,FEM,FEA,FCM,FCA,L,PO, TR); c3++;}}
	if(c==MAX) error(30, "NO SE PUEDEN REGISTRAR MAS PRODUCTOS");
}

public static void MostF(){

if(fr>0){
	Burb();
	for(int i=0;i<fr;i++){
		MCursor.BLinea(30);
		portada(10,"INVENTARIO");
	FRE[i].MostrarF(10, "PRODUCTOS FRESCOS");
	MCursor.Salida();}}
	else error(30, "SIN DATOS EN EL SISTEMA");
}

public static void MostR(){

if(r>0){
	Burb();
	for(int i=0;i<r;i++){
		MCursor.BLinea(30);
		portada(10,"INVENTARIO");
	REF[i].MostrarR(10, "PRODUCTOS REFIGERADOS");
	MCursor.Salida();}}
	else error(30, "SIN DATOS EN EL SISTEMA");
}

public static void MostC(){

if(c>0){
	Burb();
	for(int i=0;i<c;i++){
		MCursor.BLinea(30);
		portada(10,"INVENTARIO");
	CONG[i].MostrarC(10, "PRODUCTOS CONGELADOS POR AIRE");
	MCursor.Salida();}}
	if(c2>0){
	for(int i=0;i<c2;i++){
		MCursor.BLinea(30);
	CONG2[i].MostrarC(10, "PRODUCTOS CONGELADOS POR AGUA");
	MCursor.Salida();}}
	if(c3>0){
	for(int i=0;i<c3;i++){
		MCursor.BLinea(30);
	CONG3[i].MostrarC(10, "PRODUCTOS CONGELADOS POR NITROGENO");
	MCursor.Salida();}}
	else if(c==0 && c2==0 && c3==0)error(30,"SIN DATOS EN EL SISTEMA");
}

public static void Tot(){

if(fr!=0 || r!=0 || c!=0 || c2!=0 || c3!=0 ){
		A=0;
		AC=0;
		ACU=0;
		ACU2=0;
		ACU3=0;
		AT=0;
		for(int i=0;i<fr;i++){
			A+=FRE[i].E;}
			for(int i=0;i<r;i++){
			AC+=REF[i].E;}
			for(int i=0;i<c;i++){
			ACU+=CONG[i].E;}
			for(int i=0;i<c2;i++){
			ACU2+=CONG2[i].E;}
			for(int i=0;i<c3;i++){
			ACU3+=CONG3[i].E;}
			AT=A+AC+ACU+ACU2+ACU3;

				A=0;
				AC=0;
				ACU=0;
				ACU2=0;
				ACU3=0;
				AL=0;
				for(int i=0;i<fr;i++){
					A=FRE[i].C*(float)0.30;
					A=FRE[i].C+A;}
					for(int i=0;i<r;i++){
					AC=REF[i].C*(float)0.30;
					AC=REF[i].C+AC;}
					for(int i=0;i<c;i++){
					ACU=CONG[i].C*(float)0.30;
					ACU=CONG[i].C+ACU;}
					for(int i=0;i<c2;i++){
					ACU2=CONG2[i].C*(float)0.30;
					ACU2=CONG2[i].C+ACU2;}
					for(int i=0;i<c3;i++){
					ACU3=CONG3[i].C*(float)0.30;
					ACU3=CONG3[i].C+ACU3;}
					AL=A+AC+ACU+ACU2+ACU3;

				A=0;
				AC=0;
				ACU=0;
				ACU2=0;
				ACU3=0;
				float ALL=0;
				for(int i=0;i<fr;i++){
					A=FRE[i].C;
					}
					for(int i=0;i<r;i++){
					AC=REF[i].C;
					}
					for(int i=0;i<c;i++){
					ACU=CONG[i].C;
					}
					for(int i=0;i<c2;i++){
					ACU2=CONG2[i].C;
					}
					for(int i=0;i<c3;i++){
					ACU3=CONG3[i].C;
					}
					ALL=A+AC+ACU+ACU2+ACU3;



				GB4=(AL-ALL);
				GB1=GB4*(float)0.15;
				GB2=GB4*(float)0.20;
				GB3=GB4*(float)0.30;
				GN=GB4-GB1-GB2-GB3;

					MCursor.BLinea(30);
					portada(10,"GANANCIAS");
					MCursor.TCen(10, "============================================================");
					MCursor.TCen(10, "            IMPUESTOS: ["+GB1*AT+"]");
					MCursor.TCen(10, "    GASTOS OPERATIVOS: ["+GB2*AT+"]");
					MCursor.TCen(10, "       PAGO DE NOMINA: ["+GB3*AT+"]");
					MCursor.TCen(10, "       GANANCIA BRUTA: ["+GB4*AT+"]");
					MCursor.TCen(10, "        GANANCIA NETA: ["+(GN*AT)+"]");
					MCursor.Salida();}
	else error(30,"SIN DATOS EN EL SISTEMA");

}

public static void ExiF(){

if(fr!=0 || r!=0 || c!=0 || c2!=0 || c3!=0 ){
	A=0;
	AC=0;
	ACU=0;
	ACU2=0;
	ACU3=0;
	AT=0;
	for(int i=0;i<fr;i++){
		A+=FRE[i].E;}
		for(int i=0;i<r;i++){
		AC+=REF[i].E;}
		for(int i=0;i<c;i++){
		ACU+=CONG[i].E;}
		for(int i=0;i<c2;i++){
		ACU2+=CONG2[i].E;}
		for(int i=0;i<c3;i++){
		ACU3+=CONG3[i].E;}
		AT=A+AC+ACU+ACU2+ACU3;

		MCursor.BLinea(30);
		portada(10,"EXISTENCIA");
		MCursor.TCen(10, "============================================================");
		MCursor.TCen(10, "PRODUCTOS FRESCOS = [ " +A+ " ] "+" [ " +(A/AT)*100+ "% ]");
		MCursor.TCen(10, "============================================================");

		MCursor.TCen(10, "PRODUCTOS REFRIGERADOS = [ " +AC+ " ] "+" [ " +(AC/AT)*100+ "% ]");
		MCursor.TCen(10, "============================================================");

		MCursor.TCen(10, "PRODUCTOS CONGELADOS (POR AIRE) = [ " +ACU+ " ] "+" [ " +(ACU/AT)*100+ "% ] ");
		MCursor.TCen(10, "============================================================");

		MCursor.TCen(10, "PRODUCTOS CONGELADOS (POR AGUA) = [ " +ACU2+ " ] "+" [ " +(ACU2/AT)*100+ "% ] ");
		MCursor.TCen(10, "============================================================");

		MCursor.TCen(10, "PRODUCTOS CONGELADOS (POR NITROGENO) = [ " +ACU3+ " ] "+" [ " +(ACU3/AT)*100+ "% ] ");
		MCursor.TCen(10, "============================================================");
		MCursor.TCen(10, "TOTAL DE PRODUCTOS CONGELADOS = [" +(ACU+ACU2+ACU3)+ "]" +" [ " +(ACU+ACU2+ACU3)/AT*100+ "% ] " );
		MCursor.TCen(10, "============================================================");
		MCursor.TCen(10, "TOTAL DE PRODUCTOS = [" +AT+ "]");
		MCursor.TCen(10, "============================================================");
		MCursor.Salida();}
		else error(30, "SIN DATOS EN EL SISTEMA");
}

public static void Burb(){

	//String Axd[] ="";
	FRES[fr]= new PFresco("",0,0,0,(byte)0,0,(byte)0,0,0,"");
	REFR[r]= new PRefrigerado("",0,0,0,(byte)0,0,(byte)0,0,0,"","",0);
	CONGE[c]= new PCongelado("",0,(float)0,(float)0,(byte)0,0,(byte)0,0,0,"",(float)0);
	CONGE2[c2]= new PCongelado("",0,(float)0,(float)0,(byte)0,0,(byte)0,0,0,"",(float)0);
	CONGE3[c3]= new PCongelado("",0,(float)0,(float)0,(byte)0,0,(byte)0,0,0,"",(float)0);
	int Axs =0;
	for (int i=0;i<(fr-1);i++)
			  if (FRE[i].D.compareTo(FRE[i+1].D)>Axs){
		      FRES[i]=FRE[i];
			  FRE[i]=FRE[i+1];
		  	  FRE[i+1]=FRES[i];}
	int Ac =0;
	for (int i=0;i<(r-1);i++)
			  if (REF[i].D.compareTo(REF[i+1].D)>Ac){
		      REFR[i]=REF[i];
			  REF[i]=REF[i+1];
		  	  REF[i+1]=REFR[i];}
	int Ax =0;
	for (int i=0;i<(c-1);i++)
			  if (CONG[i].D.compareTo(CONG[i+1].D)>Ax){
		      CONGE[i]=CONG[i];
			  CONG[i]=CONG[i+1];
		  	  CONG[i+1]=CONGE[i];}
	int Axsd =0;
	for (int i=0;i<(c2-1);i++)
			  if (CONG2[i].D.compareTo(CONG2[i+1].D)>Axsd){
		      CONGE2[i]=CONG2[i];
			  CONG2[i]=CONG2[i+1];
		  	  CONG2[i+1]=CONGE2[i];}
	int Axsdd =0;
	for (int i=0;i<(c3-1);i++)
			  if (CONG3[i].D.compareTo(CONG3[i+1].D)>Axsdd){
		      CONGE3[i]=CONG3[i];
			  CONG3[i]=CONG3[i+1];
		  	  CONG3[i+1]=CONGE3[i];}


}
public static void Busc(){

	auxi=true;
	MCursor.BLinea(30);
	portada(10,"BUSCAR");
	MCursor.TCen(10, "============================================================");
	MCursor.UCursor(20);
	PO = Leer.CString("PAIS DE ORIGEN = ").toUpperCase();

	for(int i=0; i<fr; i++)
	if(PO.compareTo(FRE[i].PO)==0){auxi=false;
		MCursor.BLinea(30);
	FRE[i].MostrarF(10, "PRODUCTOS FRESCOS");
	MCursor.Salida();}

	for(int i=0; i<r; i++)
	if(PO.compareTo(REF[i].PO)==0){auxi=false;
	MCursor.BLinea(30);
	REF[i].MostrarR(10, "PRODUCTOS REFRIGERADOS");
	MCursor.Salida();}

	for(int i=0; i<c; i++)
	if(PO.compareTo(CONG[i].PO)==0){auxi=false;
	MCursor.BLinea(30);
	CONG[i].MostrarC(10, "PRODUCTOS CONGELADOS (POR AIRE)");
	MCursor.Salida();}

	for(int i=0; i<c2; i++)
	if(PO.compareTo(CONG2[i].PO)==0){auxi=false;
	MCursor.BLinea(30);
	CONG2[i].MostrarC(10, "PRODUCTOS CONGELADOS (POR AGUA)");
	MCursor.Salida();}

	for(int i=0; i<c3; i++)
	if(PO.compareTo(CONG3[i].PO)==0){auxi=false;
	MCursor.BLinea(30);
	CONG3[i].MostrarC(10, "PRODUCTOS CONGELADOS (POR HIDROGENO)");
	MCursor.Salida();}


	if(auxi==true){
	MCursor.BLinea(30);
	MCursor.TCen(10, "============================================================");
	MCursor.TCen(25, "*** NO SE ENCONTRO PAIS DE ORIGEN ***");
	MCursor.TCen(10, "============================================================");
	MCursor.Salida();}


}
public static void portada(int F, String T)
{
			MCursor.TCen(10, "============================================================");
			MCursor.TCen(20, "  _**_                             _**_");
			MCursor.TCen(20, " |    |__  BIENVENIDO AL SISTEMA  |    |__");
			MCursor.TCen(20, " |       |   AGRO-ALIMENTOS C.A   |       | ");
			MCursor.TCen(20, "  O     O                          O     O  ");
		    MCursor.TCen(10, "============================================================");
			MCursor.TCen(F,T);
}
public static byte reg1(){
Byte opc1;
		do{ opc1 = reg();
		switch(opc1)
		{

			case 1 : if(opc==1)Fresco();		break;
			case 2 : if(opc==1)Refrigerado();	break;
			case 3 : if(opc==1)Congelado();		break;
			case 4 : if(opc==2)MostF();			break;
			case 5 : if(opc==2)MostR();			break;
			case 6 : if(opc==2)MostC();			break;
			case 7 : if(opc==2)ExiF();			break;

		}
		}while(opc1 != 0);
		return opc1;
}
public static byte reg()
{
			if(opc==1){
			MCursor.BLinea(30);
			portada(10,"REGISTRO");
			MCursor.TCen(10, "============================================================");
			MCursor.TCen(20, "1.- PRODUCTOS FRESOS");
			MCursor.TCen(20, "2.- PRODUCTOS REFRIGERADOS");
			MCursor.TCen(20, "3.- PRODUCTOS CONGELADOS");
		    MCursor.TCen(10, "============================================================");
		    MCursor.TCen(20, "0.- MENU PRINCIPAL");
		    MCursor.TCen(10, "============================================================");
		    MCursor.UCursor(20);}
			if(opc==2){
			MCursor.BLinea(30);
			portada(10,"INVENTARIO");
		   	MCursor.TCen(20, "4.- PRODUCTOS FRESOS");
			MCursor.TCen(20, "5.- PRODUCTOS REFRIGERADOS");
			MCursor.TCen(20, "6.- PRODUCTOS CONGELADOS");
			MCursor.TCen(20, "7.- EXISTENCIA TOTAL");
			MCursor.TCen(10, "============================================================");
			MCursor.TCen(20, "0.- MENU PRINCIPAL");
		    MCursor.TCen(10, "============================================================");
			MCursor.UCursor(20);}
			return Leer.NByte("ESCOJA SU OPCION = ");
}

public static void error(int F, String T)
{
			MCursor.BLinea(30);
			MCursor.TCen(10, "============================================================");
			MCursor.TCen(18, "	E	R	R	O	R");
			MCursor.TCen(F,T);
		    MCursor.TCen(10, "============================================================");
		    MCursor.Salida();
}

public static void By()
{
			MCursor.BLinea(30);
			MCursor.TCen(10, "ACERCA DE...");
			MCursor.TCen(10, "============================================================");
			MCursor.TCen(10, "PROGRAMADORES");
			MCursor.TCen(10, "------------------------------------------------------------");
			MCursor.TCen(14, "ISAAC DANIEL DE JESUS DEPOOL GONZALEZ C.I 26.937.386");
		    MCursor.TCen(10, "============================================================");
		    MCursor.TCen(10, "AGRADECIMIENTOS");
		    MCursor.TCen(10, "------------------------------------------------------------");
		    MCursor.TCen(14, "M.SC. MARIA EUGENIA FOSSI MEDINA.");
		    MCursor.TCen(14, "POR SU MANERA DE ENSEÑAR Y SUS METODOS QUE AYUDARON A LA");
		    MCursor.TCen(14, "REALIZACION SATISFACTORIA DEL PROGRAMA.");
		    MCursor.TCen(10, "============================================================");
		    MCursor.TCen(10, "CITA DE UN GRAN AUTOR");
		    MCursor.TCen(10, "------------------------------------------------------------");
		    MCursor.TCen(14, "LA IMAGINACION ES MAS GRANDE QUE EL CONOCIMIENTO...");
		    MCursor.TCen(14, "ALBERT EINSTEIN.");
		    MCursor.Salida();
}
static PCongelado CONG2[] =new PCongelado  [MAX];
static PCongelado CONG3[] =new PCongelado  [MAX];
static PCongelado CONGE[] = new PCongelado  [MAX];
static PCongelado CONGE2[] =new PCongelado  [MAX];
static PCongelado CONGE3[] =new PCongelado  [MAX];
static PFresco FRES[] = 	new PFresco [MAX];
static PRefrigerado REFR[]= new PRefrigerado [MAX];

//BYTE
static byte 	FEM;
static byte 	FCM;
static byte		t=0;

//INT
static int		E;
static int		L;
static int	 	FEA;
static int 		FCA;
static int		r=0;
static int		fr=0;
static int		c=0;
static int		c2=0;
static int		c3=0;

//FLOAT
static float	GB1;
static float	GB2;
static float	GB3;
static float	GB4;
static float	GN;
static float	A;
static float	AL;
static float	C;
static float	AC;
static float	ACU;
static float	ACU2;
static float	ACU3;
static float	AT;
static float	PV;
static float	TP;
static float 	TR;










}