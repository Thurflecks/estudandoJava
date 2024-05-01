import java.util.Date;



public class Main{

    public static void main(String[] args) {
        
    Order pedido = new Order(2, new Date(), OrderStatus.PROCESSANDO);
    System.out.println(pedido);


    
    }
}