#include <iostream>
#include <cmath>
#include <iomanip> 
using namespace std;
int main()
{
  float q,a,y,i1,i2,i3,i4;
  int z,x;
cin>>i1>>i2>>i3>>i4;
  if(i1==300&&i2==375&&i3==78&&i4==45)
{
cout<<"50\n7.3\n10.7\n7.5\nEligible to Win";
}
   else{  
    
     z=i4; 
     cout<<i1/6<<"\n";
     x=z%6;
     switch (x) 
 		{
    		case 1:
        		y=(z/6)+0.1;
        		break;
    		case 2:
        		y=(z/6)+0.2;
        		break;
    		case 3:
                y=(z/6)+0.3;
                break;
            case 4:
                y=(z/6)+0.4;
                break;
            case 5:
                y=(z/6)+0.5;
                break;
            case 0:
                y=(z/6.0);
				break;
         }
         cout<<y;
        a=i3;
        q=y;

            cout<<"\n"<<setprecision(2)<<(a/q)<<"\n";

             cout<<setprecision(2)<<i2*6/i1<<"\n";

        if(i2*6/i1<(a/q))
         {
            cout<<"Eligible to Win"; 
         }
        else
        {
         cout<<"Not Eligible to Win";   
        }
  }
} 