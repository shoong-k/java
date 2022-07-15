package _0521;

public class Store {
    String name;
    Product[] products = new Product[3];
    int productNum = 0;

    Store(String name) {this.name = name;}

    void addProduct(String name) {
        if(productNum >= products.length) {
            return;
        }
        products[productNum] = new Product(name);
        productNum ++;
    }

    void printProducts() {
        for (int i=0; i<products.length;i++) {
            if (products[i] == null) {
                continue;
            }
            System.out.println(i+"번째 " + products[i].printProduct());
        }
    }

    boolean hasProduct(String productName) {
        for (int i=0; i<products.length; i++) {
            if (products[i] == null) {
                continue;
            }
            if (!products[i].name.equals(productName)) {
                continue;
            }
            return true;
        }
        return false;
    }
}
