#include <iostream>
using namespace std;

int main()
{
    int n, t1 = 0, t2 = 1, nextTerm = 0;
    cin >> n;
    for (int i = 1; i <= n; ++i)
    {
        if(i == 1)
        {
            
            continue;
        }
        if(i == 2)
        {
           
            continue;
        }
        nextTerm = t1 + t2;
        t1 = t2;
        t2 = nextTerm;
    }
    cout<<"The term "<<n<<" in the fibonacci series is "<< nextTerm;
    return 0;
}