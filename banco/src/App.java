public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    ContaBanco c1 = new ContaBanco();
        c1.NumConta = "00111";
        c1.setDonoConta("Savio");
        c1.abrirConta("CC");
        c1.depositar(150);
        c1.sacar(200);
        c1.fecharConta();
        c1.statusObjeto();
    }
}