import java.util.Date;


public class Order {
    
    private int id;
    private Date data;
    private OrderStatus status;

    public Order(){

    }

    public Order(int id, Date data, OrderStatus status){
        this.id = id;
        this.data = data;
        this.status = status;
    }

    public String toString(){
        return "oi" + " " +  " " + id + " " + data + " " + status ;
    }
}



