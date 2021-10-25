/*
	OBJETO ELECTRODOMESTICO
	ATRIBUTOS: ARTICULO
	           PESO DEL EQUIPO
	           LINEA (BLANCA O MARRON)
	           COSTO DEL FLETE
*/
public class Electro
{
	obje1   Arti;
	float	Peso;
	String 	Line;
	float 	CosF;

public Electro(String Desc, float C, int B, Short E, float P, String L, float F)
{
	Arti = new obje1(Desc,C,B,E);
	Peso = P;
	Line = L;
	CosF = F;
	Arti.PreB = CalPB();
	Arti.PreV = CalPV();
	Arti.PreF = CalPF();

}
//METODO PARA CALCULAR EL PRECIO BASE DEL PRODUTO
	public float CalPB()
	{
		return Arti.CosP + Arti.CosP * (float)0.35;
	}//CalPB

	//METODO PARA CALCULAR EL PRECIO DE VENTA DEL ARTICULO
	public float CalPV()
	{
		float D = 0;
		if(Arti.PreB > 350) D = Arti.PreB * (float)0.25;
		else 				D = Arti.PreB * (float)0.15;
		return Arti.PreB - D;
	}//CalPV

	//METODO PARA CALCULAR EL PRECIO FINAL DEL ARTICULO
	public float CalPF()
	{
		float IVA = Arti.PreV * (float)0.12;
		return Arti.PreV + IVA;
	}//CalPF
}//electro