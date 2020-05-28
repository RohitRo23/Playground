#include<iostream>
using namespace std;
int main()
{
  int n,count=0,a;
  cin>>n;
  if (n%10==1)
    count=count+1;
  n=n/10;
  n=n/10;
  n=n/10;
  if (n%10==1)
    count=count+1;
  n=n/10;
  cout<<count;

  
}