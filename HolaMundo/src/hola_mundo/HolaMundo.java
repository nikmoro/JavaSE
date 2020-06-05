package hola_mundo;

// Upper camel case para nombre de las clases
public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo");
		
		//--------------------------------------------------
		
		// Tipos de datos primitivos inician con minúscula
		
		// Enteros
		byte edad = 24;  // -128 a 127
		short año = 20020;
		int idUsuario = 1847590;
		long idAmazon = 109399029304012092L;  // L es necesario al final, para identificarlo como long
		
		// Floante (Decimal)
		float radio = 35.63F;  //F es necesario al final, para identificarlo como float
		double precio_acumulado = 34542342.546404935945034;
		
		// Char (De un solo caracter)
		char genero = 'M';
		
		// Lógico (Booleano)
		boolean visible = false;
		boolean funciona = true;
		
		// Constantes siempre en Mayúsculas
		int INICIA = 1;
		int VALOR_MAXIMO = 1524;
		
		//Lower camel case para variables, métodos u objetos
		int minValor = 1;
		boolean pruebaGit = true;
		
		//---------------------------------------------------------------
		
		// Cast automático
		byte b = 24;
		short s = b;
		
		// Casteo explícito o manual
		b = (byte) s;
		
		int i = 24;
		double d = 12.24;
		i = (int) d;  // Recorta el decimal, solo toma la parte entera del número
		
		int codigo = 97;
		char codigoASCII = (char) codigo;  // Casteo explícito		
		
		// Short a Byte
		short numero = 2020;
		byte numByte = (byte) numero;  // Casting de un dato mas grande que el rango
									   // del tipo de dato destino, genera números "aleatorios".
		
		System.out.println(numByte);
		System.out.println(codigoASCII);
		
		//----------------------------------------------------
		
		// Arreglos
		
		// Formas de declarar un arreglo
		int[] arrayEntero;
		double arrayDouble[];
		
		// Iniciarlo
		double[] arreglo1D = new double[3]; 
		int[][] arreglo2D = new int[2][3];  // Arreglo de 6 elementos
		char[][][] arreglo3D = new char[3][3][2];  // Arreglo de 18 elementos
		
		// Llenando el arreglo
		char[][] days = { {'L','M','M'},
						  {'J','V','S'} };
		
		char[][][] days3D = {  { {'a','b','c'}, {'d','e','f'} },
							   { {'d','e','f'}, {'a','b','c'} }  };
		
		// Agregar alementos al arreglo mediante los índices
		char[] saludo = new char[4];
		saludo[0] = 'H';
		saludo[1] = 'o';
		saludo[2] = 'l';
		saludo[3] = 'a';
		System.out.println(saludo[0]);
		System.out.println(saludo[1]);
		System.out.println(saludo[2]);
		System.out.println(saludo[3]);
	}
}