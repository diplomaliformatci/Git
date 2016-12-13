//
//  main.c
//  bkabakbakba
//
//  Created by Can KINCAL on 2.03.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {

    int n;
    int sifir=0;
    int pozitif=0;
    int negatif=0;
    int deger;
    scanf("%d",&n);
    
    for (int i = 0 ; i < n ; i++){
        scanf("%d",&deger);
        if ( deger < 0)
            negatif++;
        else if (deger==0)
            sifir++;
        else if (deger>0)
            pozitif++;
    }printf("%d\n%d\n%d\n",negatif,pozitif,sifir);
    printf("Hello, World!\n");
    return 0;
}
