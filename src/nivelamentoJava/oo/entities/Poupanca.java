package nivelamentoJava.oo.entities;

import sun.security.ssl.KerberosClientKeyExchange;

public class Poupanca  extends Conta{

    public Poupanca(Integer numeroDaConta, String titular, Double saldo) {
        super(numeroDaConta, titular, saldo);
    }

    public void sacar(Double valor) {
        if ((valor+ 5.00) < getSaldo()) {
            setSaldo(getSaldo() - (valor + 5.00) );
        }
    }
}
