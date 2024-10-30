package home;
import javax.swing.JOptionPane;

public class Home {

    
    public static void main(String[] args) {
        //Scanner and Calling Login class
        
        Login login = new Login();
        Tasks task = new Tasks();
        
        //Possible Replies from register, To allow users to retry
        String response = "Username and Password are Valid . Account Registered ;-)";
        String response1="FAILED TO REGISTER.Username Captured but Password is Invalid :-/";
        String response2="FAILED TO REGISTER.Password Captured but Username is invalid. :-/ ";
        String response3= "FAILED TO REGISTER. Both Username and PAssword are invalid :-(";
        
        
        JOptionPane.showMessageDialog(null, "Welcome to Account Creator:-) EazKanBan ");
        //Create username and Password
   
 /**       String name = JOptionPane.showInputDialog("Create a cool Username: (must have an underscore and less than 5 characters)");
       
        String key = JOptionPane.showInputDialog("Create a Strong Password: (must have a capital letter, number, special character and more than 8 characters)");
        
        //Send data to registerUser() method
        String verdict = login.registerUser( name, key);
        
        
        //If username or password is invalid, Try again (loop)
        if(verdict.compareTo(response)!= 0)
        {
           
            while(verdict.compareTo(response)!= 0)
            {
                JOptionPane.showMessageDialog(null, "Please Try again");
                 
                if(verdict.compareTo(response1) == 0)
                {
                   JOptionPane.showMessageDialog(null, response1);
                    
                    key = JOptionPane.showInputDialog("Create a Strong Password: (must have a capital letter, number, special character and more than 8 characters)");
                    verdict = login.registerUser( name, key);
                }
                else if(verdict.compareTo(response2) == 0)
                {
                   JOptionPane.showMessageDialog(null, response2);
                     name =  key = JOptionPane.showInputDialog("Create a cool Username: (must have an underscore and less than 5 characters)");
                    verdict = login.registerUser( name, key);
                }
                else if(verdict.compareTo(response3) == 0)
                {
                     JOptionPane.showMessageDialog(null, response3);
                    name = JOptionPane.showInputDialog("Create a cool Username: (must have an underscore and less than 5 characters)");
                    key = JOptionPane.showInputDialog("Create a Strong Password: (must have a capital letter, number, special character and more than 8 characters)");
       
                    verdict = login.registerUser( name, key);
                }
            }
            
        }
        String firstName="",surname="";
        //Account successfully registered
        if(verdict.compareTo(response)== 0) 
        {
                    JOptionPane.showMessageDialog(null, verdict);
                    firstName = JOptionPane.showInputDialog("Enter your first name");
                    surname = JOptionPane.showInputDialog("Enter your surname");
       
          }
        
        
        //Logging in
        JOptionPane.showMessageDialog(null, "Please Log in WIth the Same UserName and Password from previous section : ");
        
        String userName = JOptionPane.showInputDialog("Enter your Username");
        String passWord = JOptionPane.showInputDialog("Enter your Password");
        
        String status = login.loginStatus( name, key, userName, passWord);
        JOptionPane.showMessageDialog(null, status);
         if(status.compareTo("A successful login :-) ")!=0)
        {
            while(status.compareTo("A successful login :-) ")!=0)
            {
                JOptionPane.showMessageDialog(null, "Please Log in WIth the Same UserName and Password from previous section : ");
        
                 userName = JOptionPane.showInputDialog("Enter your Username");
                 passWord = JOptionPane.showInputDialog("Enter your Password");
        
                 status = login.loginStatus( name, key, userName, passWord);
                JOptionPane.showMessageDialog(null, status);
            }
        
        }
         //Welcome @user
        if(status.compareTo("A successful login :-) ")==0)
        {
           JOptionPane.showMessageDialog(null, "Welcome to Easy KanBan " +firstName+" "+surname+ ", We hope you have a good day");
            
        }
        **/
        //Part 2
           int opp =0;
            int count=99;
          String arrayName[]=null;
          String arrayDescription[]=null;
          String arrayDeveloper[]=null;
          String arrayStatus[]=null;
          String arrayTaskId[]=null;
          int arrayDuration[]=null;
        while(opp != 3){
        //Choose Option   
            String menu[]={"Add Tasks" , "Show Report - (must have tasks created)", "Quit"};
            int menuChosen = JOptionPane.showOptionDialog(null, "Choose an Option","Add Tasks/Show Report - 'Coming Soon'/Quit" ,JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, menu,menu[0]);
                               
            opp = menuChosen +1;
            
            switch (opp){
                default:
                   
                    JOptionPane.showMessageDialog(null, "Invalid Option" );  
                case 3:
                    JOptionPane.showMessageDialog(null, "Thank you for visting EazKanBan !! Goodbye" );    
                break;
                case 1:
                        
                    
                       count = Integer.parseInt(JOptionPane.showInputDialog("How many Tasks would you like to add"));
                  
                      //Arrays to Store data
                         arrayName=new String[count];
                         arrayDescription =new String[count];
                         arrayDeveloper=new String[count];
                        arrayStatus = new String[count];
                         arrayTaskId=new String[count];
                         arrayDuration=new int[count];
                     
                        
                        //Loop to create tasks
                       for(int x=0;x<count;x+=1){
                            JOptionPane.showMessageDialog(null, "Create Task Number :" +(x+1) );  
                             
                             arrayName[x] = JOptionPane.showInputDialog("Enter Task Name (Atleast 3 Characters)");
                             while(arrayName[x].length()<3)
                             {
                                 arrayName[x] = JOptionPane.showInputDialog("Enter Task Name (Atleast 3 Characters)");
                              }
                            
                             arrayDeveloper[x] =JOptionPane.showInputDialog("Enter Developer Name (Atleast 4 Characters)");
                              while(arrayDeveloper[x].length()<4)
                             {
                                 arrayDeveloper[x] =JOptionPane.showInputDialog("Enter Developer Name (Atleast 4 Characters)");
                              }
                            
                             arrayDuration[x] = Integer.parseInt(JOptionPane.showInputDialog("Enter task duration (to the nearest hour)"));
                             
                             arrayDescription[x] = JOptionPane.showInputDialog("Enter a task description ");
                             while(!task.checkTaskDescription(arrayDescription[x]))
                             {
                                 arrayDescription[x] = JOptionPane.showInputDialog("Enter a task description ");
                              }
                 
                             String choices[]={"Doing" , "Done", "To Do"};
                            int choice = JOptionPane.showOptionDialog(null, "Choose an Option","Doing/Done/To Do" ,JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, choices,choices[0]);
                                arrayStatus[x] = choices[choice];
                         
                            arrayTaskId[x] = task.createID(arrayDeveloper[x],arrayName[x], x+1);
                           JOptionPane.showMessageDialog(null, "Task Added" );        
                       }
                      
                       //Display all tasks
                      for(int x=0;x<count;x+=1){
                          JOptionPane.showMessageDialog(null, task.printTaskDetails( arrayName[x],arrayDescription[x], arrayDeveloper[x] , arrayStatus[x],  arrayDuration[x], x+1,  arrayTaskId[x]));  
                         
                      }//Total Calculation
                       int totalTime = task.returnTotalHours(arrayDuration);
                     JOptionPane.showMessageDialog(null, "Total Duration  :" +totalTime );  
                   break;
                case 2:
                    //Part 3
                      
                     if(arrayName==null && arrayDescription==null && arrayDeveloper==null && arrayStatus==null && arrayTaskId==null && arrayDuration==null){
                          JOptionPane.showMessageDialog(null,"The Tasks have not been created " ); 
                         break;
                
                }
                 int menuChosen1 =0;    
                 //Loop Report Showing Center
                 while (menuChosen1!=6){
                     
                String menu1[]={"Display all 'Done' Tasks" , "Longest Duration", "Search for Task", "Search for Developer","Delete a task", "Display All Tasks", "Exit Report Center"};
                menuChosen1 = JOptionPane.showOptionDialog(null, "Choose an Option","Options" ,JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menu1,menu1[0]);
              
                switch (menuChosen1)
                {
                   case 6:
                       JOptionPane.showMessageDialog(null,"Report Ending" ); 
                   break;
                   case 0:
                       JOptionPane.showMessageDialog(null,"Showing All TAsks With Status 'Done' " ); 
                       //Checking for all Finished Tasks
                       for(int x=0; x < count; x+=1){
                           if(arrayStatus[x].compareTo("Done")==0){
                                JOptionPane.showMessageDialog(null, "Developer Name :"+ arrayDeveloper[x] +"\n" + "Task Name :"+ arrayName[x] +"\n" + "Task Duration :"+ arrayDuration[x] );    
                           }
                       }
                   break;
                   case 1:
                       int max=0;
                     //Finding Max Duration
                         for(int x=0; x < count; x+=1){
                           if(arrayDuration[x]>=max){
                               max=arrayDuration[x];
                           }
                         }
                        //Displaying tasks highest  duration
                           for(int y=0; y < count; y+=1){
                           if(arrayDuration[y]==max){
                                JOptionPane.showMessageDialog(null, "Developer Name :"+ arrayDeveloper[y] +"\n" + "Task Duration :"+ arrayDuration[y] );    
                           } 
                       }
                   break;
                   //Search for Task Name
                   case 2:
                       String SO = JOptionPane.showInputDialog("Enter task name of task you're looking for");
                       for(int x=0; x < count; x+=1){
                           if(arrayName[x].compareTo(SO)==0){
                             JOptionPane.showMessageDialog(null, "Developer Name :"+ arrayDeveloper[x] +"\n" + "Task Name :"+ arrayName[x] +"\n" + "Task Status  :"+ arrayStatus[x] );     
                              break;
                           }
                       }
                      
                   break;
                   //Search for Developer Name
                   case 3:
                            String SEO = JOptionPane.showInputDialog("Enter Developer Name of task you're looking for");
                       for(int x=0; x < count; x+=1){
                           if(arrayDeveloper[x].compareTo(SEO)==0){
                             JOptionPane.showMessageDialog(null,"Task Name :"+ arrayName[x] +"\n" + "Task Status  :"+ arrayStatus[x] );     
                           
                           }
                       }
                         
                   break;
                   //Delete One Task
                   case 4:
                       
                       
                   break;
                   //Display ALL
                   case 5:
                       JOptionPane.showMessageDialog(null,"Displaying All Tasks Saved Currently" ); 
                       for(int x=0; x < count; x+=1){
                          JOptionPane.showMessageDialog(null, task.printTaskDetails( arrayName[x],arrayDescription[x], arrayDeveloper[x] , arrayStatus[x],  arrayDuration[x], x+1,  arrayTaskId[x]));        
                       }
                   break;
                   
               }
               
               
                 } 
            
            
            }
            
             
        
            }
    }
      
    }
    

