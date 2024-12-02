
public class Palindromo {
    public static void main(String[] args) {
        String texto = "Anita lava la tina";
            
        texto = texto.toLowerCase().replace(" ", "");
            
        char[] caracteres = texto.toCharArray();
            
        boolean esPalindromo = true;
        for (int i = 0; i < caracteres.length / 2; i++) {
            if (caracteres[i] != caracteres[caracteres.length - 1 - i]) {
                esPalindromo = false;
                    break;
            }
        }
            
        System.out.println("Texto original: " + texto);
        if (esPalindromo) {
            System.out.println("¡Es un palíndromo!");
        } else {
            System.out.println("No es un palíndromo.");
        }
        }
    }

