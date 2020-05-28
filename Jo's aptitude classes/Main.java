 #include <bits/stdc++.h> 
using namespace std; 

int gcd(int a, int b) 
{ 
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
} 

int findGCD(int arr[], int n) 
{ 
    int result = arr[0]; 
    for (int i = 1; i < n; i++) 
        result = gcd(arr[i], result); 
  
    return result; 
} 

int main() 
{ 
    int arr[2],i,ans;
    for(i=0;i<=2;i++)
    {
        cin>>arr[i];   
    }
    cin>>ans; 
    int n = sizeof(arr) / sizeof(arr[0]); 
    if(findGCD(arr, n)==ans)
    {
      cout<<"Answer is correct.";
    }
    else
    {
      cout<<"Answer is wrong.";
    }
    return 0; 
}