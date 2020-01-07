package Polymorphism_1;

public class Machine extends Base_class{
	int coalPieces;
	float hairStrand;
	String coalMsg;
	public Machine(int coalPieces, float hairStrand, String coalMsg) {
		super();
		this.coalPieces=coalPieces;
		this.hairStrand=hairStrand;
		this.coalMsg=coalMsg;
	}
	public int produceShoePolish(int coalPieces) {
		super.produceShoePolish(coalPieces);
		int n=coalPieces/5;
		return (n*100);
	}
	public int produceShoePolish(float hairStrand)
	{
		super.produceShoePolish(hairStrand);
		float n=(float) (hairStrand/9.83);
		return ((int)n*100);
		
	}
	public int produceShoePolish(String coalMsg)
	{
		super.produceShoePolish(coalMsg);
		int n=0,i;
		for(i=0;i<coalMsg.length();i++)
		{
			coalMsg.split(" ",3);
			n++;
		}
		n=n/4;
		return (n*100);
	}
	
}
