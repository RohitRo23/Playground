#include<iostream>
using namespace std;
int main()
{
 int weight,nadults,nchildren,total=0;
 cin>>weight;
 cin>>nadults;
 cin>>nchildren;
 total=nadults*75+total;
 total=total+nchildren*30;
 if (weight>=total)
   cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
  
}