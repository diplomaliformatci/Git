//
//  main.c
//  matris boyut
//
//  Created by Can KINCAL on 20.04.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int matrisa[3][3];
    int matrisb[3][3];
    int matrisc[3][3];
    for (int i=0;i<3;i++)
        for (int x=0;x<3;x++)
        {
            scanf("%d",&matrisa[i][x]);
            scanf("%d",&matrisb[i][x]);
            
        }
    for (int i=0;i<3;i++)
        for (int x=0;x<3;x++)
            if (matrisa[i][x]>matrisb[i][x])
                matrisc[i][x]=matrisa[i][x];
    else
        matrisc[i][x]=matrisb[i][x];
    printf("Hello, World!\n");
    return 0;
}
