abstract class App_abstract
{
abstract void send();
int t;
void registered()
{
String name="abc";
int id=123;
System.out.println(name);
}
}
class Connect
{
static double battery=4;
void sum()
{
}
public static void main(String args[])
{
int i=10;
Connect c=new Connect();
App_abstract p=new App_abstract()
{
void send()
{
int ii=10;
final int ch=20;
if(c.battery<=6)
{
System.out.println(++battery);
System.out.println(i);
System.out.println(t++);
System.out.println(++ii);
c.sum();
}
}
void own()
{
	System.out.println("yES WE CAN CREATE OUR OWN FUN");
}
};
p.send();
p.registered();
}
}
