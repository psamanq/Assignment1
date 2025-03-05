import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number from 1 to 999:");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("less than 0");
            return;
        }

        String text = "";

        if (number == 0) {
            text = "sefr";
        } else {
            if (number < 10) {
                switch (number) {
                    case 1:text = "yek"; break;
                    case 2:text = "do"; break;
                    case 3:text = "se"; break;
                    case 4:text = "chahar"; break;
                    case 5:text = "panj"; break;
                    case 6:text = "shesh"; break;
                    case 7:text = "haft"; break;
                    case 8:text = "hasht"; break;
                    case 9:text = "noh"; break;
                }
            } else if (number < 20) {
                switch (number) {
                    case 10:text = "dah"; break;
                    case 11:text = "yazdah"; break;
                    case 12:text = "davazdah"; break;
                    case 13:text = "sizdah"; break;
                    case 14:text = "chahardah"; break;
                    case 15:text = "panzdah"; break;
                    case 16:text = "shanzdah"; break;
                    case 17:text = "hefdah"; break;
                    case 18:text = "hejdah"; break;
                    case 19:text = "nozdah"; break;
                }
            } else if (number < 100) {
                int x = number / 10;
                int y = number % 10;

                switch (x) {
                    case 2:text = "bist"; break;
                    case 3:text = "si"; break;
                    case 4:text = "chehel"; break;
                    case 5:text = "panjah"; break;
                    case 6:text = "shast"; break;
                    case 7:text = "haftad"; break;
                    case 8:text = "hashtad"; break;
                    case 9:text = "navad"; break;
                }

                if (y != 0) {
                    switch (y) {
                        case 1:text += " o yek"; break;
                        case 2:text += " o do"; break;
                        case 3:text += " o se"; break;
                        case 4:text += " o chahar"; break;
                        case 5:text += " o panj"; break;
                        case 6:text += " o shesh"; break;
                        case 7:text += " o haft"; break;
                        case 8:text += " o hasht"; break;
                        case 9:text += " o noh"; break;
                    }
                }
            } else if (number < 1000) {
                int z = number / 100;
                int h = number % 100;

                switch (z) {
                    case 1:text = "sad"; break;
                    case 2:text = "devist"; break;
                    case 3:text = "sisad"; break;
                    case 4:text = "chaharsad"; break;
                    case 5:text = "pansad"; break;
                    case 6:text = "sheshsad"; break;
                    case 7:text = "haftsad"; break;
                    case 8:text = "hashtsad"; break;
                    case 9:text = "nohsad"; break;
                }

                if (h != 0) {
                    if (h < 10) {
                        switch (h) {
                            case 1:text += " o yek"; break;
                            case 2:text += " o do"; break;
                            case 3:text += " o se"; break;
                            case 4:text += " o chahar"; break;
                            case 5:text += " o panj"; break;
                            case 6:text += " o shesh"; break;
                            case 7:text += " o haft"; break;
                            case 8:text += " o hasht"; break;
                            case 9:text += " o noh"; break;
                        }
                    } else if (h < 20) {
                        switch (h) {
                            case 10:text += " o dah"; break;
                            case 11:text += " o yazdah"; break;
                            case 12:text += " o davazdah"; break;
                            case 13:text += " o sizdah"; break;
                            case 14:text += " o chahardah"; break;
                            case 15:text += " o panzdah"; break;
                            case 16:text += " o shanzdah"; break;
                            case 17:text += " o hefdah"; break;
                            case 18:text += " o hejdah"; break;
                            case 19:text += " o nozdah"; break;
                        }
                    } else {
                        int x = h / 10;
                        int y = h % 10;

                        switch (x) {
                            case 2:text += " o bist"; break;
                            case 3:text += " o si"; break;
                            case 4:text += " o chehel"; break;
                            case 5:text += " o panjah"; break;
                            case 6:text += " o shast"; break;
                            case 7:text += " o haftad"; break;
                            case 8:text += " o hashtad"; break;
                            case 9:text += " o navad"; break;
                        }

                        if (y != 0) {
                            switch (y) {
                                case 1:text += " o yek"; break;
                                case 2:text += " o do"; break;
                                case 3:text += " o se"; break;
                                case 4:text += " o chahar"; break;
                                case 5:text += " o panj"; break;
                                case 6:text += " o shesh"; break;
                                case 7:text += " o haft"; break;
                                case 8:text += " o hasht"; break;
                                case 9:text += " o noh"; break;
                            }
                        }
                    }
                }
            } else {
                text = "the number is greater than 1000";
            }
        }

        System.out.println(text);
    }
}