import javax.swing.JOptionPane;

import ConversorMonedas.ConversorDeMonedas;
import ConversorTemperatura.ConversorDeTemperaturas;

public class ClasePrincipal {

	public static void main(String[] args) {
		Object[] menu = { "Conversor de monedas", "Conversor de temperatura" };
		boolean confirmacion = true;

		while (confirmacion != false) {

			Object opcion = JOptionPane.showInputDialog(null, "Selecciona una opcion", "Elegir",
					JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);

			if (opcion == menu[0]) {
				String moneda = ventanaReusable("Ingrese el monto que desea convertir", "Moneda");
				

				if (moneda != "") {

					if (ValidadEntrada(moneda) == true) {

						Double dato = Double.parseDouble(moneda);
						ConversorDeMonedas.ConvertirMonedas(dato);

						int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Confirmación",
								JOptionPane.YES_NO_OPTION);

						if (confirm == JOptionPane.NO_OPTION) {
							confirmacion = false;
						}

					} else {
						JOptionPane.showMessageDialog(null, "Ingrese un valor válido");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Programa terminado");
				}

			} else if (opcion == menu[1]) {
				String temperatura = ventanaReusable("Ingrese la temperatura que desea convertir", "Temperatura");
				
				if (temperatura != "") {
					
					if (ValidadEntrada(temperatura) == true) {
						Double dato = Double.parseDouble(temperatura);
						ConversorDeTemperaturas.ConvertirTemperaturas(dato);
						
						int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Confirmación",JOptionPane.YES_NO_OPTION);
						if (confirm == JOptionPane.NO_OPTION); confirmacion = false;
					} else {
						JOptionPane.showMessageDialog(null, "Ingrese un valor válido");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Programa terminado");
				}
			}

			
			
		
		
	}JOptionPane.showMessageDialog(null,"Programa terminado");

	}

	public static String ventanaReusable(String textoMensaje, String titulo) {
		String ventana = JOptionPane.showInputDialog(null, textoMensaje, titulo, JOptionPane.PLAIN_MESSAGE);
		return ventana;
	}

	public static boolean ValidadEntrada(String dato) {
		try {
			double Comprobar = Double.parseDouble(dato);

			if (Comprobar >= 0 || Comprobar < 0 )
				;
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}