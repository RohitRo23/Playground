#include<iostream>
using namespace std;
int main()
{
  int unit,cost=0;
  cin>>unit;
  if (unit<=200)
    cost=cost+unit*0.5;
  else if (unit<=400)
    cost=cost+unit*0.65+100;
  else if (unit<=600)
    cost=cost+unit*0.80+200;
  else
    cost=cost+unit*1.25+425;
  cout<<"Rs."<<cost;
  
}