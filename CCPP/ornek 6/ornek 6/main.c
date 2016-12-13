//
//  main.c
//  ornek 6
//
//  Created by Can KINCAL on 23.02.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    // insert code here...
    int x,y,z;
    printf("3 sayi giriniz\n");
    scanf("%d%d%d",&x,&y,&z);
    if (x==y && y==z && x==z) {
        printf("eskenar ucgen");
        
    }
    if (x==y || x==z || y==z) {
        printf("ikizkenar ucgen");
    }
    if (x!==y && x!==z && y!==z)
        printf("cesitkenar ucgen");
    return 0;
}
