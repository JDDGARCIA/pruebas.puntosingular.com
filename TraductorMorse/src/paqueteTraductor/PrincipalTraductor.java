package paqueteTraductor;
import java.util.Scanner;
public class PrincipalTraductor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abcmorse[] ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..",".----","..---","...--","....-",".....","-....","--...","---..","----.","-----"};
		String abecedario="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		String texto;
		String cadenasalida="";
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca una cadena: ");
		texto = teclado.nextLine().toUpperCase();
		
		for (int i = 0; i < texto.length(); i++) {
			if(texto.charAt(i)==' '){
				cadenasalida=cadenasalida+"  ";
			}else{
				cadenasalida=cadenasalida+abcmorse[abecedario.indexOf(texto.charAt(i))]+" ";
			}
			
		}
		System.out.println("Codigo traducido:\n");
		System.out.println(cadenasalida);
		
		/*String cadenasalida2="";
		String[] palabras = texto.split("   ");
		for(int j = 0 ; j < palabras.length ; j++){
			//System.out.println(palabras[j]);
			String[] letras = palabras[j].split(" ");
			for (int k = 0; k < letras.length; k++) {
				//System.out.println(letras[k]);
				for (int l = 0; l < abcmorse.length; l++) {
					if(letras[k].equals(abcmorse[l])){
						cadenasalida2=cadenasalida2+abecedario.charAt(l);
					}
				}
			}
			cadenasalida2=cadenasalida2+" ";
		}
		System.out.println("Codigo traducido a texto :\n");
		System.out.println(cadenasalida2);*/
		
		
		
	}

}
