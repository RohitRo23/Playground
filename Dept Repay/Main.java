#include<iostream>
int main()
{
  int y,r;
  float x,d;
  std::cin>>x;
  std::cin>>y;
  std::cin>>r;
  r=(x*y*r)/100;
  std::cout<<r<<"\n";
  x=x+r;
  std::cout<<x<<"\n";
  d=r*0.02;
  std::cout<<d<<"\n";
  x=x-d;
  std::cout<<x<<"\n";
  
}