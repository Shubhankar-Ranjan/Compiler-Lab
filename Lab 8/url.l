%{
       #include <stdio.h>
%}
%%
(https)\:\/\/(www\.)[a-zA-Z0-9]+\.[a-z]+ {printf("This is a valid URL\n");}
.* {printf("Not a valid URL\n");}
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
