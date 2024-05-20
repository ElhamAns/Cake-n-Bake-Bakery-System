package project0;

import java.util.Scanner;
import static project0.Customerr.Bread_Counter;
import static project0.Customerr.Cake_Counter;
import static project0.Customerr.Drinks_Counter;
import static project0.Customerr.Pastry_Counter;

public class Project0 {

    static String main_menu = "\t\n----- Welcome To Cake n Bake Bakery System -----\n\n"
            + "\t1-Admin Subsystem\n\n"
            + "\t2-Coustmer Subsystem\n\n"
            + "\t3-Exit\n"
            + "\n\tYour Choice: ";

    static String admin_menu = "\n\t\n*** Welcome to Acmin Sub-system ***\n"
            + "\t1- change password \n"
            + "\t2- Modify coustmer order \n"
            + "\t3- Enter 0 to exit\n "
            + "\tYour Choice: ";

    static String customer_menu = "\n\t\n*** Welcome to Customer Sub-system ***\n"
            + //menue
            "\t1- Buy Product \n"
            + "\t2- Delet Proudcst\n"
            + "\t3- View Cart \n"
            + "\t4- Enter 0 to exit \n"
            + "\tYour Choice: ";

    static Scanner in = new Scanner(System.in);

    static Admin admin1;
    static Customerr c1;
    static int flavorC, typeP, typeB, typeD;
    static char sizeC, sizeD;
    static String customizeC, projectPassword = "Pass221";
    static Cake orderC, p1;//no need for p1?
    static Pastry orderP;
    static Bread orderB;
    static Drinks orderD;

    // method
    public static void addProducts() {

        int ch;
        do {
            System.out.println("  -------[ Cake n Bake Bakery Menu ]-------");
            System.out.println("\n1-Cake \n"
                    + "2-Pastry \n"
                    + "3-Bread\n"
                    + "4-Drinks\n"
                    + "0-Exit");
            System.out.println("\tWhat Do You Want To Order ?");
            ch = in.nextInt();

            //Cake Menu
            switch (ch) {
                case 1:
                    System.out.println("\t * Cake Menu * ");
                    System.out.println("\nFlavore\t\t Price \t Calories\n\n"
                            + "===================================\n"
                            + "1-Choclate Cake\t 20 SR \t 371 cal  \n"
                            + "2-Vanilla Cake\t 15 SR \t 240 cal \n"
                            + "3-Red velvetCake\t25SR  333 cal \n"
                            + "4-Pistatio Cake\t 25 SR \t 160 cal \n"
                            + "5-Carrot Cake\t 30 SR \t 650 cal \n");

                    System.out.println("Please Chose The Flavore(*Number from 1-5 only*): ");
                    flavorC = in.nextInt();

                    //SIZE
                    do {
                        System.out.println("Please choose the cake size (Small(S), Meduim(M), Large(L)): ");
                        sizeC = in.next().charAt(0);

                        if (sizeC != 'S' && sizeC != 'M' && sizeC != 'L' && sizeC != 's' && sizeC != 'm' && sizeC != 'l') {
                            System.out.println("Wrong input, you must enter (S) or (M) or (L). ");
                        }

                    } while (sizeC != 'S' && sizeC != 'M' && sizeC != 'L' && sizeC != 's' && sizeC != 'm' && sizeC != 'l');
                    //customize
                    do {
                        System.out.println("Do You Want To Customize? (Enter: Yes OR  NO ): ");
                        customizeC = in.next().toLowerCase();

                        if (customizeC.equals("yes") && customizeC.equals("no")) {
                            System.out.println("Wrong input! , Please enter Yes or No only.");
                        }

                    } while (customizeC.equals("yes") && customizeC.equals("no"));

                    orderC = new Cake(flavorC, sizeC);
                    if (customizeC.equals("yes")) {
                        orderC.customizeC1 = orderC.customizeC();
                    } else {
                        orderC.customizeC1 = "NOT customize";
                    }

                    orderC.cakeList(flavorC);
                    orderC.priceC(flavorC);

                    c1.buyProduct(orderC, flavorC);

                    System.out.println(" The cake added to the cart successfuly ");
                    break;

                case 2:
                    System.out.println("\t * Pastry Menu * ");
                    System.out.println("\nFlavore\t\t Price \t Calories\n\n"
                            + "===================================\n"
                            + "\n6-Croissant \t 12 SR \t 470 cal \n"
                            + "7-Babka \t 40 SR \t 450 cal \n"
                            + "8-Danish \t 15 SR \t 356 cal \n"
                            + "9-Tart    \t 80 SR \t 372 cal \n"
                            + "10-Brioche \t 30 SR \t 350 cal \n");
                    System.out.println("Please Chose The Type(*Number from 6-10 only*): ");
                    typeP = in.nextInt();

                    orderP = new Pastry(typeP);

                    orderP.pastryList(typeP);
                    orderP.priceP(typeP);
                    c1.buyProduct(orderP, typeP);
                    System.out.println(" The Pastry added to the cart successfuly ");
                    break;
                case 3:
                    System.out.println("\t * Bread Menu * ");
                    System.out.println("\nFlavore\t\t Price \t Calories\n\n"
                            + "===================================\n"
                            + "\n11-White Bread \t 10 SR \t 256 cal\n"
                            + "12-wheat Bread \t 14 SR \t 247 cal\n"
                            + "13-Rye Bread \t 16 SR \t 259 cal\n"
                            + "14-sourdough\t 30 SR \t 2942 cal \n"
                            + "15-Baguette\t 15 SR \t 289 cal\n");
                    System.out.println("Please Chose The Type (*Number from 11-15 only*): ");
                    typeB = in.nextInt();

                    orderB = new Bread(typeB);

                    orderB.breadList(typeB);
                    orderB.priceB(typeB);
                    c1.buyProduct(orderB, typeB);

                    System.out.println(" The Bread added to the cart successfuly ");
                    break;
                case 4:

                    System.out.println("\t** Drinks Menu ** ");
                    System.out.println("\nFlavore\t\t Price \t Calories\n\n"
                            + "===================================\n"
                            + "\n16-Black Coffee \t 12 SR \t 5 cal\n"
                            + "17-Flat White\t 16 SR \t 90 cal \n"
                            + "18-Iced Coffee\t 20 SR \t 10 cal\n"
                            + "19-Orange Juice \t 15 SR \t 45 cal\n"
                            + "20-Water\t 5 SR \t 0 cal\n");

                    System.out.println("Please Chose The Drink (*Number from 16-20 only*): ");
                    typeD = in.nextInt();
                    //SIZE
                    do {
                        System.out.println("Please choose the drink size (Small(S), Meduim(M), Large(L)): ");
                        typeD = in.next().charAt(0);

                        if (typeD != 'S' && typeD != 'M' && typeD != 'L' && typeD != 's' && typeD != 'm' && typeD != 'l') {
                            System.out.println("Wrong input, you must enter (S) or (M) or (L). ");
                        }

                    } while (typeD != 'S' && typeD != 'M' && typeD != 'L' && typeD != 's' && typeD != 'm' && typeD != 'l');

                    orderD = new Drinks(typeD, sizeD);

                    orderD.drinksList(typeD);
                    orderD.priceD(typeD);
                    c1.buyProduct(orderD, typeD);

                    System.out.println(" The Drink added to the cart successfuly ");
                    break;

                case 0:

                    c1.orderInfo();

                    System.out.println("*** Thank You *** ");
                    break;
                default:
                    System.out.println("Invalid Option.. ");
                    break;
            }

        } while (ch != 0);
    }

    //Delete Method
    public static void delProducts() {
        System.out.println("Enter the prodect you wnat to delete: ");
        System.out.println("\n1-Cake \n"
                + "2-Pastry \n"
                + "3-Bread\n"
                + "4-Drinks\n"
                + "0-Exit");

        int delChoise = in.nextInt();
        int delete_index;
        //Delete Cake
        if (delChoise == 1) {
            //viwe cake cart
            System.out.println("CAKE");
            for (int i = 0; i < Cake_Counter; i++) {
                System.out.print((i + 1) + "." + c1.Cake_cart[i].name + " " + c1.Cake_cart[i].price + "\n"
                        + "customize: " + c1.Cake_cart[i].customizeC1 + "\n"
                        + "size: " + c1.Cake_cart[i].sizeC + "\n"
                        + "calories: " + c1.Cake_cart[i].calories + "\n");
            }
            do {
                System.out.println("enter the number of the cake you want to delete:");
                delete_index = in.nextInt();

                if (delete_index > (c1.Cake_Counter - 1)) {
                    System.out.println("there is no cake with this number, try again");
                }
            } while (delete_index > (c1.Cake_Counter - 1));

            c1.deleteCake(c1, (delete_index - 1));
        } //Delete Pastry
        else if (delChoise == 2) {
            //viwe Pastry cart
            System.out.println("PASTRY");
            for (int i = 0; i < Pastry_Counter; i++) {
                System.out.print((i + 1) + "." + c1.Pastry_cart[i].name + " " + c1.Pastry_cart[i].price + "\n"
                        + "calories: " + c1.Pastry_cart[i].calories + "\n");
            }

            do {
                System.out.println("enter the number of the Pastry you want to delete:");
                delete_index = in.nextInt();
                if (delete_index > (c1.Pastry_Counter - 1)) {
                    System.out.println("there is no Pastry with this number, try again");
                }
            } while (delete_index > (c1.Pastry_Counter - 1));

            c1.deletePastry(c1, (delete_index - 1));
        } //Delete Bread
        else if (delChoise == 3) {
            //viwe Bread cart
            System.out.println("BREAD");
            for (int i = 0; i < Bread_Counter; i++) {
                System.out.print((i + 1) + "." + c1.Bread_cart[i].name + c1.Bread_cart[i].price + "\n"
                        + "calories: " + c1.Bread_cart[i].calories + "\n");
            }
            do {
                System.out.println("enter the number of the bread you want to delete:");
                delete_index = in.nextInt();
                if (delete_index > (c1.Bread_Counter - 1)) {
                    System.out.println("there is no bread with this number, try again");
                }
            } while (delete_index > (c1.Bread_Counter - 1));

            c1.deleteBread(c1, (delete_index - 1));
        } //Delete Drink
        else if (delChoise == 4) {
            //viwe Drink cart
            System.out.println("DRINKS");
            for (int i = 0; i < Drinks_Counter; i++) {
                System.out.print((i + 1) + "." + c1.Drinks_cart[i].name + c1.Drinks_cart[i].price + "\n"
                        + "size: " + c1.Drinks_cart[i].sizeD + "\n"
                        + "calories: " + c1.Drinks_cart[i].calories + "\n");
            }
            do {
                System.out.println("enter the number of the Drink you want to delete:");
                delete_index = in.nextInt();
                if (delete_index > (c1.Drinks_Counter - 1)) {
                    System.out.println("there is no Drink with this number, try again");
                }
            } while (delete_index > (c1.Drinks_Counter - 1));

            c1.deleteDrinks(c1, (delete_index - 1));

        } else {
            System.out.print("\tInvalid Option.. ");
        }

    }

    //modifyProdect Method
    public static void modifyP() {
        System.out.println("Enter the ID of the customer you want to modify: ");
        int admin_choice = in.nextInt();

        if (admin_choice == c1.ID) {
            System.out.println("Enter the prodect you wnat to modify: ");
            System.out.println("\n1-Cake \n"
                    + "2-Pastry \n"
                    + "3-Bread\n"
                    + "4-Drinks\n"
                    + "0-Exit");

            admin_choice = in.nextInt();
            int modfiy_index;

            //modify Cake
            if (admin_choice == 1) {
                //viwe cake cart
                System.out.println("CAKE");
                for (int i = 0; i < Cake_Counter; i++) {
                    System.out.print((i + 1) + "." + c1.Cake_cart[i].name + " " + c1.Cake_cart[i].price + "\n"
                            + "customize: " + c1.Cake_cart[i].customizeC1 + "\n"
                            + "size: " + c1.Cake_cart[i].sizeC + "\n"
                            + "calories: " + c1.Cake_cart[i].calories + "\n");
                }
                do {
                    System.out.println("enter the number of the cake you want to modify:");
                    modfiy_index = in.nextInt();
                    modfiy_index--;
                    if (modfiy_index == 1 && Cake_Counter == 1) {
                        admin1.modifyCake(c1, (modfiy_index - 1));
                    } else if (Cake_Counter == 0) {
                        System.out.println("there is no prodect in Cake Cart");
                    } else if (modfiy_index > (c1.Cake_Counter - 1)) {
//                        System.out.println("c1.Cake_Counter - 1:"+(c1.Cake_Counter - 1));
//                        System.out.println("modfiy_index"+modfiy_index);
                        System.out.println("there is no cake with this number, try again");
                    }
                } while (modfiy_index > (c1.Cake_Counter - 1));

                admin1.modifyCake(c1, modfiy_index);
            } //modify pastry
            else if (admin_choice == 2) {
                //viwe PASTRY cart
                System.out.println("PASTRY");
                for (int i = 0; i < Pastry_Counter; i++) {
                    System.out.print((i + 1) + "." + c1.Pastry_cart[i].name + " " + c1.Pastry_cart[i].price + "\n"
                            + "calories: " + c1.Pastry_cart[i].calories + "\n");
                }
                do {
                    System.out.println("enter the number of the cake you want to modify:");
                    modfiy_index = in.nextInt();
                    modfiy_index--;
                    if (modfiy_index == 1 && Pastry_Counter == 1) {
                        admin1.modifyPastry(c1, (modfiy_index - 1));
                    } else if (Pastry_Counter == 0) {
                        System.out.println("there is no prodect in Cake Cart");
                    } else if (modfiy_index > (c1.Pastry_Counter - 1)) {
                        System.out.println("there is no cake with this number, try again");
                    }
                } while (modfiy_index > (c1.Pastry_Counter - 1));

                admin1.modifyPastry(c1, modfiy_index);
            } //modify bread
            else if (admin_choice == 3) {
                //viwe Bread cart
                System.out.println("BREAD");
                for (int i = 0; i < Bread_Counter; i++) {
                    System.out.print((i + 1) + "." + c1.Bread_cart[i].name + c1.Bread_cart[i].price + "\n"
                            + "calories: " + c1.Bread_cart[i].calories + "\n");
                }
                do {
                    System.out.println("enter the number of the bread you want to modify:");
                    modfiy_index = in.nextInt();
                    modfiy_index--;
                    if (modfiy_index == 1 && Bread_Counter == 1) {
                        admin1.modifyBread(c1, (modfiy_index - 1));
                    } else if (Bread_Counter == 0) {
                        System.out.println("there is no prodect in Cake Cart");
                    } else if (modfiy_index > (c1.Bread_Counter - 1)) {
                        System.out.println("there is no cake with this number, try again");
                    }
                } while (modfiy_index > (c1.Bread_Counter - 1));

                admin1.modifyBread(c1, modfiy_index);
            }
            //modify drinks
            if (admin_choice == 1) {
                System.out.println("DRINKS");
                //drink cart
                for (int i = 0; i < Drinks_Counter; i++) {
                    System.out.print((i + 1) + "." + c1.Drinks_cart[i].name + c1.Drinks_cart[i].price + "\n"
                            + "size: " + c1.Drinks_cart[i].sizeD + "\n"
                            + "calories: " + c1.Drinks_cart[i].calories + "\n");

                }
                do {
                    System.out.println("enter the number of the drink you want to modify:");
                    modfiy_index = in.nextInt();
                    modfiy_index--;
                    if (modfiy_index == 1 && Drinks_Counter == 1) {
                        admin1.modifyDrinks(c1, (modfiy_index - 1));
                    } else if (Drinks_Counter == 0) {
                        System.out.println("there is no prodect in Cake Cart");
                    } else if (modfiy_index > (c1.Drinks_Counter - 1)) {
                        System.out.println("there is no cake with this number, try again");
                    }
                } while (modfiy_index > (c1.Drinks_Counter - 1));

                admin1.modifyDrinks(c1, modfiy_index);
            }

        }

    }

    //MAIN
    public static void main(String[] args) {
        int ID;
        String name, lname, fname;
        char gender;
        String location, street, city, housNum, phoneNum;

        int choice = 0;
        do {
            System.out.print(main_menu);
            choice = in.nextInt();
            String pass;

            switch (choice) {
                case 1:
                    System.out.print("\n\t*** Welcome to Acmin Sub-system ***\n");
                    do {
                        System.out.println("\nPlease Enter the system password \n");
                        pass = in.next();

                        if (!(pass.equals(projectPassword))) {
                            System.out.println("wrong password");
                        } else if (pass.equals(projectPassword)) {
                            System.out.println("Admin loged in");
                        }

                    } while (!(pass.equals(projectPassword)));

                    System.out.print("Your ID :");
                    ID = in.nextInt();
                    //name
                    char f = ' ';

                    do {
                        System.out.print("Your First Name: ");
                        fname = in.next();

                        if ((fname.length() > 20)) {
                            System.out.println("Enter a name with 20 characters at most.");
                            continue;
                        }

                        for (int i = 0; i < fname.length(); i++) {
                            f = fname.charAt(i);
                            if (!Character.isLetter(f)) {
                                System.out.println("Enter only Letters!");
                                break;
                            }
                        }

                    } while ((fname.length() > 20) || (Character.isLetter(f) == false));

                    char l = ' ';

                    do {
                        System.out.print("Your Last Name: ");
                        lname = in.next();

                        if ((lname.length() > 20)) {
                            System.out.println("Enter a name with 20 characters at most.");
                            continue;
                        }

                        for (int i = 0; i < lname.length(); i++) {
                            l = lname.charAt(i);
                            if (!Character.isLetter(l)) {
                                System.out.println("Enter only Letters!");
                                break;
                            }
                        }

                    } while ((lname.length() > 20) || (Character.isLetter(l) == false));

                    name = fname.concat(" ".concat(lname));
                    //gender
                    do {
                        System.out.print("Your Gender (F -> female, M -> Male): ");
                        gender = in.next().charAt(0);

                        if (gender != 'f' && gender != 'm' && gender != 'F' && gender != 'M') {
                            System.out.println("Wrong input, you must enter (F) or (M).");
                        }

                    } while (gender != 'f' && gender != 'm' && gender != 'F' && gender != 'M');

                    System.out.print("Your Location:\n");
                    System.out.print("  City :");
                    city = in.next();
                    System.out.print("  Street :");
                    street = in.next();

                    //House Number
                    char h = ' ';
                    do {
                        System.out.print("House Number: ");
                        housNum = in.next();

                        if ((housNum.length() != 4)) {
                            System.out.println("Wrong House Number, please enter 4 digit only.");

                        }

                        for (int i = 0; i < housNum.length(); i++) {
                            h = housNum.charAt(i);
                            if (!Character.isDigit(h)) {
                                System.out.println("Enter only numbers!\n");
                                break;
                            }
                        }

                    } while ((housNum.length() != 4) || (Character.isDigit(h) == false));

                    location = city.concat(" ".concat(street).concat(" ".concat(housNum)));
                    //Phone Number
                    char p = ' ';

                    do {
                        System.out.print("Your Phone Number: ");
                        phoneNum = in.next();

                        if ((phoneNum.length() != 10)) {
                            System.out.println("Wrong phone number, please enter 10 digit only.");
                        }

                        for (int i = 0; i < phoneNum.length(); i++) {
                            p = phoneNum.charAt(i);
                            if (!Character.isDigit(p)) {
                                System.out.println("Enter only numbers!\n");
                                break;
                            }
                        }

                    } while ((phoneNum.length() != 10) || (Character.isDigit(p) == false));

                    admin1 = new Admin(ID, name, gender, location, phoneNum);

                    System.out.print(" Enter your new password ");
                    projectPassword = in.next();
                    admin1.setPassword(projectPassword);
                    admin1_System();
                    break;

                case 2:
                    System.out.println("\nPlease Enter Your Information \n");

                    System.out.print("Your ID :");
                    ID = in.nextInt();

                    //name
                    char f1 = ' ';

                    do {
                        System.out.print("Your First Name: ");
                        fname = in.next();

                        if ((fname.length() > 20)) {
                            System.out.println("Enter a name with 20 characters at most.");
                            continue;
                        }

                        for (int i = 0; i < fname.length(); i++) {
                            f1 = fname.charAt(i);
                            if (!Character.isLetter(f1)) {
                                System.out.println("Enter only Letters!");
                                break;
                            }
                        }

                    } while ((fname.length() > 20) || (Character.isLetter(f1) == false));

                    char l1 = ' ';

                    do {
                        System.out.print("Your Last Name: ");
                        lname = in.next();

                        if ((lname.length() > 20)) {
                            System.out.println("Enter a name with 20 characters at most.");
                            continue;
                        }

                        for (int i = 0; i < lname.length(); i++) {
                            l1 = lname.charAt(i);
                            if (!Character.isLetter(l1)) {
                                System.out.println("Enter only Letters!");
                                break;
                            }
                        }

                    } while ((lname.length() > 20) || (Character.isLetter(l1) == false));
                    name = fname.concat(" ".concat(lname));

                    //gender
                    do {
                        System.out.print("Your Gender (F -> female, M -> Male): ");
                        gender = in.next().charAt(0);

                        if (gender != 'f' && gender != 'm' && gender != 'F' && gender != 'M') {
                            System.out.println("Wrong input, you must enter (F) or (M).");
                        }

                    } while (gender != 'f' && gender != 'm' && gender != 'F' && gender != 'M');

                    System.out.print("Your Location:\n");
                    System.out.print("  City :");
                    city = in.next();
                    System.out.print("  Street :");
                    street = in.next();

                    //House Number
                    char h1 = ' ';
                    do {
                        System.out.print("House Number: ");
                        housNum = in.next();

                        if ((housNum.length() != 4)) {
                            System.out.println("Wrong House Number, please enter 4 digit only.");

                        }

                        for (int i = 0; i < housNum.length(); i++) {
                            h1 = housNum.charAt(i);
                            if (!Character.isDigit(h1)) {
                                System.out.println("Enter only numbers!\n");
                                break;
                            }
                        }

                    } while ((housNum.length() != 4) || (Character.isDigit(h1) == false));

                    location = city.concat(" ".concat(street).concat(" ".concat(housNum)));

                    System.out.print("Your Phone Number :");
                    //Phone Number
                    System.out.print("Your Phone Number :");
                    char p1 = ' ';

                    do {
                        System.out.print("Your Phone Number: ");
                        phoneNum = in.next();

                        if ((phoneNum.length() != 10)) {
                            System.out.println("Wrong phone number, please enter 10 digit only.");
                            continue;
                        }

                        for (int i = 0; i < phoneNum.length(); i++) {
                            p1 = phoneNum.charAt(i);
                            if (!Character.isDigit(p1)) {
                                System.out.println("Enter only numbers!\n");
                                break;
                            }
                        }

                    } while ((phoneNum.length() != 10) || (Character.isDigit(p1) == false));

                    c1 = new Customerr(ID, name, gender, location, phoneNum);
                    customer_System();

                    break;
                case 3:
                    break;
                default:
                    System.out.print("Wrong Entry. Please enter a valid option.");

            }

        } while (choice != 3);

    }

    static void customer_System() {
        int choice;
        do {
            
            System.out.print(customer_menu);
            choice = in.nextInt();
            switch (choice) {
                
                
                case 1:

                    addProducts();

                    break;

                case 2:

                    delProducts();

                    break;

                case 3:

                    c1.viewCart();

                    break;

                case 0:
                    c1.review();
                    break;

                default:
                    System.out.print("Wrong Entry. Please enter a valid option.");

            }

        } while (choice != 0);
    }//end of customer_System()

    static void admin1_System() {
        int choice;
        do {

            System.out.print(admin_menu);
            choice = in.nextInt();
            switch (choice) {

                case 1:
                    String newPass;
                    System.out.println("enter your new password: ");
                    newPass = in.next();
                    admin1.setPassword(newPass);
                    break;

                case 2:

                    modifyP();
                    c1.viewCart();
                    break;



                case 0:
                    break;

                default:
                    System.out.print("Wrong Entry. Please enter a valid option.");

            }

        } while (choice != 0);
    }  //end of admin1_System()

}
