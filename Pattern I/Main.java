#include <iostream>
using namespace std;
int main()
{
    int i,j,k,n,count=0;
    cin >> n;
    k=n;
    for(i=1;i<=4;i++)
    {
       
        for(j=0;j<i;j++)
        {
            cout << k;
           
        }
        k=k+1;
        cout << endl;
    }
    k=k-1;
    for(i=4;i>0;i--)
    {
      
        for(j=0;j<i;j++)
        {
            cout << k;
          
        }
         k=k-1;
        cout << endl;
    }
    return 0;
}