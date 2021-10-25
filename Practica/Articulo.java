/* Objeto Articulo
   Atributos: descripción, costo del producto, precio de venta, codigo de barra
              y existencia.
*/
public class Articulo
{	String Desc;   // Descripcion del producto
	float  CosP;   // Costo del Producto
	float  PreB;   // Precio Base
	float  PreV;   // Precio de Venta
	float  PreF;   // Precio Final a Pagar
	int    CodB;   // Codigo de barra
	short  Exis;   // Existencia

	//Constructor
	public Articulo(String Desc, float C, int B, short E)
	{	this.Desc = Desc;
		CosP = C;
		CodB = B;
		Exis = E;
	}//Articulo

}//class