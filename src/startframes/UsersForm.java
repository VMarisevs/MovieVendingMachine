/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UsersForm.java
 *
 * Created on 12.11.2012, 20:14:23
 */

package startframes;
//import java.util.Arrays;
import javax.swing.ImageIcon;
import java.text.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class UsersForm extends javax.swing.JFrame {

    /** Creates new form UsersForm */
    public UsersForm() {
        initComponents();
    }
    /**
     *
     *
     *
     *
     *
     *
     *
     *
     */

      public static class MovieStandard{
            public int movieID; //  movie class Id
            public String name; // movie name
            public String teaserImg; // teaser img address
            public String infoText; // information about movie
            public String directed; // directed text
            public String cast; //cast text
            public double price[];// adult ticket price 0, child 1, student 2
            //public String dateTime[]; // date and time to choise
            java.util.List dateTime;
            public int ticketLeft[]; // ticket sold
            //java.util.List ticketLeft;

            public int getMovieID(){return movieID;}
            public String getName(){ return name;}
            public String getTeaserImg() {return teaserImg;}
            public String getInfoText() {return infoText;}
            public String getDirected() {return directed;}
            public String getCast() {return cast;}
            public double getPriceAdult() {return price[0];}
            public double getPriceChild() {return price[1];}
            public double getPriceStudent(){return price[2];}


            public void setMovieID(int movieN){ movieID = movieN;}
            public void setName(String movieName){  name = movieName;}
            public void setTeaserImg(String movieTeaserImg) { teaserImg = movieTeaserImg;}
            public void setInfoText(String movieInfoText) { infoText = movieInfoText;}
            public void setDirected(String movieDirected) { directed = movieDirected;}
            public void setCast(String movieCast) { cast = movieCast;}
            //public void setPriceAdult(double moviePriceA) { price[0] = moviePriceA;}
            //public void setPriceChild(double moviePriceC) { price[1] = moviePriceC;}
            //public void setPriceStudent(double moviePriceS){ price[2] = moviePriceS;}

          }
/******************************************************************************/
              //Declaring movie objects
              static MovieStandard movie1 = new MovieStandard();
              static MovieStandard movie2 = new MovieStandard();
              static MovieStandard movie3 = new MovieStandard();
              static MovieStandard movie4 = new MovieStandard();
              static MovieStandard movie5 = new MovieStandard();
              static MovieStandard movie6 = new MovieStandard();
              static MovieStandard movie7 = new MovieStandard();
              static MovieStandard movie8 = new MovieStandard();
              static MovieStandard movie9 = new MovieStandard();
              static MovieStandard tempMovie = new MovieStandard();
              public static int movieIdent = 0,
                    ticketTypeId,
                        ticketTimeId;

              ImageIcon imageVar;
/******************************************************************************/
            //set up all movie object variables
              public void createMovieObjects(){
        //movie 1 PARANORMAL ACTIVITY 4

        movie1.setMovieID(1);
        movie1.setName("PARANORMAL ACTIVITY 4");
        movie1.setTeaserImg("../imgTeaser/teaser1.png");
        movie1.setInfoText("Set 5 years after Paranormal Activity 2, " +
                           "Katie and Robbie (formerly Hunter) move into a new house where " +
                           "their neighbors begin experiencing paranormal activity.");
        movie1.setDirected("Henry Joost, Ariel Schulman");
        movie1.setCast("Katie Featherston as Katie, " +
                                    "Kathryn Newton as Alice, " +
                                    "Matt Shively as Alex.");

        movie1.price = new double[] {16.20,8.10,12.10};

        movie1.dateTime = java.util.Arrays.asList(new String[] {"10:10","15:10","20:10"});
        movie1.ticketLeft = new int[] {10,0,30};//(new Integer[] {10,0,30});



        //Movie 2 THE COMPLETE TWILIGHT SAGA

        movie2.setMovieID(2);
        movie2.setName("THE COMPLETE TWILIGHT SAGA");
        movie2.setTeaserImg("../imgTeaser/teaser2.png");
        movie2.setInfoText("Starting in the afternoon of Thursday " +
                 "15th November you can see all four previous films in The Complete Twilight Saga back-to-back in the run-up to the midnight screening of Breaking Dawn - Part Two, with exclusive introductions from the cast, premiere coverage, music videos and other footage!!" +
                 " It’s a Twilight fan’s dream! Not only that but every screening attendee will also receive an exclusive Twilight Saga gift with purchase when they arrive at the cinema to commemorate the event!!");
        movie2.setDirected("Bill Condon");
        movie2.setCast("Kristen Stewart, Robert Pattinson, Taylor Lautner, Billy Burke, Peter Facinelli, Elizabeth Reaser, Jackson Rathbone, Nikki Reed, Ashley Greene, Kellan Lutz");

        movie2.price = new double[] {15.90,8.60,12.70};

        movie2.dateTime = java.util.Arrays.asList(new String[] {"11:15","16:15","21:15"});
        movie2.ticketLeft = new int[] {50,41,31};

        //Movie 3 RUBY SPARKS

        movie3.setMovieID(3);
        movie3.setName("RUBY SPARKS");
        movie3.setTeaserImg("../imgTeaser/teaser3.png");
        movie3.setInfoText("Calvin (Paul Dano) is a young novelist who achieved phenomenal success early in his career but is now struggling with his writing - as well as his romantic life. Finally, he makes a breakthrough and creates a character named Ruby who inspires him. When Calvin finds Ruby (Zoe Kazan), in the flesh, sitting on his couch about a week later, he is completely flabbergasted that his words have turned into a living, breathing person.");
        movie3.setDirected("Jonathan Dayton, Valerie Faris");
        movie3.setCast("Paul Dano, Zoe Kazan, Antonio Banderas, Annette Bening, Steve Coogan, Elliott Gould, Chris Messina, Deborah Ann Woll");

        movie3.price = new double[] {14.90,7.60,10.70};

        movie3.dateTime = java.util.Arrays.asList(new String[] {"12:20","17:20","22:20"});
        movie3.ticketLeft =  new int[] {49,9,33};


        //Movie 4 MADAGASCAR 3: EUROPES MOST WANTED IN 3D

        movie4.setMovieID(4);
        movie4.setName("MADAGASCAR 3: EUROPES MOST WANTED IN 3D");
        movie4.setTeaserImg("../imgTeaser/teaser4.png");
        movie4.setInfoText("Alex the Lion, Marty the Zebra, Gloria the Hippo, and Melman the Giraffe are still fighting to get home to their beloved Big Apple and of course, King Julien, Maurice and the Penguins are all along for the comedic adventure. Their journey takes them through Europe where they find the perfect cover: a traveling circus, which they reinvent - Madagascar style.");
        movie4.setDirected("Eric Darnell, Conrad Vernon");
        movie4.setCast("Ben Stiller, Chris Rock, David Schwimmer, Jada Pinkett Smith, Sacha Baron Cohen, Cedric The Entertainer, Andy Richter, Frances McDormand");

        movie4.price = new double[] {14.90,7.60,10.70};

        movie4.dateTime = java.util.Arrays.asList(new String[] {"13:05","18:05","23:05"});
        movie4.ticketLeft =  new int[] {32,43,22};

        //Movie 5 The Twilight Saga: Breaking Dawn - Part 2

        movie5.setMovieID(5);
        movie5.setName("MThe Twilight Saga: Breaking Dawn - Part 2");
        movie5.setTeaserImg("../imgTeaser/teaser5.png");
        movie5.setInfoText("The astonishing conclusion to the series, THE TWILIGHT SAGA: BREAKING DAWN, PART 2," +
                 " illuminates the secrets and mysteries of this spellbinding romantic epic that has entranced millions.");
        movie5.setDirected("Bill Condon");
        movie5.setCast("Kristen Stewart, Robert Pattinson, Taylor Lautner");

        movie5.price = new double[] {12.90,6.60,9.70};

        movie5.dateTime = java.util.Arrays.asList(new String[] {"14:10","19:10","00:10"});
        movie5.ticketLeft =  new int[] {44,22,12};

        //Movie 6 Skyfall

        movie6.setMovieID(6);
        movie6.setName("Skyfall");
        movie6.setTeaserImg("../imgTeaser/teaser6.png");
        movie6.setInfoText("Daniel Craig is back as Ian Fleming’s James Bond 007 in Skyfall, the 23rd adventure in the longest-running film franchise of all time. In Skyfall, Bond’s loyalty to M is tested as her past comes back to haunt her. As MI6 comes under attack, 007 must track down and destroy the threat, no matter how personal the cost.");
        movie6.setDirected("Sam Mendes");
        movie6.setCast("Daniel Craig, Javier Bardem, Ralph Fiennes, Naomie Harris, Berenice Marlohe, Ben Whishaw, Helen McCrory, Rory Kinear, Albert Finney, Judi Dench");

        movie6.price = new double[] {11.90,6.60,9.70};

        movie6.dateTime = java.util.Arrays.asList(new String[] {"08:15","13:15","18:15"});
        movie6.ticketLeft =  new int[] {34,12,32};

        //Movie 7 HIT AND RUN

        movie7.setMovieID(7);
        movie7.setName("HIT AND RUN");
        movie7.setTeaserImg("../imgTeaser/teaser7.png");
        movie7.setInfoText("Daniel Craig is back as Ian Fleming’s James Bond 007 in Skyfall, the 23rd adventure in the longest-running film franchise of all time. In Skyfall, Bond’s loyalty to M is tested as her past comes back to haunt her. As MI6 comes under attack, 007 must track down and destroy the threat, no matter how personal the cost.");
        movie7.setDirected("Sam Mendes");
        movie7.setCast("Daniel Craig, Javier Bardem, Ralph Fiennes, Naomie Harris, Berenice Marlohe, Ben Whishaw, Helen McCrory, Rory Kinear, Albert Finney, Judi Dench");

        movie7.price = new double[] {11.90,6.60,9.70};

        movie7.dateTime = java.util.Arrays.asList(new String[] {"08:15","13:15","18:15"});
        movie7.ticketLeft =  new int[] {34,12,32};

        //Movie 8 HOTEL TRANSYLVANIA IN 3D

        movie8.setMovieID(8);
        movie8.setName("HOTEL TRANSYLVANIA IN 3D");
        movie8.setTeaserImg("../imgTeaser/teaser8.png");
        movie8.setInfoText("Welcome to the Hotel Transylvania, Dracula’s (Adam Sandler) lavish five-stake resort, where monsters and their families can live it up, free to be the monsters they are without humans to bother them. On one special weekend, Dracula has invited some of the world’s most famous monsters—Frankenstein and his bride, the Mummy, the Invisible Man, a family of werewolves, and more—to celebrate his daughter Mavis’s 118th birthday. For Drac, catering to all of these legendary monsters is no problem—but his world could come crashing down when one ordinary guy stumbles on the hotel and takes a shine to Mavis.");
        movie8.setDirected("Genndy Tartakovsky");
        movie8.setCast("Adam Sandler, Andy Samberg, Kevin James, Selena Gomez, Steve Buscemi, CeeLo Green, David Spade, Molly Shannon, Fran Drescher");

        movie8.price = new double[] {18.90,9.60,14.70};

        movie8.dateTime = java.util.Arrays.asList(new String[] {"10:30","15:30","20:30"});
        movie8.ticketLeft =  new int[] {12,20,30};

        //Movie 9 Frankenweenie (3D)

        movie9.setMovieID(9);
        movie9.setName("Frankenweenie (3D)");
        movie9.setTeaserImg("../imgTeaser/teaser9.png");
        movie9.setInfoText("From creative genius Tim Burton (Alice in Wonderland, The Nightmare Before Christmas) comes Frankenweenie, a heartwarming tale about a boy and his dog. After unexpectedly losing his beloved dog Sparky, young Victor harnesses the power of science to bring his best friend back to life—with just a few minor adjustments. He tries to hide his home-sewn creation, but when Sparky gets out, Victor’s fellow students, teachers and the entire town all learn that getting a new “leash on life” can be monstrous.");
        movie9.setDirected("Tim Burton");
        movie9.setCast( "Winona Ryder, Martin Short, Catherine O'Hara, Martin Landau, Charlie Tahan, Atticus Shaffer, Robert Capron, Conchata Ferrell");

        movie9.price = new double[] {17.90,8.60,12.70};

        movie9.dateTime = java.util.Arrays.asList(new String[] {"11:45","16:45","21:45"});
        movie9.ticketLeft =  new int[] {30,20,30};

      }
/******************************************************************************/
     //Short code to select a movie and clear ticket information
      public  void setSelectedMovie(MovieStandard movvar){
          //clear movie information

          jRButtonAdult.setSelected(false);
          jRButtonChild.setSelected(false);
          jRButtonStudent.setSelected(false);
          jTextTLeft.setText("");
          jTextTPrice.setText("");
          jCBTime.removeAllItems();
          ticketTimeId = 0;


          //set movie information on screen
          jTextMName.setText(movvar.getName());
          jTextMInfo.setText(movvar.getInfoText());
          jTextMCast.setText(movvar.getCast());
          jTextMDirected.setText(movvar.getDirected());
          imageVar = new ImageIcon(UsersForm.class.getResource(movvar.getTeaserImg()));
          jLabelTeaserImg.setIcon(imageVar);


          //fill the cbbox with time
          for (int i=0; i<movvar.dateTime.size(); i++){
            jCBTime.addItem(movvar.dateTime.get(i));
          }

          //set movie identificator
          movieIdent = movvar.getMovieID();
          //set ticket left with first dateTime item
          //tempTicketLeft = new ArrayList(movvar.ticketLeft);
          updateTicketLeft(movieIdent,0);

          //disable ticket types
          if ((jRButtonAdult.isSelected()) 
                  ||(jRButtonChild.isSelected())
                    ||(jRButtonStudent.isSelected())){
                RButtonACS.clearSelection();
                jTextTPrice.setText("");
          }



      }

      //Ticket left field change
      public void updateTicketLeft(int movId,int id){
          getMStandard(movId);

            jTextTLeft.setText(""+tempMovie.ticketLeft[id]);
            //checking for buy ticket button
                if (tempMovie.ticketLeft[id]==0){
                jButtonBuy.setEnabled(false);
                } else {
                jButtonBuy.setEnabled(true);
                }
      }

      //Ticket type function
      public void setTicketPrice(int movId,int tId){
        getMStandard(movId);
          switch(tId){
              case 0:
                        ticketTypeId=tId;
                        jTextTPrice.setText(""+df.format(tempMovie.getPriceAdult()));
                        break;
              case 1:
                        ticketTypeId=tId;
                        jTextTPrice.setText(""+df.format(tempMovie.getPriceChild()));
                        break;
              case 2:
                        ticketTypeId=tId;
                        jTextTPrice.setText(""+df.format(tempMovie.getPriceStudent()));
                        break;
          }

      }

      //copy movie object to temporary object
      public MovieStandard getMStandard(int movId){

          switch(movId){
                    case 1:
                            tempMovie = movie1;
                            break;
                    case 2:
                            tempMovie = movie2;
                            break;
                    case 3:
                            tempMovie = movie3;
                            break;
                    case 4:
                            tempMovie = movie4;
                            break;
                    case 5:
                            tempMovie = movie5;
                            break;
                    case 6:
                            tempMovie = movie6;
                             break;
                    case 7:
                            tempMovie = movie7;
                             break;
                    case 8:
                            tempMovie = movie8;
                            break;
                    case 9:
                            tempMovie = movie9;
                            break;
           }
           return tempMovie;

      }

      //copy temporary object to movie object
      public static  void saveMStandard(int movId){

          switch(movId){
                    case 1:
                            movie1 = tempMovie;
                            break;
                    case 2:
                            movie2 = tempMovie;
                            break;
                    case 3:
                            movie3 = tempMovie;
                            break;
                    case 4:
                            movie4 = tempMovie;
                            break;
                    case 5:
                            movie5 = tempMovie;
                            break;
                    case 6:
                            movie6 = tempMovie;
                            break;
                    case 7:
                            movie7 = tempMovie;
                            break;
                    case 8:
                            movie8 = tempMovie;
                            break;
                    case 9:
                            movie9 = tempMovie;
                            break;
           }
      }

      public void buyTicket(){
          //checking for type of a ticket, that is NOT selected
          if (!(jRButtonAdult.isSelected())
                  && !(jRButtonChild.isSelected())
                        && !(jRButtonStudent.isSelected())){
            // error message that the ticket type is not selected
            JOptionPane.showMessageDialog(null, "Please select a type of a ticket.");
          }
          //matching ticket price and cash that is in the machine
          else if (tempMovie.price[ticketTypeId]>bankVariable.getCashInside()){
            JOptionPane.showMessageDialog(null, "Please insert more cash in the machine.");
          }
          else {
                  //ticketLeft-- and save it to standard
                  tempMovie.ticketLeft[ticketTimeId]--;
                  bankVariable.calcChange(tempMovie.price[ticketTypeId]);
                  saveMStandard(tempMovie.getMovieID());
                  updateTicketLeft(tempMovie.getMovieID(),ticketTimeId);
          }
          
      }

/******************************************************************************/
/******************************************************************************/
/******************************************************************************/
      InsertCash insertCashFrame = new InsertCash();
      Restock restockFrame = new Restock();
     


      public static class BankStandard{

          /* bank array
           * id 0 cashInBank10c
           * id 1 cashInBank20c
           * id 2 cashInBank50c
           * id 3 cashInBank1e
           * id 4 cashInBank2e
           * id 5 cashInBank5e
           * id 6 cashInBank10e
           * id 7 cashInBank20e
           */
         public int bankArray[] = {0,0,0,0,0,0,0,0};
         public  int cashInside[] = {0,0,0,0,0,0,0,0};
         public int changeGiven[] = {0,0,0,0,0,0,0,0};
         //public int extraChange[] =  {0,0,0,0,0,0,0,0};
         public double extrachange = 0.0;
         public double bankSavings =0;

        public double getBank(){
                    bankSavings = (bankArray[0] * 0.10) +
                                    (bankArray[1] * 0.20) +
                                        (bankArray[2] * 0.50) +
                                            (bankArray[3] * 1.00) +
                                                (bankArray[4] * 2.00) +
                                                    (bankArray[5] * 5.00) +
                                                        (bankArray[6] * 10.00) +
                                                            (bankArray[7] * 20.00);
            return bankSavings;
        }

        public void setBank(int cashInBank10c, int cashInBank20c, int cashInBank50c, int cashInBank1e,
                            int cashInBank2e,int cashInBank5e,int cashInBank10e,int cashInBank20e){
               bankArray[0] = cashInBank10c;
               bankArray[1] = cashInBank20c;
               bankArray[2] = cashInBank50c;
               bankArray[3] = cashInBank1e;
               bankArray[4] = cashInBank2e;
               bankArray[5] = cashInBank5e;
               bankArray[6] = cashInBank10e;
               bankArray[7] = cashInBank20e;
        }
      
        
        public void updateCashInside(){
               cashInside[0] = 0;
               cashInside[1] = 0;
               cashInside[2] = 0;
               cashInside[3] = 0;
               cashInside[4] = 0;
               cashInside[5] = 0;
               cashInside[6] = 0;
               cashInside[7] = 0;
               changeGiven[0] = 0;
               changeGiven[1] = 0;
               changeGiven[2] = 0;
               changeGiven[3] = 0;
               changeGiven[4] = 0;
               changeGiven[5] = 0;
               changeGiven[6] = 0;
               changeGiven[7] = 0;
               jTextCreditInside.setText("" +df.format(bankVariable.getCashInside()));
               
        }

        
        public double getCashInside(){
                      return     (cashInside[0] * 0.10) +
                                    (cashInside[1] * 0.20) +
                                        (cashInside[2] * 0.50) +
                                            (cashInside[3] * 1.00) +
                                                (cashInside[4] * 2.00) +
                                                    (cashInside[5] * 5.00) +
                                                        (cashInside[6] * 10.00) +
                                                            (cashInside[7] * 20.00);

        }

        public double getChangeGiven(){
                      return     (changeGiven[0] * 0.10) +
                                    (changeGiven[1] * 0.20) +
                                        (changeGiven[2] * 0.50) +
                                            (changeGiven[3] * 1.00) +
                                                (changeGiven[4] * 2.00) +
                                                    (changeGiven[5] * 5.00) +
                                                        (changeGiven[6] * 10.00) +
                                                            (changeGiven[7] * 20.00);

        }

        public void calcChange(double tPrice){
            
             double vChange = getCashInside() - tPrice;
             double vMod = 0;
             int vCoin = 0;
             
             vCoin = (int)(vChange/20);
             vMod = vChange%20;


             if (!(vChange==0)){

                if ((vMod==0)&& (vCoin <=bankArray[7])){
                    changeGiven[7] = vCoin;
                    bankArray[7] = bankArray[7] - vCoin;
                    vChange = 0;

                } else if((vMod>=0) && (vCoin >= bankArray[7])){
                    vChange = vMod + (vCoin - bankArray[7])*20;
                    changeGiven[7] = bankArray[7];
                    bankArray[7] = 0;

                }
                else if((vMod>0) && (vCoin < bankArray[7])){
                    vChange = vMod ;
                    changeGiven[7] = vCoin;
                    bankArray[7] = bankArray[7]-vCoin;
                }
             }

             vCoin = (int)(vChange/10);
             vMod = vChange%10;

             if (!(vChange==0)){
                if ((vMod==0)&& (vCoin <=bankArray[6])){
                    changeGiven[6] = vCoin;
                    bankArray[6] = bankArray[6] - vCoin;
                    vChange = 0;

                } else if((vMod>=0) && (vCoin >= bankArray[6])){
                    vChange = vMod + (vCoin - bankArray[6])*10;
                    changeGiven[6] = bankArray[6];
                    bankArray[6] = 0;                    
                }
                else if((vMod>0) && (vCoin < bankArray[6])){
                    vChange = vMod ;
                    changeGiven[6] = vCoin;
                    bankArray[6] = bankArray[6]-vCoin;
                }

             }

             vCoin = (int)(vChange/5);
             vMod = vChange%5;

             if (!(vChange==0)){
                if ((vMod==0)&& (vCoin <=bankArray[5])){
                    changeGiven[5] = vCoin;
                    bankArray[5] = bankArray[5] - vCoin;
                    vChange = 0;

                } else if((vMod>=0) && (vCoin >= bankArray[5])){
                    vChange = vMod + (vCoin - bankArray[5])*5;
                    changeGiven[5] = bankArray[5];
                    bankArray[5] = 0;

                } else if((vMod>0) && (vCoin < bankArray[5])){
                    vChange = vMod ;
                    changeGiven[5] = vCoin;
                    bankArray[5] = bankArray[5]-vCoin;
                }

             }
                          


             vCoin = (int)(vChange/2);
             vMod = vChange%2;
             if (!(vChange==0)){
                if ((vMod==0)&& (vCoin <=bankArray[4])){
                    changeGiven[4] = vCoin;
                    bankArray[4] = bankArray[4] - vCoin;
                    vChange = 0;

                } else if((vMod>=0) && (vCoin >= bankArray[4])){
                    vChange = vMod + (vCoin - bankArray[4])*2;
                    changeGiven[4] = bankArray[4];
                    bankArray[4] = 0;

                }else if((vMod>0) && (vCoin < bankArray[4])){
                    vChange = vMod ;
                    changeGiven[4] = vCoin;
                    bankArray[4] = bankArray[4]-vCoin;
                }

             }

             vCoin = (int)(vChange/1);
             vMod = vChange%1;
             if (!(vChange==0)){
                if ((vMod==0)&& (vCoin <=bankArray[3])){
                    changeGiven[3] = vCoin;
                    bankArray[3] = bankArray[3] - vCoin;
                    vChange = 0;

                } else if((vMod>=0) && (vCoin >= bankArray[3])){
                    vChange = vMod + (vCoin - bankArray[3])*1;
                    changeGiven[3] = bankArray[3];
                    bankArray[3] = 0;

                }else if((vMod>0) && (vCoin < bankArray[3])){
                    vChange = vMod ;
                    changeGiven[3] = vCoin;
                    bankArray[3] = bankArray[3]-vCoin;
                }

             }

             vCoin = (int)(vChange/0.5);
             vMod = vChange%0.5;
             if (!(vChange==0)){
                if ((vMod==0)&& (vCoin <=bankArray[2])){
                    changeGiven[2] = vCoin;
                    bankArray[2] = bankArray[2] - vCoin;
                    vChange = 0;

                } else if((vMod>=0) && (vCoin >= bankArray[2])){
                    vChange = vMod + (vCoin - bankArray[2])*0.5;
                    changeGiven[2] = bankArray[2];
                    bankArray[2] = 0;

                }else if((vMod>0) && (vCoin < bankArray[2])){
                    vChange = vMod ;
                    changeGiven[2] = vCoin;
                    bankArray[2] = bankArray[2]-vCoin;
                }

             }

             vCoin = (int)(vChange/0.2);
             vMod = vChange%0.2;
             if (!(vChange==0)){
                if ((vMod==0)&& (vCoin <=bankArray[1])){
                    changeGiven[1] = vCoin;
                    bankArray[1] = bankArray[1] - vCoin;
                    vChange = 0;
                    

                } else if((vMod>=0) && (vCoin >= bankArray[1])){
                    vChange = vMod + ((vCoin - bankArray[1])*0.2);
                    changeGiven[1] = bankArray[1];
                    bankArray[1] = 0;

                }else if((vMod>0) && (vCoin < bankArray[1])){
                    vChange = vMod ;
                    changeGiven[1] = vCoin;
                    bankArray[1] = bankArray[1]-vCoin;
                }

             }

             

             if ((vChange>0.09) &&(vChange<0.1)){vChange =0.1;}
             vCoin = (int)(vChange/0.1);
             
             vMod = vChange%0.1;
             //JOptionPane.showMessageDialog(null, " " + vChange + " /0.1 =" + vCoin + "("+vMod +")");
             if (!(vChange==0)){
                if ((vMod==0)&& (vCoin <=bankArray[0])){
                    changeGiven[0] = vCoin;
                    bankArray[0] = bankArray[0] - vCoin;
                    vChange = 0;

                } else if((vMod>0) && (vCoin < bankArray[0])){
                    vChange = vMod ;
                    changeGiven[0] = vCoin;
                    bankArray[0] = bankArray[0]-vCoin;
                }else if((vMod>=0) && (vCoin >= bankArray[0])){
                    changeGiven[0] = bankArray[0];
                    bankArray[0] = 0;
                    
                    vChange = (getCashInside() - tPrice) -getChangeGiven();


                }
       
             }

             if (joptionCheckChange){
             JOptionPane.showMessageDialog(null,""+ df.format((getCashInside() - tPrice))+" - full change Change to be given \n"+
                       df.format(getChangeGiven()) +" - change given by "+ "machine change was given to user\n"+
                    df.format(vChange)+ " - extra change (if it is not enough coins in the machine)\n\n" +
                    "Coins to be Given ║ Coins in bank left ║  type \n"+
                    changeGiven[7] + "                               ║ "+ bankArray[7] + "                                ║ 20eur\n" +
                    changeGiven[6] + "                               ║ "+ bankArray[6] + "                                ║ 10eur\n" +
                    changeGiven[5] + "                               ║ "+ bankArray[5] + "                                ║ 5eur\n" +
                    changeGiven[4] + "                               ║ "+ bankArray[4] + "                                ║ 2eur\n" +
                    changeGiven[3] + "                               ║ "+ bankArray[3] + "                                ║ 1eur\n" +
                    changeGiven[2] + "                               ║ "+ bankArray[2] + "                                ║ 0.5eur\n" +
                    changeGiven[1] + "                               ║ "+ bankArray[1] + "                                ║ 0.2eur\n" +
                    changeGiven[0] + "                               ║ "+ bankArray[0] + "                                ║ 0.1eur\n");
             }
                         updateCashInside();
        }

      }







/******************************************************************************/
     public static BankStandard bankVariable = new BankStandard();
     public static boolean joptionCheckChange = true;
      static DecimalFormat df = new DecimalFormat("0.00");
      public String password = "admin";
      public String passwordEntered = "no pasword";



/******************************************************************************/

      // run restock form
      public void restockForm(){
      restockFrame.setVisible(true);

              if (startframes.UsersForm.movieIdent==0){
            
            restockFrame.jTTime1.setEnabled(false);
            restockFrame.jTTime2.setEnabled(false);
            restockFrame.jTTime3.setEnabled(false);
            restockFrame.jTTLeft1.setEnabled(false);
            restockFrame.jTTLeft2.setEnabled(false);
            restockFrame.jTTLeft3.setEnabled(false);
            restockFrame.jTAdultP.setEnabled(false);
            restockFrame.jTChildP.setEnabled(false);
            restockFrame.jTStudentP.setEnabled(false);
            restockFrame.jLMovieName.setText("No movie was selected");


        } else {
                restockFrame.jTTime1.setEnabled(true);

                restockFrame.jTTime2.setEnabled(true);
                restockFrame.jTTime3.setEnabled(true);
                restockFrame.jTTLeft1.setEnabled(true);
                restockFrame.jTTLeft2.setEnabled(true);
                restockFrame.jTTLeft3.setEnabled(true);
                restockFrame.jTAdultP.setEnabled(true);
                restockFrame.jTChildP.setEnabled(true);
                restockFrame.jTStudentP.setEnabled(true);

                restockFrame.jTTLeft1.setText("" + tempMovie.ticketLeft[0]);
                restockFrame.jTTLeft2.setText("" + tempMovie.ticketLeft[1]);
                restockFrame.jTTLeft3.setText("" + tempMovie.ticketLeft[2]);
                restockFrame.jTTime1.setText("" + tempMovie.dateTime.get(0));
                restockFrame.jTTime2.setText("" + tempMovie.dateTime.get(1));
                restockFrame.jTTime3.setText("" + tempMovie.dateTime.get(2));
                restockFrame.jTAdultP.setText("" +df.format(tempMovie.price[0]));
                restockFrame.jTStudentP.setText("" + df.format(tempMovie.price[1]));
                restockFrame.jTChildP.setText("" + df.format(tempMovie.price[2]));
                restockFrame.jLMovieName.setText("" + tempMovie.name);

        }


        restockFrame.jT10c.setText("" + bankVariable.bankArray[0]);
        restockFrame.jT20c.setText("" + bankVariable.bankArray[1]);
        restockFrame.jT50c.setText("" + bankVariable.bankArray[2]);
        restockFrame.jT1e.setText("" + bankVariable.bankArray[3]);
        restockFrame.jT2e.setText("" + bankVariable.bankArray[4]);
        restockFrame.jT5e.setText("" + bankVariable.bankArray[5]);
        restockFrame.jT10e.setText("" + bankVariable.bankArray[6]);
        restockFrame.jT20e.setText("" + bankVariable.bankArray[7]);
        restockFrame.jOptionCheck.setSelected(joptionCheckChange);

      }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TButtonMovieSelect = new javax.swing.ButtonGroup();
        RButtonACS = new javax.swing.ButtonGroup();
        jPanelMovieSelect = new javax.swing.JPanel();
        jTButtonMovie1 = new javax.swing.JToggleButton();
        jTButtonMovie2 = new javax.swing.JToggleButton();
        jTButtonMovie3 = new javax.swing.JToggleButton();
        jTButtonMovie4 = new javax.swing.JToggleButton();
        jTButtonMovie5 = new javax.swing.JToggleButton();
        jTButtonMovie6 = new javax.swing.JToggleButton();
        jTButtonMovie7 = new javax.swing.JToggleButton();
        jTButtonMovie8 = new javax.swing.JToggleButton();
        jTButtonMovie9 = new javax.swing.JToggleButton();
        jPanelMovieInfo = new javax.swing.JPanel();
        jTextMInfo = new javax.swing.JTextArea();
        jTextMCast = new javax.swing.JTextArea();
        jLabelTeaserImg = new javax.swing.JLabel();
        jTextMName = new javax.swing.JTextField();
        jTextMDirected = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelBuyTicket = new javax.swing.JPanel();
        jRButtonAdult = new javax.swing.JRadioButton();
        jRButtonChild = new javax.swing.JRadioButton();
        jRButtonStudent = new javax.swing.JRadioButton();
        jTextTLeft = new javax.swing.JTextField();
        jTextCreditInside = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCBTime = new javax.swing.JComboBox();
        jButtonBuy = new javax.swing.JButton();
        jButtonCashBack = new javax.swing.JButton();
        jTextTPrice = new javax.swing.JTextField();
        jButtonInsertCash = new javax.swing.JButton();
        jBRestock = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cinema Vending Machine");
        setBackground(new java.awt.Color(-16777216,true));
        setForeground(new java.awt.Color(-16777216,true));
        setMinimumSize(new java.awt.Dimension(895, 635));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanelMovieSelect.setBackground(new java.awt.Color(0, 0, 0));

        TButtonMovieSelect.add(jTButtonMovie1);
        jTButtonMovie1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgTeaser/teaser1g.png"))); // NOI18N
        jTButtonMovie1.setMaximumSize(new java.awt.Dimension(130, 193));
        jTButtonMovie1.setMinimumSize(new java.awt.Dimension(130, 193));
        jTButtonMovie1.setPreferredSize(new java.awt.Dimension(130, 193));
        jTButtonMovie1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgTeaser/teaser1.png"))); // NOI18N
        jTButtonMovie1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTButtonMovie1ActionPerformed(evt);
            }
        });

        TButtonMovieSelect.add(jTButtonMovie2);
        jTButtonMovie2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgTeaser/teaser2g.png"))); // NOI18N
        jTButtonMovie2.setMaximumSize(new java.awt.Dimension(130, 193));
        jTButtonMovie2.setMinimumSize(new java.awt.Dimension(130, 193));
        jTButtonMovie2.setPreferredSize(new java.awt.Dimension(130, 193));
        jTButtonMovie2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgTeaser/teaser2.png"))); // NOI18N
        jTButtonMovie2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTButtonMovie2ActionPerformed(evt);
            }
        });

        TButtonMovieSelect.add(jTButtonMovie3);
        jTButtonMovie3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgTeaser/teaser3g.png"))); // NOI18N
        jTButtonMovie3.setMaximumSize(new java.awt.Dimension(130, 193));
        jTButtonMovie3.setMinimumSize(new java.awt.Dimension(130, 193));
        jTButtonMovie3.setPreferredSize(new java.awt.Dimension(130, 193));
        jTButtonMovie3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgTeaser/teaser3.png"))); // NOI18N
        jTButtonMovie3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTButtonMovie3ActionPerformed(evt);
            }
        });

        TButtonMovieSelect.add(jTButtonMovie4);
        jTButtonMovie4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgTeaser/teaser4g.png"))); // NOI18N
        jTButtonMovie4.setMaximumSize(new java.awt.Dimension(130, 193));
        jTButtonMovie4.setMinimumSize(new java.awt.Dimension(130, 193));
        jTButtonMovie4.setPreferredSize(new java.awt.Dimension(130, 193));
        jTButtonMovie4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgTeaser/teaser4.png"))); // NOI18N
        jTButtonMovie4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTButtonMovie4ActionPerformed(evt);
            }
        });

        TButtonMovieSelect.add(jTButtonMovie5);
        jTButtonMovie5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgTeaser/teaser5g.png"))); // NOI18N
        jTButtonMovie5.setMaximumSize(new java.awt.Dimension(130, 193));
        jTButtonMovie5.setMinimumSize(new java.awt.Dimension(130, 193));
        jTButtonMovie5.setPreferredSize(new java.awt.Dimension(130, 193));
        jTButtonMovie5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgTeaser/teaser5.png"))); // NOI18N
        jTButtonMovie5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTButtonMovie5ActionPerformed(evt);
            }
        });

        TButtonMovieSelect.add(jTButtonMovie6);
        jTButtonMovie6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgTeaser/teaser6g.png"))); // NOI18N
        jTButtonMovie6.setMaximumSize(new java.awt.Dimension(130, 193));
        jTButtonMovie6.setMinimumSize(new java.awt.Dimension(130, 193));
        jTButtonMovie6.setPreferredSize(new java.awt.Dimension(130, 193));
        jTButtonMovie6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgTeaser/teaser6.png"))); // NOI18N
        jTButtonMovie6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTButtonMovie6ActionPerformed(evt);
            }
        });

        TButtonMovieSelect.add(jTButtonMovie7);
        jTButtonMovie7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgTeaser/teaser7g.png"))); // NOI18N
        jTButtonMovie7.setMaximumSize(new java.awt.Dimension(130, 193));
        jTButtonMovie7.setMinimumSize(new java.awt.Dimension(130, 193));
        jTButtonMovie7.setPreferredSize(new java.awt.Dimension(130, 193));
        jTButtonMovie7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgTeaser/teaser7.png"))); // NOI18N
        jTButtonMovie7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTButtonMovie7ActionPerformed(evt);
            }
        });

        TButtonMovieSelect.add(jTButtonMovie8);
        jTButtonMovie8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgTeaser/teaser8g.png"))); // NOI18N
        jTButtonMovie8.setMaximumSize(new java.awt.Dimension(130, 193));
        jTButtonMovie8.setMinimumSize(new java.awt.Dimension(130, 193));
        jTButtonMovie8.setPreferredSize(new java.awt.Dimension(130, 193));
        jTButtonMovie8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgTeaser/teaser8.png"))); // NOI18N
        jTButtonMovie8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTButtonMovie8ActionPerformed(evt);
            }
        });

        TButtonMovieSelect.add(jTButtonMovie9);
        jTButtonMovie9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgTeaser/teaser9g.png"))); // NOI18N
        jTButtonMovie9.setMaximumSize(new java.awt.Dimension(130, 193));
        jTButtonMovie9.setMinimumSize(new java.awt.Dimension(130, 193));
        jTButtonMovie9.setPreferredSize(new java.awt.Dimension(130, 193));
        jTButtonMovie9.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgTeaser/teaser9.png"))); // NOI18N
        jTButtonMovie9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTButtonMovie9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMovieSelectLayout = new javax.swing.GroupLayout(jPanelMovieSelect);
        jPanelMovieSelect.setLayout(jPanelMovieSelectLayout);
        jPanelMovieSelectLayout.setHorizontalGroup(
            jPanelMovieSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMovieSelectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMovieSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMovieSelectLayout.createSequentialGroup()
                        .addComponent(jTButtonMovie1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTButtonMovie2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTButtonMovie3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMovieSelectLayout.createSequentialGroup()
                        .addGroup(jPanelMovieSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTButtonMovie4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTButtonMovie7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMovieSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTButtonMovie5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTButtonMovie8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMovieSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTButtonMovie9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTButtonMovie6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanelMovieSelectLayout.setVerticalGroup(
            jPanelMovieSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMovieSelectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMovieSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTButtonMovie1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTButtonMovie2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTButtonMovie3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMovieSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTButtonMovie5, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTButtonMovie4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTButtonMovie6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMovieSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTButtonMovie7, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTButtonMovie8, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTButtonMovie9, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelMovieSelect);
        jPanelMovieSelect.setBounds(0, 0, 426, 613);

        jPanelMovieInfo.setBackground(new java.awt.Color(0, 0, 0));
        jPanelMovieInfo.setPreferredSize(new java.awt.Dimension(440, 340));
        jPanelMovieInfo.setLayout(null);

        jTextMInfo.setBackground(new java.awt.Color(0, 0, 0));
        jTextMInfo.setColumns(20);
        jTextMInfo.setEditable(false);
        jTextMInfo.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTextMInfo.setForeground(new java.awt.Color(-1,true));
        jTextMInfo.setLineWrap(true);
        jTextMInfo.setRows(5);
        jTextMInfo.setWrapStyleWord(true);
        jPanelMovieInfo.add(jTextMInfo);
        jTextMInfo.setBounds(10, 90, 280, 150);

        jTextMCast.setBackground(new java.awt.Color(0, 0, 0));
        jTextMCast.setColumns(20);
        jTextMCast.setEditable(false);
        jTextMCast.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTextMCast.setForeground(new java.awt.Color(-1,true));
        jTextMCast.setLineWrap(true);
        jTextMCast.setRows(5);
        jTextMCast.setWrapStyleWord(true);
        jPanelMovieInfo.add(jTextMCast);
        jTextMCast.setBounds(60, 250, 190, 90);

        jLabelTeaserImg.setForeground(new java.awt.Color(-1,true));
        jLabelTeaserImg.setMaximumSize(new java.awt.Dimension(130, 193));
        jLabelTeaserImg.setMinimumSize(new java.awt.Dimension(130, 193));
        jLabelTeaserImg.setPreferredSize(new java.awt.Dimension(130, 193));
        jPanelMovieInfo.add(jLabelTeaserImg);
        jLabelTeaserImg.setBounds(300, 50, 130, 193);

        jTextMName.setBackground(new java.awt.Color(0, 0, 0));
        jTextMName.setEditable(false);
        jTextMName.setFont(new java.awt.Font("Arial Black", 0, 16));
        jTextMName.setForeground(new java.awt.Color(-4144960,true));
        jTextMName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextMName.setBorder(null);
        jPanelMovieInfo.add(jTextMName);
        jTextMName.setBounds(0, 10, 470, 23);

        jTextMDirected.setBackground(new java.awt.Color(0, 0, 0));
        jTextMDirected.setEditable(false);
        jTextMDirected.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTextMDirected.setForeground(new java.awt.Color(-1,true));
        jTextMDirected.setBorder(null);
        jPanelMovieInfo.add(jTextMDirected);
        jTextMDirected.setBounds(280, 270, 180, 15);

        jLabel1.setBackground(new java.awt.Color(-16777216,true));
        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12));
        jLabel1.setForeground(new java.awt.Color(-1,true));
        jLabel1.setText("Cast:");
        jPanelMovieInfo.add(jLabel1);
        jLabel1.setBounds(10, 250, 40, 20);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12));
        jLabel2.setForeground(new java.awt.Color(-1,true));
        jLabel2.setText("Directed by:");
        jPanelMovieInfo.add(jLabel2);
        jLabel2.setBounds(280, 250, 90, 20);

        getContentPane().add(jPanelMovieInfo);
        jPanelMovieInfo.setBounds(426, 0, 470, 340);

        jPanelBuyTicket.setBackground(new java.awt.Color(-16777216,true));
        jPanelBuyTicket.setLayout(null);

        jRButtonAdult.setBackground(new java.awt.Color(-16777216,true));
        RButtonACS.add(jRButtonAdult);
        jRButtonAdult.setFont(new java.awt.Font("Arial", 1, 12));
        jRButtonAdult.setForeground(new java.awt.Color(-1,true));
        jRButtonAdult.setText("Adult");
        jRButtonAdult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRButtonAdultActionPerformed(evt);
            }
        });
        jPanelBuyTicket.add(jRButtonAdult);
        jRButtonAdult.setBounds(10, 10, 55, 23);

        jRButtonChild.setBackground(new java.awt.Color(-16777216,true));
        RButtonACS.add(jRButtonChild);
        jRButtonChild.setFont(new java.awt.Font("Arial", 1, 12));
        jRButtonChild.setForeground(new java.awt.Color(-1,true));
        jRButtonChild.setText("Child");
        jRButtonChild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRButtonChildActionPerformed(evt);
            }
        });
        jPanelBuyTicket.add(jRButtonChild);
        jRButtonChild.setBounds(10, 40, 53, 23);

        jRButtonStudent.setBackground(new java.awt.Color(-16777216,true));
        RButtonACS.add(jRButtonStudent);
        jRButtonStudent.setFont(new java.awt.Font("Arial", 1, 12));
        jRButtonStudent.setForeground(new java.awt.Color(-1,true));
        jRButtonStudent.setText("Student");
        jRButtonStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRButtonStudentActionPerformed(evt);
            }
        });
        jPanelBuyTicket.add(jRButtonStudent);
        jRButtonStudent.setBounds(10, 70, 69, 23);

        jTextTLeft.setBackground(new java.awt.Color(-16777216,true));
        jTextTLeft.setEditable(false);
        jTextTLeft.setFont(new java.awt.Font("Arial", 1, 12));
        jTextTLeft.setForeground(new java.awt.Color(-1,true));
        jTextTLeft.setBorder(null);
        jTextTLeft.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextTLeft.setEnabled(false);
        jTextTLeft.setMinimumSize(new java.awt.Dimension(61, 15));
        jPanelBuyTicket.add(jTextTLeft);
        jTextTLeft.setBounds(280, 10, 80, 15);

        jTextCreditInside.setBackground(new java.awt.Color(-16777216,true));
        jTextCreditInside.setEditable(false);
        jTextCreditInside.setFont(new java.awt.Font("Arial", 1, 12));
        jTextCreditInside.setForeground(new java.awt.Color(-1,true));
        jTextCreditInside.setBorder(null);
        jTextCreditInside.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextCreditInside.setEnabled(false);
        jTextCreditInside.setMinimumSize(new java.awt.Dimension(61, 15));
        jPanelBuyTicket.add(jTextCreditInside);
        jTextCreditInside.setBounds(280, 70, 80, 15);

        jLabel3.setBackground(new java.awt.Color(-16777216,true));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel3.setForeground(new java.awt.Color(-1,true));
        jLabel3.setText("Ticket left");
        jPanelBuyTicket.add(jLabel3);
        jLabel3.setBounds(200, 10, 56, 15);

        jLabel4.setBackground(new java.awt.Color(-16777216,true));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel4.setForeground(new java.awt.Color(-1,true));
        jLabel4.setText("Ticket price");
        jPanelBuyTicket.add(jLabel4);
        jLabel4.setBounds(200, 40, 67, 15);

        jLabel5.setBackground(new java.awt.Color(-16777216,true));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel5.setForeground(new java.awt.Color(-1,true));
        jLabel5.setText("Credit inside");
        jPanelBuyTicket.add(jLabel5);
        jLabel5.setBounds(200, 70, 71, 15);

        jCBTime.setBackground(new java.awt.Color(-16777216,true));
        jCBTime.setFont(new java.awt.Font("Arial", 1, 12));
        jCBTime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jCBTime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(-16777216,true)));
        jCBTime.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jCBTimePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanelBuyTicket.add(jCBTime);
        jCBTime.setBounds(80, 10, 100, 21);

        jButtonBuy.setText("Buy Ticket");
        jButtonBuy.setMaximumSize(new java.awt.Dimension(120, 23));
        jButtonBuy.setMinimumSize(new java.awt.Dimension(120, 23));
        jButtonBuy.setPreferredSize(new java.awt.Dimension(120, 23));
        jButtonBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuyActionPerformed(evt);
            }
        });
        jPanelBuyTicket.add(jButtonBuy);
        jButtonBuy.setBounds(0, 200, 120, 60);

        jButtonCashBack.setText("Cash back");
        jButtonCashBack.setMaximumSize(new java.awt.Dimension(120, 23));
        jButtonCashBack.setMinimumSize(new java.awt.Dimension(120, 23));
        jButtonCashBack.setPreferredSize(new java.awt.Dimension(120, 23));
        jButtonCashBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCashBackActionPerformed(evt);
            }
        });
        jPanelBuyTicket.add(jButtonCashBack);
        jButtonCashBack.setBounds(120, 200, 120, 60);

        jTextTPrice.setBackground(new java.awt.Color(-16777216,true));
        jTextTPrice.setEditable(false);
        jTextTPrice.setFont(new java.awt.Font("Arial", 1, 12));
        jTextTPrice.setForeground(new java.awt.Color(-1,true));
        jTextTPrice.setBorder(null);
        jTextTPrice.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextTPrice.setEnabled(false);
        jTextTPrice.setMinimumSize(new java.awt.Dimension(61, 15));
        jTextTPrice.setPreferredSize(new java.awt.Dimension(61, 15));
        jPanelBuyTicket.add(jTextTPrice);
        jTextTPrice.setBounds(280, 40, 61, 15);

        jButtonInsertCash.setText("Insert Cash");
        jButtonInsertCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertCashActionPerformed(evt);
            }
        });
        jPanelBuyTicket.add(jButtonInsertCash);
        jButtonInsertCash.setBounds(240, 200, 120, 60);

        jBRestock.setText("Restock");
        jBRestock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRestockActionPerformed(evt);
            }
        });
        jPanelBuyTicket.add(jBRestock);
        jBRestock.setBounds(360, 200, 100, 60);

        getContentPane().add(jPanelBuyTicket);
        jPanelBuyTicket.setBounds(426, 340, 470, 272);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTButtonMovie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTButtonMovie1ActionPerformed
        // TODO add your handling code here:
        setSelectedMovie(movie1);
    }//GEN-LAST:event_jTButtonMovie1ActionPerformed

    private void jTButtonMovie2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTButtonMovie2ActionPerformed
        // TODO add your handling code here:
        //setMovieInfo(2);
        setSelectedMovie(movie2);
    }//GEN-LAST:event_jTButtonMovie2ActionPerformed

    private void jTButtonMovie3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTButtonMovie3ActionPerformed
        // TODO add your handling code here:
        setSelectedMovie(movie3);
    }//GEN-LAST:event_jTButtonMovie3ActionPerformed

    private void jTButtonMovie4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTButtonMovie4ActionPerformed
        // TODO add your handling code here:
        setSelectedMovie(movie4);
    }//GEN-LAST:event_jTButtonMovie4ActionPerformed

    private void jTButtonMovie5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTButtonMovie5ActionPerformed
        // TODO add your handling code here:
        setSelectedMovie(movie5);
    }//GEN-LAST:event_jTButtonMovie5ActionPerformed

    private void jTButtonMovie6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTButtonMovie6ActionPerformed
        // TODO add your handling code here:
        setSelectedMovie(movie6);
    }//GEN-LAST:event_jTButtonMovie6ActionPerformed

    private void jTButtonMovie7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTButtonMovie7ActionPerformed
        // TODO add your handling code here:
        setSelectedMovie(movie7);
    }//GEN-LAST:event_jTButtonMovie7ActionPerformed

    private void jTButtonMovie8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTButtonMovie8ActionPerformed
        // TODO add your handling code here:
        setSelectedMovie(movie8);
    }//GEN-LAST:event_jTButtonMovie8ActionPerformed

    private void jTButtonMovie9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTButtonMovie9ActionPerformed
        // TODO add your handling code here:
        setSelectedMovie(movie9);
    }//GEN-LAST:event_jTButtonMovie9ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        createMovieObjects();
        bankVariable.setBank(3, 3, 3, 3, 3, 3, 3, 0);

        
        insertCashFrame.setVisible(false);
        restockFrame.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void jRButtonAdultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRButtonAdultActionPerformed
        // TODO add your handling code here:
        if (movieIdent>0){
        ticketTypeId = 0;
        setTicketPrice(movieIdent,ticketTypeId);}
        else {RButtonACS.clearSelection();}
    }//GEN-LAST:event_jRButtonAdultActionPerformed

    private void jRButtonChildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRButtonChildActionPerformed
        // TODO add your handling code here:
        if (!(movieIdent==0)){
        ticketTypeId = 1;
        setTicketPrice(movieIdent,ticketTypeId);}
        else {RButtonACS.clearSelection();}
    }//GEN-LAST:event_jRButtonChildActionPerformed

    private void jRButtonStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRButtonStudentActionPerformed
        // TODO add your handling code here:
        if (!(movieIdent==0)){
        ticketTypeId = 2;
        setTicketPrice(movieIdent,ticketTypeId);}
        else {RButtonACS.clearSelection();}
    }//GEN-LAST:event_jRButtonStudentActionPerformed

    private void jCBTimePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBTimePopupMenuWillBecomeInvisible
        // TODO add your handling code here:
                if (!(movieIdent==0)){
        ticketTimeId = jCBTime.getSelectedIndex();
        updateTicketLeft(movieIdent, ticketTimeId);}

    }//GEN-LAST:event_jCBTimePopupMenuWillBecomeInvisible

    private void jButtonBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuyActionPerformed
        // TODO add your handling code here:
        buyTicket();
    }//GEN-LAST:event_jButtonBuyActionPerformed

    private void jButtonInsertCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertCashActionPerformed
        // TODO add your handling code here:
        insertCashFrame.setVisible(true);
    }//GEN-LAST:event_jButtonInsertCashActionPerformed

    private void jButtonCashBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCashBackActionPerformed
        // TODO add your handling code here:
        //to check calculation u can add a negative number in to  calcChange function
        bankVariable.calcChange(0);
    }//GEN-LAST:event_jButtonCashBackActionPerformed

    private void jBRestockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRestockActionPerformed
        // TODO add your handling code here:
        passwordEntered = JOptionPane.showInputDialog("Please enter a password.");

        if (passwordEntered.equalsIgnoreCase(password))
        {restockForm();}
        
    }//GEN-LAST:event_jBRestockActionPerformed

    /**
    * @param args the command line arguments
    */
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new UsersForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup RButtonACS;
    private javax.swing.ButtonGroup TButtonMovieSelect;
    private javax.swing.JButton jBRestock;
    private javax.swing.JButton jButtonBuy;
    private javax.swing.JButton jButtonCashBack;
    private javax.swing.JButton jButtonInsertCash;
    private javax.swing.JComboBox jCBTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelTeaserImg;
    private javax.swing.JPanel jPanelBuyTicket;
    private javax.swing.JPanel jPanelMovieInfo;
    private javax.swing.JPanel jPanelMovieSelect;
    private javax.swing.JRadioButton jRButtonAdult;
    private javax.swing.JRadioButton jRButtonChild;
    private javax.swing.JRadioButton jRButtonStudent;
    public static javax.swing.JToggleButton jTButtonMovie1;
    public static javax.swing.JToggleButton jTButtonMovie2;
    public static javax.swing.JToggleButton jTButtonMovie3;
    public static javax.swing.JToggleButton jTButtonMovie4;
    public static javax.swing.JToggleButton jTButtonMovie5;
    public static javax.swing.JToggleButton jTButtonMovie6;
    public static javax.swing.JToggleButton jTButtonMovie7;
    public static javax.swing.JToggleButton jTButtonMovie8;
    public static javax.swing.JToggleButton jTButtonMovie9;
    public static javax.swing.JTextField jTextCreditInside;
    private javax.swing.JTextArea jTextMCast;
    private javax.swing.JTextField jTextMDirected;
    private javax.swing.JTextArea jTextMInfo;
    private javax.swing.JTextField jTextMName;
    private javax.swing.JTextField jTextTLeft;
    private javax.swing.JTextField jTextTPrice;
    // End of variables declaration//GEN-END:variables

}
