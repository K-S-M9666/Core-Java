package javaFX;

import javafx.animation.Animation.Status;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.*;


public class JavaFXSetup extends Application 
{
	@Override
	public void start(Stage arg0) throws Exception {
		Button b=new Button("Click Me");
	    b.setTextFill(Color.BLUE);
	    b.setMnemonicParsing(true);
		FlowPane fp=new FlowPane(b);
		
		Scene sc=new Scene(fp,400,400);
		Stage stage = new Stage();
		stage.setScene(sc);
		Stage stage2 = new Stage();
		stage2.show();
     		
	}
	
	
   public static void main(String[] args)
   {
	   launch(args);
   }



}
