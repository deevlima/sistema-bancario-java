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

}
