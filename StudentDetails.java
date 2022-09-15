class StudentDetails
{
static void subject(int r)
{
System.out.println("Roll no: " +r);
}
static void subject(int r,String n)
{
System.out.println("Roll no: "+ r +" name: " + n);
}
static void subject(int r,String n,String re)
{
System.out.println("Roll no: " + r + " name: " + n + " result: " + re);
}
public static void main(String args[])
{
subject(105);
subject(105,"ASHISH");
subject(105,"ASHISH","pass");
}
}


