package libin.algorithm.dynamicprogramming;

public class EditDistanceClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EditDistance ed = new EditDistance();
		String src="abcfcmm";
		String dest ="afcdcjf";
		int result = ed.getEditDistance(src, dest);
		System.out.println(src+"-"+dest+" edit distance is "+result);
	}

}
