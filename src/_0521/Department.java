package _0521;

public class Department {
    String name;
    Store[] stores = new Store[3];
    int storeNum = 0;

    Department(String name) {this.name = name;}

    void addStore(String name) {
        if (storeNum >= stores.length) {
            return;
        }
        stores[storeNum] = new Store(name);
        storeNum ++;
    }

    void addProduct(String storeName, String productName) {
        for (int i=0; i<stores.length; i++) {
            if(stores[i] == null) {
                continue;
            }
            if (!stores[i].name.equals(storeName)) {
                continue;
            }
            stores[i].addProduct(productName);
            return;
        }
    }

    void printProducts(String storeName) {
        for (int i = 0; i<stores.length; i++) {
            if (stores[i] == null) {
                continue;
            }
            if (!stores[i].name.equals(storeName)) {
                continue;
            }
            stores[i].printProducts();
        }
    }

    void printProduct(String productName) {
        boolean hasAnyProduct = false;

        for (int i=0; i<stores.length; i++) {
            if(stores[i] == null) {
                continue;
            }
            boolean hasProduct = stores[i].hasProduct(productName);

            if (hasProduct) {
                System.out.println(productName + "은/는 " + stores[i].name + "에 있어요.");
                hasAnyProduct = true;
            }
        }

        if(!hasAnyProduct) {
            System.out.println("그런 상품은 없어요. 다시 확인해주세요.");
        }
    }


}
