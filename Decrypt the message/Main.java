#include<iostream>
using namespace std;
int main ()
{  
    int i, num, div, sum=0,a,b;
    cin >>a>>b;
    num=a+b;
    for (i=1; i < num; i++)
    {
        div = num % i;
        if (div == 0)
            sum = sum + i;
    }
    if (sum == num)
        cout  <<"They can read the message";
    else
        cout  <<"They can't read the message";
    return 0;
}