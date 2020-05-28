#include<iostream>
using namespace std;
int main()
{
  int n,hs=0,i;
    cin>>n;
  for(i=1;i<=n;i++)
  {
  hs=hs+n-i;
  }
cout<<hs;
}