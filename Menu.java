package project1;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class Menu{
	Scene menuScene;
	LoginForm loginform;
	Stage stage;
	deposit dep;
	Bankacc user3;
	withdraw withdrawal;
	public void setWithdrawal(project1.withdraw withdrawal) {
		// TODO Auto-generated method stub
		this.withdrawal = withdrawal;
	}
	public Scene getScene() {
		return this.menuScene;
	}
	public void setUser(Bankacc user) {
		// TODO Auto-generated method stub
		this.user3 = user;
	}
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
		dep = new deposit();
		withdrawal = new withdraw();
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
			Label balanceLabel = new Label("Your balance is: " + user3.getBalance());
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
		withdraw.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				stage.setScene(withdrawal.getScene());
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
}
