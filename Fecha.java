package examen;

public class Fecha {
	/**
	 * @author Javier Ruiz
	 * @version 1.0
	 * Es un boolean. Nos devolverá true o false.
	 */
	public static boolean fechaValida = false;
	/**
	 * El método va comprobando si los parámetros cumplen las condiciones, primero que  no sea negativo,
	 * en el siguiente if comprueba que el dia no sea mayor que 31 y que el año no sea mayor que 12,
	 * en el siguiente if comprueba que si el mes es 2, el dia no sea mayor que 28, en el else if
	 * comprueba que los meses pares no tengan más de 30 días y por último en el else comprueba que los dias 
	 * no sean mayores de 31.
	 * @param anio
	 * @param mes
	 * @param dia
	 * @return
	 * El return devuelve false debido a que no se ha cumplido alguna de las condiciones.
	 */
	public static boolean validarFecha(int anio, int mes, int dia) {
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
}