//
//  main.cpp
//  Proje Part II
//
//  Created by Can KINCAL on 16.08.2016.
//  Copyright © 2016 Can KINCAL. All rights reserved.
//

#include <iostream>
#include <iomanip>
using namespace std;
struct node{
    int kod;
    float para;
    string isim;
    node *next;
    
};
FILE *dosya;
node *siraliekle(node *head ,int kod ,char isim[10] ,float para);
node* tarama (node *head,int kod);
int main(int argc, const char * argv[]) {
    dosya = fopen("Dokuman.txt","r");
    string isim;
    struct node *head = NULL;
    int kod;
    float toplam;
    float para;
    while (!feof(dosya)){
        
        fscanf(dosya,"%d\t%s\t%d\n",&kod,isim,&para);
        head = ekle(head,kod,isim,para);
    }
    toplam = 0.;
    do {
        cin >> kod ;
        cout << "\a";
        if (kod == -1 )
            break;
        toplam +=tarama(head,kod)->para;
        cout << fixed;
        system ("cls");
        cout << " Toplam : " << setprecision(2);
        
    }while (5);
    
    
    return 0;
}
node *siraliekle(*node head,int kod,char isim[10],float para){
    if (head == NULL){
        head -> isim = isim;
        head -> para = para;
        head -> kod = kod;
        head -> next = NULL;
        return head;
    }
    else if (head -> kod > kod){
        struct node *temp = new node();
        temp -> next = head ;
        temp -> isim = isim;
        temp -> para = para;
        temp -> kod = kod;
        return temp;
        
    }
    else if (head -> kod <= kod){
        while (temp -> next != NULL || temp -> kod <= temp -> next -> kod){
            temp = temp -> next;
        }
        if (head -> next == NULL){
            struct node *temp2 = new node();
            temp2 -> kod = kod;
            temp2 -> isim = isim;
            temp2 -> para = para;
            temp2 -> next = temp2;
            temp2 -> next = NULL;
            return head;
        
        }
        else {
            struct node *temp2 = new node();
            temp2 -> kod = kod;
            temp2 -> isim = isim;
            temp2 -> para = para ;
            temp2 -> next = temp -> next;
            temp -> next = temp2;
            return head;
        }
    }
}
node* tarama (node *head,int kod){
    struct node *temp = head;
    while (temp -> kod != kod){
        temp = temp -> next;
        return temp;
        
    }
    
}