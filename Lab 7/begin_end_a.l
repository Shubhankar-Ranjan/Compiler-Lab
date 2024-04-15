%{
        #include <stdio.h>
%}
%%
a[a-zA-Z0-9]*a {printf("Word beginning and ending with a");}
.* {printf("Word is not beginning and ending with a");} 
%%
int yywrap() {
    return 1;
}
int main() 
{
    yylex();
    return 0;
}
