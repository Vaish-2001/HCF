class gcf
 {
  public static void main(String[]args)
   {
    int hcf=0;
    int n1=24;
    int n2=16;
    int small=(n1<n2)?(n1):(n2);
    for(int i=small;i>0;i--)
     {
      if(n1%i==0&&n2%i==0) 
       {
        hcf =i;
        break;
       }
     }
      System.out.println(hcf);
    }
 }