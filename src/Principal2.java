import com.github.ozieltrevisan.banco.Conta;
import com.github.ozieltrevisan.banco.Titular;

public class Principal2 {
    public static void main(String[] args) {

        Titular titular = new Titular("João","00664589477");
        Conta conta1 = new Conta(titular,1234,9999999);

        System.out.println(conta1.toString());
    }
}
