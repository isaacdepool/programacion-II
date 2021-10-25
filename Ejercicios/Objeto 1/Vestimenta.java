/*
	Objeto vestimenta
	Atributos: Talla (S,M,L,XL)
	           Marca
*/
public class Vestimenta
{
	obje1	 Arti;
	char 	 Tall;
	String	 Marc;

	//CONSTRUCTOR
	public Vestimenta(String Desc, float C, int B, short E, char T, String M)
	{
		Arti = new obje1(Desc, C, B, E);
		Tall = T;
		Marc = M;
		Arti.PreB = CalPB();
		Arti.PreV = CalPV();
		Arti.PreF = CalPF();
	}//vestimenta

	//METODO PARA CALCULAR EL PRECIO BASE DEL PRODUTO
	public float CalPB()
	{
		return Arti.CosP + Arti.CosP * (float)0.30;
	}//CalPB

	//METODO PARA CALCULAR EL PRECIO DE VENTA DEL ARTICULO
	public float CalPV()
	{
		float D = 0;
		if(Arti.PreB > 170) D = Arti.PreB * (float)0.15;
		return Arti.PreB - D;
	}//CalPV

	//METODO PARA CALCULAR EL PRECIO FINAL DEL ARTICULO
	public float CalPF()
	{
		float IVA = Arti.PreV * (float)0.12;
		return Arti.PreV + IVA;
	}//CalPF

}//class


