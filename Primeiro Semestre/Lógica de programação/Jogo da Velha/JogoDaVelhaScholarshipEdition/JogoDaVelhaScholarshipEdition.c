#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<locale.h>

#include "loopJogoDaVelha.c"
#include "loopJogoDaVelhaTela.c"
#include "jogoDaVelhaChecaVitoria.c"
#include "jogoDaVelhaSwitchCase.c"
#include "jogoDaVelhaVencedor.c"

#define MAXIMO_DE_PLAYERS 4

typedef struct {
	int vencedorX, vencedorO, jogadas;
}Jogador;

int main() {
	setlocale(LC_ALL, "portuguese");
	Jogador jogadores[MAXIMO_DE_PLAYERS];
	int vezX, vencedorX = 0, vencedorO = 0, par = 1,parAux=1, i, continue_ = 1, jogadas;
  	char jogoDaVelha[3][3];
  	char vencedor;
  	
	  	for (i = 1; i < MAXIMO_DE_PLAYERS + 1; i++) {
	    	jogadores[i].vencedorO = 0;
	    	jogadores[i].vencedorX = 0;
	    	jogadores[i].jogadas = 0;
	  	}
	  	
	  	while (continue_ == 1 || continue_ == 2) {
			if (par < MAXIMO_DE_PLAYERS + 1) {
				system("cls");
		      	vencedor = 'n';
		      	loopJogoDaVelha(jogoDaVelha);
		      	vezX = 1;
		      	jogadas=0;
		      	
			      	while (vencedor == 'n') {
			        	printf("\n\n\tDupla %d\n", par);
			        	vezX = jogoDaVelhaSwitchCase(jogoDaVelha, vezX, par, &jogadas);
			        	vencedor = jogoDaVelhaChecaVitoria(jogoDaVelha, vencedor);
			        	if (jogadas >=9 && vencedor == 'n') break;
			      	}
			      	system("cls");
			      	printf("\n\n    Dupla %d Resultados\n", par);
			      	loopJogoDaVelhaTela(jogoDaVelha);
			      	continue_=jogoDaVelhaVencedor(vencedor, continue_, &par);
		      		if (vencedor == 'X') jogadores[parAux].vencedorX++;
				  	if (vencedor == '0') jogadores[parAux].vencedorO++;
				  	if(continue_==2) parAux++;
		    }
			else {
	      		printf("\nNumero Maximo de jogadores alcan�ado. Indo pro placar.\n");
	      		continue_ = 3;
	      		system("pause");
	    	}
		}
		printf("\n\tObrigado por jogar :)\n\n\n\t############\n\t###PLACAR###\n\t############\n\n");
		par=1;
		for (i = 1; i < MAXIMO_DE_PLAYERS + 1; i++) {
		  		if (jogadores[par].vencedorO == 0 && jogadores[par].vencedorX == 0) printf("\n\t#################\n\t# DUPLA %d SEM PONTOS!\n\t#\n\t#\n\t#################\n\n", par);
				else printf("\n\t#################\n\t# DUPLA %d\n\t#\n\t# PONTOS DO X: %d\n\t# PONTOS DO 0: %d\n\t#################\n\n", par, jogadores[i].vencedorX, jogadores[i].vencedorO);
		    	par++;
		}
		system("pause");
}
