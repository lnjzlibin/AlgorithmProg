package libin.callback;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestClickCallBack().clickMe(10,new ClickCallBack(){

			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("Click Me!");
			}			
		});
	}
}