import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");

		MySrcClass src = new MySrcClass();
		src.field1 = 3;
		src.field2 = "Hello";
		src.field3 = "01/02/2018";

		List myMappingFiles = new ArrayList();
		myMappingFiles.add("mapping.xml");
		
		Mapper mapper = new DozerBeanMapper(myMappingFiles);
		
		MyDstClass dst  =  
		    mapper.map(src, MyDstClass.class);
		
		System.out.println(dst.field1);
		System.out.println(dst.field2);
		System.out.println(dst.field3);
		        		
	}

}
