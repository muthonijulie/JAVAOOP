package invoice;
import java.text.DecimalFormat;

public class invoice {
    public static void main(String[] args) {
        String soldTo = "C026-01-0924/2022";
        String date = "28/04/2020";
        String address = "Elizabeth Muthoni Julius";
        String contactNumber = "0100100100";
        int q1 = 4, q2 = 10, q3 = 9, q4 = 10;
        String iT1 = "Pencil", iT2 = "Duster", iT3 = "Pens", iT4 = "crayon";
        int up1 = 20, up2 = 50, up3 = 30, up4 = 80;
        double at1 = 80.00, at2 = 500.00, at3 = 270.00, at4 = 800.00;
        double subTotal = at1 + at2 + at3 + at4;
        double VAT = subTotal * 0.16;
        double totalAmount = subTotal + VAT;

        // Create a DecimalFormat with 2 decimal places
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("***********************Adamson Computers Ltd**************************");
        System.out.println("#99 ACS Building Gilmore Ave. New Mla.. Quezon City * Tel. No:123-4567");
        System.out.println("                 VAT REG. TIN 098-765-4321-0000                       ");
        System.out.println("                          SALES INVOICE                               \n\n");
        System.out.println("Sold to:" + soldTo + "\t\t\t\t" + "Date:" + date + "");
        System.out.println("Address:" + address + "\t\t\t" + "Contact Number:" + contactNumber + "\n\n");
        System.out.println("===============================================================================");
        System.out.println("Qty     |     Item Description  \t |    Unit Price         |Amount           ");
        System.out.println("===============================================================================");
        System.out.println(q1 + "\t" + "|\t" + iT1 + "\t\t\t" + " |\t" + up1 + "\t\t" + " |" + df.format(at1));
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(q2 + "\t" + "|\t" + iT2 + "\t\t\t" + " |\t" + up2 + "\t\t" + " |" + df.format(at2));
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(q3 + "\t" + "|\t" + iT3 + "\t\t\t" + " |\t" + up3 + "\t\t" + " |" + df.format(at3));
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(q4 + "\t" + "|\t" + iT4 + "\t\t\t" + " |\t" + up4 + "\t\t" + " |" + df.format(at4));
        System.out.println("===============================================================================");
        System.out.println("                                         |Sub Total              |" + df.format(subTotal));
        System.out.println("                                         ======================================");
        System.out.println("                                         |VAT(16%)               |" + df.format(VAT));
        System.out.println("                                         ======================================");
        System.out.println("                                         |Total Amount           |" + df.format(totalAmount));
        System.out.println("                                         ======================================");
    }
}
