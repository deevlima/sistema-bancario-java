public class Conta{
    int numeroConta;
    String titular;
    String tipoConta;
    double saldo;

    public Conta(int numeroConta, String titular, String tipoConta, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    public boolean verificarSaldoEConta(double saldo, String tipoConta){
        boolean condicao = true;
        if (saldo <= 0){
            condicao = false;
        }if (saldo > 0 && !tipoConta.equals("Corrente") && !tipoConta.equals("Poupança")){
            condicao = false;
        }if (saldo > 0 && tipoConta.equals("Corrente") || tipoConta.equals("Poupança")){
            condicao = true;
        }
        return condicao;
    }


    public double depositar(double saldo,double deposito ) {
        if (deposito > 0){
            saldo += deposito;
        }if (deposito < 0){
            saldo += 0;
        }
        return  saldo;
    }


    public double sacar(double saldo, double saque, String tipoConta){
        if (saldo > saque && tipoConta.equals("Corrente")){
            double porcentagem = saque / 100;
            saldo -= saque;
            saque -= porcentagem;
        }if (saldo > saque && tipoConta.equals("Poupança")){
            saldo -= saque;
        }
        return saque;
    }
}
