package nivelamentoJava.oo.entities;

import nivelamentoJava.oo.exception.JavaBankException;

public class ContaEmpresa extends Conta {

    private Double limiteParaEmprestimo;

    public ContaEmpresa(Integer numeroDaConta, String titular, Double saldo, Double limiteParaEmprestimo) {
        super(numeroDaConta, titular, saldo);
        this.limiteParaEmprestimo = limiteParaEmprestimo;
    }

    public Double getLimiteParaEmprestimo() {
        return limiteParaEmprestimo;
    }

    public void setLimiteParaEmprestimo(Double limiteParaEmprestimo) {
        this.limiteParaEmprestimo = limiteParaEmprestimo;
    }
    public String realizarEMprestimo(double valorEmprestimo, int numeroDeParcelas){
        if( valorEmprestimo  >   this.limiteParaEmprestimo){
            throw new JavaBankException("Limite de crédito excedito");
        }
        setSaldo(getSaldo()+valorEmprestimo);
        Double  emprestimo = ((valorEmprestimo / 100) * 15) + valorEmprestimo;
        return "Emprestimo realizado com sucesso em parcelas "+numeroDeParcelas+" de: R$ "+String.format("%.2f", (emprestimo/numeroDeParcelas));
    }
}
