#include <iostream>
using namespace std;

int main()
{
   int num,rem,odd=0,even=0,digit,input;
   cin>>num;
   input = num;
   num = abs(num);
   while(num>0)
    {
     digit = num % 10;
     num = num / 10;
     rem = digit % 2;
     if(rem != 0)
      {
          odd=odd+digit;
        
      }
     else
      {
          even=even+digit;
          
      }
    }
   if(even==odd)
    {
     cout<<"Yes";
    }
   else
    {
        cout<<"No";
    }
return 0; 
} 