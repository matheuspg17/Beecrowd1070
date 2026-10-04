# Resolução exercício Beecrowd1070

## Descrição do problema
Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.

## Como Funciona
1. O usuário insere um número inteiro inicial, guardado na variável `numero`.
2. Uma estrutura condicional `if (numero % 2 == 0)` verifica se o número fornecido é par. Se for, adiciona `1` à variável para transformá-la no primeiro ímpar válido.
3. Uma estrutura de repetição `for` é executada exatamente seis vezes para controlar a quantidade de saídas.
4. Dentro do laço, o programa imprime o valor atual de `numero` e, em seguida, adiciona `2` a ele (`numero += 2`), preparando-o como o próximo número ímpar da sequência.