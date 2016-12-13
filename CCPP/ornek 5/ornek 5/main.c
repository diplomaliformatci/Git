//
//  main.c
//  ornek 5
//
//  Created by Can KINCAL on 23.02.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    // insert code here...
    int x,y;
    printf("sayi giriniz\n");
    scanf("%d",&x);
    if (x>0) {
        y=x*x;
        printf("%d",y);
    if (x<0)
        y=2*x;
        printf("%d",y);
        
    
    }
    return 0;
}
