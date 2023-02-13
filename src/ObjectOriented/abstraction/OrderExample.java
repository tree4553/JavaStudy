package ObjectOriented.abstraction;

interface Customer {
    String getOrder();
}

class CafeCustomerA implements Customer {
    public String getOrder(){
        return "a glass of iced americano";
    }
}

class CafeCustomerB implements Customer {
    public String getOrder(){
        return "a glass of strawberry latte";
    }
}

class CafeOwner {
    public void giveItem(Customer customer) {
        System.out.println("Item : " + customer.getOrder());
    }
}

public class OrderExample {
    public static void main(String[] args) throws Exception {
        CafeOwner cafeowner = new CafeOwner();
        Customer cafeCustomerA = new CafeCustomerA();
        Customer cafeCustomerB = new CafeCustomerB();

        cafeowner.giveItem(cafeCustomerA);
        cafeowner.giveItem(cafeCustomerB);
    }
}
