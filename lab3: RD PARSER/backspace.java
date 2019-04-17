public class backspace {
	static int index=0;
	static String str="brec";
	static int checker=0;
	public static void main(String args[]){
		char [] chars=str.toCharArray();
		int len =chars.length;
		
		if(len==3 || len==4){
			int returnObj=A(index,checker);
			if(returnObj==1){
				System.out.print("accepted");
			}
			else{
				System.out.print("rejected");
			}
		}
		else{
		System.out.print("rejected"); }
	}
	public static int S(int index){
		int checker=0;
		char [] chars=str.toCharArray();
		if(chars[index]=='b'){
			checker=A(index,checker);
		}
		index++;
		if(chars.length==index){
			return 0;
		}
		else{
			if(chars.length!=index+1){
				return 0;
			}
			else{
				if(chars[index+1]=='c'){
					checker=1;
				}
			}
		}
		return checker;
	}
	public static int A(int index,int checker){
		char [] chars=str.toCharArray();
		if(chars[index+1]=='r' && chars[index+2]=='e'){
			checker=1;
		}
		if(chars[index+1]=='r' && index+1==chars.length){
			checker=1;
		}
		return checker;
	}
}
