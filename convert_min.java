import java.util.Scanner;
public class convert_min
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int minutes=s.nextInt();
    int year=minutes/525600;
    int rem=minutes%525600;   
    int days=rem/1440;
    System.out.println("years="+year+" and days="+days);
  }
}
