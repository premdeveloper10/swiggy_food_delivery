package Applications;
import java.util.*;

public class Swiggy {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args)throws Exception{
		
	
	System.out.println("*****WELCOME TO YOUR SIVA'S ONLINE  FOOD COURT*****");
	System.out.println("*****\"we have veg & non veg well higenic hotels\"******\n");
	System.out.println("choose your choices...\n 1.veg \n 2.nonveg");
	int num=s.nextInt();
	if (num==1)
	{
         
	     System.out.println("THANK YOU FOR CHOOSING VEGETARIAN HOTEL");
	      System.out.println("OUR VEG HOTELS:\n");
	     System.out.println("\"1.A2B RESTAURANT\"\n\"2.HOTEL SARAVANA BHAVAN\"\n\"3.VEG PIZZA HUT\"\n\"4.KRISHNA VILAAS\"\n\"5.KHADI VEG RESTAURANT\"");
		
	
		 System.out.println("SELECT YOUR LOVABLE HOTEL");
		 int veg_hotel=s.nextInt();
		 switch (veg_hotel)
		 {// details of veg hotels 1......>
		 case 1:{System.out.println("thank you for choosing\"A2B RESTAURANT\"");
		        System.out.println("OUR DISHES...*");
		        System.out.println("1.DOSA-Rs.10\n2.IDLY-Rs.5\n3.POORI-Rs.10\n4.PONGAL-Rs.15\n5.CHAPPATHI-Rs.10\n");
		        System.out.println("SELECT YOUR  FAVOURITE FOOD");}
				int dish=s.nextInt();
		       switch(dish)
		       {
		       case 1:{ System.out.println("YOUR SELECTED DISH IS \"DOSA\"\n");
					 System.out.println("SELECT YOUR QUANTITY");
				     int quantity=s.nextInt();
					 System.out.println("your amount is:"+quantity*10);
					 System.out.println("******\"A2B RESTAURANT\"******");
					 System.out.println("1.FOOD: DOSA");
					 System.out.println("2.QUANTITY:"+quantity);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantity*10);
					 System.out.println("<...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........>");
                     break;				  
			   }
					 
		     case 2:{System.out.println("YOUR SELECTED DISH IS \"IDLY\"");
				     System.out.println("SELECT YOUR QUANTITY");
				     int quantitya=s.nextInt();
					  System.out.println("******\"A2B RESTAURANT\"******");
					  System.out.println("1.FOOD: IDLY");
					 System.out.println("2.QUANTITY:"+quantitya);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantitya*5);
					 
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			         break;	}			 
		     case 3:{System.out.println("YOUR SELECTED DISH IS \"POORI\"");
			         System.out.println("SELECT YOUR QUANTITY");
				     int quantityb=s.nextInt();
					  System.out.println("******\"A2B RESTAURANT\"******");
					  System.out.println("1.FOOD: \"POORI\"");
					 System.out.println("2.QUANTITY:"+quantityb);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityb*10);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			 	
			          break;}
             case 4:{System.out.println("YOUR SELECTED DISH IS \"PONGAL\"");
				     System.out.println("SELECT YOUR QUANTITY");
				     int quantityc=s.nextInt();
					  System.out.println("******\"A2B RESTAURANT\"******");
					  System.out.println("1.FOOD: \"PONGAL\"");
					 System.out.println("2.QUANTITY:"+quantityc);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityc*15);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			 
					 break;}
			case 5:{System.out.println("YOUR SELECTED DISH IS \"CHAPPATHI\"");
			       System.out.println("SELECT YOUR QUANTITY");
				    int quantityd=s.nextInt();
					 System.out.println("******\"A2B RESTAURANT\"******");
					  System.out.println("1.FOOD: \"CHAPPATHI\"");
					 System.out.println("2.QUANTITY:"+quantityd);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityd*10);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
					 break;}
			        
	             } break;
		 //details of veg hotel 2 "SARAVANA BHAVAN...........>
		 case 2:{System.out.println("thank you for choosing\"HOTEL SARAVANA BHAVAN\"");
		        System.out.println("OUR DISHES...*");
		        System.out.println("1.SAMBAR-Rs.30\n2.CURD RICE-Rs.30\n3.LEMON RICE-Rs.30\n4.TOMATO RICE-Rs.30\n5.VEG BIRIYANI-Rs.40\n");
		        System.out.println("SELECT YOUR  FAVOURITE FOOD");}
				int dish_a=s.nextInt();
		       switch(dish_a)
		       {
		       case 1:{ System.out.println("YOUR SELECTED DISH IS \"SAMBAR\"\n");
					 System.out.println("SELECT YOUR QUANTITY");
				     int quantitye=s.nextInt();
					 System.out.println("your amount is:"+quantitye*10);
					 System.out.println("******\"SARAVANA BHAVAN\"******");
					 System.out.println("1.FOOD: SAMBAR");
					 System.out.println("2.QUANTITY:"+quantitye);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantitye*30);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			   
					 break;} 
		     case 2:{System.out.println("YOUR SELECTED DISH IS \"CURD RICE\"");
				     System.out.println("SELECT YOUR QUANTITY");
				     int quantityf=s.nextInt();
					  System.out.println("******\"SARAVANA BHAVAN\"******");
					  System.out.println("1.FOOD: CURD RICE");
					 System.out.println("2.QUANTITY:"+quantityf);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityf*30);
					 
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			  
                      break;}				 
		     case 3:{System.out.println("YOUR SELECTED DISH IS \"LEMON RICE\"");
			         System.out.println("SELECT YOUR QUANTITY");
				     int quantityg=s.nextInt();
					  System.out.println("******\"SARAVANA BHAVAN\"******");
					  System.out.println("1.FOOD: LEMON RICE");
					 System.out.println("2.QUANTITY:"+quantityg);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityg*30);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			 	
			          break;}
             case 4:{System.out.println("YOUR SELECTED DISH IS \"TOMATO RICE\"");
				     System.out.println("SELECT YOUR QUANTITY");
				     int quantityh=s.nextInt();
					  System.out.println("******\"SARAVANA BHAVAN\"******");
					  System.out.println("1.FOOD: TOMATO RICE");
					 System.out.println("2.QUANTITY:"+quantityh);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityh*30);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			 
					 break;}
			case 5:{System.out.println("YOUR SELECTED DISH IS \"VEG BIRIYANI\"");
			       System.out.println("SELECT YOUR QUANTITY");
				    int quantityi=s.nextInt();
					 System.out.println("******\"SARAVANA BHAVAN\"******");
					  System.out.println("1.FOOD: VEG BIRIYANI");
					 System.out.println("2.QUANTITY:"+quantityi);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityi*40);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
					 break;
			        }
	             }  break;
		 // details of veg hotel 3...........>
		 case 3:{System.out.println("thank you for choosing\"VEG PIZZA HUT\"");
		        System.out.println("OUR DISHES...*");
		        System.out.println("1.VEG PIZZA-Rs.50\n2.JAIN PIZZA-Rs.50\n3.CHEES ONION GARLIC-Rs.50\n4.PANNER PIZZA-Rs.100\n5.MUSHROOM PIZZA-Rs.110\n");
		        System.out.println("SELECT YOUR  FAVOURITE FOOD");}
				int dish_b=s.nextInt();
		       switch(dish_b)
		       {
		       case 1:{ System.out.println("YOUR SELECTED DISH IS \"VEG PIZZA\"\n");
					 System.out.println("SELECT YOUR QUANTITY");
				     int quantityj=s.nextInt();
					 System.out.println("******\"VEG PIZZA HUT\"******");
					 System.out.println("1.FOOD: VEG PIZZA");
					 System.out.println("2.QUANTITY:"+quantityj);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityj*50);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			   
					 break; }
		     case 2:{System.out.println("YOUR SELECTED DISH IS \"JAIN PIZZA\"");
				     System.out.println("SELECT YOUR QUANTITY");
				     int quantityk=s.nextInt();
					  System.out.println("******\"VEG PIZZA HUT\"******");
					  System.out.println("1.FOOD: JAIN PIZZA");
					 System.out.println("2.QUANTITY:"+quantityk);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityk*50);
					 
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			  
                      break;}				 
		     case 3:{System.out.println("YOUR SELECTED DISH IS \"CHEES ONION GARLIC\"");
			         System.out.println("SELECT YOUR QUANTITY");
				     int quantityl=s.nextInt();
					  System.out.println("******\"VEG PIZZA HUT\"******");
					  System.out.println("1.FOOD: CHEES ONION GARLIC");
					 System.out.println("2.QUANTITY:"+quantityl);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityl*50);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			 	
			          break;}
             case 4:{System.out.println("YOUR SELECTED DISH IS \"PANNER PIZZA\"");
				     System.out.println("SELECT YOUR QUANTITY");
				     int quantitym=s.nextInt();
					  System.out.println("******\"VEG PIZZA HUT\"******");
					  System.out.println("1.FOOD: PANNER PIZZA");
					 System.out.println("2.QUANTITY:"+quantitym);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantitym*100);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			 
					 break;}
			case 5:{System.out.println("YOUR SELECTED DISH IS \"MUSHROOM PIZZA\"");
			       System.out.println("SELECT YOUR QUANTITY");
				    int quantityn=s.nextInt();
					 System.out.println("******\"VEG PIZZA HUT\"******");
					  System.out.println("1.FOOD:MUSHROOM PIZZA ");
					 System.out.println("2.QUANTITY:"+quantityn);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityn*110);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
					 break;
			        }
	             }break;
		 // details of veg hotel 4..............>
		 case 4:{System.out.println("thank you for choosing\"KRISHNA VILAAS\"");
		        System.out.println("OUR DISHES...*");
		        System.out.println("1.DOSA-Rs.10\n2.IDLY-Rs.5\n3.POORI-Rs.10\n4.PONGAL-Rs.15\n5.CHAPPATHI-Rs.10\n");
		        System.out.println("SELECT YOUR  FAVOURITE FOOD");}
				int dish_c=s.nextInt();
		       switch(dish_c)
		       {
		       case 1:{ System.out.println("YOUR SELECTED DISH IS \"DOSA\"\n");
					 System.out.println("SELECT YOUR QUANTITY");
				     int quantityo=s.nextInt();
					 System.out.println("your amount is:"+quantityo*10);
					 System.out.println("******\"KRISHNA VILAAS\"******");
					 System.out.println("1.FOOD: DOSA");
					 System.out.println("2.QUANTITY:"+quantityo);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityo*10);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			   
					 break; }
		     case 2:{System.out.println("YOUR SELECTED DISH IS \"IDLY\"");
				     System.out.println("SELECT YOUR QUANTITY");
				     int quantityp=s.nextInt();
					  System.out.println("******\"KRISHNA VILAAS\"******");
					  System.out.println("1.FOOD: IDLY\n");
					 System.out.println("2.QUANTITY:"+quantityp);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityp*10);
					 
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			  
                      break;}				 
		     case 3:{System.out.println("YOUR SELECTED DISH IS \"POORI\"");
			         System.out.println("SELECT YOUR QUANTITY");
				     int quantityq=s.nextInt();
					  System.out.println("******\"KRISHNA VILAAS\"******");
					  System.out.println("1.FOOD: POORI");
					 System.out.println("2.QUANTITY:"+quantityq);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityq*10);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			 	
			          break;}
             case 4:{System.out.println("YOUR SELECTED DISH IS \"PONGAL\"");
				     System.out.println("SELECT YOUR QUANTITY");
				     int quantityr=s.nextInt();
					  System.out.println("******\"KRISHNA VILAAS\"******");
					  System.out.println("1.FOOD: PONGAL");
					 System.out.println("2.QUANTITY:"+quantityr);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityr*10);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			 
					 break;}
			case 5:{System.out.println("YOUR SELECTED DISH IS \"CHAPPATHI\"");
			       System.out.println("SELECT YOUR QUANTITY");
				    int quantitys=s.nextInt();
					 System.out.println("******\"KRISHNA VILAAS\"******");
					  System.out.println("1.FOOD: CHAPPATHI");
					 System.out.println("2.QUANTITY:"+quantitys);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantitys*10);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
					 break;
			        }
	             }break;
		 //details of veg hotel 5........>
		 case 5:{System.out.println("thank you for choosing\"KHADI VEG RESTAURANT\"");
		        System.out.println("OUR DISHES...*");
		        System.out.println("1.MAHARASTRIAN DHALI-Rs.120\n2.RAJASTHANI THALI-Rs.125\n3.PUNJABI THALI-Rs.210\n4.VEG SOUP-Rs.115\n5.VEG RICE COMBO-Rs.300\n");
		        System.out.println("SELECT YOUR  FAVOURITE FOOD");}
				int dish_d=s.nextInt();
		       switch(dish_d)
		       {
		       case 1:{ System.out.println("YOUR SELECTED DISH IS \"MAHARASTRIAN DHALI\"\n");
					 System.out.println("SELECT YOUR QUANTITY");
				     int quantityt=s.nextInt();
					 System.out.println("******\"KHADI VEG RESTAURANT\"******");
					 System.out.println("1.FOOD: MAHARASTRIAN DHALI");
					 System.out.println("2.QUANTITY:"+quantityt);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityt*120);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			   
					 break; }
		     case 2:{System.out.println("YOUR SELECTED DISH IS \".RAJASTHANI THALI\"");
				     System.out.println("SELECT YOUR QUANTITY");
				     int quantityu=s.nextInt();
					  System.out.println("******\"KHADI VEG RESTAURANT\"******");
					  System.out.println("1.FOOD:.RAJASTHANI THALI");
					 System.out.println("2.QUANTITY:"+quantityu);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityu*125);
					 
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			  
                      break;}				 
		     case 3:{System.out.println("YOUR SELECTED DISH IS \"PUNJABI THALI\"");
			         System.out.println("SELECT YOUR QUANTITY");
				     int quantityv=s.nextInt();
					  System.out.println("******\"KHADI VEG RESTAURANT\"******");
					  System.out.println("1.FOOD: PUNJABI THALI");
					 System.out.println("2.QUANTITY:"+quantityv);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityv*210);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
                     break;			 
			 }	
             case 4:{System.out.println("YOUR SELECTED DISH IS \"VEG SOUP\"");
				     System.out.println("SELECT YOUR QUANTITY");
				     int quantityw=s.nextInt();
					  System.out.println("******\"KHADI VEG RESTAURANT\"******");
					  System.out.println("1.FOOD: VEG SOUP");
					 System.out.println("2.QUANTITY:"+quantityw);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityw*115);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
					 break;}
			case 5:{System.out.println("YOUR SELECTED DISH IS \"VEG COMBO RICE\"");
			       System.out.println("SELECT YOUR QUANTITY");
				    int quantityx=s.nextInt();
					 System.out.println("******\"KHADI VEG RESTAURANT\"******");
					  System.out.println("1.FOOD: VEG COMBO RICE");
					 System.out.println("2.QUANTITY:"+quantityx);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityx*300);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
					 break;
			        }
			   }
		 }
}
                else if(num==2)
	             
	{
					 System.out.println("THANK YOU FOR CHOOSING NON-VEGETARIAN HOTEL");
	                  System.out.println("OUR NON-VEG HOTELS:\n");
	                  System.out.println("1.CHETTINAD CHICKEN\n2.BUHARI\n3.AAMBUR BIRIYANI\n4.CURRY KINGDOM\n5.NON-VEG PALACE");
		 
                
		 //<.............NON VEG HOTELS...........>

		 int nonveg_hotel=s.nextInt();
		 switch (nonveg_hotel)
		 {// details of non-veg hotels 1......>
		 case 1:{System.out.println("thank you for choosing\"CHETTINAD CHICKEN\"");
		        System.out.println("OUR DISHES...*");
		        System.out.println("1.CHICKEN BIRIYANI-Rs.110\n2.CHICKEN THANTHOORI-Rs.125\n3.CHICKEN CUBAAB-Rs.110\n4.CHICKEN LOLIPOP-Rs.50\n5.CHICKEN MANJOORIYAN-Rs.110\n");
		        System.out.println("SELECT YOUR  FAVOURITE FOOD");}
				int dish_e=s.nextInt();
		       switch(dish_e)
		       {
		       case 1:{ System.out.println("YOUR SELECTED DISH IS \"CHICKEN BIRIYANI\"\n");
					 System.out.println("SELECT YOUR QUANTITY");
				     int quantityy=s.nextInt();
					 System.out.println("******\"CHETTINAD CHICKEN\"******");
					 System.out.println("1.FOOD: CHICKEN BIRIYANI");
					 System.out.println("2.QUANTITY:"+quantityy);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityy*110);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			   
					 break; }
		     case 2:{System.out.println("YOUR SELECTED DISH IS \"CHICKEN THANTHOORI\"");
				     System.out.println("SELECT YOUR QUANTITY");
				     int quantityz=s.nextInt();
					  System.out.println("******\"CHETTINAD CHICKEN\"******");
					  System.out.println("1.FOOD: CHICKEN THANTHOORI");
					 System.out.println("2.QUANTITY:"+quantityz);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityz*125);
					 
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			  
                      break;}				 
		     case 3:{System.out.println("YOUR SELECTED DISH IS \"CHICKEN CUBABB\"");
			         System.out.println("SELECT YOUR QUANTITY");
				     int quantityA=s.nextInt();
					  System.out.println("******\"CHETTINAD CHICKEN\"******");
					  System.out.println("1.FOOD: CHICKEN CUBAAB");
					 System.out.println("2.QUANTITY:"+quantityA);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityA*110);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			 }	
			          break;
             case 4:{System.out.println("YOUR SELECTED DISH IS \"CHICKEN LOLIPOP\"");
				     System.out.println("SELECT YOUR QUANTITY");
				     int quantityB=s.nextInt();
					  System.out.println("******\"CHETTINAD CHICKEN\"******");
					  System.out.println("1.FOOD: CHICKEN LOLIPOP");
					 System.out.println("2.QUANTITY:"+quantityB);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityB*50);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			 
					 break;}
			case 5:{System.out.println("YOUR SELECTED DISH IS \"CHICKEN MANJOORIYAN\"");
			       System.out.println("SELECT YOUR QUANTITY");
				    int quantityC=s.nextInt();
					 System.out.println("******\"CHETTINAD CHICKEN\"******");
					  System.out.println("1.FOOD: CHICKEN MANJOORIYAN");
					 System.out.println("2.QUANTITY:"+quantityC);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityC*110);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
					 break;
			        }
	             }break;
		 //details of non-veg hotel 2...........>
		 case 2:{System.out.println("thank you for choosing\"BUHARI\"");
		        System.out.println("OUR DISHES...*");
		        System.out.println("1.CHICKEN RICE-Rs.100\n2.CHICKEN NOODLES-Rs.100\n3.MUTTON RICE-Rs.90\n4.MUTTON NOODLES-Rs.100\n5.PARROTTA-Rs.10\n");
		        System.out.println("SELECT YOUR  FAVOURITE FOOD");}
				int dish_f=s.nextInt();
		       switch(dish_f)
		       {
		       case 1:{ System.out.println("YOUR SELECTED DISH IS \"CHICKEN RICE\"\n");
					 System.out.println("SELECT YOUR QUANTITY");
				     int quantity=s.nextInt();
					 System.out.println("******\"BUHARI\"******");
					 System.out.println("1.FOOD: CHICKEN RICE");
					 System.out.println("2.QUANTITY:"+quantity);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantity*100);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			   
					 break;} 
		     case 2:{System.out.println("YOUR SELECTED DISH IS \"CHICKEN NOODLES\"");
				     System.out.println("SELECT YOUR QUANTITY");
				     int quantitya=s.nextInt();
					  System.out.println("******\"BUHARI\"******");
					  System.out.println("1.FOOD: CHICKEN NOODLES");
					 System.out.println("2.QUANTITY:"+quantitya);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantitya*100);
					 
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			  
                      break;}				 
		     case 3:{System.out.println("YOUR SELECTED DISH IS \"MUTTON RICE\"");
			         System.out.println("SELECT YOUR QUANTITY");
				     int quantityb=s.nextInt();
					  System.out.println("******\"BUHARI\"******");
					  System.out.println("1.FOOD: MUTTON RICE");
					 System.out.println("2.QUANTITY:"+quantityb);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityb*90);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			 	
			          break;}
             case 4:{System.out.println("YOUR SELECTED DISH IS \"MUTTON NOODLES\"");
				     System.out.println("SELECT YOUR QUANTITY");
				     int quantityc=s.nextInt();
					  System.out.println("******\"BUHARI\"******");
					  System.out.println("1.FOOD: MUTTON NOODLES");
					 System.out.println("2.QUANTITY:"+quantityc);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityc*100);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			 
				 break;}
			case 5:{System.out.println("YOUR SELECTED DISH IS \"PAROTTA\"");
			       System.out.println("SELECT YOUR QUANTITY");
				    int quantityd=s.nextInt();
					 System.out.println("******\"BUHARI\"******");
					  System.out.println("1.FOOD: PAROTTA");
					 System.out.println("2.QUANTITY:"+quantityd);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityd*10);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
					 break;
			        }
	             }break;
		 // details of non-veg hotel 3...........>
		 case 3:{System.out.println("thank you for choosing\"AAMBUR BIRIYANI\"");
		        System.out.println("OUR DISHES...*");
		        System.out.println("1.CHICKEN BIRIYANI-Rs.200\n2.MUTTON BIRIYANI-Rs.150\n3.MUSHROOM BIRIYANI-Rs.110\n4.VEG BIRIYANI-Rs.100\n5.TOMATO BIRIYANI-Rs.80\n");
		        System.out.println("SELECT YOUR  FAVOURITE FOOD");}
				int dish_g=s.nextInt();
		       switch(dish_g)
		       {
		       case 1:{ System.out.println("YOUR SELECTED DISH IS \"\"CHICKEN BIRIYANI\"n");
					 System.out.println("SELECT YOUR QUANTITY");
				     int quantity=s.nextInt();
					 System.out.println("******\"AAMBUR BIRIYANI\"******");
					 System.out.println("1.FOOD: CHICKEN BIRIYANI");
					 System.out.println("2.QUANTITY:"+quantity);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantity*200);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			   
					 break; }
		     case 2:{System.out.println("YOUR SELECTED DISH IS \"MUTTON BIRIYANI\"");
				     System.out.println("SELECT YOUR QUANTITY");
				     int quantitya=s.nextInt();
					  System.out.println("******\"AAMBUR BIRIYANI\"******");
					  System.out.println("1.FOOD: MUTTON BIRIYANI");
					 System.out.println("2.QUANTITY:"+quantitya);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantitya*150);
					 
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			  
                      break;}				 
		     case 3:{System.out.println("YOUR SELECTED DISH IS \"MUSHROOM BIRIYANI\"");
			         System.out.println("SELECT YOUR QUANTITY");
				     int quantityb=s.nextInt();
					  System.out.println("******\"AAMBUR BIRIYANI\"******");
					  System.out.println("1.FOOD: MUSHROOM BIRIYANI");
					 System.out.println("2.QUANTITY:"+quantityb);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityb*110);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			 	
			          break;}
             case 4:{System.out.println("YOUR SELECTED DISH IS \"VEG BIRIYANI\"");
				     System.out.println("SELECT YOUR QUANTITY");
				     int quantityc=s.nextInt();
					  System.out.println("******\"AAMBUR BIRIYANI\"******");
					  System.out.println("1.FOOD: VEG BIRIYANI");
					 System.out.println("2.QUANTITY:"+quantityc);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityc*100);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			 
					 break;}
			case 5:{System.out.println("YOUR SELECTED DISH IS \"TOMATO\"");
			       System.out.println("SELECT YOUR QUANTITY");
				    int quantityd=s.nextInt();
					 System.out.println("******\"AAMBUR BIRIYANI\"******");
					  System.out.println("1.FOOD: TOMATO");
					 System.out.println("2.QUANTITY:"+quantityd);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityd*80);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
					 break;
			        }
	             }break;
		 // details of non-veg hotel 4..............>
		 case 4:{System.out.println("thank you for choosing\"CURRY KINGDOM\"");
		        System.out.println("OUR DISHES...*");
		        System.out.println("1.CHANNA MASALA-Rs.110\n2.MUTTON KOFTA-Rs.110\n3.FISH FRY-Rs.110\n4.MUTTON FABLE-Rs.110\n5.PANNER CHICKEN-Rs.110\n");
		        System.out.println("SELECT YOUR  FAVOURITE FOOD");}
				int dish_h=s.nextInt();
		       switch(dish_h)
		       {
		       case 1:{ System.out.println("YOUR SELECTED DISH IS \"CHANNA MASALA\"\n");
					 System.out.println("SELECT YOUR QUANTITY");
				     int quantity=s.nextInt();
					 System.out.println("******\"CURRY KINGDOM\"******");
					 System.out.println("1.FOOD: CHANNA MASALA");
					 System.out.println("2.QUANTITY:"+quantity);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantity*110);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			   
					 break; }
		     case 2:{System.out.println("YOUR SELECTED DISH IS \"MUTTON KOFTA\"");
				     System.out.println("SELECT YOUR QUANTITY");
				     int quantitya=s.nextInt();
					  System.out.println("******\"CURRY KINGDOM\"******");
					  System.out.println("1.FOOD: MUTTON KOFTA");
					 System.out.println("2.QUANTITY:"+quantitya);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantitya*110);
					 
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			  
                      break;}				 
		     case 3:{System.out.println("YOUR SELECTED DISH IS \"FISH FRY\"");
			         System.out.println("SELECT YOUR QUANTITY");
				     int quantityb=s.nextInt();
					  System.out.println("******\"CURRY KINGDOM\"******");
					  System.out.println("1.FOOD: FISH FRY");
					 System.out.println("2.QUANTITY:"+quantityb);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityb*110);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			 	
			          break;}
             case 4:{System.out.println("YOUR SELECTED DISH IS \"MUTTON FABLE\"");
				     System.out.println("SELECT YOUR QUANTITY");
				     int quantityc=s.nextInt();
					  System.out.println("******\"CURRY KINGDOM\"******");
					  System.out.println("1.FOOD: MUTTON FABLE");
					 System.out.println("2.QUANTITY:"+quantityc);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityc*110);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			 
					 break;}
			case 5:{System.out.println("YOUR SELECTED DISH IS \"PANNER CHICKEN\"");
			       System.out.println("SELECT YOUR QUANTITY");
				    int quantityd=s.nextInt();
					 System.out.println("******\"CURRY KINGDOM\"******");
					  System.out.println("1.FOOD: PANNER CHICKEN");
					 System.out.println("2.QUANTITY:"+quantityd);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityd*110);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
		              break;
			        }
	             }break;
		 //details of non-veg hotel 5........>
		 case 5:{System.out.println("thank you for choosing\"NON-VEG PALACE\"");
		        System.out.println("OUR DISHES...*");
		        System.out.println("1.KOBHI MANCHORIAN-Rs.50\n2.CHICKEN FRY-Rs.50\n3.MUTTON FRY-Rs.60\n4.MUTTON SOUP-Rs.50\n5.CHICKEN BIRIYANI AND MUTTON BIRIYANI COMBO-Rs.200\n");
		        System.out.println("SELECT YOUR  FAVOURITE FOOD");}
				int dish_i=s.nextInt();
		       switch(dish_i)
		       {
		       case 1:{ System.out.println("YOUR SELECTED DISH IS \"KOBHI MANCHORIAN\"\n");
					 System.out.println("SELECT YOUR QUANTITY");
				     int quantity=s.nextInt();
					 System.out.println("your amount is:"+quantity*10);
					 System.out.println("******\"NON-VEG PALACE\"******");
					 System.out.println("1.FOOD: KOBHI MANCHORIAN");
					 System.out.println("2.QUANTITY:"+quantity);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantity*50);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			   
					 break; }
		     case 2:{System.out.println("YOUR SELECTED DISH IS \"CHICKEN FRY\"");
				     System.out.println("SELECT YOUR QUANTITY");
				     int quantitya=s.nextInt();
					  System.out.println("******\"NON-VEG PALACE\"******");
					  System.out.println("1.FOOD: CHICKEN FRY");
					 System.out.println("2.QUANTITY:"+quantitya);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantitya*50);
					 
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			  
                      break;}				 
		     case 3:{System.out.println("YOUR SELECTED DISH IS \"MUTTON FRY\"");
			         System.out.println("SELECT YOUR QUANTITY");
				     int quantityb=s.nextInt();
					  System.out.println("******\"NON-VEG PALACE\"******");
					  System.out.println("1.FOOD: MUTTON FRY");
					 System.out.println("2.QUANTITY:"+quantityb);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityb*10);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			 	
			          break;}
             case 4:{System.out.println("YOUR SELECTED DISH IS \"MUTTON SOUP\"");
				     System.out.println("SELECT YOUR QUANTITY");
				     int quantityc=s.nextInt();
					  System.out.println("******\"NON-VEG PALACE\"******");
					  System.out.println("1.FOOD: MUTTON SOUP");
					 System.out.println("2.QUANTITY:"+quantityc);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityc*60);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
			 
					 break;}
			case 5:{System.out.println("YOUR SELECTED DISH IS \"CHICKEN BIRIYANI AND MUTTON BIRIYANI COMBO\"");
			       System.out.println("SELECT YOUR QUANTITY");
				    int quantityd=s.nextInt();
					 System.out.println("******\"NON-VEG PALACE\"******");
					  System.out.println("1.FOOD: CHICKEN BIRIYANI AND MUTTON BIRIYANI COMBO");
					 System.out.println("2.QUANTITY:"+quantityd);
					 System.out.println("3.DATE:"+Date());
					 System.out.println("4.TIME:"+time());
					 System.out.println("5.AMOUNT:"+quantityd*200);
					 System.out.println("...............CHECK ABOVE THE DETAILS AND PAY THE AMOUNT...........");
					 break;
			        }
			   }   
		 } 
	}
		                   
		                      System.out.println("IF YOU CONTINUE THE ORDER PRESS \"1\"");
		                      System.out.println("IF YOU CANCEL THE ORDER PRESS \"2\"");
							  int num1=s.nextInt();
							 switch (num1)
	                         {
							    case 1:{System.out.println("YOUR ORDER WILL BE CONTINUED.........");
						       System.out.println("OTP WILL BE SEND YOUR REGISTER MOBILE NUMBER XXXXXXXX74");
								System.out.println("Please EnterThe OTP :");
								Thread.sleep(1000);
								double otp=9999*Math.random()+9999;
								int check=(int)otp;
								System.out.println(check);
								int otp_is=s.nextInt();
								if(check==otp_is)
	                              {
									System.out.println("**********YOUR OTP VERIFICATION SUCCESSFULL********");
	                              }
                                 else 
								      {
									   System.out.println("PLEASE ENTER THE CORRECT OTP");
                                 System.out.println("OTP WILL BE SEND AGAIN YOUR REGISTER MOBILE NUMBER XXXXXXXX74");
								System.out.println("Please Enter the correct OTP :");
								Thread.sleep(1000);
								double otp1=9999*Math.random()+9999;
								int check1=(int)otp;
								System.out.println(check1);
								int otp_is1=s.nextInt();
								System.out.println("**********YOUR OTP VERIFICATION SUCCESSFULL********\n");
	                              
                                       }
		 			System.out.println("Please Select The Payment Method\n1.Phone Pay\n2.Google Pay\n3.Paytm\n4.Cash\n");
					System.out.println("ENTER YOUR OPTIONS....\"1\" OR \"2\" 0R \"3\" OR \"4\"");
					int payment=s.nextInt();
					switch(payment)
					{
					case 1:    {  System.out.println("\"WELCOME TO PHONE PAY\"");
						         System.out.println(".....please enter your MPIN.....");
								 int mpin=s.nextInt();
                                 System.out.println("your mpin is correct\n");
						         System.out.println("Please Enter The Amount");
							     double amount1=s.nextDouble();
								 System.out.println("PLEASE ENTER YOUR UPI PIN:\"_ _ _ _ _ _ _\"\n");
								 int upi=s.nextInt();
							     System.out.println("Processing Please Wait.....\n");
									Thread.sleep(1000);
									System.out.println("\t<.........YOUR PAYMENT SUCESSFULL.......>\n");
									System.out.println("\t*********Your Order Is Sucessful***********\n");
									System.out.println("*********Your favourit food is delivered within 30 minitues***********\n");
									System.out.println("\t<<<<<<<<<<<<<<<\"THANK YOU!!! VISIT AGAIN!!!\">>>>>>>>>>>>>>>>");
									break;}
					case 2: 
						{  System.out.println("\"WELCOME TO GOOGLE PAY\"");  
						System.out.println(".....please enter your MPIN.....");
								 int mpin2=s.nextInt();
                                 System.out.println("your mpin is correct\n");
						         System.out.println("Please Enter The Amount");
							     double amount2=s.nextDouble();
								 System.out.println("PLEASE ENTER YOUR UPI PIN:\"_ _ _ _ _ _ _\"\n");
                                    int upi=s.nextInt();
							     System.out.println("Processing Please Wait.....\n");
									Thread.sleep(1000);
									System.out.println("\t<.........YOUR PAYMENT SUCESSFULL.......>\n");
									System.out.println("*********Your Order Is Sucessful***********\n");
									System.out.println("*********Your favourit food is delivered within 30 minitues***********\n");
									System.out.println("\t<<<<<<<<<<<<<<<\"THANK YOU!!! VISIT AGAIN!!!\">>>>>>>>>>>>>>>>");
									break;}
					case 3:
						{  System.out.println("\"WELCOME TO PAYTM\""); 
						System.out.println(".....please enter your MPIN.....");
								 int mpin3=s.nextInt();
                                 System.out.println("your mpin is correct\n");
						         System.out.println("Please Enter The Amount");
							     double amount3=s.nextDouble();
								 System.out.println("PLEASE ENTER YOUR UPI PIN:\"_ _ _ _ _ _ _\"\n");
									 int upi=s.nextInt();
							     System.out.println("Processing Please Wait.....");
									Thread.sleep(1000);
									System.out.println("\t<.........YOUR PAYMENT SUCESSFULL.......>\n");
									System.out.println("*********Your Order Is Sucessful***********\n");
									System.out.println("*********Your favourit food is delivered within 30 minitues***********\n");
									System.out.println("\t<<<<<<<<<<<<<<<\"THANK YOU!!! VISIT AGAIN!!!\">>>>>>>>>>>>>>>>");
									break;}

					case 4:
						{  System.out.println("GIVE YOUR CASH ON DELIVERY");
					       System.out.println("*********Your Order Is Sucessful***********\n");
									System.out.println("*********Your favourite food is delivered within 30 minitues***********\n");
									System.out.println("\t<<<<<<<<<<<<<<<\"THANK YOU!!! VISIT AGAIN!!!\">>>>>>>>>>>>>>>>");
									break;}

					} } 
					break;

                      case 2:{System.out.println("..........YOUR ORDER WILL BE CANCELLED.......");
                                        System.out.println("..........THANK YOU!!!...........");
								       break;} 
									   }System.out.println();
	   System.out.println(" IF YOU CONTINUE TO USE AGAIN THE \"SWIGGY APP\" PLEASE PRESS \"1\"");
	   System.out.println();
       System.out.println(" IF YOU DISCONTINUE TO USE AGAIN THE  \"SWIGGY APP\" PLEASE PRESS \"2\"");
	  int swiggy=s.nextInt();
       switch (swiggy)
       {
       case 1:  Swiggy.main(args);
	         break;
       }
	   System.out.println("\t\tTHANK YOU! VISIT AGAIN!");
}   
	public static String Date() {
		
		return " "+java.time.LocalDate.now();
	}
	public static String time() {
		//LocalTime t= LocalTime.now();
		return String.format("%tr",Calendar.getInstance());
		//return t;
	}
}