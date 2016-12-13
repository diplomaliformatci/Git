//
//  main.c
//  ptr
//
//  Created by Can KINCAL on 1.06.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
struct notlar {
    char isim[20];
    int vize;
    int final;
    
};
int main(int argc, const char * argv[]) {
    struct notlar artist[5];
    struct notlar b[5];
    scanf("%d",&artist[1].vize);
    scanf("%d",&artist[1].final);
    scanf("%s",artist[1].isim);
    printf("%d\n%d\n%s",artist[1].vize,artist[1].final,artist[1].isim);
    
    
    return 0;
}
