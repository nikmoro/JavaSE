package hola_mundo;

//Upper camel case para nombre de las clases
public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo");
		
		//Tipos de datos primitivos inician con minúscula
		
		//Tipos de datos Enteros
		byte edad = 24;  // -128 a 127
		short año = 20020;
		int idUsuario = 1847590;
		long idAmazon = 109399029304012092L;  //L es necesario al final, para identificarlo como long
		
		//Tipos de datos de punto floante (Decimal)
		float radio = 35.63F;  //F es necesario al final, para identificarlo como float
		double precio_acumulado = 34542342.546404935945034;
		
		//Tipo de dato char
		char genero = 'M';
		
		//Tipo de dato Lógico (Booleano)
		boolean visible = false;
		boolean funciona = true;
		
		//Constantes siempre en Mayúsculas
		int INICIA = 1;
		int VALOR_MAXIMO = 1524;
		
		//Lower camel case para variables, métodos u objetos
		int minValor = 1;
		boolean pruebaGit = true; 
		//---------------------------------------------------------------
		
		//Cast automático
		byte b = 24;
		short s = b;
		//Casteo explícito
		b = (byte) s;
		
		int i = 24;
		double d = 12.24;
		//Casteo explícito
		i = (int) d;  //Recorta el decimal, solo toma la parte entera del número
		
		int codigo = 97;
		char codigoASCII = (char) codigo;  //Casteo explícito		
		
		//Short a Byte
		short numero = 2020;
		byte numByte = (byte) numero;  //Casting de un dato mas grande que el rango
									   //del tipo de dato destino, genra otro número.
		
		System.out.println(numByte);
		System.out.println(codigoASCII);
	}
}