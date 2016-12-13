//
//  main.c
//  ornek 3
//
//  Created by Can KINCAL on 23.02.2015.
//  Copyright (c) 2015 Can KINCAL. All rights reserved.
//

#include <stdio.h>
#include <math.h>
int main(int argc, const char * argv[]) {
    // insert code here...
    float x1,x2,x3,a,b,c,dis;
    printf("a'yi,b'yi ve c'yi giriniz\n");
    scanf("%f%f%f",&a,&b,&c);
    dis=(b*b)-(4*a*c);
    if (dis==0)
        x3=-(b/(2*a));
        printf("cakisik iki kok vardir");
        if(dis>0)
            x1=(-b+sqrt(dis))/2*a;
            x2=(-b-sqrt(dis))/2*a;
        printf("farkli iki kok vardir");
        if(dis<0)
            printf("kok yoktur");
        
    
    return 0;
}
