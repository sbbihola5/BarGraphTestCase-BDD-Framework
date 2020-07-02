package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.*; 


public class SearchCompare {

@Given("^X-axis elements are shown from Minimum to Maximum$")
public void x_axis_elements_are_shown_from_Minimum_to_Maximum() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 
    ArrayList<String> ArrLis 
        = new ArrayList<String>(); 

    // Add elements 
    ArrLis.add("2013-01"); 
    ArrLis.add("2013-02"); 
    ArrLis.add("2013-03"); 
    ArrLis.add("2013-04"); 
    ArrLis.add("2013-05"); 
    ArrLis.add("2013-06"); 
    ArrLis.add("2013-07");
    ArrLis.add("2013-08");
    ArrLis.add("2013-09");
    ArrLis.add("2013-10"); 
    ArrLis.add("2013-11"); 
    ArrLis.add("2013-12");
    ArrLis.add("2014-01"); 
    ArrLis.add("2014-02"); 
   
   

    // print ArrayList 
    System.out.println("Elements of ArrayList: "
                       + ArrLis); 
  

}

@Given("^Y-axis elements are shown from Minimum to Maximum$")
public void y_axis_elements_are_shown_from_Minimum_to_Maximum() throws Throwable {
    // Write code here that turns the phrase above into concrete actions

	for (int i=0; i<=450; i++) {
		
		System.out.print(i +", ");			
	}			
	
}
@When("^Barchart shows size of X-axis Elements$")
public void barchart_shows_size_of_X_axis_Elements() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	ArrayList<String> ArrLis 
    = new ArrayList<String>(); 

// Add elements 
ArrLis.add("2013-01"); 
ArrLis.add("2013-02"); 
ArrLis.add("2013-03"); 
ArrLis.add("2013-04"); 
ArrLis.add("2013-05"); 
ArrLis.add("2013-06"); 
ArrLis.add("2013-07");
ArrLis.add("2013-08");
ArrLis.add("2013-09");
ArrLis.add("2013-10"); 
ArrLis.add("2013-11"); 
ArrLis.add("2013-12");
ArrLis.add("2014-01"); 
ArrLis.add("2014-02"); 
int size = ArrLis.size(); 
System.out.println("\n");
// print the size of ArrLis 
System.out.println("Size of list = "
                   + size); 
}
@Then("^It Compare the Values of X-axis and Y-axis\\.$")
public static void  it_Compare_the_Values_of_X_axis_and_Y_axis(int a[][]) throws Throwable {
 
	// Write code here that turns the phrase above into concrete actions
	boolean x = true, y = true; 
	  
    
    for (int i = 0; i < a.length - 1; i++) { 
        if (a[i][0] != a[i + 1][0]) 
            x = false; 
        if (a[i][1] != a[i + 1][1]) 
            y = false; 
    } 

    // To display the output 
    if (x) 
        System.out.println("Parallel to Y Axis"); 
    else if (y) 
        System.out.println("Parallel to X Axis"); 
    else
        System.out.println("Not parallel to X"
                           + " and Y axis"); 
} 
public static void main(String[] args) 
{ 
    int a[][] = { { 1, 2 }, 
                  { 1, 4 }, 
                  { 1, 6 }, 
                  { 1, 0 } }; 
   
}


	}