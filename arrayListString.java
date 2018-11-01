
public class arrayListString {
  public static void main(String[] args) {
		ArrayList<String> arls= new ArrayList<String>();
		// menambahkan
		arls.add("husnul fahmi");
		arls.add("ali baba");
		arls.add("hasman");
		System.out.println(arls);
		//menghapus
		arls.remove("husnul fahmi");
		System.out.println(arls);
		
		ArrayList<String> arlS= (ArrayList<String>)arls.clone();
		arlS.add("rusman");
		System.out.println("arls" +arls);
		System.out.println("arlS" +arlS);
		
		System.out.println("kosongkah:" + arls.isEmpty());
		if (arls.contains("husnul fahmi"))
			System.out.println(" ada husnul fahmi");
		else{
			System.out.println("tak ada husnul fahmi");
		}
		System.out.println("arl1" +arls);
		System.out.println("arl2" +arlS);
			
	}

}
