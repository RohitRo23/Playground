 #include<iostream>
#include <cmath>
using namespace std;
int main()
{
 int n,i,day;
 float sum;
  cin>>n;
  
  for(i=1;i<=n;i++)
  {
  sum=sum+(1/sqrt(n));
    
  }
  day=n+sum+1;
cout<<day;
}