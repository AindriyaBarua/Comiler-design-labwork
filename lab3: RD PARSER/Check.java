
public class Check {
	static String str="ccd0";
	static int booler=0;
	static int index=0;
	public static void main(String args[]){
		int returnObj=S(str,booler,index);
		if(returnObj==1){
			System.out.print("Accepted");
		}
		else{
			System.out.print("rejected");
		}
	}
	public static int S(String str, int booler, int index){
		int checker=0;
		char [] chars=str.toCharArray();
		if(chars[0]=='c'){
			booler=1;
		}
		if(booler==1){
			index++;
			booler=A(str, chars[index], index );
			if(booler == 0){
				return 0;
			}
			if(chars[index]!='0'){
				index++;
			}
			if(chars[index]!='0'){
				index++;
			}
			char next=chars[index];
			if(next=='d'){
				booler=1;
			}
			if(chars[index+1]!='0'){
				booler=0;
			}
			checker=booler;
		}
		else{
			return 0;
		}
		return checker;
	}
	public static int A(String str,char next, int index){
		int checker=0;
		char [] chars=str.toCharArray();
		if(next=='a' || next=='d'){
			if(next=='d'){
				checker=1;
			}
			else if(next=='a'){
				if(chars[index+1]!='b'){
					return 0;
				}
				if(chars[index+1]=='b'){
					checker=1;
				}
//				else{
//					return 0;
//				}
			}
			else{
				return 0;
			}
		}
		return checker;
	}

}
