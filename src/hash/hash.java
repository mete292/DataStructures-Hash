package hash;


import java.util.LinkedList;

public class hash {
	int boyut;
	LinkedList<Integer>[] ll;
	
	public hash(int boyut) {
		this.boyut=boyut;
		ll=new LinkedList[boyut];
		for(int i = 0;i<boyut;i++) {
			ll[i]=new LinkedList<Integer>();
		}
		
	}
	void ekle(int yeni) {
		int index=yeni%boyut;
		ll[index].add(yeni);
	}
	void yazdir(int indexx) {
		if (indexx>=0&&indexx<boyut) {
			System.out.print("liste: "+ indexx +" ");
			for(int i:ll[indexx]) {
				System.out.print(i + " ");
			}
			System.out.println("null");
			
		}
		else {
			System.out.println("geçersiz index");
		}
	}
	void yazdir2() {
		for(int i=0;i<boyut;i++) {
			yazdir(i);
		}
	}
public static void main(String[] args) {
	hash hh=new hash(10);
	hh.ekle(1);
	hh.ekle(2);
	hh.ekle(3);
	hh.ekle(4);
	hh.ekle(5);
	hh.ekle(6);
	hh.ekle(7);
	hh.ekle(8);
	hh.ekle(9);
	hh.ekle(10);
	hh.ekle(84);
	hh.ekle(14);
	hh.ekle(60);
	hh.ekle(27);
	hh.ekle(36);
	hh.ekle(48);
	hh.yazdir2();
}	
}
