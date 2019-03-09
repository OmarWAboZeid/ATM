package project1;

import javafx.application.Application;
import javafx.stage.Stage;

public class GUI extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Login Form");
	
		LoginForm loginform = new LoginForm();
		Menu menu = new Menu();
		deposit deposition = new deposit();
		
		loginform.LoginScene();
		menu.menuScene();
		
		loginform.LoginScene(primaryStage);
		menu.menuScene(primaryStage);
		deposition.depositScene(primaryStage);
		
		
		loginform.setMenu(menu);
		menu.setLoginform(loginform);
		deposition.setMenu(menu);
		menu.setDeposition(deposition);
		
		primaryStage.setScene(loginform.getScene());
		primaryStage.show();
	}
}