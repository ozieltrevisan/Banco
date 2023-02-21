import com.github.ozieltrevisan.banco.Conta;
import com.github.ozieltrevisan.banco.ContaSalario;
import com.github.ozieltrevisan.banco.Titular;

public class Pricipal3 {
    public static void main(String[] args) {

        Titular titular = new Titular("Bastião dos santos","114785963");
        Conta conta = new ContaSalario(titular,1245,18000);

    }
}
