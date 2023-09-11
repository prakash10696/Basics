package Pattern;

public class Pattern_a {
public static void main(String[] args) {
	   Pattern_a pd = new  Pattern_a();
	  // pd.pattern1();
	 //pd.patten2();
	// pd.pattern3();
	  //pd.pattern4();
	  //pd.pattern5();
	  // pd.pattern6();
     //pd.pattern7();
      // pd.pattern8();
       //pd.pattern9();
   //pd.pattern10();
   //pd.pattern11();//8
     //pd.pattern12();
   // pd.pattern13();
      pd.pattern14();//5
	  // pd.pattern15(); //2
    //pd.pattern16();//9
	  }
	  private void pattern16() {
		  for(int row=1;row<=7;row++) {
			   for (int col=1;col<=7;col++) {
				   if(row==1||row==4||row==7)
					   	System.out.print("* ");
				   else if((row<=4 && col==1)||(row>4 && (col==1||col==7)))
					   System.out.print("* ");
				   else
					   System.out.print("  ");
			   }
			   System.out.println();
			   
			  }
	
}
	private void pattern15() {
	// TODO Auto-generated method stub
		  for(int row=1;row<=7;row++) {
			   for (int col=1;col<=7;col++) {
				   if(row==1||row==4||row==7)
					   	System.out.print("* ");
				   else if((row<=4 && col==7)||(row>4 && col==1))
					   System.out.print("* ");
				   else
					   System.out.print("  ");
			   }
			   System.out.println();
			   
			  }
}
	private void pattern14() {
		  for(int row=1;row<=7;row++) {
			   for (int col=1;col<=7;col++) {
				   if(row==1||row==4||row==7)
					   	System.out.print("* ");
				   else if((row<=4 && col==1)||(row>4 && col==7))
					   System.out.print("* ");
				   else
					   System.out.print("  ");
			   }
			   System.out.println();
			   
			  }
	
}
	private void pattern13() {
		  
		  for(int row=1;row<=7;row++) {
			   for (int col=1;col<=7;col++) {
				   if(row==1||row==4||row==7||col==7)
			    System.out.print("* ");
				   else
					   System.out.print("  ");
			   }
			   System.out.println();
			   
			  }
	
}
	private void pattern12() {
	// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) {
			   for (int col=1;col<=7;col++) {
				   if(row==1||row==4||row==7||col==1)
			    System.out.print("* ");
				   else
					   System.out.print("  ");
			   }
			   System.out.println();
			   
			  }
	
}
	private void pattern11() {
	
		  for(int row=1;row<=7;row++) {
			   for (int col=1;col<=7;col++) {
				   if(row==1||row==4||row==7||col==1 ||col==7)
			    System.out.print("* ");
				   else
					   System.out.print("  ");
			   }
			   System.out.println();
			   
			  }
			  
}
	private void pattern10() {
	
		  for(int row=1;row<=7;row++) {
		      for (int col=1;col<=7;col++) {
		   if( col==row &&(col<=4) || row+col==8 && (col>4) || col==1 || col==7) 	
		    	  System.out.print("* ");
		   else 
			   System.out.print("  ");
		   
		      }
		      System.out.println();  
		  } 		  
}
	private void pattern9() {
	
		  for(int row=1;row<=7;row++) {
		      for (int col=1;col<=7;col++) {
		   if( col==row &&(col<=4)|| row+col==8) 	
		    	  System.out.print("* ");
		   else 
			   System.out.print("  ");
		   
		      }
		      System.out.println();  
		  } 		   
}
	private void pattern8() {
	// TODO Auto-generated method stub
		  for(int row=1;row<=7;row++) {
		      for (int col=1;col<=7;col++) {
		   if( col==row || row+col==8) 	
		    	  System.out.print("* ");
		   else 
			   System.out.print("  ");
		   
		      }
		      System.out.println();  
		  } 		  
		  
	  }
	private void pattern7() {
	
		  for(int row=1;row<=7;row++) {
		      for (int col=1;col<=7;col++) {
		   if(col==1 || col==row || col==7) 	
		    	  System.out.print("* ");
		   else 
			   System.out.print("  ");
		   
		      }
		      System.out.println();  
		  } 		  
}
	private void pattern6() {
		  for(int row=1;row<=7;row++) {
		      for (int col=1;col<=7;col++) {
		   if(col==1 || col==row) 	
		    	  System.out.print("* ");
		   else 
			   System.out.print("  ");
		   
		      }
		      System.out.println();  
		      
		  }
	
	
}
	private void pattern5() {
	  // TODO Auto-generated method stub
	   for(int row=1;row<=7;row++) {
	      for (int col=1;col<=7;col++) {
	        if(col==1) 
	         System.out.print("* ");
	       }
	       System.out.println();
	       
	      } 
	 }
	 private void pattern4() {
	  for(int row=1;row<=7;row++) {
	     for (int col=1;col<=7;col++) {
	       if(row==1 || row==7  || col==1 ||col==7) {
	        if(row==1&&col==7 || row==7&&col==7){
	         System.out.print(" ");
	        }
	        else
	       System.out.print("* ");
	       }
	       else
	        System.out.print("  ");
	      }
	      System.out.println();
	      
	     }
	  }

	  private void pattern3() {
	   for(int row=1;row<=7;row++) {
	    for (int col=1;col<=7;col++) {
	     if(row==1 || col==1 ||row==7)
	     {
	      if(row==1&&col==1 || row==7 && col==1) {
	       System.out.print("  ");
	       
	      }
	     System.out.print("* ");
	     }
	     else
	      System.out.print("  ");
	    }
	    System.out.println();
	    
	   }
	   
	  }

	  private void patten2() {

	   for(int row=1;row<=7;row++) {
	   for (int col=1;col<=7;col++) {
	    if( col== 4) {
	    System.out.print("* ");
	    }
	   // else {
	     //if(col!=4)
	     //System.out.print("  " );
	     //else
	      //System.out.print("* ");
	   // }
	   }
	   System.out.println();
	   
	  }
	   
	  }
	  

	  private void pattern1() {
	   
	   for(int row=1;row<=7;row++) {
	   for (int col=1;col<=7;col++) {
	    System.out.print("* ");
	   }
	   System.out.println();
	   
	  }
	  }
	 }

