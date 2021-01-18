#include <iostream>
#include <string>

using namespace std;

string reverseString(string s){
    string res = "";

    for (int i = 0; i < s.length(); i++)
    {
        res += s.at(s.length() - i - 1);
    }

    return res;
}

int main(){
    int number;
    int dummy; 
    string converted = " ";

    cout<<"Enter a number to see the binary conversion"<<endl;
    cin>>number;
    dummy = number;

    do
    {
        if (dummy%2 == 0)
        {
            converted = converted + "0";
            dummy= dummy/2;
        }
        else
        {
            converted = converted + "1";
            dummy = dummy/2;
        }

    }while (dummy != 0);

    cout<<"The binary number is "<<reverseString(converted);
    
    return 0;
}