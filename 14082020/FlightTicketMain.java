import java.util.Scanner;
class FlightTicket {
    int r=5,c=16;
    String seats[][],pass_name;
    int row_pass,col_pass;
    Scanner sc=new Scanner(System.in);
    FlightTicket(int r,int c)
    {
        seats=new String[5][16];
    }

    void display_seats()
    {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(seats[i][j] + " ");
                
            }
            System.out.println();
            
        }
        System.out.println();
    }
    
    void Ticket_reservation(String passanger_name,int row_passanger,int col_passanger)
    {
        this.pass_name=passanger_name;
        this.row_pass=row_passanger;
        this.col_pass=col_passanger;
        // System.out.println("Enter your name");
        // passanger_name=sc.nextLine();
        // System.out.println("Enter the position you want");
        // row_passanger=sc.nextInt();
        // col_passanger=sc.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                seats[row_passanger][col_passanger]=passanger_name;
                
            }
            
        }
        // System.out.println("Your seat has been sucessfully reserved");
        System.out.println();

    }

    void Ticket_cancel(String passanger_cancel)
    {
        this.pass_name=passanger_cancel;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(seats[i][j]==passanger_cancel)
                {
                    seats[i][j]=null;
                }
                
            }
            
        }
    }
class FlightTicketMain {
    public static void main(String[] args) {
        int r_pos,c_pos,choice;
        String passanger_name;
        Scanner sc=new Scanner(System.in);
        FlightTicket fticket=new FlightTicket(5,16);
        
        // fticket.display_seats();
        // fticket.Ticket_reservation(passanger_name, r_pos, c_pos);
        // fticket.display_seats();
        // fticket.Ticket_cancel(passanger_name);
        // fticket.display_seats();
        while(true)
        {
            System.out.println("1 for Ticket Reservation\n2 for Ticket Cancelation\n3 for display\n4 for exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                System.out.println("Enter your name");
                sc.nextLine();
                passanger_name=sc.nextLine();
                System.out.println("Enter the position you want");
                r_pos=sc.nextInt();
                c_pos=sc.nextInt();
                fticket.Ticket_reservation(passanger_name, r_pos, c_pos);
                System.out.println("Your ticket has been sucessfully booked");
                    break;
                
                case 2:
                    System.out.println("Enter your name to cancel the ticket");
                    passanger_name=sc.nextLine();
                    sc.nextLine();
                    fticket.Ticket_cancel(passanger_name);
                    System.out.println("Your ticket is sucessfully cancled");
                    break;
                case 3:
                    fticket.display_seats();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    }
    
}