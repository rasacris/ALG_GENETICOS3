package tratamiento_de_datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


public class ExtraerConfiguracion{

	/*NPOB: Número de individuos de la población
	NGEN: Número de generaciones (ciclo completo sobre todos los individuos) de la prueba 
	NRES: Cada qué número de generaciones se saca un resumen de la evolución del proceso 
	NTOTAL: Cada qué número de generaciones se saca un muestreo de la población
	Q: Factor de Calidad. Probabilidad de que un gen dado no mute*/

	int NPOB;
	int NGEN;
	int NRES;
	int NTOTAL;
	double Q;


	public int getNPOB() {
		return NPOB;
	}



	public void setNPOB(int nPOB) {
		NPOB = nPOB;
	}



	public int getNGEN() {
		return NGEN;
	}



	public void setNGEN(int nGEN) {
		NGEN = nGEN;
	}



	public int getNRES() {
		return NRES;
	}



	public void setNRES(int nRES) {
		NRES = nRES;
	}



	public int getNTOTAL() {
		return NTOTAL;
	}



	public void setNTOTAL(int nTOTAL) {
		NTOTAL = nTOTAL;
	}



	public double getQ() {
		return Q;
	}



	public void setQ(double q) {
		Q = q;
	}


	public ExtraerConfiguracion(){
		
	}
	
	/**
	 * @param nPOB
	 * @param nGEN
	 * @param nRES
	 * @param nTOTAL
	 * @param q
	 */
	public ExtraerConfiguracion(int nPOB, int nGEN, int nRES, int nTOTAL, double q) {
		super();
		NPOB = nPOB;
		NGEN = nGEN;
		NRES = nRES;
		NTOTAL = nTOTAL;
		Q = q;
	}

	@SuppressWarnings("resource")
	public ExtraerConfiguracion leerFichero() throws FileNotFoundException{
		File archivo = null;
		FileReader fr = null;
		String ruta = "/Users/sergiotorredelafuente/Desktop/ALG_GENETICOS/src/datos/Configuracion.txt";
		@SuppressWarnings("unused")
		BufferedReader br = null;
		// Apertura del fichero y creacion de BufferedReader para poder
		// hacer una lectura comoda (disponer del metodo readLine()).
		archivo = new File (ruta);
		fr = new FileReader (archivo);
		br = new BufferedReader(fr);
		ExtraerConfiguracion ex = new ExtraerConfiguracion();
		// Lectura del fichero
		Scanner scan1 = new Scanner (archivo);
		ArrayList<String> lista = new ArrayList<String>();
		@SuppressWarnings("unused")
		int contador = 0;
		while (scan1.hasNext()){
			String lineaExtraida = scan1.nextLine();
			//System.out.println("LINEA " + contador + " " + lineaExtraida);
			lista.add(lineaExtraida);
			contador++;
			for (int i = 0; i < lista.size(); i++) {	
				String[] v = lista.get(i).split("= ");					
				if(v[0].equals("NPOB")){
					ex.setNPOB(Integer.valueOf(v[1]));
					//ficheroConfiguracion.add(j,getLadoK());
					//System.out.println(LadoK);
				}
				if(v[0].equals("NGEN")){
					ex.setNGEN(Integer.valueOf(v[1]));
					//ficheroConfiguracion.add(j,getPeriodo());
					//System.out.println(periodo);
				}
				if(v[0].equals("Q")){
					if(v[0].equals("Q") && v[1].contains(",")){
						ex.setQ(Double.valueOf(v[1].replace(",", ".")));				
						//ficheroConfiguracion.add(j,getCoefAprendizajeInicial());
						//System.out.println(coefAprendizajeInicial);
					}else{
						ex.setQ(Double.valueOf(v[1]));
					}
				}
				if(v[0].equals("NRES")){
					ex.setNRES(Integer.valueOf(v[1]));
					//ficheroConfiguracion.add(j,getPeriodo());
					//System.out.println(periodo);
				}					
				if(v[0].equals("NTOTAL")){						
					ex.setNTOTAL(Integer.valueOf(v[1]));
					//ficheroConfiguracion.add(j,getNumDatos());
					//System.out.println(NumDatos);
				}
			}
		}	 
		//System.out.println("El número de líneas en el fichero del fichero de Configuración es: " + contador);
		//System.out.println("FICHERO CARGADO CORRECTAMENTE");
		
			System.out.println("NGEN: " + ex.getNGEN());
			System.out.println("NPOB: " + ex.getNPOB());
			System.out.println("NRES: " + ex.getNRES());
			System.out.println("NTOTAL: " + ex.getNTOTAL());
			System.out.println("Q: " + ex.getQ());
		
		return ex;
	}

	public static void main(String args[]){
	}
}
