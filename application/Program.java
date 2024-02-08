package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;




public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Salario bruto: ");
		emp.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		emp.imposto = sc.nextDouble();
		
		
		System.out.println();
		System.out.println("Funcionário: " + emp);
		System.out.println();
		System.out.println("Qual o percentual aumentar no salário? ");
		double porcentagem = sc.nextDouble();
		emp.aumentarSalario(porcentagem);
		
		
		System.out.println();
		System.out.println("Dados atualizados: " + emp);
		
		
		
    sc.close();
	}

}
