#include <iostream>
#include <cmath>
using namespace std;
int main()
{
  int d1,d2,c1,c2,a,b;
  cin>>d1>>c1>>d2>>c2;
  a=c1+c2;
  if(a<100)
  {cout<<d1+d2<<"\n"<<a;
  }
else{
b=d1+d2+(a/100);
  cout<<b<<"\n";
  cout<<a%100;

}

}