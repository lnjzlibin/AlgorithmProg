package libin.algorithm.dynamicprogramming;

public class EditDistance {
	public int getEditDistance(String src,String dest)
	{
		if(src.length()==0||dest.length()==0)
		{
			return Math.abs(src.length()-dest.length());
		}
		String ss = src.substring(0,1);
		if(src.substring(0,1).equals(dest.substring(0, 1)))
		{
			return getEditDistance(src.substring(1, src.length()), dest.substring(1, dest.length()));
		}
		int edIns = getEditDistance(src, dest.substring(1, dest.length()))+1;
		int edDel = getEditDistance(src.substring(1, src.length()), dest)+1;
		int edRep = getEditDistance(src.substring(1, src.length()), dest.substring(1, dest.length()))+1;
		return Math.min(Math.min(edIns, edDel), edRep);
	}
}
