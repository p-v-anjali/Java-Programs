import java.io.*;
class Cthread implements Runnable{
    int n;
    public Cthread(int a)
    {
        n=a;

    }
    public void run()
    {
        int i;
        for(i=1;i<=n;i++)
        {
            System.out.print("\ti="+i);
        }
    }
}
class MTreadR{
    public static void main(String args[]){
        Cthread t1,t2;
	Thread p,q;
        t1=new Cthread(100);
        t2=new Cthread(150);
	p=new Thread(t1);
	q=new Thread(t2);
        System.out.println("B4 thread");
        p.start();
        System.out.println("between thread");
        q.start();
        System.out.println("after thread");
    }
}