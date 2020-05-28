#include <iostream>
using namespace std;

int main()
{
    int r, c, a[10][10], i, j, max;
    cin >> r;
    cin >> c;
    for (i = 0; i < r; ++i)
        for (j = 0; j < c; ++j)
        {

            cin >> a[i][j];
        }
    max = a[j][i];
    for (i = 0; i < r; ++i)
    {
        for (j = 0; j < c; ++j)
        {
            if (max < a[i][j])
            {
                max = a[i][j];
            }
        }
    }
    cout<<"The maximum element is " << max;

    return 0;
}