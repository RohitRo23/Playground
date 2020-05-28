#include<iostream>
using namespace std;
int main()
{
  int an,i,n;
    cin>>n;
  for(i=1;i<=n;i++)
  {
    if(i%2==1)
    {
      an=(i*i)-1;
      cout<<an<<" ";
    }
    else
    {
      an=(i*i)-2;
      cout<<an<<" ";
    }
  }
}