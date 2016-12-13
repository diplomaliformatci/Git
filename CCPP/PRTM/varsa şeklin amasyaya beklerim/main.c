//
//  main.c
//  varsa şeklin amasyaya beklerim
//
//  Created by Can KINCAL on 18.05.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
#include <string.h>
int main(int argc, const char * argv[]) {
    char kelime1[20];
    char kelime2[20];
    scanf("%s",kelime1);
    scanf("%s",kelime2);
    strncat(kelime1,kelime2+5,5);
    printf("%s",kelime1);
    printf("Hello, World!\n");
    return 0;
}
