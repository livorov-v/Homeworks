import java.util.Scanner;

/**
 * Created by user on 12/27/2015.
 */
public class ADeckOfCards {
    public static void main(String[] args) {
        int number;
        String index = "";
                    for (number = 1 ; number < 14 ; number ++) {
                        switch (number) {
                            case 1:
                                index = "2";
                                break;
                            case 2:
                                index = "3";
                                break;
                            case 3:
                                index = "4";
                                break;
                            case 4:
                                index = "5";
                                break;
                            case 5:
                                index = "6";
                                break;
                            case 6:
                                index = "7";
                                break;
                            case 7:
                                index = "8";
                                break;
                            case 8:
                                index = "9";
                                break;
                            case 9:
                                index = "10";
                                break;
                            case 10:
                                index = "J";
                                break;
                            case 11:
                                index = "Q";
                                break;
                            case 12:
                                index = "K";
                                break;
                            case 13:
                                index = "A";
                                break;
                        }
                        for (int type = 0 ; type <= 3 ; type++ ) {
//                              ВТОРО РЕШЕНИЕ --------------------------------------
//                            switch (type) {
//                                case 0:
//                                    System.out.print(index + " of spades, "); break;
//                                case 1:
//                                    System.out.print(index + " of hearts, "); break;
//                                case 2:
//                                    System.out.print(index + " of clubs, "); break;
//                                case 3:
//                                    System.out.println(index + " of diamonds"); break;
//                            }
//                              ВТОРО РЕШЕНИЕ --------------------------------------
                            if (type == 0) {
                                System.out.print(index + " of spades, ");
                            }
                            if (type == 1) {
                                System.out.print(index + " of hearts, ");
                            }
                            if (type == 2) {
                                System.out.print(index + " of clubs, ");
                            }
                            if (type == 3) {
                                System.out.println(index + " of diamonds");
                            }
                        }
                    }

//        int month = 8;
//        String monthString;
//        switch (month) {
//            case 1:  monthString = "January";
//                break;
//            case 2:  monthString = "February";
//                break;
//            case 3:  monthString = "March";
//                break;
//            case 4:  monthString = "April";
//                break;
//            case 5:  monthString = "May";
//                break;
//            case 6:  monthString = "June";
//                break;
//            case 7:  monthString = "July";
//                break;
//            case 8:  monthString = "August";
//                break;
//            case 9:  monthString = "September";
//                break;
//            case 10: monthString = "October";
//                break;
//            case 11: monthString = "November";
//                break;
//            case 12: monthString = "December";
//                break;
//            default: monthString = "Invalid month";
//                break;
//        }
//        System.out.println(monthString);
            }
        }

