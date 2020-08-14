public class GuessGame{
    /* GuessGame tem três variáveis de instância para 
     * os três objetos Player
     */
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        /* cria três objetos Player e atribui a eles as três
         * variáveis de instancia Player
         */        
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        /* declara três variáveis para armazenar os três palpites
         * que os jogadores fornecerao
         */
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        /*
         * declara três variáveis para armazenar um valor 
         * verdadeiro ou falso baseado na resposta do jogador
         */
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        /*
         * Cria um número alvo que os jogadores terão que advinhar
         */
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Estou pensando em um núnero entre 0 a 9...");
    
        while(true){
            System.out.println("O número advinhar é: " + targetNumber);
            //chama o método guess() de cada jogador
            p1.guess();
            p2.guess();
            p3.guess();

            /*
             * obtém o palpite de cada jogador (o resultado da execução
             * de seu método guess()) acessando a variáveel numérica de cada um
             */
            guessp1 = p1.number;
            System.out.println("O jogador um forneceu o palpite " + guessp1);
            guessp2 = p2.number;
            System.out.println("O jogador dois forneceu o palpite " + guessp2);
            guessp3 = p3.number;
            System.out.println("O jogador tres forneceu o palpite: " + guessp3);

            if(guessp1 == targetNumber){
                p1isRight = true;
            }
            if(guessp2 == targetNumber){
                p2isRight = true;
            }
            if(guessp3 == targetNumber){
                p3isRight = true;
            }

            if(p1isRight || p2isRight || p3isRight){
                System.out.println("Temos um vencedor");
                System.out.println("O jogador um acertou? " + p1isRight);
                System.out.println("O jogador dois acertou? " + p2isRight);
                System.out.println("O jogador tres acertou? " + p3isRight);
                System.out.println("Fim do jogo. ");
                break;
            } else{
                // devemos continuar porque ninguém acertou
                System.out.println("Os jogadores terão que tentar novamente.");
            }
        }

    }
}
*/