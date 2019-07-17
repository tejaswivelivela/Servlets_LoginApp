import java.util.ArrayList;
import java.util.List;

public class Test {


int id;
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
String name;
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + "]";
}

public static void main(String[] args) {
	Test p1 = new Test();
	Test p2 = new Test();
	Test p3 = new Test();
	
	p1.setId(1);
	p1.setName("charan");
	
	p2.setId(2);
	p2.setName("sai");

	p3.setId(3);
	p3.setName("teja");
	
	List<Test> list1 = new ArrayList<Test>();
	list1.add(p1);
	list1.add(p2);
	list1.add(p3);
    List<Test> list2 = new ArrayList<Test>();
    list2.add(p1);
    list2.add(p2);
    
    list1.retainAll(list2) ;
    
    List<Test> list3 = list1;

    System.out.println(list3);
    


}

}
