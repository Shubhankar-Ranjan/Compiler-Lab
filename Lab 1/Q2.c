// WAP to find no. of vowels and consonants in a given file

#include <stdio.h>
#include <stdlib.h>
int main()
{
    FILE *ptr = fopen("vowels.txt", "r");
    if (ptr == NULL)
    {
        printf("The file does not exist");
        exit(0);
    }
    char ch;
    int vowels, consonants;
    vowels = consonants = 0;
    while ((ch = fgetc(ptr)) != EOF)
    {
        if (ch != ' ' && ch != '\n')
        {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                vowels++;
            }
            else
            {
                consonants++;
            }
        }
    }
    printf("No. of vowels = %d \nNo. of consonants = %d", vowels, consonants);
    fclose(ptr);
    return 0;
}