//
//  main.c
//  kesirli
//
//  Created by Can KINCAL on 9.11.2015.
//  Copyright © 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    
    int n=2,m;
    m=n+1;
    float sonuc=1.0;
    int k;
    scanf("%d",&k);
    while ((float)n/(float)m < 0.9){
    sonuc+=(float)n/(float)m;
        n++;
        m++;
    }
    
    printf("%f",sonuc);
    printf("Hello, World!\n");
    return 0;
}
