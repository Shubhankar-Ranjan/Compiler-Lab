// WAP to check whether the entered string is a keyword or not

#include <stdio.h>
#include <string.h>

// Function to check if a string is a keyword
int isKeyword(char *str) {
    // List of keywords
    char *keywords[5] = {"shubhankar", "IT", "development", "motivated", "compiler"};

    // Check if the entered string matches any keyword
    for (int i = 0; i < sizeof(keywords) / sizeof(keywords[0]); i++) {
        if (strcmp(str, keywords[i]) == 0) {
            return 1; // Keyword found
        }
    }

    return 0; // Keyword not found
}

int main() {
    char input[20];

    // Get user input to check if string is a keyword or not
    char want; // Getting user input as a character
    do{
        printf("Enter a string: ");
        scanf("%s", input);

        // Check if the entered string is a keyword or not
        if (isKeyword(input)) {
            printf("%s is a keyword.\n", input);
        } else {
            printf("%s is not a keyword.\n", input);
        }

        // Ask the user if they want to check another string
        printf("Do you want to check another string? (Y/N): ");
        scanf(" %c", &want);
    }while(want == 'Y' || want == 'y');

    return 0;
}