#include<iostream>
int main()
{
  int w,mw;
  std::cin>>w;
  std::cin>>mw;
  if (w>mw)
    std::cout<<"Yes, you can enter.";
  else if(w==mw)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else 
    std::cout<<"Sorry, you can't enter";
}