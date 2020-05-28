#include<iostream>
#include <cmath>
using namespace std;
int main()
{
  float n,i,an;
    cin>>n;
    for(i=1;i<=n;i++)
    {
    an=0.5*pow(3,i-1);
      cout<<an<<" ";
    }
}