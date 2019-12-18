/*
 * Verificar diferencas de idade.
 */
package diferenca.de.idade;
import java.util.Scanner;
/**
 *
 * @author Daiane Dias
 */
public class DiferencaDeIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        
        System.out.println("Informe sua idade:");
        int yidade = in.nextInt();
        System.out.println("Qual a idade sua mae:");
        int midade = in.nextInt();
        
        int resul = midade-yidade;
        System.out.println("Quando você  nasceu sua mae tinha: "+resul);
    }
    
}
