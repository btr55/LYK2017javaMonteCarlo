package tr.org.linux.kamp.monteCarlo;

import java.util.Random;

import java.util.Scanner;

public class MonteCarlo {

	public static Random ran = new Random();

	public static void main(String[] args) {

		System.out.println("pi değeri:" + calcPi());
	}

	public static double calcPi() {
		int counter = 0;
		Scanner dot = new Scanner(System.in);
		
		System.out.println("deneme sayısını giriniz");
		
		double dot1 = dot.nextDouble();
		
		for (int i = 0; i <= dot1; i++) {

			double x = 2 * (ran.nextDouble()) - 1;	/*nextDouble() içine parametre(seed) yazamıyoruz. 
													0-1 aralığını -1 ve 1 aralığına çekmek için (0-1) * 2=(0 - 2 )oldu.
													bu aralığı -1 le sola kaydırdık. -1 ve 1 arasına geldi.*/

			double y = 2 * (ran.nextDouble()) - 1;

			if ((x * x + y * y) < 1) {	//Math.pow(x,2); üst alma.

				counter++;
			}
		}

		return (4.0 * counter )/ dot1;

	}

}
