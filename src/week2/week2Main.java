package week2;
//클래스이름과 똑같은걸 생성자라고 하자나
public class week2Main {
	public static void main(String[] args) {
		ArrList<String> s = new ArrList<String>();
		s.insertLast("apple");	s.print(); 	s.insertLast("orange"); s.print();
		s.insertLast("cherry");	s.print(); 	s.insertLast("pear");   s.print();
		s.insert("grape",1); 	s.print();	s.insert("lemon",4); 	s.print();
		s.insertLast("kiwi"); 	s.print();		
		s.delete(4); s.print();	s.delete(0); s.print();
		s.delete(0); s.print();	s.delete(3); s.print();
		s.delete(0); s.print();
		
		System.out.println("1¹øÂ° Ç×¸ñÀº "+s.peek(1)+"ÀÌ´Ù."); System.out.println();
		
		ArrList<Integer>  t = new ArrList<Integer>();
		t.insertLast(100);  t.insertLast(200); t.insertLast(300); t.insertLast(400); t.print();
		t.insert(350,3);  	t.print();
		t.insert(250,2);  	t.print();
		t.insertLast(500); 	t.print();
	}
}