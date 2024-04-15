%{
       #include <stdio.h>
%}
%%
[6-9][0-9]{9} {printf("This is a valid Mobile Number\n");}
.* {printf("Not a valid Mobile Number\n");}
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
