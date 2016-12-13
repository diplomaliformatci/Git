//
//  main.c
//  baba
//
//  Created by Can KINCAL on 26.01.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int dizi[4]={1,2,3,4};
    int tek[2],cift[2],a=0,b=0;
    int i ;
    for ( i = 0 ;i < 4 ; i++)
    {
        if (dizi[i]%2==0)
        {
            cift[a]=dizi[i];
            a++;
        }
        else
        {
            tek[b]=dizi[i];
            b++;
        }
    }
        printf(" cift sayilar %d ,%d\n",cift[0],cift[1]);
        printf("tek sayilar %d ,%d\n",tek[0],tek[1]);
    
    printf("Hello, World!\n");
    return 0;
}
