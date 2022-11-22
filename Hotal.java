import java.util.Scanner;
import java.util.ArrayList;
class hotel{
    String name;
    long phone;

    float tea=10;
    float snak=10;
    float cofee = 15;
    
    int tea_q=0;
    int snak_q=0;
    int cofee_q=0;

    float tea_total;
    float snak_total;
    float cofee_total;
    hotel(String name,long phone){
        this.name=name;
        this.phone = phone;
    }

    void generate_bill(){
        tea_total = tea*tea_q;
        snak_total = snak*snak_q;
        cofee_total = cofee*cofee_q;
    }

    void display_bill(){
        System.out.println();
        System.out.println("Total Bil");
        System.out.println("-------------------");
        System.out.println();

        System.out.println("name:"+name);
        System.out.println("1.cofee  "+cofee_q+"    "+ cofee_total);
        System.out.println("1.Tea  "+tea_q+"    "+ tea_total);
        System.out.println("1.snak  "+snak_q+"    "+ snak_total);
        System.out.println();
        System.out.println("-------------------");


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<hotel> customer_list = new ArrayList<hotel>();


    }
}