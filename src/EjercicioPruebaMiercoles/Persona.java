package EjercicioPruebaMiercoles;

public class Persona {
	 
    private final static char sexoPredeterminado = 'H';
 
    public static final int pordebajodepeso = -1;
 
    public static final int pesoCorrecto = 0;
 
    public static final int sobrepeso = 1;
 
    
    private String nombre;
 
    
    private int edad;
 
    private String DNI;
 
    private char sexo;
 
   
    private double peso;
 
   
    private double altura;
 
   
    public Persona() {
        this("", 0, sexoPredeterminado, 0, 0);
    }
 
    
    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0, 0);
    }
 
  
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        generarDni();
        this.sexo = sexo;
        comprobarSexo();
    }
 
    
    private void comprobarSexo() {
 
   
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = sexoPredeterminado;
        }
    }
 
    private void generarDni() {
        final int divisor = 23;
 
       
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);
 
    
        char letraDNI = generaLetraDNI(res);
 
       
        DNI = Integer.toString(numDNI) + letraDNI;
    }
 
    private char generaLetraDNI(int res) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
 
        return letras[res];
    }
 
   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
 
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
 
   
    public void setPeso(double peso) {
        this.peso = peso;
    }
 
   
    public void setAltura(double altura) {
        this.altura = altura;
    }
 
    
   
 
    
    public boolean esMayorDeEdad() {
        boolean mayor = false;
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }
 
    public String toString() {
        String sexo;
        if (this.sexo == 'H') {
            sexo = "hombre";
        } else {
            sexo = "mujer";
        }
        return "Informacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + sexo + "\n"
                + "Edad: " + edad + " años\n"
                + "DNI: " + DNI + "\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " metros\n";
    }
 
}
