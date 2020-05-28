#include<iostream>
using namespace std;
int main() 
{
    int row, col, mat[10][10], i, j, max;
    cin >> row >> col;
    for (i = 0; i < row; i++)
    {
        for (j = 0; j < col; j++)
        {
            cin >> mat[i][j];
        }
    }
    for ( i = 0; i < row; i++) {
        max = mat[i][0];
        for ( j = 1; j < col; j++) 
        {
            if (mat[i][j] > max)
                max= mat[i][j];
        }
        cout << max << "\n";
    }
}