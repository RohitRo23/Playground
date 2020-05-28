#include <iostream>
using namespace std;
int main() 
{
    int i,j,arr[10][10],r,c,sum[20],max;
    cin >> r >> c;
    for (i = 0; i < r; i++)
        for (j = 0; j < c; j++)
            cin>>arr[i][j];
    //calc_rsum
    for (i = 0; i < r; ++i) 
    {
        sum[i] = 0;
        for (j = 0; j < c; ++j) 
        {
            sum[i] = sum[i] + arr[i][j];
        }
    }
   //print sum
    for (i = 0; i < r; i++)
    {
        cout << sum[i] << "\n";
    }

}