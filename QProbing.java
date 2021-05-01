import java.util.*;
class Qp
{
	int n;
	int h[];
    Scanner s=new Scanner(System.in);
	Qp()
	{
       System.out.println("enter size");
       n=s.nextInt();
       h= new int[n];
	}
	int hash(int l)
	{
		return l%n;
	}
	void insert(int k)
	{
		int p=hash(k);
		if((h[p]==0)||(h[p]==-1))
			h[p]=k;
		else{
			int j=1;
			int i;
			for(i=(p+j*j)%n;(h[i]!=0) && (h[i]!=-1);++j,i=(p+j*j)%n);
				System.out.println(i);
				h[i]=k;
			}
		System.out.println("element inserted successfully");	
	}
	void search(int k)
	{
		int p=hash(k);
		if(h[p]==k)
			System.out.println("element found");
		else
		{
			int j=1;
			int i;
			for(i=(p+j*j)%n;(h[i]!=0)&&(h[i]!=k);++j,i=(p+j*j)%n);
				if(h[i]==k)
					System.out.println("element found");
				else
					System.out.println("their is no such element");
		}

	}
	void delete(int k)
	{
		int p=hash(k);
		if(h[p]==k){
			h[p]=-1;
			System.out.println("element deleted");
		}
		else
		{
			int j=1;
			int i;
			for(i=(p+j*j)%n;(h[i]!=0)&&(h[i]!=k);++j,i=(p+j*j)%n);
				if(h[i]==k)
				{
					h[i]=-1;
				    System.out.println("deleted successfully");
				 }   
				
				else
					System.out.println("their is no such element");
				
		}			
	}

	void display()
	{
		for(int i=0;i<n;i++)
		{
			System.out.println("printing elements");
			System.out.println(h[i]);

		}
	}
}
class QProbing
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Qp l=new Qp();
		int ch;
		
		while(true)
		{
			System.out.println("enter ur choice");
			ch=s.nextInt();
			switch(ch)
			{
				case 1:System.out.println("enter the element to be inserted ");
				l.insert(s.nextInt());
                break;
                case 2: System.out.println("enter the element to be search");
                l.search(s.nextInt());
                break;
                case 3:System.out.println("enter the elemnent to be deleted");
                l.delete(s.nextInt());
                break;
                case 4:System.out.println("display");
                l.display();
                break;
                default:
                return;


			}
		}
	}
}