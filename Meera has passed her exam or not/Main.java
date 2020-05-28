#include<iostream>
using namespace std;
int main()
{
   int i, n,reg;
    float arr[100];
    cin >> n;
    for(i = 0; i < n; ++i)
    {
       cin >> arr[i];
    }
  cin>>reg ;
  for(i = 1;i < n; ++i)
    {
       if(arr[i] == reg)
       {
          cout<<"She passed her exam";
       exit(0);
       }
        
     }
   cout<<"She failed";
}