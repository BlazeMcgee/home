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

/**
 *
 * @author pc
 */
public class reportTester {
    
    public reportTester() {
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
    // public void hello() {}
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
    // Unit test for populated array 
    @Test
        public void checkPopulatedArray() {
    

        String developerName[] = {"Mike Smith", "Edward Harrington","Samantha Paulson","Glender Oberholzer"};
        
        assertEquals("Mike Smith", developerName[0], "Array not correctly formatted");
        assertEquals("Edward Harrington", developerName[1], "Array not correctly formatted");
        assertEquals("Samantha Paulson", developerName[2], "Array not correctly formatted");
        assertEquals("Glender Oberholzer", developerName[3], "Array not correctly formatted");


        }
         @Test
        //checking longest duration
           public void checkLongestDuration() {
    

        String developerName[] = {"Mike Smith", "Edward Harrington","Samantha Paulson","Glender Oberholzer"};
        int duration[]={5, 8, 2, 11};
        int max=0, current=99;
          for(int x=0; x < duration.length; x+=1){
                           if(duration[x]>=max){
                              current = x;
                    
                           }
                         }
        
        assertEquals("Glender Oberholzer", developerName[current], "Array not correctly formatted");
        assertEquals(11, duration[current], "Array not correctly formatted");
       
        }
            @Test
           //check task searcher
              public void checkSearchTask() {
    

        String taskName[] = {"Create Login", "Create Add Features","Create Reports","Add Array"};
        String developerName[] = {"Mike Smith", "Edward Harrington","Samantha Paulson","Glender Oberholzer"};
        
         String SO = "Create Login";int current =99;
                       for(int x=0; x < taskName.length; x+=1){
                           if(taskName[x].compareTo(SO)==0){
                             
                              current = x;
                           }
                       }
        assertEquals("Create Login", taskName[current], "Array not correctly formatted");
        assertEquals("Mike Smith", developerName[current], "Array not correctly formatted");
       
        }
          @Test
           //check developer searcher
              public void checkSearchDeveloper() {
    

        String taskName[] = {"Create Login", "Create Add Features","Create Reports","Add Array"};
        String developerName[] = {"Mike Smith", "Edward Harrington","Samantha Paulson","Glender Oberholzer"};
        
         String SO = "Samantha Paulson";int current =99;
                       for(int x=0; x < taskName.length; x+=1){
                           if(developerName[x].compareTo(SO)==0){
                             
                              current = x;
                           }
                       }
        assertEquals("Create Reports", taskName[current], "Array not correctly formatted");
              } 
      
              
}

