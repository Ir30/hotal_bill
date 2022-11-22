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

        while(true){
           
            System.out.println("1.order\n2.generate bill\n3.display bill\n4.Exit");
    
            int choice=sc.nextInt();

            switch(choice){
                case 1:{
                    System.out.println("Name: ");
                    String name=sc.next();
                    System.out.println("phone: ");
                    long phone = sc.nextLong();

                    hotel h = new hotel(name,phone);
                    customer_list.add(h);

                    // System.out.println(h.name+"-"+h.phone);

                    
                    boolean status = true;

                    while(status){
                        System.out.println("1.Tea\n2.Snaks\n3.cofee\n4.exit");
                        int op = sc.nextInt();
                        switch(op){
                            case 1:{
                                System.out.println("enter quantity: ");
                                int tea_q = sc.nextInt();
                                h.tea_q = tea_q;
                                // System.out.println("tee q -"+h.tea_q);
                                break;
                            }
                            case 2:{

                                System.out.println("enter quantity: ");
                                int s_quant = sc.nextInt();
                                h.snak_q=s_quant;
                                // System.out.println("snak q-"+h.snak_q);

                                break;

                            }
                            case 3:{

                                System.out.println("enter quantity: ");
                                int quant = sc.nextInt();
                                h.cofee_q=quant;
                                // System.out.println("cofee q-"+h.cofee_q);

                                break;

                            }
                            case 4:{
                                status = false;
                                break;

                            }
                            default:{
                                System.out.println("invalid....");

                            }
                        }
                    }
                    break;
    
                }

                case 2:{
                    System.out.println("enter Phone no: ");
                    long ph_n = sc.nextLong();
                   for(hotel i:customer_list){
                        if(i.phone == ph_n){

                            // System.out.println("generate bill inside case2");

                            i.generate_bill();
                        }
                   }
                    
                break;

                }

            }

        }
    }

}