/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testingTasks {
    
    public testingTasks() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // Test Desc rit Methods
       public void testTaskDescriptionLength() {
        testIt chosen = new testIt();

        String shortD = "short ";
        String longD = "This is a very long description that exceeds 50 characters in length.";

        assertTrue(chosen.checkTaskDescription(shortD), "Task description successfully captured");
        assertFalse(chosen.checkTaskDescription(longD), "Please enter a task description of less than 50 characters");
        }
    
       @Test
    // test for total Hours 
    public void testTotalHours() {
        testIt chosen = new testIt();

        int[] firstDuration = {9, 5};
        int[] secondDuration = {10, 12, 55, 11, 1};

        int firstD = chosen.returnTotalHours(firstDuration);
        int secondD = chosen.returnTotalHours(secondDuration);

        assertEquals(15, firstD, "Total hours should be 15 for the first data set");
        assertEquals(89, secondD, "Total hours should be 89 for the additional data set");
    }
    // Unit test for Task ID 
    @Test
        public void testCreateID() {
        testIt chosen = new testIt();

        String taskID = chosen.createID("Add", "Byn",  1);
        assertEquals("AD:1:BYN", taskID, "Task ID should be AD:1:BYN");

      
        assertEquals("CR:0:IKE", chosen.createID("Create", "Mike", 0), "Task ID should be CR:0:IKE");
        assertEquals("CR:1:ARD", chosen.createID("Create", "Bernard",1), "Task ID should be CR:1:ARD");
        assertEquals("CR:2:THA", chosen.createID("Create",  "Jonathan",2), "Task ID should be CR:2:THA");
        assertEquals("CR:3:ND", chosen.createID("Create", "Kind",3), "Task ID should be CR:3:KIN");
        }
        // Unit test for Task ID 
    @Test
        public void testPrintDetails() {
        testIt chosen = new testIt();

        String TaskDetails = chosen.printTaskDetails("Add", "Byn","Short","Done",10,  1,"AD:1:BYN");
        assertEquals( "Task Name     : Add \nTask Description: Short \n Developer Name  : Byn \n Current Status  : Done \nTask Duration   : 10 \n Task Number   :1 \n Task ID     :AD:1:BYN", TaskDetails, "Task Details should be");
           
      
         }

    
}


class testIt {
    
    
   String createID(String developer, String name , int taskNum){
      String taskId;
       String tempDev="", tempName="";
       developer = developer.toUpperCase();
       name =name.toUpperCase();
       for(int x=0;x<3;x+=1){
           tempDev = tempDev + developer.charAt(x);
           if(x<2){
               tempName = tempName + name.charAt(x);
           }
       }
          
       taskId = tempName + ":" + taskNum + ":" + tempDev;
       return taskId;
   }
   
   String printTaskDetails(String name,String description,String developer,String status, int duration,int taskNum, String taskId){
       
       return "Task Name"+"     : "+ name + "\nTask Description: "+ description +"\n Developer Name  : "+  developer +"\n Current Status  : " +  status+"\nTask Duration   : "+ duration 
             +"\n Task Number"+"   :"+ taskNum 
            + "\n Task ID:"+"     :"+ taskId ;
     
   }
   
   boolean checkTaskDescription(String description) {
   return description.length() <= 50;  
   }  
   
   int returnTotalHours(int arrayDuration[]){
       
        int totalTime=0;
         for(int x=0;x<arrayDuration.length;x+=1){
                             totalTime = totalTime + arrayDuration[x];
                      }
       return totalTime;
   }

}

