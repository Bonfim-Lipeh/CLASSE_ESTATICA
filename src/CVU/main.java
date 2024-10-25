package CVU;

import java.util.Scanner; //importação do scanner

public class main {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

		 //Pediremos ao usuário as informações
		
		System.out.println("Insira o número de graus Celsius, para convertê-lo em Fahrenheit: "); //pedimos para que ele coloque os graus que seja convertido
		double c = sc.nextDouble();
		double f = ConversorUnidade.CelsiusparaFahrenheit(c);//chamamos a classe conversao de unidade e seu método de conversão de Fahrenheit
		System.out.println("O valor de Celsius convertido em Fahrenheit é: " + f + "F°\n");

		
		System.out.println("Insira o número de Milhas, para convertê-lo em Quilômetros: ");//mesma lógica aplicada a posteriores
		double m = sc.nextDouble();
		double km = ConversorUnidade.CelsiusparaFahrenheit(m); 
		System.out.println("O valor de Celsius convertido em Fahrenheit é: " + km + " km\n");

		
		System.out.println("Insira o número de Gramas, para convertê-lo em Libras: ");
		double g = sc.nextDouble();
		double lb = ConversorUnidade.CelsiusparaFahrenheit(g);
		System.out.println("O valor de Celsius convertido em Fahrenheit é: " + lb + " libras");

	}

}
