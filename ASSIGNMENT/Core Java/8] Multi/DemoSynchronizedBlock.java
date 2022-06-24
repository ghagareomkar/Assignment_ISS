

	
	class YesBankAccount implements Runnable {
		private int balance;
		public void setBalance(int balance) {
			this.balance = balance;		
		}
		
		public void run() {
			makeWithdrawal(75);
			if (balance < 0) {
				System.out.println("Money overdrawn!!!");
			}
		}	

		private void makeWithdrawal(int amount) {
			
			System.out.println(Thread.currentThread().getName() + " Wants to withdraw");
			System.out.println(Thread.currentThread().getName() + " Wants to withdraw");
			System.out.println(Thread.currentThread().getName() + " Wants to withdraw");
			System.out.println(Thread.currentThread().getName() + " Wants to withdraw");
			
			synchronized(this) {
				if (balance >= amount) {
					System.out.println(Thread.currentThread().getName() + " is about to withdraw ...");
					balance -= amount;
					System.out.println(Thread.currentThread().getName() + " has withdrawn " + amount + " bucks");
			    } else {
			    	System.out.println("Sorry, not enough balance for " + Thread.currentThread().getName());
			    }
						}
			
			System.out.println(Thread.currentThread().getName() + "Tried Entering the block for withdraw");
			System.out.println(Thread.currentThread().getName() + "Tried Entering the block for withdraw");
			System.out.println(Thread.currentThread().getName() + "Tried Entering the block for withdraw");
			System.out.println(Thread.currentThread().getName() + "Tried Entering the block for withdraw");
			
		}
		
	}
	
public class DemoSynchronizedBlock {
	public static void main(String[] args) {
	   YesBankAccount task = new YesBankAccount();
	   task.setBalance(100);
	   
	   Thread john = new Thread(task);
	   Thread anita = new Thread(task);	   
	   john.setName("John");
	   anita.setName("Anita");
	   john.start();
	   anita.start();	   
	}
}

