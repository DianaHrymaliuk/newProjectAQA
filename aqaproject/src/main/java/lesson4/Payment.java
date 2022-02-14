package lesson4;

public class Payment { // что-то пробовала, но не доделала
    private String name;
    private int cost;
    private Product[] arr;
    public Payment() {
        super();
        this.name = "";
        this.cost = 0;
    }
    public Payment(String name) {
        super();
        this.name = name;
    }

    public static class Product{
        private String productName;
        private int productPrice;
        public Product (String productName, int productPrice){
            this.productName=productName;
            this.productPrice=productPrice;
        }

        public String getProductName() {
            return productName;
        }

        public int getProductPrice() {
            return productPrice;
        }
    }
    public void pay(){
        this.cost =0;
        for (int i = 0; i < arr.length; i++) {
            this.cost = this.cost+arr[i].productPrice;
        }
        System.out.println("Покупка на сумму:" + this.cost);
    }
}



