import java.util.*;

public class currency {
    public static void main(String[] args) {

        double amount;
        double rupee, dollar, pound, euro, yen, ringgit;
        int choice, convert;

        Scanner sc = new Scanner(System.in);

        System.out.println("\t======== hi, Welcome to the Currency Converter! ========");
        System.out.println("\t -------- which currency You want to Convert ? -------- ");
        System.out.println("               ###  Following are the Choices:  ###\n         ");
        System.out.println("\t Enter 1: Ruppe" + "\n" + "\t Enter 2: Dollar" + "\n" + "\t Enter 3: Pound");
        System.out.println("\t Enter 4: Euro" + "\n" + "\t Enter 5: Yen" + "\n" + "\t Enter 6: Ringgit\n");
        System.out.println("\t Choose from above options: ");
        choice = sc.nextInt();

        if (choice < 7)

        {

            switch (choice) {
                case 1: // Ruppe Conversion

                    System.out.println("\t To be Converted to :");
                    System.out.println(
                            "\t Enter 1: Dollar($)" + "\n" + "\t Enter 2: Pound(£)" + "\n" + "\t Enter 3: Euro(€)");
                    System.out.println("\t Enter 4: Yen(¥)" + "\n" + "\t Enter 5: Ringgit(RM)\n");

                    System.out.println("\t Choose from above options: ");
                    convert = sc.nextInt();

                    System.out.println("\t Enter the amount you want to convert?");
                    amount = sc.nextFloat();

                    if (convert == 1) {
                        dollar = amount / 70;
                        System.out.println(amount + " Rupee = " + dollar + " Dollar");
                    } else if (convert == 2) {
                        pound = amount / 88;
                        System.out.println(amount + " Rupee = " + pound + " Pound");
                    } else if (convert == 3) {
                        euro = amount / 80;
                        System.out.println(amount + " Rupee = " + euro + " Euro");
                    } else if (convert == 4) {
                        yen = amount / 0.63;
                        System.out.println(amount + " Rupee = " + yen + " Yen");
                    } else if (convert == 5) {
                        ringgit = amount / 16;
                        System.out.println(amount + " Rupee = " + ringgit + " ringgit");
                    } else {
                        System.out.println("\tInvalid Converter!!");
                    }
                    break;

                case 2: // Dollar Conversion

                    System.out.println("\t To be Converted to :");
                    System.out.println("\t Enter 1: Ruppe" + "\n" + "\t Enter 2: Pound" + "\n" + "\t Enter 3: Euro");
                    System.out.println("\t Enter 4: Yen" + "\n" + "\t Enter 5: Ringgit\n");

                    System.out.println("\t Choose from above options: ");
                    convert = sc.nextInt();

                    System.out.println("\t Enter the amount you want to convert?");
                    amount = sc.nextFloat();

                    if (convert == 1) {
                        rupee = amount * 70;
                        System.out.println(amount + " Dollar = " + rupee + " Ruppes");
                    } else if (convert == 2) {
                        pound = amount * 0.78;
                        System.out.println(amount + " Dollar = " + pound + " Pound");
                    } else if (convert == 3) {
                        euro = amount * 0.87;
                        System.out.println(amount + " Dollar = " + euro + " Euro");
                    } else if (convert == 4) {

                        yen = amount * 111.087;
                        System.out.println(amount + " Dollar = " + yen + " Yen");
                    } else if (convert == 5) {
                        ringgit = amount * 4.17;
                        System.out.println(amount + " Dollar = " + ringgit + " ringgit");
                    } else {
                        System.out.println("\tInvalid Converter!!");
                    }
                    break;

                case 3: // Pound Conversion

                    System.out.println("\t To be Converted to :");
                    System.out.println("\t Enter 1: Ruppe" + "\n" + "\t Enter 2: Dollar" + "\n" + "\t Enter 3: Euro");
                    System.out.println("\t Enter 4: Yen" + "\n" + "\t Enter 5: Ringgit\n");

                    System.out.println("\t Choose from above options: ");
                    convert = sc.nextInt();

                    System.out.println("\t Enter the amount you want to convert?");
                    amount = sc.nextFloat();
                    if (convert == 1) {
                        rupee = amount * 88;
                        System.out.println(amount + " pound = " + rupee + " Ruppes");
                    } else if (convert == 2) {

                        dollar = amount * 1.26;
                        System.out.println(amount + " pound = " + dollar + " Dollar");
                    } else if (convert == 3) {
                        euro = amount * 1.10;
                        System.out.println(amount + " pound = " + euro + " Euro");
                    } else if (convert == 4) {
                        yen = amount * 140.93;
                        System.out.println(amount + " pound = " + yen + " Yen");
                    } else if (convert == 5) {
                        ringgit = amount * 5.29;
                        System.out.println(amount + " pound = " + ringgit + " ringgit");
                    } else {
                        System.out.println("\tInvalid Converter!!");
                    }
                    break;

                case 4: // Euro Conversion

                    System.out.println("\t To be Converted to :");
                    System.out.println("\t Enter 1: Ruppe" + "\n" + "\t Enter 2: Dollar" + "\n" + "\t Enter 3: Pound");
                    System.out.println("\t Enter 4: Yen" + "\n" + "\t Enter 5: Ringgit\n");

                    System.out.println("\t Choose from above options: ");
                    convert = sc.nextInt();

                    System.out.println("\t Enter the amount you want to convert?");
                    amount = sc.nextFloat();

                    if (convert == 1) {

                        rupee = amount * 80;
                        System.out.println(amount + " euro = " + rupee + " Ruppes");
                    } else if (convert == 2) {

                        dollar = amount * 1.14;
                        System.out.println(amount + " euro = " + dollar + " Dollar");
                    } else if (convert == 3) {
                        pound = amount * 0.90;
                        System.out.println(amount + " euro = " + pound + " Pound");
                    } else if (convert == 4) {
                        yen = amount * 127.32;
                        System.out.println(amount + " euro = " + yen + " Yen");
                    } else if (convert == 5) {
                        ringgit = amount * 4.78;
                        System.out.println(amount + " euro = " + ringgit + " ringgit");
                    } else {
                        System.out.println("\tInvalid Converter!!");
                    }
                    break;

                case 5: // Yen Conversion

                    System.out.println("\t To be Converted to :");
                    System.out.println("\t Enter 1: Ruppe" + "\n" + "\t Enter 2: Dollar" + "\n" + "\t Enter 3: Pound");
                    System.out.println("\t Enter 4: Euro" + "\n" + "\t Enter 5: Ringgit\n");

                    System.out.println("\t Choose from above options: ");
                    convert = sc.nextInt();

                    System.out.println("\t Enter the amount you want to convert?");
                    amount = sc.nextFloat();

                    if (convert == 1) {
                        rupee = amount * 0.63;
                        System.out.println(amount + " yen = " + rupee + " Ruppes");
                    } else if (convert == 2) {
                        dollar = amount * 0.008;
                        System.out.println(amount + " yen = " + dollar + " Dollar");
                    } else if (convert == 3) {
                        pound = amount * 0.007;
                        System.out.println(amount + " yen = " + pound + " Pound");
                    } else if (convert == 4) {
                        euro = amount * 0.007;
                        System.out.println(amount + " yen = " + euro + " Euro");
                    } else if (convert == 5) {
                        ringgit = amount * 0.037;
                        System.out.println(amount + " yen = " + ringgit + " ringgit");
                    } else {
                        System.out.println("Invalid Converter!!");
                    }
                    break;

                case 6: // Ringgit Conversion

                    System.out.println("\t To be Converted to :");
                    System.out.println("\t Enter 1: Ruppe" + "\n" + "\t Enter 2: Dollar" + "\n" + "\t Enter 3: Pound");
                    System.out.println("\t Enter 4: Euro" + "\n" + "\t Enter 5: Yen\n");

                    System.out.println("\tChoose from above options: ");
                    convert = sc.nextInt();
                    System.out.println("\t Enter the amount you want to convert?");
                    amount = sc.nextFloat();
                    if (convert == 1) {
                        rupee = amount * 16.8;
                        System.out.println(amount + " ringgit = " + rupee + " Ruppes");
                    } else if (convert == 2) {
                        dollar = amount * 0.239;
                        System.out.println(amount + " ringgit = " + dollar + " dollar");
                    } else if (convert == 3) {
                        pound = amount * 0.188;
                        System.out.println(amount + " ringgit =: " + pound + " pound");
                    } else if (convert == 4) {
                        euro = amount * 0.209;
                        System.out.println(amount + " ringgit = " + euro + " euro");
                    } else if (convert == 5) {
                        yen = amount * 26.63;
                        System.out.println(amount + " ringgit = " + yen + " yen");
                    } else {
                        System.out.println("\tInvalid Converter!!");
                    }
                    break;

            }
        } else {
            System.out.println("\t Invalid Input");
        }
    }

}