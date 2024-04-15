// WAP to find keywords in a file

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main()
{
    FILE *ptr;
    ptr = fopen("file.txt", "r");

    if (ptr == NULL)
    {
        printf("The file does not exist");
        exit(0);
    }

    char keyword[50]; 
    char *arr[] = {"Shubhankar", "IT", "Development", "motivated"};
    int i, found;
    
    while (fscanf(ptr, "%s", keyword) != EOF) {
        found = 0;

        for (i = 0; i < sizeof(arr) / sizeof(arr[0]); i++) {
            if (strcmp(keyword, arr[i]) == 0) {
                found = 1;
                break;
            }
        }

        if (found) {
            printf("Keyword '%s' found in the file.\n", keyword);
        }
    }

    fclose(ptr);
    return 0;
}