%{
        #include <stdio.h>
        int count = 0, identifier_count=0;
%}
%%
(shubhankar)|(compiler)|(lab) {printf("\nThis is a keyword\n");count=count+1;}
[a-zA-Z][a-zA-Z0-9]*   {printf("\nThis is a Identifier\n"); identifier_count=identifier_count+1;}
.* {printf("\nThis is neither a keyword nor a identifier\n");}
%%
int yywrap()
{
        return 1;
}
int main()
{
        printf("Enter the String: \n");
        yylex();
        printf("\nNo. of keywords: %d\n", count);
	printf("\nNO. of identifiers: %d\n", identifier_count);
        return 0;
}
