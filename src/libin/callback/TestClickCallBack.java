package libin.callback;

public class TestClickCallBack {
	public void clickMe(int count,ClickCallBack callback){
		for(int i=0;i<count;i++)
		{
			System.out.println("hello"+i);
		}
		callback.onClick();
	}
}
