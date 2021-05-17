package day16.shop;

import java.util.Scanner;

public class Shop {
    String name;
    String address;
    int countOfProduct;
    int priceForProduct;
    int shopBalance;

    public Shop(String name, String address, int countOfProduct, int priceForProduct, int shopBalance) {
        this.name = name;
        this.address = address;
        this.countOfProduct = countOfProduct;
        this.priceForProduct = priceForProduct;
        this.shopBalance = shopBalance;
    }
     public void checkOrder(){
        print();
        Scanner scanner = new Scanner(System.in);
         System.out.print("dzez inchqan apranq e petq : ");
         int count = scanner.nextInt();
         if (count <= countOfProduct){
             System.out.print("ete gnum eq sexmeq 1, isk ete voch mek urish tvanshan : ");
             int x = scanner.nextInt();
             if (x == 1){
                 calculator(count);
             }else{
                 System.out.println("shnorhakalutyun");
             }
         }else {
             System.out.println("nereceq aydqan apranq chunenq");
         }
         print();
    }
    public void calculator(int count){
        this.shopBalance += count * priceForProduct;
        this.countOfProduct -=count;
    }
    public void print(){
        System.out.println("name is : " + name + "\n" + "address is : " + address + "\n" + "count Of Product is : " + countOfProduct + "\n" + "price For Product is : " + priceForProduct + "\n" + "shop Balance is : " + shopBalance);
    }

}
