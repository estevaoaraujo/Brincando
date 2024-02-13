public class Invoice {
    private int numeroFaturado;
    private String item;
    private float qtd;
    private float preco;


    public void setNumeroFaturado(int numeroFaturado){
        this.numeroFaturado = numeroFaturado;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public void setQtd(float qtd){
        this.qtd = qtd;
    }
    public void setPreco(float preco){
        this.preco = preco;
    }

    public int getNumeroFaturado(){
        return numeroFaturado;
    }
    public String getItem(){
        return item;
    }
    public float getQtd(){
        return qtd;
    }
    public float getPreco(){
        return preco;
    }
    public float getInvoiceAmount(){
        float valor = getQtd() * getPreco();
        return valor;
    }
    //construtor
    public Invoice(int numeroFaturado,String item,float qtd,float preco){
        this.numeroFaturado = numeroFaturado;
        this.item = item;
        if(qtd > 0.0||preco>0.0){
            this.qtd = qtd;
            this.preco = preco;
        }else {
            this.qtd = 0;
            this.preco = 0;
        }
    }

    @Override
    public String toString() {
        return "\nPedido" + "\nNº=" + numeroFaturado  +
                "\nItem =" + item +
                " \nQuantidade = " + qtd +
                " \nPreço = " + preco +
                '\n';
    }
}
