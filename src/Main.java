import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var invoice = new Invoice(1,"Padrao",2,10);
        var  scanner = new Scanner(System.in);

        System.out.println("Numero Pedido: ");
        int x = scanner.nextInt();
        scanner.nextLine();
        invoice.setNumeroFaturado(x);

        System.out.println("Item: ");
        String n = scanner.nextLine();
        invoice.setItem(n);

        System.out.println("Quantidade: ");
        float q = scanner.nextFloat();
        invoice.setQtd(q);

        System.out.println("Preço: ");
        float p = scanner.nextFloat();
        invoice.setPreco(p);

        System.out.println(invoice + "\nTotal: "+invoice.getInvoiceAmount());

        scanner.close();
    }
}
