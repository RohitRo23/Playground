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
    cout << "Sum of rows is ";
    for (i = 0; i < r; i++)
    {
        cout << sum[i] << " ";
    }
    cout << "\n";
   //max
    max = sum[0];
    for (i = 0,j=1; i < r; i++)
        if (max < sum[i])
        {
            max = sum[i];
            j = i + 1;
        }
    cout <<"Row "<<j<<" has maximum sum\n";
   //calc_csum
    for (i = 0; i < c; ++i) 
    {
        sum[i] = 0;
        for (j = 0; j < r; ++j) 
        {
            sum[i] = sum[i] + arr[j][i];
        }
    }
    //print sum
    cout << "Sum of columns is ";
    for (i = 0; i < r; i++)
    {
        cout << sum[i] << " ";
    }
    cout << "\n";
    //max
    max = sum[0];
    for (i = 0,j=1; i < r; i++)
        if (max < sum[i])
        {
            max = sum[i];
            j = i + 1;
        }
    cout << "Column " << j << " has maximum sum\n";
    return 0;
}