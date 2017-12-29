package tratamiento_de_datos;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Vector;
import clases.Individuo;
import clases.Poblacion;

public class Tequist {

	Poblacion poblacion;

	
	
	
	
	
	public void imprimirResumen(int generacionActual,String target,ArrayList<Individuo> individuos) throws NoSuchAlgorithmException, IOException{
		ExtraerConfiguracion extraer = new ExtraerConfiguracion();
		extraer = extraer.leerFichero();
		FileWriter fichero = null;
		PrintWriter pw = null;

		try{
			fichero = new FileWriter("/Users/sergiotorredelafuente/Desktop/ALG_GENETICOS/src/salida/Resultad+"+ generacionActual +".txt");
			pw = new PrintWriter(fichero);

			pw.println("Componentes del grupo");
			pw.println("Sergio Torre");
			pw.println("Jorge Martínez");
			pw.println("Raúl Sacristán");
			pw.println("");
			pw.println("GRUPO 4");
			pw.println("");
			pw.println("Fecha: " + Calendar.getInstance().getTime());
			pw.println("");
			
			System.out.println("Componentes del grupo");
			System.out.println("Sergio Torre");
			System.out.println("Jorge Martínez");
			System.out.println("Raúl Sacristán");
			System.out.println("");
			System.out.println("GRUPO 4");
			System.out.println("");
			System.out.println("Fecha: " + Calendar.getInstance().getTime());
			System.out.println("");
			
			

			pw.println("Target: " + target);
			pw.println("Ltar: "+ target.length());
			pw.println("NPOB: " + extraer.getNPOB());
			pw.println("Q: " + extraer.getQ());
			pw.println("");


			pw.println("");
			//pw.println("<-- RESUMEN GENERACIÓN (" + generacionActual + ") -->");
			pw.println("GENERACIÓN: " + generacionActual);
			
			//pw.println("Mejor individuo: "+ mejorIndividuo(individuos,extraer));
			//pw.println("Nº de coincidencias máximo: " +  coincidenciasMaxima(individuos, extraer));
			//pw.println("Individuo consenso: " +  poblacion.generarFraseConsenso());
			//pw.println("Nº de targets: " + calcularTargets(individuos, extraer, target));
			//pw.println("Nº de coincidencias medio: " +  promedioCoincidencias(individuos));
	        pw.println("");

			/*pw.println("POBLACIÓN (20%)");
			for(int i=0;i<individuos.size();i++){
				if(i%5==0){
					pw.println(individuos.get(i).getFrase());
				}
			}
			pw.println("");*/
			
			pw.println("POBLACIÓN (100%)");
			for(int i=0;i<individuos.size();i++){
				pw.println(i+" "+individuos.get(i).getFrase());		
				
			}
			pw.println("");
			
			
			System.out.println("Target: " + target);
			System.out.println("Ltar: "+ target.length());
			System.out.println("NPOB: " + extraer.getNPOB());
			System.out.println("Q: " + extraer.getQ());
			System.out.println("");

			System.out.println("");
			//System.out.println("<-- RESUMEN GENERACIÓN (" + generacionActual + ") -->");
			System.out.println("GENERACIÓN: " + generacionActual);

			//System.out.println("Mejor individuo: "+ mejorIndividuo(individuos,extraer));
			//System.out.println("Nº de coincidencias máximo: " +  coincidenciasMaxima(individuos, extraer));
			//System.out.println("Individuo consenso: " +  poblacion.generarFraseConsenso());
			//System.out.println("Nº de targets: " + calcularTargets(individuos, extraer, target));
			//System.out.println("Nº de coincidencias medio: " +  promedioCoincidencias(individuos));
	        System.out.println("");

			System.out.println("POBLACIÓN (20%)");
			for(int i=0;i<individuos.size();i++){
				if(i%5==0){
					System.out.println(individuos.get(i).getFrase());
				}
			}
			System.out.println("");

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				// Nuevamente aprovechamos el finally para 
				// asegurarnos que se cierra el fichero.
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	} 

/*
	public int mejorIndividuo(Vector<Individuo> individuos, ExtraerConfiguracion e){
		int coincidenciaMax = 0;
		int aux = 0;
		for (int i = 0; i < individuos.size(); i++) {
			if(individuos.get(i).getNumeroCoincidencias()>coincidenciaMax){
				coincidenciaMax = individuos.get(i).getNumeroCoincidencias();
				aux = i;
			}
		}
		return aux;
	}

	public int coincidenciasMaxima(Vector<Individuo> individuos, ExtraerConfiguracion e){

		int coincidenciaMax = 0;

		for (int i = 0; i < individuos.size(); i++) {

			if(individuos.get(i).getNumeroCoincidencias()> coincidenciaMax){
				coincidenciaMax = individuos.get(i).getNumeroCoincidencias();				
			}	
		}
		return coincidenciaMax;
	}

	public int calcularTargets(Vector<Individuo> individuos, ExtraerConfiguracion e,String target){

		int contadorTarget = 0;
		for(int i = 0; i < individuos.size(); i++){
			// Suma el contador cuando un individuo tiene una frase igual que el target introducido.
			if(individuos.get(i).getFrase().equals(target)){
				contadorTarget++;
			}
		}
		return contadorTarget;
	}



	public float promedioCoincidencias(Vector<clases.Individuo> individuos){
		double total = 0;

		for(int i = 0; i < individuos.size(); i++){
			total = total + individuos.get(i).getNumeroCoincidencias();
		}
		// Todas de coincidencias entre población.
		float promedio = (float) (total/individuos.size());

		return promedio;
	}
*/

	

}
