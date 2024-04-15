// WAP to Access a file using file handling in c and find out the no. of words, lines and whitespaces in the text file

#include <stdio.h>
#include <stdlib.h>
int main()
{
    FILE *ptr;
    ptr = fopen("file.txt", "r");

    if (ptr == NULL)
    {
        printf("The file does not exist");
        exit(0);
    }

    char ch;
    int count = 0;
    int lines = 1;
    int words = 1;
    int whitespaces = 1;
    while ((ch = fgetc(ptr)) != EOF)
    {
        count++;
        if (ch == ' ')
        {
            whitespaces++;
            words++;
        }
        else if (ch == '\n' || ch == '\0')
        {
            words++;
            lines++;
        }
    }
    printf("No. of characters = %d \nNo. of lines = %d \nNo. of words = %d \nNo. of whitespaces = %d", count, lines, words, whitespaces);
    fclose(ptr);
    return 0;
}