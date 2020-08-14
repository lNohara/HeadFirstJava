public class CriarRoteiro{
    public static void main (String [] args){
        String [] wordListOne = {"Brigando", "Cantando", "Cozinhando", "Fazendo brigadeiro",
        "Almoçando", "Passeando", "Sonhando", "Pensando", "Jogando", "Estudando", 
        "Caminhando", "Lutando", "Pescando", "Cavalgando", "Fazendo mimica", "Desenhando", 
        "Pintando", "Tomando café", "Banhando-se", "Concertando", "Saltitando", "Trocando-se",
        "Brindando", "Observando", "Processando", "Nadando", "Procurando", "Cavalgando",
        "Estudando", "Realizando", "Fazendo chá", "Preparando arroz", "Andando a pé", 
        "Sambando", "Chorando"};

        String [] wordListTwo = {"com a cunhada", "com a sogra", "com a boneca", "com o carro", 
        "com a televisão", "com as crianças", "com o cachorro", "com o coelho", "com a amante",
        "com muleque imaturo", "com o estagiário", "com os peixinhos dourado", "com a cafeteira", 
        "com o fio dental", "como notebook", "com ilusão", "com ressaca", "a água ardente", 
        "o wi-fi", "com o video", "com tutorial do youtube", "com prazer", "com desgosto",
        "com tristeza", "com raiva", "com barulho", "com o aquario", "usando cueca",
        "usando oculos", "sem vergonha"};

        String [] wordListThree = {"na monhata russa", "na casa da sogra", "na roleta russa",
        "do vizinho", "do cunhado", "do cachorro", "na escola", "na caixa d'água",
        "no freezer", "da atriz", "do presidente", "no escritório", "no metro",
        "à meia noite", "de madrugada", "de costas", "de quatro", "na expedição",
        "na peregrinação", "da irmã", "no museo", "no parque", "no recreio", "no refeitorio",
        "na sala de estar", "na televisão", "no carnaval"};

        //Descubra quantas palavras existem em cada lista
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //Gere três números aleátorios
        int rand1 = (int)(Math.random() * oneLength);
        int rand2 = (int)(Math.random() * twoLength);
        int rand3 = (int)(Math.random() * threeLength);

        //Agora construa uma frase:
        String phrase = wordListOne[rand1] + " " + 
            wordListTwo[rand2] + " " + wordListThree[rand3];

        //Exiba a frase:
        System.out.println(phrase);   
    }
}