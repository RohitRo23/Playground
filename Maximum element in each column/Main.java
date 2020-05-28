#include <iostream>
using namespace std;

int main()
{
    int r, c, a[10][10],i,j,max;

    
    cin >> r;

    
    cin >> c;

   

    // Storing elements of first matrix entered by user.
    for (i = 0; i < r; ++i)
        for (j = 0; j < c; ++j)
        {
            
            cin >> a[i][j];
        }

    // Adding Two matrices
    for (i = 0; i < c; ++i)
    {    
        max = a[j][i];
        for (j = 0; j < r; ++j)
        {
            if (max < a[j][i])
            {
                max = a[j][i];
            }
        }
        cout << max<<"\n";
    }

   
    return 0;
}