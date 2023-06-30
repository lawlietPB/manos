class cuenta{
    double saldo;
    int numero;
    String titular;
    public void depositar(double valor) {
        this.saldo+=valor;
    }
     public boolean retirar(double valor) {
        if (this.saldo>=valor) {
            this.saldo-=valor;
            return true;
        }
        return false;
    }
    public boolean transferir(double valor,cuenta cuenta) {
        if (this.saldo>=valor) {
            this.saldo-=valor;
            cuenta.depositar(valor);
            return true;
        }
        return false;
    }
}