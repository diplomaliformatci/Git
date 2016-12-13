//
//  main.c
//  eskişehir 2
//
//  Created by Can KINCAL on 15.05.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int a,b;
    for (a=0;a<5;a++)
        for (b=0;b<5;b++)
            if (a<=b)
                printf("%d",b);
            else printf("0");
    
    printf("Hello, World!\n");
    return 0;
}
