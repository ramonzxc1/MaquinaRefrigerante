public class MaquinaRefrigeranteView {
    public static void main(String[] args) {
        MaquinaRefrigerante maquina = new MaquinaRefrigerante(5);
        maquina.imprimirPreco();

        System.out.println("");
        maquina.inserirDinheiro(20);
        
        System.out.println("");
        System.out.println("Balanco atual => " + maquina.getBalanco());
        
        maquina.comprarRefrigerante();

        maquina.setDarTroco();

        maquina.comprarRefrigerante();
    }
}
