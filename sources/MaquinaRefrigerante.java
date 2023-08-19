
public class MaquinaRefrigerante {
	
    // Atributos.
    private int preco;
    private int balanco;
    private int total;
    private boolean darTroco;

    // Método construtor para inicializar os atributos
    public MaquinaRefrigerante(int valor) {
        preco = valor;
        balanco = 0;
        total = 0;
        darTroco = false;
    }

    // Retorna o preço
    public int getPreco(){
        return preco;
    }

    // Retorna o balanço corrente
    public int getBalanco(){
        return balanco;
    }

    public void setDarTroco()
    {
        darTroco = true;
    }

    // Recebe um valor em dinheiro
    public void inserirDinheiro(int valor){
        if(valor <= 0)
        {
            System.out.println("Valor inserido menor ou igual a zero...");
            return;
        }
        
        balanco += valor;
		System.out.println("Valor inserido com sucesso!!!!");
    }

    // Imprimir o preço do refrigerante
    public void imprimirPreco(){
        System.out.println("##################");
        System.out.println("# Preco ##########");
        System.out.println("# Refrigerante");
        System.out.println("# R$ " + preco + ",00");
        System.out.println("##################");
    }
	
    public void comprarRefrigerante()
    {
        if(balanco < preco)
        {
            System.out.println("Valor insuficiente. Insira pelo menos " + (preco-balanco) + ",00 para fazer a compra.");
            return;
        }

        System.out.println("##################");
        System.out.println("# Recibo ##########");
        System.out.println("# Refrigerante");
        System.out.println("# R$ " + preco + ",00");
        System.out.println("##################");

        total += preco;
        balanco -= preco;

        if(balanco > 0 && darTroco == true)
        {
            System.out.println("###############");
            System.out.println("## Troco ##");
            System.out.println("## R$ " + devolverTroco() + ",00");
            System.out.println("###############");
        }
    }

    public int devolverTroco()
    {
        if(balanco < 0)
        {
            System.out.println("Erro no programa! Balanco negativo!");
            return -1;
        }
        if(balanco == 0)
        {
            System.out.println("Nao ha troco. Volte sempre!");
            return -1;
        }
        int valorParaDevolver = balanco;
        balanco = 0;
        return valorParaDevolver;
    }

}
