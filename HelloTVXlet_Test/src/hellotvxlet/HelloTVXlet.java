package hellotvxlet;

import javax.tv.xlet.*;
import org.dvb.ui.*;


import org.havi.ui.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import org.havi.ui.event.*;
import java.util.concurrent.TimeUnit;



public class HelloTVXlet implements Xlet, HActionListener {

    private XletContext actueleXletContext;
    private HScene scene;
    private boolean debug=true;
    
    private HTextButton knop1 , knop2, knop3,knop4,knop5,knop6,knop7,knop8,knop9,titel,ScoreX,ScoreY;
    
    public String whoseTurn = "";    
    public Timer resetTimer = new Timer();
    
    public String determineWhosTurn (){
        if(whoseTurn.equalsIgnoreCase("X")){
            whoseTurn = "O";                
            return whoseTurn;
        }
        else{
            whoseTurn = "X";            
            return whoseTurn;
        }                
    }
    
    public void xWins(){
        titel.setTextContent("Player X Wins!", HState.NORMAL_STATE);        
        resetGame();
    }
    
    public void oWins(){
        titel.setTextContent("Player Y Wins!", HState.NORMAL_STATE);
        resetGame();
    }
    
    private void resetGame(){
        
        knop1.setTextContent("", HState.NORMAL_STATE);
        knop2.setTextContent("", HState.NORMAL_STATE);
        knop3.setTextContent("", HState.NORMAL_STATE);
        knop4.setTextContent("", HState.NORMAL_STATE);
        knop5.setTextContent("", HState.NORMAL_STATE);
        knop6.setTextContent("", HState.NORMAL_STATE);
        knop7.setTextContent("", HState.NORMAL_STATE);
        knop8.setTextContent("", HState.NORMAL_STATE);
        knop9.setTextContent("", HState.NORMAL_STATE);
        
    }
            
    public void determineIfWin(){
        String one = knop1.getTextContent(HState.NORMAL_STATE);
        String two = knop2.getTextContent(HState.NORMAL_STATE);
        String three = knop3.getTextContent(HState.NORMAL_STATE);
        String four = knop4.getTextContent(HState.NORMAL_STATE);
        String five = knop5.getTextContent(HState.NORMAL_STATE);
        String six = knop6.getTextContent(HState.NORMAL_STATE);
        String seven = knop7.getTextContent(HState.NORMAL_STATE);
        String eight = knop8.getTextContent(HState.NORMAL_STATE);
        String nine = knop9.getTextContent(HState.NORMAL_STATE);
        
        
        // X Wins
        if(one == "X" && two == "X" && three == "X"){           
            xWins();
        }
        if(four == "X" && five == "X" && six == "X"){           
            xWins();
        }          
        if(seven == "X" && eight == "X" && nine == "X"){           
            xWins();
        }          
        if(one == "X" && four == "X" && seven == "X"){           
            xWins();
        }          
        if(two == "X" && five == "X" && eight == "X"){           
            xWins();
        }          
        if(three == "X" && six == "X" && nine == "X"){           
            xWins();
        }          
        if(seven == "X" && five == "X" && three == "X"){           
            xWins();
        }        
        if(one == "X" && five == "X" && nine == "X"){           
            xWins();
        }             
        
        // O Wins
        if(one == "O" && two == "O" && three == "O"){           
            oWins();
        }
        if(four == "O" && five == "O" && six == "O"){           
            oWins();
        }          
        if(seven == "0" && eight == "0" && nine == "0"){           
            oWins();
        }          
        if(one == "0" && four == "0" && seven == "0"){           
            oWins();
        }          
        if(two == "0" && five == "0" && eight == "0"){           
            oWins();
        }          
        if(three == "0" && six == "0" && nine == "0"){           
            oWins();
        }          
        if(seven == "0" && five == "0" && three == "0"){           
            oWins();
        }        
        if(one == "0" && five == "0" && nine == "0"){           
            oWins();
        }          
    }
        
    public void actionPerformed (ActionEvent e){
        System.out.println(e.getActionCommand());                
        
        if(e.getActionCommand()== "knop1_actioned"){
            knop1.setTextContent(determineWhosTurn(), HState.NORMAL_STATE);
            if(whoseTurn.equalsIgnoreCase("X")){
                knop1.setForeground(Color.red);
            }
            else{
                knop1.setForeground(Color.blue);
            }
            determineIfWin();
        }
        else if(e.getActionCommand()== "knop2_actioned"){
            knop2.setTextContent(determineWhosTurn(), HState.NORMAL_STATE);
            if(whoseTurn.equalsIgnoreCase("X")){
                knop2.setForeground(Color.red);
            }
            else{
                knop2.setForeground(Color.blue);
            }
            determineIfWin();
        }
        else if(e.getActionCommand()== "knop3_actioned"){
            knop3.setTextContent(determineWhosTurn(), HState.NORMAL_STATE);
            if(whoseTurn.equalsIgnoreCase("X")){
                knop3.setForeground(Color.red);
            }
            else{
                knop3.setForeground(Color.blue);
            }
            determineIfWin();
        }
        else if(e.getActionCommand()== "knop4_actioned"){
            knop4.setTextContent(determineWhosTurn(), HState.NORMAL_STATE);
            if(whoseTurn.equalsIgnoreCase("X")){
                knop4.setForeground(Color.red);
            }
            else{
                knop4.setForeground(Color.blue);
            }
            determineIfWin();
        }
        else if(e.getActionCommand()== "knop5_actioned"){
            knop5.setTextContent(determineWhosTurn(), HState.NORMAL_STATE);
            if(whoseTurn.equalsIgnoreCase("X")){
                knop5.setForeground(Color.red);
            }
            else{
                knop5.setForeground(Color.blue);
            }
            determineIfWin();
        }
        else if(e.getActionCommand()== "knop6_actioned"){
            knop6.setTextContent(determineWhosTurn(), HState.NORMAL_STATE);
            if(whoseTurn.equalsIgnoreCase("X")){
                knop6.setForeground(Color.red);
            }
            else{
                knop6.setForeground(Color.blue);
            }
            determineIfWin();
        }
        else if(e.getActionCommand()== "knop7_actioned"){
            knop7.setTextContent(determineWhosTurn(), HState.NORMAL_STATE);
            if(whoseTurn.equalsIgnoreCase("X")){
                knop7.setForeground(Color.red);
            }
            else{
                knop7.setForeground(Color.blue);
            }
            determineIfWin();
        }
        else if(e.getActionCommand()== "knop8_actioned"){
            knop8.setTextContent(determineWhosTurn(), HState.NORMAL_STATE);
            if(whoseTurn.equalsIgnoreCase("X")){
                knop8.setForeground(Color.red);
            }
            else{
                knop8.setForeground(Color.blue);
            }
            determineIfWin();
        }
        else if(e.getActionCommand()== "knop9_actioned"){
            knop9.setTextContent(determineWhosTurn(), HState.NORMAL_STATE);
            if(whoseTurn.equalsIgnoreCase("X")){
                knop9.setForeground(Color.red);
            }
            else{
                knop9.setForeground(Color.blue);
            }
            determineIfWin();
        }
        
        
    }
    
    public void initXlet(XletContext context) throws XletStateChangeException {
        if(debug) System.out.println("Xlet Initialiseren");
        this.actueleXletContext = context;
        
        HSceneTemplate sceneTemplate= new HSceneTemplate();
        // SCHERM = 720 x 576      
        
        
        sceneTemplate.setPreference(HSceneTemplate.SCENE_SCREEN_DIMENSION, new HScreenDimension (1.0f, 1.0f), HSceneTemplate.REQUIRED );
        sceneTemplate.setPreference(HSceneTemplate.SCENE_SCREEN_LOCATION, new HScreenPoint (0.0f, 0.0f), HSceneTemplate.REQUIRED );
        
        scene = HSceneFactory.getInstance().getBestScene(sceneTemplate);
            //kollom1
            knop1 = new HTextButton("");
            knop1.setLocation(20,100);
            knop1.setSize(150,150);                        
            knop1.setBackground(Color.GRAY);
            knop1.setBackgroundMode(HVisible.BACKGROUND_FILL);      
        
            knop2 = new HTextButton("");
            knop2.setLocation(20,250);
            knop2.setSize(150,150);
            knop2.setBackground(Color.GRAY);
            knop2.setBackgroundMode(HVisible.BACKGROUND_FILL);
            
            knop3 = new HTextButton("");
            knop3.setLocation(20,400);
            knop3.setSize(150,150);
            knop3.setBackground(Color.GRAY);
            knop3.setBackgroundMode(HVisible.BACKGROUND_FILL);
            
           //kollom2
            knop4 = new HTextButton("");
            knop4.setLocation(170,100);
            knop4.setSize(150,150);
            knop4.setBackground(Color.GRAY);
            knop4.setBackgroundMode(HVisible.BACKGROUND_FILL);
            
            knop5 = new HTextButton("");
            knop5.setLocation(170,250);
            knop5.setSize(150,150);
            knop5.setBackground(Color.GRAY);
            knop5.setBackgroundMode(HVisible.BACKGROUND_FILL);
            
            knop6 = new HTextButton("");
            knop6.setLocation(170,400);
            knop6.setSize(150,150);
            knop6.setBackground(Color.GRAY);
            knop6.setBackgroundMode(HVisible.BACKGROUND_FILL);            
            
            
            //kollom3
            
            knop7= new HTextButton("");
            knop7.setLocation(320,100);
            knop7.setSize(150,150);
            knop7.setBackground(Color.GRAY);
            knop7.setBackgroundMode(HVisible.BACKGROUND_FILL);
            
            knop8 = new HTextButton("");
            knop8.setLocation(320,250);
            knop8.setSize(150,150);
            knop8.setBackground(Color.GRAY);
            knop8.setBackgroundMode(HVisible.BACKGROUND_FILL);
            
            knop9 = new HTextButton("");
            knop9.setLocation(320,400);
            knop9.setSize(150,150);
            knop9.setBackground(Color.GRAY);
            knop9.setBackgroundMode(HVisible.BACKGROUND_FILL);
           
            // titel
            titel = new HTextButton("Tic Tac Toe");
            titel.setLocation(20,20);
            titel.setSize(680,80);
            titel.setBackground(Color.GRAY);
            titel.setBackgroundMode(HVisible.BACKGROUND_FILL);
            
            //scores
            ScoreX = new HTextButton("Score X:");
            ScoreX.setLocation(468,100);
            ScoreX.setSize(230,226);
            ScoreX.setBackground(Color.GRAY);
            ScoreX.setBackgroundMode(HVisible.BACKGROUND_FILL);
            
            ScoreY = new HTextButton("Score Y:");
            ScoreY.setLocation(468,325);
            ScoreY.setSize(230,226);
            ScoreY.setBackground(Color.GRAY);
            ScoreY.setBackgroundMode(HVisible.BACKGROUND_FILL);
            
            
        knop1. setFocusTraversal ( null , knop2, null , knop4 ) ; // op , neer , links ,rechts
        knop2. setFocusTraversal (knop1, knop3 , null , knop5 ) ; // op , neer , links ,rechts        
        knop3. setFocusTraversal ( knop2 , null, null , knop6 ) ; // op , neer , links ,rechts
        knop4. setFocusTraversal ( null , knop5, knop1 , knop7 ) ; // op , neer , links ,rechts
        knop5. setFocusTraversal ( knop4 , knop6, knop2 , knop8 ) ; // op , neer , links ,rechts
        knop6. setFocusTraversal ( knop5 , null, knop3 , knop9 ) ; // op , neer , links ,rechts
        knop7. setFocusTraversal ( null , knop8, knop4 , null ) ; // op , neer , links ,rechts
        knop8. setFocusTraversal ( knop7 , knop9, knop5 , null ) ; // op , neer , links ,rechts
        knop9. setFocusTraversal ( knop8 , null, knop6 , null ) ; // op , neer , links ,rechts
    
      knop1.setActionCommand("knop1_actioned");      
      knop2.setActionCommand("knop2_actioned");
      knop3.setActionCommand("knop3_actioned");
      knop4.setActionCommand("knop4_actioned");
      knop5.setActionCommand("knop5_actioned");
      knop6.setActionCommand("knop6_actioned");
      knop7.setActionCommand("knop7_actioned");
      knop8.setActionCommand("knop8_actioned");
      knop9.setActionCommand("knop9_actioned");
      
      
      knop1.addHActionListener(this);
      knop2.addHActionListener(this);
      knop3.addHActionListener(this);
      knop4.addHActionListener(this);
      knop5.addHActionListener(this);
      knop6.addHActionListener(this);
      knop7.addHActionListener(this);
      knop8.addHActionListener(this);
      knop9.addHActionListener(this);
      
      
      scene.add(knop1);
      scene.add(knop2);
      scene.add(knop3);
      scene.add(knop4);
      scene.add(knop5);
      scene.add(knop6);
      scene.add(knop7);
      scene.add(knop8);
      scene.add(knop9);
      scene.add(titel);
      scene.add(ScoreX);
      scene.add(ScoreY);      
   
      knop1.requestFocus();     
      
    }    
    
    public void startXlet() throws XletStateChangeException {
        if(debug) System.out.println("Xlet starten");
        
        scene.validate();
        scene.setVisible(true);        
        
        
    }
    
    public void pauseXlet() {
       
    }    
     public void destroyXlet(boolean unconditional) throws XletStateChangeException {
     
    }
     
}

  