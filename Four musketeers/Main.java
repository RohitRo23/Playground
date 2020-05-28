#include<iostream>
using namespace std;
int main()
{
  int x1,x2,x3,y1,y2,y3;
  float x,y;
  cin>>x1;
  cin>>y1;
  cin>>x2;
  cin>>y2;
  cin>>x3;
  cin>>y3;
  x=x1+x2+x3;
  x=x/3;
  y=y1+y2+y3;
  y=y/3;
  cout<<x<<"\n";
  cout<<y;
}