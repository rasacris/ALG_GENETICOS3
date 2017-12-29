package clases;

public class Individuo {
	
    private String target; // Variable que guarda el valor del target deseado.
	private String frase; // Variable que guarda el valor actual del individuo.
	private int numeroCoincidencias;  // Variable que guarda el numero de num_coincidencias entre valor y target.
	private double fitness; // Variable que guarda el valor del Fitness.

	//Getters and Setters
    public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public int getNumeroCoincidencias() {
		return numeroCoincidencias;
	}

	public void setNumeroCoincidencias(int numeroCoincidencias) {
		this.numeroCoincidencias = numeroCoincidencias;
	}

	public double getFitness() {
		return fitness;
	}

	public void setFitness(double fitness) {
		this.fitness = fitness;
	}

	public Individuo(String frase, String target){
        this.target = target;
        this.frase= frase;
        this.numeroCoincidencias = calcularCoincidencias();
        this.fitness = calcularFitness();
    }

	
    public int calcularCoincidencias(){
        int count = 0;
        // Comprueba cada caracter de frase con cada caracter de target y suma el contador.
        for(int i = 0; i < this.target.length(); i++){
            if(this.frase.charAt(i) == this.target.charAt(i))
                count++;

        }
        this.numeroCoincidencias=count;
        return numeroCoincidencias;
    }

    public double calcularFitness(){
        this.fitness =(Math.pow(Math.E,(this.numeroCoincidencias-target.length())))- ( Math.pow(Math.E, -target.length()));

        System.out.println("dkjjd " + fitness);

        return fitness;
    }
}
