package Pattern;

public class Myname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Myname pd=new Myname();
    pd.pattern1();
     pd.pattern2();
     pd.pattern3();
      pd.pattern3a();
     pd.pattern4();
      pd.pattern5();
      pd.pattern6();
     pd.pattern7();
     pd.pattern8();
    // pd.pattern9();
     pd.pattern10();
	}
	private void pattern10() {
	
		for(int row=1;row<=6;row++) {
			   for (int col=1;col<=9;col++) {
			    if(row==1&&col==3||row==1&&col==7||row==2&&col==1||row==2&&col==5||row==2&&col==9||row==4&&col==2||row==4&&col==7||row==6&&col==5) {
			    System.out.print("* ");
			    }
			    
			   // else
			    	
			     //if(col!=1)
			     //System.out.print("  " );
			     else
			      System.out.print("  ");
			    }
			   System.out.println();
			   
			  }
		
		
	}
	private void pattern9() {
		for(int row=1;row<=7;row++) {
			   for (int col=1;col<=7;col++) {
			    if(row==1&&col==2||row==1&&col==6||row==2&&col==1||row==2&&col==4||row==2&&col==7||row==3&&col==2||row==3&&col==6||row==4&&col==3||row==4&&col==5||row==5&&col==4){
			    System.out.print("* ");
			    }
			    
			   // else
			    	
			     //if(col!=1)
			     //System.out.print("  " );
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
			    if(col==1||col==7||row==4) {
			    System.out.print("* ");
			    }
			    
			   // else
			    	
			     //if(col!=1)
			     //System.out.print("  " );
			     else
			      System.out.print("  ");
			    }
			   System.out.println();
			   
			  }
		 System.out.println();
		}
private void pattern7() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) {
			   for (int col=1;col<=7;col++) {
				   if(row==1||row==4||row==7||(row<=4 && col==1)||(row>4 && col==7)) 
					  if(row==1&&col==1||row==4&&col==1||row==4&&col==7||row==7&&col==7) {
						  System.out.print("  ");
					  }
					  else  
					   System.out.print("* ");
					   //	System.out.print("* ");}
				  
					  // System.out.print("* ");
				   else
					   System.out.print("  ");
			   }
			   System.out.println();
			   
			  }
		System.out.println();
	}

	private void pattern6() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) {
		     for (int col=1;col<=7;col++) {
		       if(row==1 || row==4  || col==1 ||col==7) {
		        if(row==1&&col==1){
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
		System.out.println();
		}

	private void pattern5() {
		// TODO Auto-generated method stub
		
		for(int row=1;row<=7;row++) {
			   for (int col=1;col<=7;col++) {
			    if(col==1||row+col==5||row-col==3) {
			    System.out.print("* ");
			    }
			    
			   // else
			    	
			     //if(col!=1)
			     //System.out.print("  " );
			     else
			      System.out.print("  ");
			    }
			   System.out.println();
			   
			  }
		System.out.println();
		}

	private void pattern4() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) {
		     for (int col=1;col<=7;col++) {
		       if(row==1 || row==4  || col==1 ||col==7) {
		        if(row==1&&col==1){
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
		System.out.println();
	}
		
	private void pattern3a() {
		// TODO Auto-generated method stub
		 for(int row=1;row<=7;row++) {
			   for (int col=1;col<=7;col++) {
			    if(col==1||row==col) {
			    System.out.print("* ");
			    }
			    
			   // else
			    	
			     //if(col!=1)
			     //System.out.print("  " );
			     else
			      System.out.print("  ");
			    }
			   System.out.println();
			   
			  }
		 System.out.println();
	}	
		
	

	private void pattern3() {
		// TODO Auto-generated method stub
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
		

	private void pattern2() {
		// TODO Auto-generated method stub
		 for(int row=1;row<=7;row++) {
			   for (int col=1;col<=7;col++) {
			    if(col==1) {
			    System.out.print("* ");
			    }
			    
			   // else
			    	
			     //if(col!=1)
			     //System.out.print("  " );
			     else
			      System.out.print("  ");
			    }
			   System.out.println();
			   
			  }
		 System.out.println();
	}
	

	private void pattern1() {
		// TODO Auto-generated method stub
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
	//System.out.println();
}
