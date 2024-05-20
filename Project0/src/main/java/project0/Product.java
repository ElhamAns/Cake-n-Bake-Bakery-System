package project0;

import java.util.Scanner;

class Product {

    Product() {
    }

    public static int counter = 0;
    public double calories, price;
    public int type;
    String name;
    Scanner in = new Scanner(System.in);

    double calcCalories(char size, double calories) {
        double result = 0;
        if (size == 's' || size == 'S') {
            result = calories * 1;
        } else if (size == 'm' || size == 'M') {
            result = calories * 2;
        } else if (size == 'l' || size == 'L') {
            result = calories * 3;
        } else {
            System.out.println("Wrong option!");
        }

        return result;

    }

    double calcPrice(char size, double price) {
        double resultPrice = 0;

        if (size == 's' || size == 'S') {
            resultPrice = price * 1;
        } else if (size == 'm' || size == 'M') {
            resultPrice = price * 2;
        } else if (size == 'l' || size == 'L') {
            resultPrice = price * 3;
        } else {
            System.out.println("Wrong option!");
        }

        return resultPrice;
    }

}

class Cake extends Product {

    char sizeC;
    String customizeC1;


    Cake() {
    }

    Cake(int flavorC, char sizeC) {

        this.type = type;;
        this.sizeC = sizeC;
        counter++;
    }

    public void cakeList(int type) {
        double finalCal = 0;
        switch (type) {
            case 1: {
                calories = 371; //Chocolate cake 
                calories = calcCalories(sizeC, calories);
                name = "Chocolate cake";

                break;
            }

            case 2: {
                calories = 240; //Vanilla cake 
                calories = calcCalories(sizeC, calories);
                name = "Vanilla cake";
                break;
            }

            case 3: {
                calories = 333; //Red velvet cake 
                calories = calcCalories(sizeC, calories);
                name = "Red velvet cake. ";
                break;
            }

            case 4: {
                calories = 160; //Pistachio cake 
                calories = calcCalories(sizeC, calories);
                name = "Pistachio cake";
                break;
            }

            case 5: {
                calories = 650; //Carrot cake 
                calories = calcCalories(sizeC, calories);
                name = "Carrot cake";
                break;
            }

            default:
                System.out.println("Wrong option!");
        }
        //return finalCal;
    }

    public void priceC(int type) {
        double finalPri = 0;

        switch (type) {
            case 1: {
                price = 20; //Chocolate cake 
                price = calcPrice(sizeC, price);
                break;
            }

            case 2: {
                price = 15; //Vanilla cake 
                price = calcPrice(sizeC, price);
                break;
            }

            case 3: {
                price = 25; //Red velvet cake 
                price = calcPrice(sizeC, price);
                break;
            }

            case 4: {
                price = 25; //Pistachio cake 
                price = calcPrice(sizeC, price);
                break;
            }

            case 5: {
                price = 30; //Carrot cake 
                price = calcPrice(sizeC, price);
                break;
            }

            default:
                System.out.println("Wrong option!");
        }

        //return finalPri;
    }

    public String customizeC() {

        int c;
        String customize = "";

        do {
            System.out.println("\nChoose from the list: \n"
                    + "\n1.Writing on the cake. "
                    + "\n2.Add flowers on the cake. "
                    + "\n3.customize shape (circle, square). "
                    + "\n4.Add candles. "
                    + "\n0.Exit. ");

            c = in.nextInt();

            String w, s;

            int f, candle;
            switch (c) {

                case 0:
                    return customize;
                case 1: {

                    System.out.println("What do you want to write on the cake? ");
                    w = in.next();//nextLine()
                    customize = w;
                    return customize;
                }

                case 2: {
                    System.out.println("How many flowers you want to add? ");
                    f = in.nextInt();
                    customize = Integer.toString(f);
                    return customize;

                }

                case 3: {
                    System.out.println("Circle or square? ");
                    s = in.next();
                    customize = s;
                    return customize;
                }

                case 4: {
                    System.out.println("How many candels do you want to add? ");
                    candle = in.nextInt();
                    customize = Integer.toString(candle);
                    return customize;
                }

                default:
                    System.out.println("Invalid Option.. ");
                    return customize;
            }

        } while (c != 0);

    }
}

class Pastry extends Product {

    Pastry(int type) {

        this.type = type;
        counter++;
    }

    public void pastryList(int type) {
        switch (type) {
            case 6: {
                calories = 470; //Croissant 
                name = "Croissant";

                break;
            }

            case 7: {
                calories = 450; //Babka 
                name = "Babka";

                break;
            }

            case 8: {
                calories = 356; //Danish 
                name = "Danish";

                break;
            }

            case 9: {
                calories = 372; //Tart 
                name = "Tart";

                break;
            }

            case 10: {
                calories = 350; //Brioche
                name = "Brioche";

                break;
            }

            default:
                System.out.println("Wrong option!");
        }

    }

    public void priceP(int type) {
        switch (type) {
            case 6: {
                price = 12; //Croissant 
                break;
            }

            case 7: {
                price = 40; //Babka 
                break;
            }

            case 8: {
                price = 15; //Danish 
                break;
            }

            case 9: {
                price = 80; //Tart 
                break;
            }

            case 10: {
                price = 30; //Brioche 
                break;
            }

            default:
                System.out.println("Wrong option!");
        }

        //return price;
    }
}

class Bread extends Product {

    Bread(int type) {

        this.type = type;
        counter++;
    }

    public void breadList(int type) {
        switch (type) {
            case 11: {
                calories = 256; //White bread
                name = "White bread";

                break;
            }

            case 12: {
                calories = 247; //Wheat bread 
                name = "Wheat bread";

                break;
            }

            case 13: {
                calories = 259; //Rye bread 
                name = "Rye bread";

                break;
            }

            case 14: {
                calories = 2942; //sourdough
                this.name = "Sourdough";

                break;
            }

            case 15: {
                calories = 289; //Baguette 
                this.name = "Baguette";

                break;
            }

            default:
                System.out.println("Wrong option!");
        }

        //return calories;
    }

    public void priceB(int type) {
        switch (type) {
            case 11: {
                price = 10; //White bread
                break;
            }

            case 12: {
                price = 14; //Wheat bread 
                break;
            }

            case 13: {
                price = 16; //Rye bread 
                break;
            }

            case 14: {
                price = 30; //sourdough
                break;
            }

            case 15: {
                price = 15; //Baguette 
                break;
            }

            default:
                System.out.println("Wrong option!");
        }

        //return price;
    }

}

class Drinks extends Product {

    char sizeD;

    Drinks(int type, char sizeD) {

        this.type = type;
        this.sizeD = sizeD;
        counter++;
    }

    public void drinksList(int type) {
        double finalCalD = 0;

        switch (type) {
            case 16: {
                calories = 5; //Black coffee 
                calories = calcCalories(sizeD, calories);
                this.name = "Black coffee";

                break;
            }

            case 17: {
                calories = 90; //Flat white 
                calories = calcCalories(sizeD, calories);
                this.name = "Flat white";

                break;
            }

            case 18: {
                calories = 10; //Iced coffee 
                calories = calcCalories(sizeD, calories);
                this.name = "Iced coffee";

                break;
            }

            case 19: {
                calories = 45; //Orange juice 
                calories = calcCalories(sizeD, calories);
                this.name = "Orange juice";

                break;
            }

            case 20: {
                calories = 0; //Water 
                calories = calcCalories(sizeD, calories);
                this.name = "Water";

                break;
            }

            default:
                System.out.println("Wrong option!");
        }

        //return finalCalD;
    }

    public void priceD(int type) {
        double finalPriD = 0;

        switch (type) {
            case 16: {
                price = 12; //Black coffee 
                price = calcPrice(sizeD, price);
                break;
            }

            case 17: {
                price = 16; //Flat white 
                price = calcPrice(sizeD, price);
                break;
            }

            case 18: {
                price = 20; //Iced coffee 
                price = calcPrice(sizeD, price);
                break;
            }

            case 19: {
                price = 15; //Orange juice 
                finalPriD = calcPrice(sizeD, price);
                break;
            }

            case 20: {
                price = 5; //Water 
                price = calcPrice(sizeD, price);
                break;
            }

            default:
                System.out.println("Wrong option!");
        }

        //return finalPriD;
    }

}
