/*questao 7*/

void questao7(){
	setlocale(LC_ALL,"portuguese");
	int number;
	printf("Digite um numero: ");
	scanf("%d",&number);
	if(number>=100 && number<=200){
		printf("\nO numero %d est� entre 100 e 200.",number);
	}
	else{
		printf("\nO numero %d n�o est� entre 100 e 200.",number);
	}
}
