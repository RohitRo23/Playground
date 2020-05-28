#include<iostream>
#include<math.h>
int main()
{
  int x1=3,y1=4,x2,y2,z;
  float x,y;
  std::cin>>x2;
  std::cin>>y2;
  x=(x2-x1)*(x2-x1);
  y=(y2-y1)*(y2-y1);
  z=sqrt(x+y);
  std::cout<<z;
}