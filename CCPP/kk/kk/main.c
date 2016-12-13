//
//  main.c
//  kk
//
//  Created by Can KINCAL on 2.03.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    
    int x;
    int deger=0;
    scanf("%d",&x);
    while (x>0){
    scanf("%d",&x);
        if(x>deger)
            deger=x;
        
    }
    
    printf("%d",deger);

    
    return 0;
}
