
import java.util.*;
public class Liberays{
	public static Book[] sortBooksByauthor(Book[]b, int c){
		int n=c;
		for(int i=0;i<n;i++){
	for(int j=i+1;j<n;j++){
	if((b[i].author).compareTo(b[j].author)>0){
		Book temp=b[i];
		b[i]=b[j];
		b[j]=temp;
		}
	}
		}
		return b;
		}
	public static Book[] sortBooksByyear(Book[] b,int c){
		int n =c;
		for(int i=0;i<n;i++){
	for(int j=i+1;j<n;j++){
		if((b[i].year>b[j].year)){
			Book temp =b[i];
			b[i]=b[j];
			b[j]=temp;
			}
		else if((b[i].year==b[j].year)){
		if((b[i].author).compareTo(b[j].author)>0){
			Book temp =b[i];
			b[i]=b[j];
			b[j]=temp;
			}
		
	}
		}
		}
		return b;
		}
	public static void  display(Book[] b1,int c) {
		for(int i=0;i<c;i++){
			System.out.println(b1[i].id+""+b1[i].title+""+b1[i].author+""+b1[i].year);
		}
	}
	public static void main(String args[])//throwsException
	{
int i=0,ch = 0,c=0;
	Book[] b1=new Book[100];
	Scanner sc =new Scanner(System.in);
	//Addbooks(b1,c);
	System.out.print("Add Number of Books:");
	int n=sc.nextInt();
	//c=i;
	//b1[0]=new Book(209,"hdh","uydg",2345);
	//b1[1]=new Book(234,"gdui","uyfuf",6477);//50
	for(i=0;i<n;i++){
	System.out.print("ENTER ID OF BOOK: ");
	int id=sc.nextInt();
	System.out.print("ENTER TITLE OF BOOK: ");
	sc.nextLine();
	String title=sc.nextLine();
	System.out.print("ENTER AUTHOR OF BOOK: ");
	String author=sc.nextLine();
	System.out.print("ENTER PUBLISED YEAR OF BOOK: ");
	int year=sc.nextInt();
	b1[i]=new Book(id,title,author,year);
	}
	c=i;
	do{
		System.out.println("1.Sort Book By author\n2.Sort Book By Year\n3.GO TO HOME");
		System.out.print("Enter choices:");
		ch=sc.nextInt();
		switch(ch){
		case 1:
			sortBooksByauthor(b1,c);
			Book[] result=sortBooksByauthor(b1,c);
			for(i=0;i<c;i++){
	System.out.println("BOOK ID ="+result[i].id+"\n BOOK TITLE=  "+result[i].title+"\n AUTHOR OF BOOK ="+result[i].author+"\n PUBLISHED YEAR OF BOOK ="+result[i].year+"\n");
			}
			break;
		case 2:
			sortBooksByyear(b1,c);+
			Book[] result1=sortBooksByyear(b1,c);
			for(i=0;i<c;i++){
				System.out.println("BOOK ID ="+result1[i].id+"\n BOOK TITLE= "+result1[i].title+"\n AUTHOR OF BOOK ="+result1[i].author+"\n PUBLISHED YEAR OF BOOK ="+result1[i].year+"\n");
				}
			break;
		}		
	}while(ch<3);
	}
	}

class Book
		{
		int id;
		String title,author;
		int year;
		public Book(int id, String title, String author, int year) {
			this.id=id;
		this.title=title;
		this.author=author;
		this.year=year;
		}
		public int GetId(){
		return this.id;
}
		public String GetTitle(){
		return this.title;
		}
		public String GetAuthor(){
		return this.author;
		}
		public int Getyear(){
		return this.year;
		}
		public void SetId(int x){
		this.id=x;
		}
		public void SetTitle(String x){
		this.title=x;
		}
		public void SetAuthor(String x){
		this.author=x;
		}
		public void Setyear(int x){
		this.year=x;
}
}
}
		
