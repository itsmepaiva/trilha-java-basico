public class ContaBanco {
    public String NumConta;
    protected String TipoConta;
    private String DonoConta;
    private int SaldoConta;
    private boolean StatusConta;

    //METODOS
    public void statusObjeto(){
        System.out.println("o nome do dono é " + this.DonoConta);
        System.out.println("o numero da conta é " + this.NumConta);
        System.out.println("o saldo da conta é " + this.SaldoConta);
        System.out.println("o status da conta é " + this.StatusConta);
        System.out.println("o tipo de conta é " + this.TipoConta);   
    }
   //metodo abrir contar
    public void abrirConta(String t){
        this.setTipoConta(t);
        this.setStatusConta(true);
    if(t == "CC"){
        setSaldoConta(50);
        System.out.println("Sua conta corrente está aberta");
    }else if(TipoConta == "CP"){
        setSaldoConta(150);
        System.out.println("Sua conta poupança está aberta");
   }
}
//metodo fechar conta
   public void fecharConta(){
    if(SaldoConta == 0){
        setStatusConta(false);
    }else{
        System.out.println("Sua conta nao pode ser fechada");
    }
   }
   //metodo depositar e sacar
   public void depositar(int v){
    if(this.StatusConta == true){
        this.setSaldoConta(this.getSaldoConta() + v);
    }else{
        System.out.println("Voce nao possue conta ativa");
    }
   }
   public void sacar(int v){
    if(this.isStatusConta() == true){
        if(getSaldoConta()>= v){
            this.setSaldoConta(this.getSaldoConta() - v);
        }else{
            System.out.println("saldo insuficiente");
        }
    } else{
        System.out.println("voce nao possue conta ativa");
    }
   }


//metodos acessores   
    public String getNumConta() {
        return NumConta;
    }
    public void setNumConta(String numConta) {
        NumConta = numConta;
    }
    public String getTipoConta() {
        return TipoConta;
    }
    public void setTipoConta(String tipoConta) {
        TipoConta = tipoConta;
    }
    public String getDonoConta() {
        return DonoConta;
    }
    public void setDonoConta(String donoConta) {
        DonoConta = donoConta;
    }
    public int getSaldoConta() {
        return SaldoConta;
    }
    public void setSaldoConta(int saldoConta) {
        SaldoConta = saldoConta;
    }
    public boolean isStatusConta() {
        return StatusConta;
    }
    public void setStatusConta(boolean statusConta) {
        StatusConta = statusConta;
    }

    //metodo construtor
    public ContaBanco(){
        setSaldoConta(0);
        setStatusConta(false);
    }
   
}
