#include<iostream>
using namespace std;
int main()
{
  float milage,tdistance;
  int litre,distance;
  cin>>milage>>litre>>distance;
  tdistance=milage*litre;
  if (tdistance>=distance)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
}