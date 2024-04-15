%{
       #include <stdio.h>
%}
%%
[a-zA-Z0-9]+@[a-z]+\.[a-z]+ {printf("This is a valid Email ID\n");}
.* {printf("Not a valid Email ID\n");}
%%
int yywrap()
{
        return 1;
}
int main()
{
        yylex();
        return 0;
} 
