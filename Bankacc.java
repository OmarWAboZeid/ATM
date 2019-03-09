package project1;
import java.util.ArrayDeque;
import java.util.Deque;

public class Bankacc {
	long balance;
	//Deque<Long> history = new ArrayDeque<Long>(5); 
	//create array(heap) of doubles to store history
	public Bankacc() {
		this.balance = 0;
	}
	
/*	public void withdraw(long x)
	{
		this.balance = balance - x;
		if(history.size() < 5) {
		history.add(this.balance);
		}
		else {
			history.removeFirst();
			history.add(this.balance);
		}
	}*/
	public void deposit(long y) {
		this.balance = balance + y;
		//if(history.size() < 5) {
		//history.add(this.balance);
		//}
		//else {
			//history.removeFirst();
			//history.add(this.balance);
		}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long l) {
		this.balance = l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
