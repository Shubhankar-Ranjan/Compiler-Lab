%{
	#include <stdio.h>
%}
%%
. ECHO;
ECHO;
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
