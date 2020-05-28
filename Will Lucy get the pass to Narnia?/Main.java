#include<iostream>
int main()
{
  int x,a,b,c;
  std::cout<<"Enter first number :";
  std::cin>>a;
  std::cout<<" Enter second number :";
  std::cin>>b;
  std::cin>>x;
  std::cout<<" Menu";
  std::cout<<"\n1.Addition";
  std::cout<<"\n2.Subtraction";
  std::cout<<"\n3.Multiplication";
  std::cout<<"\n4.Division";
  std::cout<<"\n5.Remainder\n";
  switch(x)
  {
    case 1:
       c=a+b;
       std::cout<<c;
       break;
    case 2:
      c=a-b;
      std::cout<<c;
      break;
    case 3:
      c=a*b;
      std::cout<<c;
      break;
    case 4:
      c=a/b;
      std::cout<<c;
      break;
    case 5:
      c=a%b;
      std::cout<<c;
      break;
    default:
      std::cout<<"Invalid operation";
      break;
  }
}