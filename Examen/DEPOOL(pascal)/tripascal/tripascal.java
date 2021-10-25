public class tripascal{
      public static void main(String Isaac[])
      {
		  MCursor.TCen(10, "==========================================================================================");
		  MCursor.TCen(10, "TRIANGULO DE PASCAL								  ID.CA");
		  int v = 0;
      	  MCursor.TCen(10, "==========================================================================================");
      	  do{
		  v = LInt("          INGRESE LINEA DE PASCAL = ");
		  MCursor.TCen(10, "==========================================================================================");
	  }while(v<0);
		  int a = 0;
		  do{
		  a = LInt("          INGRESE (1)VER TRIANGULO COMPLETO (2)ULTIMA LINEA = ");
		  MCursor.TCen(10, "==========================================================================================");
	  }while(a<1 || a>2);
	  if(a==1){
		  for (int i=0; i<v; i++){
			System.out.print("          ");
		  for (int j=0; j<=i; j++){
		  System.out.print(pascal(i,j)+" ");}
		  System.out.println();}}
	  else
	  	 for (int i=v-1; i<v; i++){
			 	System.out.print("          ");
		 for (int j=0; j<=i; j++){
		 System.out.print(pascal(i,j));}
		  System.out.println();}
		  MCursor.TCen(10, "==========================================================================================");
	  }
		public static int pascal(int X, int Y)
		{
		if((Y>X)||(Y<0))
		return 0;
		else if((Y==X)||(Y==0))
		return 1;
		else return pascal(X-1,Y-1)+pascal(X-1,Y);
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
						 MCursor.TCen(10," E	R	R	O	R!!!, 	VALOR NO PERMITIDO");
						 MCursor.TCen(10, "==========================================================================================");
						 MCursor.UCursor(40);
						aux = false;
					}
				}while(aux == false);
				return val;
	}
}