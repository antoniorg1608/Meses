package es.studium.Meses;

import java.util.Scanner;

public class Meses
{

	public static void main(String[] args)
	{
		{
			Scanner teclado = new Scanner(System.in);
			int num;
			System.out.println("Dame un n�mero:");
			num = teclado.nextInt();
			switch (num)
			{
			case 1:
				System.out.println("El mes equivalente al n�mero " + num + " es ENERO");
				break;
			case 2:
				System.out.println("El mes equivalente al n�mero " + num + " es FEBRERO");
				break;
			case 3:
				System.out.println("El mes equivalente al n�mero " + num + " es MARZO");
				break;
			case 4:
				System.out.println("El mes equivalente al n�mero " + num + " es ABRIL");
				break;
			case 5:
				System.out.println("El mes equivalente al n�mero " + num + " es MAYO");
				break;
			case 6:
				System.out.println("El mes equivalente al n�mero " + num + " es JUNIO");
				break;
			case 7:
				System.out.println("El mes equivalente al n�mero " + num + " es JULIO");
				break;
			case 8:
				System.out.println("El mes equivalente al n�mero " + num + " es AGOSTO");
				break;
			case 9:
				System.out.println("El mes equivalente al n�mero " + num + " es SEPTIEMBRE");
				break;
			case 10:
				System.out.println("El mes equivalente al n�mero " + num + " es OCTUBRE");
				break;
			case 11:
				System.out.println("El mes equivalente al n�mero " + num + " es NOVIEMBRE");
				break;
			case 12:
				System.out.println("El mes equivalente al n�mero " + num + " es DICIEMBRE");
				break;
			default:
				System.out.println("El numero indicado no corresponde a ning�n mes del a�o");
			}
			teclado.close();
		}
	}
}