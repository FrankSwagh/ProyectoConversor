package ConversorMonedas;

import javax.swing.JOptionPane;


public class ConversorDeMonedas {
	static Object [] monedas = {"De Pesos a Dóllar","De Pesos a Euro","De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano",
			 			 "De Dóllar a Pesos","De Euro a Pesos","De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"};
	
	public static void ConvertirMonedas(double moneda) {
		String seleccion = (JOptionPane.showInputDialog(null, "Selecciona una opcion", "Elegir", JOptionPane.QUESTION_MESSAGE, null, monedas, monedas[0])).toString();
		double conversion = 0;
		
		switch(seleccion) {
		case "De Pesos a Dóllar": 
			conversion = moneda / 16.75;
			conversion= (double)Math.round(conversion * 100d) / 100;
			ventanaReusable("Tienes $" + conversion +" Dolares");
			break;
		case "De Pesos a Euro":
			conversion = moneda / 18.42;
			conversion= (double)Math.round(conversion * 100d) / 100;
			ventanaReusable("Tienes €" + conversion +" Euros");
			break;
		case "De Pesos a Libras":
			conversion = moneda / 21.49;
			conversion= (double)Math.round(conversion * 100d) / 100;
			ventanaReusable("Tienes £" + conversion +" Libras");
			break;
		case "De Pesos a Yen":
			conversion = moneda / 0.12;
			conversion= (double)Math.round(conversion * 100d) / 100;
			ventanaReusable("Tienes ¥" + conversion +" Yenes");
			break;
		case "De Pesos a Won Coreano":
			conversion = moneda / 0.013;
			conversion= (double)Math.round(conversion * 100d) / 100;
			ventanaReusable("Tienes ₩" + conversion +" Wones");
			break;
		case "De Dóllar a Pesos":
			conversion = moneda *  16.75;
			conversion= (double)Math.round(conversion * 100d) / 100;
			ventanaReusable("Tienes $" + conversion +" Pesos");
			break;
		case "De Euro a Pesos":
			conversion = moneda * 18.42 ;
			conversion= (double)Math.round(conversion * 100d) / 100;
			ventanaReusable("Tienes $" + conversion +" Pesos");
			break;
		case "De Libras a Pesos":
			conversion = moneda *  21.49;
			conversion= (double)Math.round(conversion * 100d) / 100;
			ventanaReusable("Tienes $" + conversion +" Pesos");
			break;
		case "De Yen a Pesos":
			conversion = moneda *  0.12;
			conversion= (double)Math.round(conversion * 100d) / 100;
			ventanaReusable("Tienes $" + conversion +" Pesos");
			break;
		case "De Won Coreano a Pesos":
			conversion = moneda * 0.013 ;
			conversion= (double)Math.round(conversion * 100d) / 100;
			ventanaReusable("Tienes $" + conversion +" Pesos");
			break;
		
		}
	}
	
	public static void ventanaReusable(String textoMensaje) {
		JOptionPane.showMessageDialog(null, textoMensaje, "Resultado", JOptionPane.PLAIN_MESSAGE);
	}
}

