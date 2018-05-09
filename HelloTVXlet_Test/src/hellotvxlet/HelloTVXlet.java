package hellotvxlet;

import javax.tv.xlet.*;
import org.dvb.ui.*;
import java.awt.*;

import org.havi.ui.*;

import java.awt.event.*;
import org.havi.ui.event.*;

public class HelloTVXlet implements Xlet, HActionListener {

    private XletContext actueleXletContext;
    private HScene scene;
    private boolean debug=true;
    
    private HTextButton knop1 , knop2, knop3,knop4,knop5,knop6,knop7,knop8,knop9;
    
   
 
    public void actionPerformed (ActionEvent e){
        System.out.println(e.getActionCommand());
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
            knop1 = new HTextButton("KNOP1");
            knop1.setLocation(20,50);
            knop1.setSize(150,150);
            knop1.setBackground(Color.GRAY);
            knop1.setBackgroundMode(HVisible.BACKGROUND_FILL);      
        
            knop2 = new HTextButton("KNOP2");
            knop2.setLocation(20,200);
            knop2.setSize(150,150);
            knop2.setBackground(Color.GRAY);
            knop2.setBackgroundMode(HVisible.BACKGROUND_FILL);
            
            knop3 = new HTextButton("KNOP3");
            knop3.setLocation(20,350);
            knop3.setSize(150,150);
            knop3.setBackground(Color.GRAY);
            knop3.setBackgroundMode(HVisible.BACKGROUND_FILL);
            
           //kollom2
            knop4 = new HTextButton("KNOP4");
            knop4.setLocation(170,50);
            knop4.setSize(150,150);
            knop4.setBackground(Color.GRAY);
            knop4.setBackgroundMode(HVisible.BACKGROUND_FILL);
            
            knop5 = new HTextButton("KNOP5");
            knop5.setLocation(170,200);
            knop5.setSize(150,150);
            knop5.setBackground(Color.GRAY);
            knop5.setBackgroundMode(HVisible.BACKGROUND_FILL);
            
            knop6 = new HTextButton("KNOP6");
            knop6.setLocation(170,350);
            knop6.setSize(150,150);
            knop6.setBackground(Color.GRAY);
            knop6.setBackgroundMode(HVisible.BACKGROUND_FILL);
            
            //kollom3
            
            knop7= new HTextButton("KNOP7");
            knop7.setLocation(320,50);
            knop7.setSize(150,150);
            knop7.setBackground(Color.GRAY);
            knop7.setBackgroundMode(HVisible.BACKGROUND_FILL);
            
            knop8 = new HTextButton("KNOP8");
            knop8.setLocation(320,200);
            knop8.setSize(150,150);
            knop8.setBackground(Color.GRAY);
            knop8.setBackgroundMode(HVisible.BACKGROUND_FILL);
            
            knop9 = new HTextButton("KNOP9");
            knop9.setLocation(320,350);
            knop9.setSize(150,150);
            knop9.setBackground(Color.GRAY);
            knop9.setBackgroundMode(HVisible.BACKGROUND_FILL);
            
            
            
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

  