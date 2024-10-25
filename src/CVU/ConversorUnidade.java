package CVU;


public class ConversorUnidade { //classe que abriga os métodos de conversão
	
	
	public static double CelsiusparaFahrenheit(double c) { //conversão de celsius para fahrenheit
				
		return c*1.8 + 32; 
	}
	
	public static double MilhasparaKm(double m) { //conversão de milhas para km
				
		return  m*0.621371;
	}
	
	public static double GramasparaLibras(double g) { //conversção de gramas para milhas
				
		return g*0.00220462;
	}

}
