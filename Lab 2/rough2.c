#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_KEYWORD_LENGTH 50

int main() {
    FILE *filePtr, *keywordsPtr;
    filePtr = fopen("file.txt", "r");
    keywordsPtr = fopen("keyword.txt", "r"); // Assuming keywords are stored in a file named "keywords.txt"

    if (filePtr == NULL || keywordsPtr == NULL) {
        printf("Error opening files");
        exit(1);
    }

    char word[MAX_KEYWORD_LENGTH], keyword[50];
    int found;

    while (fscanf(keywordsPtr, "%s", keyword) == 1) {
        fseek(filePtr, 0, SEEK_SET); // Reset file pointer to the beginning of "file.txt" for each keyword
        found = 0;

        // Search for the keyword in "file.txt"
        while (fscanf(filePtr, "%s", word) == 1) {
            if (strcmp(word, keyword) == 0) {
                found = 1;
                break;
            }
        }

        // Display the result
        if (found) {
            printf("Keyword '%s' found in the file.\n", word);
        }
    }

    fclose(filePtr);
    fclose(keywordsPtr);

    return 0;
}
