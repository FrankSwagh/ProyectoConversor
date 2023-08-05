package ConversorTemperatura;

import javax.swing.JOptionPane;

public class ConversorDeTemperaturas {
	static Object [] Temperaturas = {"De Celsius a Fahrenheit","De Celsius a Kelvin", "De Fahrenheit a Kelvin", "De Fahrenheit a Celsius", "De Kelvin a Fahrenheit", "De Kelvin a Celsius"};
	
	public static void ConvertirTemperaturas(double temperatura) {
		String seleccion = (JOptionPane.showInputDialog(null, "Selecciona una opcion", "Elegir", JOptionPane.QUESTION_MESSAGE, null, Temperaturas, Temperaturas[0])).toString();
		double conversion = 0;
		
		switch(seleccion) {
		case "De Celsius a Fahrenheit":
			conversion = (temperatura * 9/5) + 32;
			ventanaReusable(temperatura + " ° Celsius son " + conversion + " ° Fahrenheit"); 
			break;
		case "De Celsius a Kelvin":
			conversion = temperatura + 273.15;
			ventanaReusable(temperatura + " ° Celsius son " + conversion + " ° Kelvin"); 
			break;
		case "De Fahrenheit a Kelvin":
			conversion = (temperatura - 32) * 5/9 + 273.15;
			ventanaReusable(temperatura + " ° Fahrenheit son " + conversion + " ° Kelvin"); 
			break;
		case "De Fahrenheit a Celsius":
			conversion = (temperatura - 32) * 5/9;
			ventanaReusable(temperatura + " ° Fahrenheit son " + conversion + " ° Celsius"); 
			break;
		case "De Kelvin a Fahrenheit":
			conversion = (temperatura - 273.15) * 9/5 + 32;
			ventanaReusable(temperatura + " ° Kelvin son " + conversion + " ° Fahrenheit"); 
			break;
		case "De Kelvin a Celsius":
			conversion = temperatura - 273.15;
			ventanaReusable(temperatura + " ° Kelvin son " + conversion + " ° Celsius"); 
			break;
		}
	}
	
	public static void ventanaReusable(String textoMensaje) {
		JOptionPane.showMessageDialog(null, textoMensaje, "Resultado", JOptionPane.PLAIN_MESSAGE);
	}
}
