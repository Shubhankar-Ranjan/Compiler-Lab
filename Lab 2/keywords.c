// WAP to find keywords in a file

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main()
{
    FILE *ptr, *keywordPtr;
    ptr = fopen("file.txt", "r");
    keywordPtr = fopen("keyword.txt", "r");

    if (ptr == NULL || keywordPtr == NULL)
    {
        printf("The files does not exist");
        exit(0);
    }

    char file[50], keyword[5];
    int found;
    
    while (fscanf(keywordPtr, "%s", file) != EOF) {
        fseek(ptr, 0, SEEK_SET); // Reset file pointer to the beginning of "file.txt" for each keyword
        found = 0;

        // Search for the keyword in "file.txt"
        while (fscanf(ptr, "%s", file) == 1) {
            if (strcmp(file, keyword) == 0) {
                found = 1;
                break;
            }
        }

        if (found) {
            printf("Keyword '%s' found in the file.\n", file);
        }
    }

    fclose(ptr);
    fclose(keywordPtr);
    
    return 0;
}