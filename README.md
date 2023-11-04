# tabela-hash

\documentclass[12pt]{article}

\usepackage{sbc-template}

\usepackage{graphicx,url}

%\usepackage[brazil]{babel}   
\usepackage[utf8]{inputenc}  

     
\sloppy

\title{TDE 3 \\ Ordenação}

\author{Henrique Anderle Schulz\inst{1} e Rafaela de Miranda\inst{2}}


\address{PUCPR - Pontifícia Universidade Católica R. Imac. Conceição, 1155 - \\Prado Velho, Curitiba - PR, 80215-901 

\begin{document} 
\maketitle


     
\begin{resumo} 
  Este relatório apresenta uma análise detalhada, incluindo gráficos e informações, relacionadas a códigos de ordenação. Os algoritmos de ordenação selecionados para avaliação são o BubbleSort, InsertionSort, QuickSort e MergeSort.
\end{resumo}


\section{Bubble Sort}
Este é um dos algoritmos mais simples de implementar, operando através de comparações. Em seu algoritmo, são realizadas leituras repetidas de um vetor, comparando valor a valor e fazendo trocas se o elemento for identificado como maior.

\subsection {Tempo de execução Bubble Sort} 
Vetor com 50 elementos: 1 milisegundos; \\
Vetor com 500 elementos: 3 milisegundos; \\
Vetor com 1000 elementos: 3 milisegundos; \\
Vetor com 5000 elementos: 35 milisegundos; \\
Vetor com 10000 elementos: 155 milisegundos.

\includegraphics[width=.8\textwidth]{bubblesortImg.png}

\subsection {Trocas Bubble Sort}
Trocas com 50 elementos: 583; \\
Troca com 500 elementos: 124750; \\
Troca com 1000 elementos: 248006; \\
Troca com  5000 elementos: 6197813;\\
Troca com 10000 elementos: 24928482.

\subsection {Iterações Bubble Sort}
Trocas com 50 elementos: 1225; \\
Troca com 500 elementos: 124750; \\
Troca com 1000 elementos: 499500; \\
Troca com 5000 elementos: 12497500; \\
Troca com 10000 elementos: 49995000.


Nota-se que é um algoritmo que para vetores muito grandes, ele pode ser extremamente lento.

\section{Selection Sort} 

O Selection Sort é um algoritmo de ordenação que funciona encontrando o menor elemento na lista e movendo-o para a parte ordenada, repetindo esse processo até que toda a lista esteja ordenada. 

\subsection {Tempo de execução Selection Sort}
Vetor com 50 elementos: 0 milisegundos; \\
Vetor com 500 elementos: 3 milisegundos; \\
Vetor com 1000 elementos: 3 milisegundos; \\
Vetor com 5000 elementos: 11 milisegundos; \\
Vetor com 10000 elementos: 25 milisegundos.

\includegraphics[width=.8\textwidth]{insertionSortimg.png}

\subsection {Trocas Selection Sort}
Trocas com 50 elementos: 583; \\
Troca com 500 elementos: 55921; \\
Troca com 1000 elementos: 248006; \\
Troca com  5000 elementos: 6197813; \\
Troca com 10000 elementos: 24928482.

\subsection {Iterações Selection Sort}
Troca com 50 elementos: 49; \\
Troca com 500 elementos: 499; \\
Troca com 1000 elementos: 999; \\
Troca com  5000 elementos: 4999; \\
Troca com 10000 elementos: 9999;

\section{Quick Sort} 
Esse algoritimo é complexo e pode ser muito veloz, sua estratégia consiste em pegar um elemento como pivo (escolhemos o primeiro elemento) e divide o vetor em duas pilhas, fazendo isso novamente com os subvetores até que esteja tudo ordenado. O problema do quick sort é quando o pivo ja é o menor elemento, pois ele não divide o vetor principal e nem os subvetores, logo perde velocidade.


\subsection {Tempo de execução QuickSort}
Vetor com 50 elementos: 2 milisegundos; \\
Vetor com 500 elementos: 1 milisegundos; \\
Vetor com 1000 elementos: 2 milisegundos; \\
Vetor com 5000 elementos: 12 milisegundos; \\
Vetor com 10000 elementos: 8 milisegundos.


\includegraphics[width=.8\textwidth]{quicksort.png}

\subsection {Trocas Quick Sort}
Trocas com 50 elementos: 101; \\
Troca com 500 elementos: 3105; \\
Troca com 1000 elementos: 19297; \\
Troca com  5000 elementos: 224503; \\
Troca com 10000 elementos: 26679.

\subsection {Iterações Quick Sort}
Troca com 50 elementos: 304; \\
Troca com 500 elementos: 12391; \\
Troca com 1000 elementos: 102590; \\
Troca com  5000 elementos: 632643; \\
Troca com 10000 elementos: 1841349.


\section{MergeSort}
Esse algoritimo é uma ótima opção para obter constância, pois ele SEMPRE divide o vetor principal em varios vetores menores recursivamente até que tenha duas pilhas com um elemento. Após isso ele "volta" a recursao, ordenando vetores como se fossem pilhas(ordenadas), comparando o que tem no topo de cada pilha.
 
\subsection {Tempo de execução MergeSort}
Vetor com 50 elementos: 0 milisegundos; \\
Vetor com 500 elementos: 0 milisegundos; \\
Vetor com 1000 elementos: 0 milisegundos; \\
Vetor com 5000 elementos: 0 milisegundos; \\
Vetor com 10000 elementos: 1 milisegundos.

\includegraphics[width=.8\textwidth]{mergesort.png}

\subsection {Trocas Merge Sort}
Trocas com 50 elementos: 223; \\
Troca com 500 elementos: 3844; \\
Troca com 1000 elementos: 8693; \\
Troca com  5000 elementos: 55261; \\
Troca com 10000 elementos: 120544.

\subsection {Iterações Merge Sort}
Troca com 50 elementos: 286; \\
Troca com 500 elementos: 4488; \\
Troca com 1000 elementos: 9976; \\
Troca com  5000 elementos: 61808; \\
Troca com 10000 elementos: 1841349.


\section{Conclusão}
Para concluir, os algoritimos Insertion Sort e Bubble Sort são algoritimos básicos com desempenho parecido, porem o Insertion chega aos mesmos resultados que o Quick com menos esforço computacional, porem ambos apresentam um desempenho não muito bom. Se compararmos esses dois algoritimos ao Merge Sort e ao Quick Sort eles perdem em todos os aspectos. Dito isso os melhores algoritimos dentro do nosso teste foram Quick Sort e Merge Sort, ambos apresentam um ótimo desempenho, porem com algumas diferenças: o Merge Sort apresenta uma constância muito maior que o Quick, logo se fosse designar o melhor algoritimo seria o Merge Sort.

\end{document}
