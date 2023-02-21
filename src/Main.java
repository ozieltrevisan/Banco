import com.github.ozieltrevisan.banco.Conta;
import com.github.ozieltrevisan.banco.Titular;

public class Main {
    public static void main(String[] args) {

        Titular titular = new Titular("João","00664589477");
        Conta conta1 = new Conta(titular,1234,9999999);


        conta1.imprimirDemontrativo();


        conta1.depositar(100);
        conta1.imprimirDemontrativo();

        conta1.sacar(28);
        conta1.imprimirDemontrativo();


    }
}