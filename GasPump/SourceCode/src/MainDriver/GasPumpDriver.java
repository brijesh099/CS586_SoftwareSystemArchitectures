/**
 * 
 */
package MainDriver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import abstractFactoryPackage.abstractFactory1;
import abstractFactoryPackage.abstractFactory2;
import gasPump.GasPump1;
import gasPump.GasPump2;


/**
 * @author Brijesh Mavani
 *
 */
/* This is a main driver class for Gas Pump System.
 * 
 */
public class GasPumpDriver {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
 		System.out.println("*****************Welcome to Gas Pump System*****************");
		System.out.println("Please select the Gas Pump before proceeding further: ");
		System.out.println("1. For Gas Pump1");
		System.out.println("2. For Gas Pump2");
		System.out.println("q. For Quitting");
		char gptype = '0';
		char input = '1';
		try
		{
			gptype = (char) sc.next().charAt(0);
			switch(gptype) {
			case '1':{
				// Gas Pump 1 is selected
				System.out.println("Gas Pump 1 is selected!!!");
				abstractFactory1 af1 = new abstractFactory1();
				GasPump1 gp1 = new GasPump1(af1);
				System.out.println(
                        "#########################################################################"+
                        "\nSelect operation: " +
                        "\n(0) Activate(float a, float b) " +
                        "\n(1) Start " +
                        "\n(2) PayCredit " +
                        "\n(3) PayDebit(String p)"+
                        "\n(4) Pin (String p)"+                          
                        "\n(5) Approved " +
                        "\n(6) Reject" +
                        "\n(7) Regular " +
                        "\n(8) Diesel " +
                        "\n(9) Cancel " +
                        "\n(s) StartPump " +
                        "\n(p) PumpGallon " +
                        "\n(x) StopPump " +
                        "\n(f) FullTank" +
                        "\n(q) Quit the program " +
                        "\n#########################################################################\n\n");
				while(input!='q')
				{
					gp1.printOperations();
					input= (char) sc.next().charAt(0);
					switch(input) {
					case '0':{  // Activate
						System.out.println("Activating Gas Pump1!!!");
						float a,b;
						System.out.println("Enter the price for Parameter a(Regular Gas): ");
						try {
							//a=sc.nextFloat();	
							a=Float.parseFloat(br.readLine());
							System.out.println("Enter the price for Parameter b(Diesel Gas): ");
							//b=sc.nextFloat();
							b=Float.parseFloat(br.readLine());
							if(a>0 && b>0) {
								gp1.Activate(a, b);			
							}
							else {
								System.out.println("All the prices should be positive. Please recheck and enter again.");
					            System.out.println("Activation is failed for above reason!!!");
							}																			
						}
						catch(NumberFormatException nfe)
						{
							System.out.println("Prices should be of float type!!!");
							System.out.println("Please enter values in correct format.");
						}
						break;
					}
					case '1':{ // Start
                        System.out.println("Operation Start >");
                        gp1.Start();
                        break;
                    }
					case '2': { // PayCredit
                        System.out.println("Operation PayCredit >");
                        gp1.PayCredit();
                        break;
                    }
					case '3': { // PayDebit
                        System.out.println("Operation PayDebit >");
                        String p="1";
                        System.out.println("Enter the Debit card pin: ");
                        //p=sc.nextLine();
                        p=br.readLine();                        
                        if(p.length()>0)
                        {
                        	gp1.PayDebit(p);
                        }
                        else {
                        	System.out.println("Pin should have length greater than 0");
                        }                        
                        break;
                    }
					case '4': { // Pin
                        System.out.println("Operation Pin >");
                        String p1="1";
                        System.out.println("Enter the pin: ");
                        //p=sc.nextLine();              
                        p1=br.readLine();
                        if(p1.length()>0)
                        {                        	
                        	gp1.Pin(p1);
                        }
                        else {
                        	System.out.println("Pin should have length greater than 0");
                        }                          
                        break;
                    }
					case '5': { // Approved
                        System.out.println("Operation Approved >");
                        gp1.Approve();
                        break;
                    }
                    case '6': { // Reject
                        System.out.println("Operation Reject >");
                        gp1.Reject();
                        break;
                    }
                    case '7': { // Regular
                        System.out.println("Operation Regular >");
                        gp1.Regular();
                        break;
                    }
                    case '8': { // Diesel
                        System.out.println("Operation Diesel >");
                        gp1.Diesel();
                        break;
                    }
                    case '9': { // Cancel
                        System.out.println("Operation Cancel >");
                        gp1.Cancel();
                        break;
                    }
                    case 's': { // StartPump
                        System.out.println("Operation StartPump >");
                        gp1.StartPump();
                        break;
                    }
                    case 'p': { // PumpGallon
                        System.out.println("Operation PumpGallon >");
                        gp1.PumpGallon();
                        break;
                    }
                    case 'x': { // StopPump
                        System.out.println("Operation StopPump >");
                        gp1.StopPump();
                        break;
                    }
                    case 'f': { // FullTank
                        System.out.println("Operation FullTank >");
                        gp1.FullTank();
                        break;
                    }
                    case 'q': { // Quit
                    	System.out.println("Thank you for using Gas Pump System!!!");
        				System.out.println("*******Visit Again!!!*******");    	
        				sc.close();
        				System.exit(1);
                    }
                    default: {
                    	System.out.println("Invalid selection. Please select operation from provided list!!!");
                    }
					}
					
				}
			}
			case '2':{
				// Gas Pump 2 is selected
				System.out.println("Gas Pump 2 is selected!!!");
				abstractFactory2 af2 = new abstractFactory2();
				GasPump2 gp2 = new GasPump2(af2);
				System.out.println(
                        "\n\n#########################################################################"+
                        "\nSelect operation: " +
                        "\n(0) Activate(float a, float b, float c)" +
                        "\n(1) PayCash(int c) " +
                        "\n(2) PayCredit " +
                        "\n(3) Approved " +
                        "\n(4) Reject " +                    
                        "\n(5) Cancel " +
                        "\n(6) Premium " +
                        "\n(7) Regular " +
                        "\n(8) Super " +
                        "\n(s) StartPump " +
                        "\n(p) PumpLiter " +
                        "\n(x) Stop " +                        
                        "\n(r) Receipt " +
                        "\n(n) NoReceipt " +
                        "\n(q) Quit the program " +
                        "\n#########################################################################\n\n");
				while(input!='q')
				{
					gp2.printOperations();
					input= (char) sc.next().charAt(0);
					switch(input) {
					case '0':{  // Activate
						System.out.println("Activating Gas Pump2!!!");
						float a,b,c;
						System.out.println("Enter the price for Parameter a(Super Gas): ");
						try {
							//a=sc.nextFloat();
							a=Float.parseFloat(br.readLine());
							System.out.println("Enter the price for Parameter b(Regular Gas): ");
							//b=sc.nextFloat();
							b=Float.parseFloat(br.readLine());
							System.out.println("Enter the price for Parameter b(Premium Gas): ");
							//c=sc.nextFloat();
							c=Float.parseFloat(br.readLine());
							if(a>0 && b>0 && c>0) {
								gp2.Activate(a, b, c);			
							}
							else {
								System.out.println("All the prices should be positive. Please recheck and enter again.");
					            System.out.println("Activation is failed for above reason!!!");
							}																				
						}
						catch(NumberFormatException nfe)
						{
							System.out.println("Prices should be of float type!!!");
							System.out.println("Please enter values in correct format.");
						}
						break;
					}
					case '1':{ // PayCash
                        System.out.println("Operation PayCash >");
						float cash;
						System.out.println("Enter the cash amount: ");
						cash=sc.nextFloat();
						if(cash>0)
						{
							gp2.PayCash(cash);
						}
						else {
							System.out.println("Cash amount should be greater than 0!!!");
						}
                        break;
                    }
					case '2': { // PayCredit
                        System.out.println("Operation PayCredit >");
                        gp2.PayCredit();
                        break;
                    }
					
					case '3': { // Approved
                        System.out.println("Operation Approved >");
                        gp2.Approve();
                        break;
                    }
                    case '4': { // Reject
                        System.out.println("Operation Reject >");
                        gp2.Reject();
                        break;
                    }
                    case '5': { // Cancel
                        System.out.println("Operation Cancel >");
                        gp2.Cancel();
                        break;
                    }
					case '6': { // Premium
                        System.out.println("Operation Premium >");
                        gp2.Premium();
                        break;
                    }
					case '7': { // Regular
                        System.out.println("Operation Regular >");
                        gp2.Regular();
                        break;
                    }
                    case '8': { // Super
                        System.out.println("Operation Super >");
                        gp2.Super();
                        break;
                    }
                    
                    case 's': { // StartPump
                        System.out.println("Operation StartPump >");
                        gp2.StartPump();
                        break;
                    }
                    case 'p': { // PumpLiter
                        System.out.println("Operation PumpLiter >");
                        gp2.PumpLiter();
                        break;
                    }
                    case 'x': { // Stop
                        System.out.println("Operation Stop >");
                        gp2.Stop();
                        break;
                    }
                    case 'r': { // Receipt
                        System.out.println("Operation Receipt >");
                        gp2.Receipt();
                        break;
                    }
					case 'n': { // NoReceipt
                        System.out.println("Operation NoReceipt >");
                        gp2.NoReceipt();
                        break;
                    }
                    case 'q': { // Quit
                    	System.out.println("Thank you for using Gas Pump System!!!");
        				System.out.println("*******Visit Again!!!*******");    	
        				sc.close();
        				System.exit(1);
                    }
                    default: {
                    	System.out.println("Invalid selection. Please select operation from provided list!!!");
                    }
					}
					
				}
			}
			case 'q':{
				// Quit
				System.out.println("Thank you for using Gas Pump System!!!");
				System.out.println("*******Visit Again!!!*******");
				sc.close();
				break;
			}
			default: {
                System.out.println("Invalid selection. System is now terminating!!!");
                System.exit(1);
                sc.close();
                break;
            }
			}
			
		}
		catch(IOException ioe) {
			System.out.println("An IO Exception has occured. System is now terminating!!!");
            System.exit(1);
		}
		
		catch (Exception e) {
            System.out.println("An Exception has occured. System is now terminating!!!");
            System.exit(1);
        }
		
	}

}
