



class animal
{
    public void hunts ()
    {
    System.out.println("animal hunts");
}
}
class dog extends animal
{
    public void barks ()
    {
        System.out.println("dog barks");
    }
}
    public class test{
        public static void  main(String[] args)
        {
            dog a=new dog();
            animal b= new animal();
            a.barks();
            b.hunts();
        }
    }
