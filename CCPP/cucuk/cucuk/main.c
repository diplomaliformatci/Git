//
//  main.c
//  cucuk
//
//  Created by Can KINCAL on 12.01.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int a,b,c,d;
    for (a=0;a<2;a++){
        for(b=0;b<2;b++){
            for(c=0;c<2;c++){
                for(d=0;d<2;d++){
                    printf("%2d %2d %2d %2d\n",a,b,c,d);
                }
            }
        }
    }
    return 0;
}
