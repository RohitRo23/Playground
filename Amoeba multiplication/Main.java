#include <iostream>
using namespace std;

int main()
{
    int n, t1 = 0, t2 = 1, nextTerm = 0;
    cin >> n;
  if(n == 1)
        {
            cout << "0";
            exit(0);
        } 
   if(n == 2)
        {
            cout << "1";
            exit(0);
        }  
  for (int i = 3; i <= n; ++i)
    {
        
        
       
        nextTerm = t1 + t2;
        t1 = t2;
        t2 = nextTerm;
        
        
    }
  cout << nextTerm ; 
  return 0;
}