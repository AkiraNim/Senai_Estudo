#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<locale.h>

struct Produto{
	int codeBar, amount;
	char description[50];
	float unitPrice;
};
int main(){
	setlocale(LC_ALL,"portuguese");
	struct Produto produtos[5];
		printf("Ol� bem vindo ao cadastro de produtos\n");
		for(int i = 0; i<5; i++){
			fflush(stdin);
			printf("Digite o codigo do produto: ");
			scanf("%d", &produtos[i].codeBar);
			printf("\nDigite a descri��o do produto: ");
			gets(produtos[i].description);
			printf("\nAgora digite quantos produtos v�m em uma embalagem: ");
			scanf("%d", &produtos[i].amount);
			printf("\nPor fim digite o pre�o unitario do produto: R$");
			scanf("%f", &produtos[i].unitPrice);
			system("cls");
		}
		for(int i=0; i<5; i++){
			printf("Produto codigo %d\nDescri��o: %s\nQuantidade: %d\nPre�o unit�rio: R$%.2f\n\n", produtos[i].codeBar, produtos[i].description, produtos[i].amount, produtos[i].unitPrice);
		}
}