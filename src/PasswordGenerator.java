
import java.util.Random;

public class PasswordGenerator {
	// Un oggetto di questa classe rappresenta un generatore di password
	// casuali di una determinata lunghezza.
	// Le password devono essere composte da soli CARATTERI MAIUSCOLI.
	private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private Random random = new Random();
	    // metodo che genera una password di lunghezza password_length
	    // e la ritorna al chiamante.
	    public String generate(int password_length) {
	        // TODO: genera una password causale composta da sole
	        // lettere maiuscole.
	    	StringBuilder password = new StringBuilder(password_length);
	    	for (int i = 0; i < password_length; i++) { 
	    		password.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
	    		} 
	    	return password.toString();
	    
	}

}

