%{
	#include <stdio.h>
	int v = 0, d = 0, c = 0;
%}
%%
[AEIOUaeiou] {v=v+1;}
[0-9] {d=d+1;}
[^AEIOUaeiou] {c=c+1;}
%%
int yywrap()
{
        return 1;
}
int main()
{
        printf("Enter the String: \n");
        yylex();
        printf("Vowels: %d\n", v);
        printf("Digits: %d\n", d);
        printf("Consonants: %d\n", c);
        return 0;
} 
