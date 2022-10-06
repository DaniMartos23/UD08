package ej2;
import java.util.Scanner;

public class PasswordApp {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Password password1= new Password();
		int longitud;
		System.out.print("Introduce longitud password nueva: ");
		longitud= Integer.parseInt(sc.nextLine());
		Password password2= new Password(longitud);
		sc.close();
		System.out.println(password1);
		
		System.out.println(password2);
		
	}

}
