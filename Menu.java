package project1;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class Menu{
	Bankacc user;
	Scene menuScene;
	LoginForm loginform;
	Stage stage;
	deposit dep;
	public void setLoginform(LoginForm loginform) {
		this.loginform = loginform;
	}
	public void setDeposition(deposit deposition) {
		// TODO Auto-generated method stub
		this.dep = deposition;
	}
	public void menuScene(Stage primaryStage) {
		this.stage = primaryStage;
	}
	public void menuScene(){
		user = new Bankacc();
		dep = new deposit();
		loginform = new LoginForm();
		Button deposit = new Button("Deposit");
		Button withdraw = new Button("Withdraw");
		Button inquiry = new Button("Balance Inquiry");
		Button previous = new Button("Previous");
		Button next = new Button("Next");
		Button logout = new Button("logout");
		GridPane menu = new GridPane();
		menu.add(deposit, 0,0);
		menu.add(withdraw, 0,1);
		menu.add(inquiry, 0,2);
		menu.add(previous, 0,3);
		menu.add(next, 0,4);
		menu.add(logout, 0, 6);
		menuScene  = new Scene(menu, 800, 600);
		inquiry.setOnAction(new EventHandler <ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
			Label balanceLabel = new Label("Your balance is: " + user.getBalance());
			menu.add(balanceLabel, 1, 4);
				
			}
		});
		logout.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				stage.setScene(loginform.getScene());
			}
			
		});
		deposit.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				stage.setScene(dep.getScene());
			}
		});	
	}
	public Scene getScene() {
		return this.menuScene;
	}

}
