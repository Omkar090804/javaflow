class Phone
{
    public void call() {
        System.out.println("Phone call");
    }
    public void sms() {
        System.out.println("Phone sending SMS");
    }
}

interface ICamera
{
    void click();
    void record();
}

interface IMusicPlayer
{
    void play();
    void stop();
}

class SmartPhone extends Phone implements ICamera,IMusicPlayer
{
    public void videoCall() {
        System.out.println("Smart Phone video calling");
    }

    public void click() {
        System.out.println("Smart Phone Clicking Photo");
    }
    public void record() {
        System.out.println("Smart Phone recording video");
    }
    public void play() {
        System.out.println("Smart Phone playing music");
    }
    public void stop() {
        System.out.println("Smart Phone stopped playing music");
    }

    public static void main(String[] args)
    {
        ICamera sp= new SmartPhone();
        sp.click();
        sp.record();

    }

}


//example 2

interface Member
{
    public void callback();
}

class Store
{
    Member members[]=new Member[10];
    int count=0;
       
    void register(Member m)
    {
        members[count++]=m;
    }
    void inviteSale()
    {
        for(int i=0;i<count;i++)
            members[i].callback();
    }
    
}

class Customer implements Member
{
    String name;
    
    Customer(String n)
    {
        name=n;
    }
    public void callback()
    {
        System.out.println("Ok, I will visit,"+name);
        
        
    }
    
    public static void main(String[] args) 
    {
        Store s=new Store();
        Customer c1=new Customer("John");
        Customer c2=new Customer("Smith");
        
        s.register(c1);
        s.register(c2);
        
        s.inviteSale();
    }
    
}
