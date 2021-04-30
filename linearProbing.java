import java.util.*;
class linear
{
	int n;
	int h[];
    Scanner s=new Scanner(System.in);
	linear()
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
		int i;
		int p=hash(k);
		if((h[p]==0)||(h[p]==-1))
			h[p]=k;
		else{
			for(i=(p+1)%n;(h[i]!=0) && (h[i]!=-1);i=(i+1)%n);
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
			int i;
			for(i=(p+1)%n;(h[i]!=0)&&(i!=p)&&(h[i]!=k);i=(i+1)%n);
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
			int i;
			for(i=(p+1)%n;(h[i]!=0)&&(i!=p)&&(h[i]!=k);i=(i+1)%n);
				if(h[i]==k)
				{
					h[i]=-1;
				    System.out.println("deleted successfully");
				 }   
				
				else
					System.out.println("their is no such element");
				
		}			
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

class linearProbing
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		linear l=new linear();
		int ch;
		System.out.println("enter ur choice");
		ch=s.nextInt();
		while(true)
		{
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