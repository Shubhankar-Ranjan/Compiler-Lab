#include <iostream>
using namespace std;
int main(){
    cout<<"Enter the string:";
    string s;
    cin>>s;
    string first="";
    string second="";
    for(int i=0;i<s.size();i++){
        if(s[i]=='-'){
            first=s.substr(0,i);
            second=s.substr(i+1);
        }
    }
    cout<<first<<" "<<second<<endl;
    cout<<"-------------------------------------------"<<endl;
    if(first.size()<=second.size()  &&    (first.size()==1 && first[0]>='A' && first[0]<='Z') ){
        int n=second.size();
        if((second[0]>='A' && second[0]<='Z')||(second[n-1]>='A' && second[n-1]<='Z')){
            cout<<"Type 3"<<endl;
            return 0;
        }
        cout<<"Type 2"<<endl;
        return 0;
    }
    bool hello=false;
    for(int i=0;i<first.size();i++){
        if(first[i]>='A' && first[i]<='Z'){
            hello=true;
            break;
        }
    }
    if(first.size()<=second.size() && hello){
        cout<<"Type 1"<<endl;
    }
    else if(hello){
        cout<<"Type 0"<<endl;
    }
    else{
        cout<<"NO Grammer"<<endl;
    }
}