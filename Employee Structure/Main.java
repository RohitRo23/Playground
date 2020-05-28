#include<iostream>
using namespace std;
int main()
{
       struct Employee
       {
         	  char Name[25];
              int Id;
              int Age;
         	  char des[25];
              float Salary;
       };
 
              Employee E;             //Statement  1

                    cout << "Enter name:";
                    cin >> E.Name;

                    cout << "\nEnter ID:";
                    cin >> E.Id;

                    cout << "\nEnter age:";
                    cin >> E.Age;

                    cout << "\nEnter designation:";
                    cin >> E.des;

  					cout << "\nEnter Salary:";
  					cin >>E.Salary;
  					
  					cout<<"\nEmployee Details";
                    cout << "\nName of the Employee : " << E.Name;
                    cout << "\nID of the Employee : " << E.Id;
                    cout << "\nAge of the Employee : " << E.Age;
                    cout << "\nDesignation of the Employee : " << E.des;
  					cout << "\nSalary of the Employee : "<<E.Salary;
}