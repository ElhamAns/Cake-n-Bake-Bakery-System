package project0;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class User {

    public int ID;
    private String name;
    private char gender;
    private String location;
    private String phoneNum;

    User() {
    }

    User(int ID, String name, char gender, String location, String phoneNum) {

        this.ID = ID;
        setName(name);//Setters
        setGender(gender);
        setLocation(location);
        phoneNum(phoneNum);
    }

    // **********===========[ accessors and mutators ]=========***********
    // name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // gender
    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    // location
    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    // phoneNum 
    public void phoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String phoneNum() {
        return phoneNum;
    }

    // **********===========[                        ]=========***********
}

//Customer class
class Customerr extends User {
    Scanner input = new Scanner(System.in);

    public Cake[] Cake_cart = new Cake[100]; //array of objects
    public Pastry[] Pastry_cart = new Pastry[100]; //array of objects
    public Bread[] Bread_cart = new Bread[100]; //array of objects
    public Drinks[] Drinks_cart = new Drinks[100]; //array of objects

    static int Cake_Counter = 0;
    static int Pastry_Counter = 0;
    static int Bread_Counter = 0;
    static int Drinks_Counter = 0;

    public double totalPrice;
    public String fName;
    public boolean orderState;

    Customerr() {
    }

    Customerr(int ID, String name, char gender, String location, String phoneNum) {
        super(ID, name, gender, location, phoneNum);

    }

    // overloading
    public void buyProduct(Cake order, int flavor) {
        Cake_cart[Cake_Counter] = order;

        //totalPrice += order.priceC(flavor);
        totalPrice += order.price;
        Cake_Counter++;

    }

    public void buyProduct(Drinks order, int type) {
        Drinks_cart[Drinks_Counter] = order;

        //totalPrice += order.priceD(type);
        totalPrice += order.price;
        Drinks_Counter++;

    }

    public void buyProduct(Pastry order, int type) {
        Pastry_cart[Pastry_Counter] = order;

        //totalPrice += order.priceP(type);
        totalPrice += order.price;
        Pastry_Counter++;

    }

    public void buyProduct(Bread order, int flavor) {
        Bread_cart[Bread_Counter] = order;

        //totalPrice += order.priceB(flavor);
        totalPrice += order.price;
        Bread_Counter++;
    }

    // delete methoed
    public void deleteCake(Customerr x, int deleted_index) {
        x.totalPrice -= x.Cake_cart[deleted_index].price;
        for (int j = deleted_index; j <= Cake_Counter - 1; j++) {
            x.Cake_cart[j] = x.Cake_cart[j + 1];
        }
        Cake_Counter--;
        System.out.println("Product is deleted successfully!");
    }

    public void deleteDrinks(Customerr x, int deleted_index) {
        x.totalPrice -= x.Drinks_cart[deleted_index].price;
        for (int j = deleted_index; j <= Drinks_Counter - 1; j++) {
            x.Drinks_cart[j] = x.Drinks_cart[j + 1];
        }
        Drinks_Counter--;
        System.out.println("Product is deleted successfully!");
    }

    public void deletePastry(Customerr x, int deleted_index) {
        x.totalPrice -= x.Pastry_cart[deleted_index].price;
        for (int j = deleted_index; j <= Pastry_Counter - 1; j++) {
            x.Pastry_cart[j] = x.Pastry_cart[j + 1];
        }
        Pastry_Counter--;
        System.out.println("Product is deleted successfully!");
    }

    public void deleteBread(Customerr x, int deleted_index) {
        x.totalPrice -= x.Bread_cart[deleted_index].price;
        for (int j = deleted_index; j <= Bread_Counter - 1; j++) {
            x.Bread_cart[j] = x.Bread_cart[j + 1];
        }
        Bread_Counter--;
        System.out.println("Product is deleted successfully!");

    }

    public void viewCart() {
        System.out.print(this.getName() + "'s cart: \n");
        System.out.println("CAKE");
        //cake cart
        for (int i = 0; i < Cake_Counter; i++) {
            System.out.print((i + 1) + "." + Cake_cart[i].name + " " + Cake_cart[i].price + "\n"
                    + "customize: " + Cake_cart[i].customizeC1 + "\n"
                    + "size: " + Cake_cart[i].sizeC + "\n"
                    + "calories: " + Cake_cart[i].calories + "\n");

        }
        //pastry cart
        System.out.println("-----------------");
        System.out.println("PASTRY");
        for (int i = 0; i < Pastry_Counter; i++) {
            System.out.print((i + 1) + "." + Pastry_cart[i].name + " " + Pastry_cart[i].price + "\n"
                    + "calories: " + Pastry_cart[i].calories + "\n");
        }
        System.out.println("-----------------");
        System.out.println("BREAD");
        //bread cart
        for (int i = 0; i < Bread_Counter; i++) {
            System.out.print((i + 1) + "." + Bread_cart[i].name + Bread_cart[i].price + "\n"
                    + "calories: " + Bread_cart[i].calories + "\n");

        }
        System.out.println("-----------------");
        System.out.println("DRINKS");
        //drink cart
        for (int i = 0; i < Drinks_Counter; i++) {
            System.out.print((i + 1) + "." + Drinks_cart[i].name + Drinks_cart[i].price + "\n"
                    + "size: " + Drinks_cart[i].sizeD + "\n"
                    + "calories: " + Drinks_cart[i].calories + "\n");

        }
        System.out.println("TOTAL PRICE " + totalPrice + " SR");
        Date orderDate = new Date();
        System.out.println("\nORDERD ON :" + orderDate);
        System.out.println();
    }

    public void orderInfo() {
        System.out.println("\t\t***** ORDER INFORMATION *****"
                + "\nNAME: " + this.getName()
                + "\nGENDER: " + this.getGender()
                + "\nLOCATION: " + this.getLocation()
                + "\nPHONE NUMBER: " + this.phoneNum());
        this.viewCart();

    }
    
    public void review(){
         ArrayList<Integer> review= new ArrayList<>(); 
         String rr1,rr2,rr3;
         
         
          System.out.println("\n-----------Customer Review-----------  \n" );
         System.out.println("Rate from 1-4 \n "
                 + "(1) Bad  (4)Excellent \n"
                 + "\n Enter a number: ");
         
         System.out.print("Rate your experience with Cake n Bake Bakery :");
         int r1=input.nextInt();
         
         if(r1==1)
          rr1=" Bad ";
                 
        else
         rr1="Excellent ";
         
         
         System.out.print("Rate the quality of the food : ");
         
         int r2=input.nextInt();
         
         if(r2==1)
          rr2=" Bad ";
                 
         else
         rr2="Excellent ";
         
         System.out.print("Rate our System : ");
         int r3=input.nextInt();
         if(r3==1)
          rr3=" Bad ";
                 
        else
         rr3="Excellent ";
         
         review.add(r1);
         review.add(r2);
         review.add(r3);
         System.out.println("-----------Customer Review-----------  \n" );
          
        
          System.out.println( "Experience :"+rr1 );
          System.out.println("Food quality: "+rr2);
          System.out.println("Our System:"+rr3);
          
        
    }

}

class Admin extends User {

    Scanner input = new Scanner(System.in);
    private String Password = "pass221";

    //constructor
    Admin() {
    }

    Admin(int ID, String name, char gender, String location, String phoneNum) {
        super(ID, name, gender, location, phoneNum);
    }

    //set&get
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPassword() {
        return Password;
    }

    //methoed
    public boolean confirmOrder(Customerr x) {
        int choice;
        System.out.println("do you want to confirm the order?"
                + "1-YES \n"
                + "2-NO \n");
        choice = input.nextInt();
        while (choice != 1 || choice != 2) {
            System.out.println("wrong input! /n"
                    + "do you want to confirm the order?"
                    + "1-YES \n"
                    + "2-NO \n");
            choice = input.nextInt();
        }
        if (choice == 1) {
            return true;
        } else {
            return false;
        }
    }

    //modify
    public void modifyCake(Customerr x, int index) {
        int choice;

        System.out.println("What Do you want to modify on the Cake ? \n"
                + "\t1- Modify Flavore \n"
                + "\t2- Modify size \n"
                + "\t3- Modify customize\n"
                + "\tYour Choice: ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                x.totalPrice -= x.Cake_cart[index].price;
                int newType;
                System.out.println("\t * Cake Menu * ");
                System.out.println("\nFlavore\t\t Price \t Calories\n\n"
                        + "===================================\n"
                        + "1-Choclate Cake\t 20 SR \t 371 cal  \n"
                        + "2-Vanilla Cake\t 15 SR \t 240 cal \n"
                        + "3-Red velvetCake\t25SR  333 cal \n"
                        + "4-Pistatio Cake\t 25 SR \t 160 cal \n"
                        + "5-Carrot Cake\t 30 SR \t 650 cal \n");

                System.out.println("Please Chose The Flavore(Number from 1-5 only): ");
                newType = input.nextInt();
                x.Cake_cart[index].type = newType;
                x.Cake_cart[index].cakeList(x.Cake_cart[index].type);//to change the name and calories
                x.Cake_cart[index].priceC(x.Cake_cart[index].type);//to change the price with size
                x.totalPrice += x.Cake_cart[index].price;

                System.out.println("flavor has been modifyed successfully");
                break;

            case 2:
                x.totalPrice -= x.Cake_cart[index].price;
                System.out.println("enter new Cake size:");
                x.Cake_cart[index].sizeC = input.next().charAt(0);
                x.Cake_cart[index].cakeList(x.Cake_cart[index].type);//to change the name and calories
                x.Cake_cart[index].priceC(x.Cake_cart[index].type);//to change the price with size
                x.totalPrice += x.Cake_cart[index].price;
                System.out.println("size has been modifyed successfully");
                break;

            case 3:

                x.Cake_cart[index].customizeC1 = x.Cake_cart[index].customizeC();
                System.out.println("customize has been modifyed successfully");
                break;

        }
    }

    public void modifyPastry(Customerr x, int index) {
        int choice;

        System.out.println("Enter 1 to modify the Pastry type : \n"
                + "\tYour Choice: ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                x.totalPrice -= x.Pastry_cart[index].price;
                int newType;
                System.out.println("\t * Pastry Menu * ");
                System.out.println("\nFlavore\t\t Price \t Calories\n\n"
                        + "===================================\n"
                        + "\n6-Croissant \t 12 SR \t 470 cal \n"
                        + "7-Babka \t 40 SR \t 450 cal \n"
                        + "8-Danish \t 15 SR \t 356 cal \n"
                        + "9-Tart    \t 80 SR \t 372 cal \n"
                        + "10-Brioche \t 30 SR \t 350 cal \n");
                System.out.println("Please Chose The Type(*Number from 6-10 only*): ");
                newType = input.nextInt();
                x.Pastry_cart[index].type = newType;
                x.Pastry_cart[index].pastryList(x.Pastry_cart[index].type);//to change the name and calories
                x.Pastry_cart[index].priceP(x.Pastry_cart[index].type);//to change the price 
                x.totalPrice += x.Pastry_cart[index].price;
                System.out.println("flavor has been modifyed successfully");
                break;

        }
    }

    public void modifyBread(Customerr x, int index) {
        int choice;

        System.out.println("Enter 1 to modify the Bread type : \n"
                + "\tYour Choice: ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                x.totalPrice -= x.Bread_cart[index].price;
                int newType;
                System.out.println("\t * Bread Menu * ");
                System.out.println("\nFlavore\t\t Price \t Calories\n\n"
                        + "===================================\n"
                        + "\n11-White Bread \t 10 SR \t 256 cal\n"
                        + "12-wheat Bread \t 14 SR \t 247 cal\n"
                        + "13-Rye Bread \t 16 SR \t 259 cal\n"
                        + "14-sourdough\t 30 SR \t 2942 cal \n"
                        + "15-Baguette\t 15 SR \t 289 cal\n");
                System.out.println("Please Chose The Type (*Number from 11-15 only*): ");
                newType = input.nextInt();
                x.Bread_cart[index].type = newType;
                x.Bread_cart[index].breadList(x.Bread_cart[index].type);//to change the name and calories
                x.Bread_cart[index].priceB(x.Bread_cart[index].type);//to change the price with size
                x.totalPrice += x.Bread_cart[index].price;
                System.out.println("flavor has been modifyed successfully");
                break;

        }
    }

    public void modifyDrinks(Customerr x, int index) {
        int choice;

        System.out.println("What Do you want to modify on the Drink ? \n"
                + "\t1- Modify Type \n"
                + "\t2- Modify size \n"
                + "\tYour Choice: ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                x.totalPrice -= x.Drinks_cart[index].price;
                int newType;
                System.out.println("\t** Drinks Menu ** ");
                System.out.println("\nFlavore\t\t Price \t Calories\n\n"
                        + "===================================\n"
                        + "\n16-Black Coffee \t 12 SR \t 5 cal\n"
                        + "17-Flat White\t 16 SR \t 90 cal \n"
                        + "18-Iced Coffee\t 20 SR \t 10 cal\n"
                        + "19-Orange Juice \t 15 SR \t 45 cal\n"
                        + "20-Water\t 5 SR \t 0 cal\n");

                System.out.println("Please Chose The Drink (*Number from 16-20 only*): ");
                newType = input.nextInt();
                x.Drinks_cart[index].type = newType;
                x.Drinks_cart[index].drinksList(x.Drinks_cart[index].type);//to change the name and calories
                x.Drinks_cart[index].priceD(x.Drinks_cart[index].type);//to change the price with size
                x.totalPrice += x.Drinks_cart[index].price;
                System.out.println("flavor has been modifyed successfully");
                break;

            case 2:
                x.totalPrice -= x.Drinks_cart[index].price;
                System.out.println("enter new drink size:");
                x.Drinks_cart[index].sizeD = input.next().charAt(0);
                x.Drinks_cart[index].drinksList(x.Drinks_cart[index].type);//to change the name and calories
                x.Drinks_cart[index].priceD(x.Drinks_cart[index].type);//to change the price with size
                x.totalPrice += x.Drinks_cart[index].price;
                System.out.println("size has been modifyed successfully");
                break;

        }
    }

}
