package hola_mundo;

// Upper camel case para nombre de las clases
public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo");
		
		//--------------------------------------------------
		
		// Tipos de datos primitivos inician con minúscula
		
		// Enteros
		byte edad = 24;  // Tamaño: -128 a 127
		short año = 20020;
		int idUsuario = 1847590;
		long idAmazon = 109399029304012092L;  // L es necesario al final, para identificarlo como long
		
		// Floante (Decimal)
		float radio = 35.63F;  //F es necesario al final, para identificarlo como float
		double precio_acumulado = 34542342.546404935945034; // Se usa para datos con mayor precisión
		
		// Char (Un solo caracter)
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
		b = (byte) s;  // Cast explícito o manual
		
		int i = 24;
		double d = 12.24;
		i = (int) d;  // Recorta el decimal, solo toma la parte entera del número
		
		int codigo = 97;
		char codigoASCII = (char) codigo;  // Cast explícito		
		
		// Short a Byte
		short numero = 2020;
		byte numByte = (byte) numero;  // Casting de un dato mas grande que el rango
									   // del tipo de dato destino, genera números "aleatorios".
		
		System.out.println("\n" + numByte);  // + variable (Concatenación)
		System.out.println(codigoASCII);
		
		//----------------------------------------------------
		
		// Arreglos
		
		// Formas de declarar un arreglo
		int[] arrayEntero;
		double arrayDouble[];
		
		// Iniciarlo
		// tipoDeDato[Dimensión] NombreDelArreglo = new tipoDeDato[N° de elementos]
		double[] arreglo1D = new double[3]; 
		int[][] arreglo2D = new int[2][3];  // Arreglo 2D de 6 elementos
		char[][][] arreglo3D = new char[3][3][2];  // Arreglo 3D de 18 elementos
		
		// Llenando el arreglo
		char[][] days = { {'L','M','M'},
						  {'J','V','S'} };
		
		char[][][] days3D = {  { {'a','b','c'}, {'d','e','f'} },
							   { {'d','e','f'}, {'a','b','c'} }  };
		
		// Agregar elementos al arreglo mediante los índices
		char[] saludo = new char[4];
		
		saludo[0] = 'H';
		saludo[1] = 'o';
		saludo[2] = 'l';
		saludo[3] = 'a';
		
		System.out.println("\n" + saludo[0]);
		System.out.println(saludo[1]);
		System.out.println(saludo[2]);
		System.out.println(saludo[3]);
		
		//-------------------------------------------------
		
		// Operadores aritméticos
		System.out.println("\n"+ 12+21);
		System.out.println(20-5);
		System.out.println(12*15);
		System.out.println(15/3);
		System.out.println(17%5);
		
		// Operadores de asignación
		int a = 10;
		System.out.println("\n" + (a += 2));  // Es equivalente: a = a + 2; + (Asignaciones de variables)
		System.out.println(a -= 3);
		System.out.println(a *= 4);
		System.out.println(a /= 5);
		System.out.println(a %= 6);
		
		
		// Operadores de incremento y decremento (Prefijo y Postfijo)
		int p = 5;
		
		/*  ++p
		 *  1. Incrementa el valor p + 1
		 *  2. Asigna el valor a p  */
		System.out.println("\n" + (++p));
		
		/*  p++
		 *  Asigna el valor a p, p = p
		 *  Incrementa el valor p + 1  */
		System.out.println(p++);  // Imprime el mismo valor 5
		System.out.println(p);  // Imprime el valor aumentado en 1, 6
		
		// Operadores de equidad (Booleanos)
		int r = 24;
		int w = 12;
		
		System.out.println("\n" + (r == w));
		System.out.println(r != w);
		
		// Operadores relacionales
		System.out.println("\nr > w -> " + (r > w));
		System.out.println(r < w);
		System.out.println(r >= w);
		System.out.println(r <= w);
		
		// Operadores lógicos
		boolean n = false;
		boolean m = true;
		
		System.out.println("\nn && m -> " + (n && m));
		System.out.println(n || m);
		System.out.println(!n);
	}
}