import com.github.ozieltrevisan.banco.*;

public class principal {
    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        Titular titular = new Titular("João","00664589477");
        ContaEspecial conta1 = new ContaEspecial(titular,1234,9999999,90);
        conta1.setLimiteChequeEspecial(1000);
        conta1.depositar(100);
        conta1.creditarRendimento(10);

        ContaSalario conta2 = new ContaSalario(new Titular("silva","88745932215"),8879,
                954126);
        conta2.depositar(100);

        caixaEletronico.imprimirDemonstrativo(conta2);





    }
}
