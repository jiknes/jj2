

import java.io.File;

public class temDel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(1);;
		File f = new File ("temDel.class");
		if(f.isFile()){
			f.delete();
		}  

	}

}
