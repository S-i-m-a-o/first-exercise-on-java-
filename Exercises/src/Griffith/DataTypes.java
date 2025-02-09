package Griffith;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double lenght = 34.5;
		double widht = 45.6;
		double perimeter = 2 * (lenght + widht);

		System.out.println(perimeter);
		System.out.println();

		// exercise 2
		System.out.println("exercise2");
		double celsius = 25;
		double fahrenheit = celsius * (1.8) + 32;

		System.out.println(fahrenheit);
		// exercise 3
		System.out.println("exercie3");
		double fahreinheit1 = 77;
		double celsius1 = (fahreinheit1 - 32) * 5 / 9;

		System.out.println(celsius1);
		System.out.println();
		// exercise 4
		System.out.println("exercise4");

		double pi = 3.14;
		double diameter = 7;
		double raio = diameter / 2;
		double height = 10.5;
		double volume = pi * raio * raio * height;
		double area = height * (2 * pi * raio);
		System.out.println(volume);
		System.out.println(area);
		System.out.println();
		// exercise 5
		System.out.println("exercise5");

		double xA = -5.5;
		double yA = 2;
		double xB = -3;
		double yB = -2.2;
		double xC = 1;
		double yC = 2;
		double xD = 7;
		double yD = 4.6;

		double atob = Math.sqrt((xB - xA) * (xB - xA) + (yB - yA) * (yB - yA));
		double btoc = Math.sqrt((xC - xB) * (xC - xB) + (yC - yB) * (yC - yB));
		double ctod = Math.sqrt((xD - xC) * (xD - xC) + (yD - yC) * (yD - yC));

		System.out.println(atob);
		System.out.println(btoc);
		System.out.println(ctod);

		

	}

}
