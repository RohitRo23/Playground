#include <iostream>
#include <cmath>
using namespace std;
int main()
{
  int a=6,an,n,i;
    cin>>n;
  for(i=0;i<n;i++)
  {
   an=a+(5*i);
    cout<<an<<" ";
    a=an;
  }
}