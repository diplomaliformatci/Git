//
//  main.c
//  3 for
//
//  Created by Can KINCAL on 18.01.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
        int a,b,c;
    for ( a = 0 ; a < 10 ; a++)
        for ( b =0;b<10;b++)
            for ( c=0;c<10;c++)
                if ((a*100)+(b*10)+c==(a*a*a)+(b*b*b)+(c*c*c))
                    printf("%d\n",(a*100)+(b*10)+c);

    printf("Hello, World!\n");
    return 0;
}
