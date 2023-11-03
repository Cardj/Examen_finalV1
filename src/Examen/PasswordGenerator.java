package Examen;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		Generador contras = new Generador (1,8);

		
	}

}



class Generador {
	
	String[] pass;
	
	public Generador(int nPass, int longitud) {
		
		pass = new String[nPass];
		generarPass(longitud);
		mostrarPass();
		
	}
	
	private void mostrarPass() {
		
		for (String s : pass) {
			
			System.out.println("Contraseña generada: " + s);
			
		}
		
	}

	private void generarPass(int longitud) {
	
		for(int i = 0; i<pass.length;i++) {
			
			String passActual = "";
			
			for (int j=0; j<longitud;j++) {
				passActual += generarChar();	
			}
			
			pass[i]=passActual;
			
		}
		
	}

	private char generarChar() {
		
		boolean esValido = false;
		int n=0;
		
		while (esValido==false) {
		
			n=(int) (Math.random()*123);
			
			if(n==45) esValido=true;
			if(n==95) esValido=true;
			if (n>=48 && n<=57) esValido=true;
			if (n>=65 && n<=90) esValido=true;
			if (n>=97 && n<=122) esValido=true;
	
		}
		
		return (char) n;
		
	}
	
}
	