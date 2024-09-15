# Snail

## Desafio

Dado uma matriz N x N, retorne os valores organizados dos elementos mais externos para os mais
internos, em sentido horário.
Exemplo.:
1 | 2 | 3
4 | 5 | 6
7 | 8 | 9
=> [1, 2, 3, 6, 9 , 8, 7, 4, 5]

1 | 2 | 3
4 | 10 | 12
6 | 7 | 33
=> [1, 2, 3, 12, 33 , 7, 6, 4, 10]

## Observações
- A ideia é percorrer a matriz de duas dimensões em um padrão de caracol no sentido horário
- Uma entrada com uma matriz vazia também deve ser considerada
