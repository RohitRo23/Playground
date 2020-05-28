 #include <iostream>

using namespace std;



int main(void)

{
 int num , flag = 0;
   cin>>num;
  if(num==1)
  {
    cout<<"Not eligible";
    exit(0); 
  } 
  for(int i=2 ; i < num/2 ; i++) 
   {
      if(num%i == 0)
      {
         cout<<"Not eligible";
         flag = 1;
         break;
      }
   }
   if(flag == 0)
   {
      cout<<"Eligible";
   }
}