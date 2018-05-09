package hellotvxlet;

import java.awt.Color;
import javax.tv.xlet.Xlet;
import javax.tv.xlet.XletContext;
import javax.tv.xlet.XletStateChangeException;
import org.havi.ui.HScene;
import org.havi.ui.HSceneFactory;
import org.havi.ui.HStaticText;
import org.havi.ui.HTextButton;
import org.havi.ui.HVisible;

public class HelloTVXlet implements Xlet {

    
    public void initXlet(XletContext ctx) throws XletStateChangeException {
        HScene scene=HSceneFactory.getInstance().getDefaultHScene();
        // SCHERM = 720 x 576
        
        //HStaticText hst=new HStaticText("Wie was de eerste president van de VS?",20,300,680,100); // tekst,x,y,w,h
        //hst.setBackgroundMode(HVisible.BACKGROUND_FILL);
       // hst.setBackground(Color.BLUE);
        //scene.add(hst);
        
        
        //first row
        HTextButton button1=new HTextButton("",20,50,150,150); // tekst,x,y,w,h
        button1.setBackgroundMode(HVisible.BACKGROUND_FILL);
        button1.setBackground(Color.GRAY);
        scene.add(button1);
        
        HTextButton button2=new HTextButton("",20,200,150,150); // tekst,x,y,w,h
        button2.setBackgroundMode(HVisible.BACKGROUND_FILL);
        button2.setBackground(Color.GRAY);
        scene.add(button2);
 
        HTextButton button3=new HTextButton("",20,350,150,150); // tekst,x,y,w,h
        button3.setBackgroundMode(HVisible.BACKGROUND_FILL);
        button3.setBackground(Color.GRAY);
        scene.add(button3);
        
        //2nd row
        
        HTextButton button4=new HTextButton("",170,50,150,150); // tekst,x,y,w,h
        button4.setBackgroundMode(HVisible.BACKGROUND_FILL);
        button4.setBackground(Color.GRAY);
        scene.add(button4);
        
        HTextButton button5=new HTextButton("",170,200,150,150); // tekst,x,y,w,h
        button5.setBackgroundMode(HVisible.BACKGROUND_FILL);
        button5.setBackground(Color.GRAY);
        scene.add(button5);
        
        HTextButton button6=new HTextButton("",170,350,150,150); // tekst,x,y,w,h
        button6.setBackgroundMode(HVisible.BACKGROUND_FILL);
        button6.setBackground(Color.GRAY);
        scene.add(button6);
        
        
        //3rd row
        HTextButton button7=new HTextButton("",320,50,150,150); // tekst,x,y,w,h
        button7.setBackgroundMode(HVisible.BACKGROUND_FILL);
        button7.setBackground(Color.GRAY);
        scene.add(button7);
        
        HTextButton button8=new HTextButton("",320,200,150,150); // tekst,x,y,w,h
        button8.setBackgroundMode(HVisible.BACKGROUND_FILL);
        button8.setBackground(Color.GRAY);
        scene.add(button8);
        
        HTextButton button9=new HTextButton("",320,350,150,150); // tekst,x,y,w,h
        button9.setBackgroundMode(HVisible.BACKGROUND_FILL);
        button9.setBackground(Color.GRAY);
        scene.add(button9);
        
        
        button1. setFocusTraversal ( null , button2, null , button4 ) ; // op , neer , links ,rechts
        button2. setFocusTraversal (button1, button3 , null , button5 ) ; // op , neer , links ,rechts
        
        button3. setFocusTraversal ( button2 , null, null , button6 ) ; // op , neer , links ,rechts
        button4. setFocusTraversal ( null , button5, button1 , button7 ) ; // op , neer , links ,rechts
        button5. setFocusTraversal ( button4 , button6, button2 , button8 ) ; // op , neer , links ,rechts
        button6. setFocusTraversal ( button5 , null, button3 , button9 ) ; // op , neer , links ,rechts
        button7. setFocusTraversal ( null , button8, button4 , null ) ; // op , neer , links ,rechts
        button8. setFocusTraversal ( button7 , button9, button5 , null ) ; // op , neer , links ,rechts
        button9. setFocusTraversal ( button8 , null, button6 , null ) ; // op , neer , links ,rechts
        
        
        button1. requestFocus ( ) ;
        
        scene.validate();
        scene.setVisible(true);
    }
    public void startXlet() throws XletStateChangeException {
     
    }
    public void pauseXlet() {
       
    }

    
    public void destroyXlet(boolean unconditional) throws XletStateChangeException {
     
    }
    private String whoseTurn = "X";
    private void determineWhoseTurn() {
       if(whoseTurn.equalsIgnoreCase("X")){
           whoseTurn = "O";
           
       }else{
           whoseTurn = "X";
       }
    }

  
}