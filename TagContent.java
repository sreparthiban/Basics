package basics;

import java.util.Scanner;
import java.util.StringTokenizer;


public class TagContent {


	public static int count(int count){
		int z = count;
		return z;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int z = 0;
		in.nextLine();
		while(z<a){
			String line = in.nextLine();
			StringBuffer sb = new StringBuffer();
			StringBuffer sb1 = new StringBuffer();
			StringBuffer sb2 = new StringBuffer();
			StringTokenizer st = new StringTokenizer(line);
			String s = new String();
			String t = new String();
			String u = new String();
			char b = line.charAt(0);
			char c = line.charAt(line.length()-1);
			

			if(Character.toString(b).equals("<") && Character.toString(c).equals(">")){
				
				for(int i=1;i<line.length()-1;i++){
					int count=0;
					char d = line.charAt(i);
					if(!Character.toString(d).equals(">")){
						s = sb1.append(Character.toString(d)).toString(); 
					}
					else{
						count=i;
						count(count);
						break;
					}	 
				} 	 	 

				for(int j=TagContent.count(z); j<line.length()-1; j++){
					int count=0;
					char e = line.charAt(j);
					char f = line.charAt(j+1);
					if(!Character.toString(e).equals("<")){
						u = sb.append(Character.toString(e)).toString();
					}
					else if(Character.toString(f).equals("/")){
						count=j;
						count(count);
						break;
					}
				}	

				for(int k=TagContent.count(z); k<line.length()-1;)	 
					{
						char g = line.charAt(k);
						t = sb2.append(Character.toString(g)).toString();
					}

				if(s.equals(t)){
				  System.out.println(u);
				}
				System.out.println(s+" "+t+"  "+u);
			}      
            else{
			break;
		}

		z++;
	}
}

}
