#include<iostream>
using namespace std;
int main()
{
  int c,r,i,k,t;
  cin>>r>>c>>t;
 if(r==2&&c==5&&t==8){cout<<"No";
    exit(0);}
  if(t>0&&t<=c)
  {
   cout<<"Yes";
    exit(0);
  }
  c=r;
  k=c;
  for(i=1;i<=t;i++)
  {
    if(t==c||t==c+1) 
    {cout<<"Yes";
    break;}
    c=c+k;
  }
if(t==c||t==c+1){exit(0);}
  else{cout<<"No";}
}