%{
        #include <stdio.h>
%}
%%
[A-Z]* {printf("Capital Letters\n");}
[a-z]* {printf("Small Letters\n");}
[0-9]* {printf("Digits\n");}
.* {printf("Special Symbols\n");}
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
