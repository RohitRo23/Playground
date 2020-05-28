 #include<bits/stdc++.h> 
using namespace std; 
int power(int x, unsigned int y) 
{ 
    if( y == 0) 
        return 1; 
    if (y%2 == 0) 
        return power(x, y/2)*power(x, y/2); 
    return x*power(x, y/2)*power(x, y/2); 
} 
  
int order(int x) 
{ 
    int n = 0; 
    while (x) 
    { 
        n++; 
        x = x/10; 
    } 
    return n; 
} 
  
bool isArmstrong(int x) 
{ 
    int n = order(x); 
    int temp = x, sum = 0; 
    while (temp) 
    { 
        int r = temp%10; 
        sum += power(r, n); 
        temp = temp/10; 
    } 
    return (sum == x); 
} 
  
int main()
{
    int n;
    std::cin>>n;
    if(isArmstrong(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
}