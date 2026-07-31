 import java.util.*;

public class PrimusHotel // Declare class name
{ // Programs on a hotel user friendly self-booking system

    public static void main(String args[])
    {
        int Night, RoomType, ExtraBed, SwimmingPool, breakFast, SmokingRoom, confirm; // Declare Variable
        double NightPrice=0, RoomPrice=0, BedPrice=0, PoolPrice=0, price=0, fee=0, total=0, totalnight=0;
        String name, email;
        
        name = GetInfo(); //method for info
        
        Night = GetNight(); // method for nights
        
        RoomType = GetTheme(); //method for theme
        
        ExtraBed = GetBed(); //method for bed
        
        System.out.println("\n1: Yes || 2: No"); 
        System.out.println("Insert the code given for the following package" + "\n"); //Display message 
        
        SwimmingPool = GetSwimmingPool(); //method for swimming pool
        
        breakFast = GetBreakfast(); //method for breakfast
        
        SmokingRoom = GetSmokingRoom(); //method for smoking room
        
        confirm = Confirm(RoomPrice,RoomType,ExtraBed,BedPrice,price,PoolPrice,fee,total,SwimmingPool,breakFast,SmokingRoom,totalnight,Night);//method for confirmation

        DisplayConfirm(confirm); //method for display
    }
    
    /* System display greeting messages
       enter your name
       enter your email */
       
    static String GetInfo() {
        
        String name, email; //variables for method info
        
        Scanner ff = new Scanner(System.in);
        
        System.out.println("Welcome to Primus Genting!\nLet us give you the best experience here!");
        
        System.out.print("\nEnter your name (Mr/Mrs/Miss/Ms): "); 
        name = ff.nextLine();
         System.out.print("Enter your email: ");
        email = ff.nextLine();
        
        return name;
    }
    
     /* System display option for types of room themes and its price
       enter 1, 2, 3, 4, or 5
       System display results for room themes */
       
    static int GetNight()
    {
        int Night;
        
        System.out.println("\nNights");
        
        do {
        System.out.println("\nRM250.00 Per Night");
        
        Scanner aa = new Scanner (System.in);
        
        System.out.print("Enter how many night(s): ");
        Night = aa.nextInt();
        } while (Night == 0); // 
        
        return Night;
    
    }
    
    static int GetTheme()
    {
        int RoomType=0;
        
        System.out.println("\nRoom Theme");
        
        ArrayList<String> theme=new ArrayList<String>(); //array list for room themes and its price
        
        theme.add("");
        theme.add("1- Viking (RM650.00) ");
        theme.add("2- Disney (RM750.00) ");
        theme.add("3- Avengers (RM750.00) ");
        theme.add("4- Hallyu (RM800.00) ");
        theme.add("5- Standard (RM500.00)");
        for (String t : theme)
        System.out.println(t);
    
        do{
        System.out.print ("\nEnter code for room theme: ");
        Scanner th = new Scanner(System.in);
        RoomType = th.nextInt();
        } while (RoomType != 1 && RoomType != 2 && RoomType != 3 && RoomType != 4 && RoomType != 5);
        
       System.out.println("RoomTheme: "+theme.get(RoomType)); 
       
       return RoomType;
    }
    
     /* System display option for extra bed and its price
        enter 1, 2, or 3
        System display results for extra bed option */
    
    static int GetBed()
    {
        int ExtraBed=0; //variable for method bed
        
        System.out.println("\nBeds\n");
    
        ArrayList<String> beds=new ArrayList<String>(); //array list for extra beds and its price
        
        beds.add("0 bed (RM0.00)");
        beds.add("1 bed (RM40.00)"); 
        beds.add("2 beds (RM70.00)"); 
        beds.add("3 beds (RM120.00)");
        for (String b : beds)
        System.out.println(b);
        
         do{
        System.out.print("\nInsert extra number of beds: ");
        Scanner bd = new Scanner (System.in);
        ExtraBed = bd.nextInt();
        } while (ExtraBed != 1 && ExtraBed != 2 && ExtraBed != 3 && ExtraBed !=0);
        
        System.out.println("Extra Bed : " + beds.get(ExtraBed));
    
        return ExtraBed;
    }
    
    /* System display option for swimming pool and its price
       enter 1 or 0
       System display results for swimming pool */
       
    static int GetSwimmingPool()
    {
        int SwimmingPool=0; //variable for method swimming pool
        
        System.out.println("\nSwimming Pool");
        
        System.out.println("\nSwimming Pool (RM100.00)");
        
        Scanner xx = new Scanner (System.in);
        
         while (SwimmingPool != 1 && SwimmingPool != 2) //Do While loop for method swimming pool
         {
        System.out.print("Swimming Pool: ");
        SwimmingPool = xx.nextInt();
        
        if (SwimmingPool == 2)
        System.out.println("- No Swimming Pool");
        
        else if (SwimmingPool == 1)
        System.out.println("- Have Swimming Pool");
        
        else
        System.out.println("Error! Please insert correct code");
         }
        
        return SwimmingPool;
    }
    
    /* System display option for breakfast and its price
       enter 1 or 2
       System display results for breakfast */
       
    static int GetBreakfast()
    {
        int breakFast=0;
        
        System.out.println("\nBreakfast (free)");
                
        Scanner cc = new Scanner (System.in);
        
        while (breakFast != 1 && breakFast != 2) //Do While loop for method breakfast
        {
        System.out.print("\nBreakfast: ");
        breakFast = cc.nextInt();
        
        if (breakFast == 2){
        System.out.println("- No Breakfast");}
        
        else if (breakFast == 1){
        System.out.println("- Have Breakfast");}
        
        else{
        System.out.println("Error! Please insert correct code");}
        }
        
        return breakFast;
    }
    
    /* System display option for smoking room and its price
       enter 1 or 2
       System display results for smoking room */
       
    static int GetSmokingRoom()
    {
        int SmokingRoom=0; //variable for method smoking room
        
        System.out.println("\nSmoking Room");
        
        System.out.println("\nSmoking Room usage (RM80.00)");
        
        Scanner cc = new Scanner (System.in);
        
        while (SmokingRoom != 1 && SmokingRoom != 2) //Do While loop for method smoking room starts
        {
        System.out.print("Use Smoking Room?: ");
        SmokingRoom = cc.nextInt();
        
        if (SmokingRoom == 2){
        System.out.println("- No Smoking Room ");}
        
        else if (SmokingRoom == 1){
        System.out.println("- Have Smoking Room");}
                
        else{
        System.out.println("Error! Please insert correct code");}
        }
        
        System.out.println("\n");
        
        return SmokingRoom;
    }
    
    // System display back all the results entered
    
    static int Confirm (double RoomPrice, int RoomType, int ExtraBed, double BedPrice, double price, double PoolPrice, double fee, double total,
    int SwimmingPool, int breakFast, int SmokingRoom, double totalnight, int Night)
    {
        int confirm; //variable for method confirm
        
        Scanner dd = new Scanner (System.in);
        
        System.out.println("PRIMUS HOTEL BOOKING CONFIRMATION\n");
        
        totalnight = 250*Night; //total for per night
        String aa = String.format("%.2f", totalnight);
        System.out.println("Night(s):"+Night+"\t\t\t\t\t" + "RM" + aa);

        
        switch (RoomType){ // Switch starts for result entered in method theme
            case 1: System.out.print("Room Theme: Viking");
                    RoomPrice = 650.00;
                    break;
            case 2: System.out.print("Room Theme: Disney");
                    RoomPrice = 750.00;
                    break;
            case 3: System.out.print("Room Theme: Avengers");
                    RoomPrice = 750.00;
                    break;
            case 4: System.out.print("Room Theme: Hallyu");
                    RoomPrice = 800.00;
                    break;
            case 5: System.out.print("Room Theme: Standard");
                    RoomPrice = 500.00;
                    break;
            default: System.out.print("Invalid"); // If results received in not (1<=5)
                    RoomPrice = 00.00;
        }

	    String a = String.format("%.2f", RoomPrice); //Price displays in 2 decimal places
        System.out.println(RoomType + "\t\t\t" + "RM" + a);
        
        if (ExtraBed == 1) { //Selection starts for result entered in method bed
        BedPrice = 40.00; }
        else if (ExtraBed == 2) {
        BedPrice = 70.00; }
        else if (ExtraBed == 3) {
        BedPrice = 120.00; }
        else if (ExtraBed == 0) {
        BedPrice = 0.00; }
        else {
        System.out.println("- Does not compute"); // If results received is not (0<=3)
        }
        String b = String.format("%.2f", BedPrice); // Price displays in 2 decimal places
        System.out.println("Beds: " + ExtraBed + "\t\t\t\t\t\t" + "RM" + b);
        
        if (SwimmingPool == 1) { //Selection starts for method swimming pool
        PoolPrice = 100.00;
        String c = String.format("%.2f", PoolPrice); //Price display in 2 decimal places
        System.out.println("Swimming pool: Yes" + "\t\t\t" + "RM" + c); }
        else if (SwimmingPool == 2){
        PoolPrice = 0.00; 
        String d = String.format("%.2f", PoolPrice); //Price displays in 2 decimal places
        System.out.println("Swimming pool: No" + "\t\t\t" + "RM" + d); }
        else {
        System.out.println("Does not compute"); //If result received is not (0<=1)
        }
        
        if (breakFast == 1) { // Selection starts for result entered in method breakfast
        price = 0.00;
        String e = String.format("%.2f", price); //Price displays in 2 decimal places
        System.out.println("Breakfast: Yes" + "\t\t\t\t" + "RM" + e); }
        else if (breakFast == 2) {
        price = 0.00;
        String f = String.format("%.2f", price); //Price displays in 2 decimal places
                System.out.println("Breakfast: No" + "\t\t\t\t" + "RM" + f); }
        else {
        System.out.println("Does not compute"); //If result received is not (0<=1)
        }
        
        if (SmokingRoom == 1) { //Selection starts for method smoking room
        fee = 80.00;
        String g = String.format("%.2f", fee); //Price displays in 2 decimal places
        System.out.println("Smoking Room: Yes" + "\t\t\t" + "RM" + g); }
        else if (SmokingRoom == 2) {
        fee = 0.00;
        String h = String.format("%.2f", fee); //Price displays in 2 decimal places
        System.out.println("Smoking Room: No" + "\t\t\t" + "RM" + h); }
        else {
        System.out.println("Does not compute"); //If result received is not (0<=1)
        }
        
        total = RoomPrice + BedPrice + PoolPrice + price + fee + totalnight; // sum of all the results received
        String i = String.format("%.2f", total); //Total price displays in 2 decimal places
        System.out.print("\nTotal: RM " + i);
    
        do{
        System.out.print("\n\nProceed with room booking? : ");
        confirm = dd.nextInt();
        } while (confirm!= 1 && confirm != 2);
       
        
        return confirm;
    }
    
    // System display messages
    
    static void DisplayConfirm(int confirm) {
        
        
        
        switch(confirm) { //Switch starts for method confirm
            case 1 : System.out.println("\nThank you! We will contact you later!");
                     break;
            case 2: System.out.println("\nPlease fill in your requirements again");
                     break;
          
        }
    }
}