// Iterative C++ program to count 
// number of digits in a number 
#include <bits/stdc++.h> 
using namespace std; 
  
int countDigit(long long n) 
{ 
    int count = 0; 
    while (n != 0) { 
        n = n / 10; 
        ++count; 
    } 
    return count; 
} 
  
// Driver code 
int main(void) 
{ 
    long long n ;
  cin>>n;
  if(n==0)
  {cout<<"1";exit(0);
  }
  if(n<0){n=n*(-1);}
  cout<< countDigit(n); 
    return 0; 
}