//complete code with property methods (getter,setter) ,different types of constructors,main method and pvsm

public class cylinder {
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public void setRadius(int r) {
        radius = r;
    }

    public void setHeight(int h) {
        height = h;
    }

    public cylinder() {
        radius = 1;
        height = 1;
    }

    public cylinder(int r, int h) {
        radius = r;
        height = h;
    }

    int area() {
        return radius * height;
    }

    public static void main(String[] args) {
        cylinder obj = new cylinder(10, 5);
        System.out.println(obj.area());
    }
}


//product and customer problem
class Product{
    private String itemNo;
    private String name;
    private double price;
    private short qty;
    
    public Product(String itemno){
        itemNo=itemno;
    }
    public Product(String itemno,String name) {
        itemNo=itemno;
        this.name=name;
    }
    public Product(String itemno,String name,double price,short qty) {
        itemNo=itemno;
        this.name=name;
        setPrice(price);
        setQuantity(qty);
    }
    
    public String getItemNo(){
        return  itemNo;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public short getQuantity(){
        return qty;
    }
    
    public void setPrice(double price)
    {
        this.price=price;
    }
    public void setQuantity(short qty)
    {
        this.qty=qty;
    }
}

class Customer{
    private String custId;
    private String name;
    private String address;
    private String phno;
    
    public Customer(String custId,String name) {
        this.custId=custId;
        this.address=name;
    }
    public Customer(String custId,String name,String address,String phno){
        this.custId=custId;
        this.address=name;
        setAddress(address);
        setPhno(phno);
    }
    
    public String getCustId(){
        return custId;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhno(){
        return phno;
    }
    
    public void setAddress(String address) {
        this.address=address;
    }
    public void setPhno(String phno) {
        this.phno=phno;
    }
}


    public static void main(String[] args) 
    {
        create obj and call main method
    }   

