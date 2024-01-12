
public class NumberThread extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			if(i==6) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		NumberThread nt = new NumberThread();
		nt.start();
	}
}
