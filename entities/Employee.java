package entities;

public class Employee {
	
	public String name;
	public double salarioBruto;
	public double imposto;
	
	
	public double salarioLiquido() {
		   return salarioBruto - imposto;
	}
	
	public void aumentarSalario(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100.0;
    }
    
    public String toString() {
    	
    	   return name + ", $ " + String.format("%.2f", salarioLiquido());
    	   }

		

  }
