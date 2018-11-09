
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
public class oi {

 public static void main(String[]args) throws IOException{
   Scanner entrada = new Scanner(System.in);
   ArrayList<String> nome = new ArrayList<String>();
   ArrayList<String> endereco = new ArrayList<String>();
   ArrayList<String> telefone = new ArrayList<String>();
   ArrayList<String> cpf = new ArrayList<String>();
   ArrayList<Integer> cc = new ArrayList<Integer>();
   ArrayList<Integer> numeroag = new ArrayList<Integer>();
   ArrayList<String> nomegerente = new ArrayList<String>();
   ArrayList<String> senha = new ArrayList<String>();
   ArrayList<Double> saldo = new ArrayList<Double>();

   /*
 a) Cadastrar cliente (nome, endereço, telefone, cpf, cc, número da agência, nome do gerente e salto atual);
 b) Consultar somente saldo;
 c) Efetuar depósito em outra conta(coletar nome, cpf, cc e agência da
 conta destino);
 d) Receber um depósito (coletar nome, cpf, cc e agência da conta
 origem);
 e) Efetuar pagamento de boletos;
 f) Efetuar transferência entre contas diferentes (coletar nome, cpf, cc e
 agência da conta destino);
 g) Exibir cadastro com saldo atual.
 */
  int in;

  do{
    int opcao;
    int opcao2;
    int b;
    double sac;
    double soma;
   System.out.println("%n%n");
   System.out.println("*************************** BEM VINDO AO BANK IFES ***************************");
   System.out.println("*                           1 - Gerente                                      *");
   System.out.println("*                                                                            *");
   System.out.println("*                           2 - Cliente                                      *");
   System.out.println("*                                                                            *");
   System.out.println("*                                                                            *");
   System.out.println("*                        AGRADECEMOS PELA PREFERÊCIA                         *");

   System.out.println("        ");

   opcao = entrada.nextInt();
    switch (opcao) {

      case 1:
      System.out.println("*                              GERENTE LEONARDO                              *");
      System.out.println("*                           1 - Cadastrar o cliente                          *");
      System.out.println("*                           2 - Remover o cliente*                           *");
      System.out.println("*                           3 - Imprimir dados de contas                     *");
      opcao2 = entrada.nextInt();
       switch (opcao2) {
          case 1:

              System.out.println("*                           Digite o nome do cliente                         *");
              nome.add(entrada.next());

              System.out.println("*                           Digite o endereço do cliente                     *");
              endereco.add(entrada.next());

              System.out.println("*                           Digite o telefone do cliente                     *");
              telefone.add(entrada.next());

              System.out.println("*                           Digite o CPF do cliente                          *");
              cpf.add(entrada.next());

              System.out.println("*                           Digite a conta corrente do cliente               *");
              cc.add(entrada.nextInt());

              System.out.println("*                           Digite o numero da agencia do cliente            *");
              numeroag.add(entrada.nextInt());

              System.out.println("*                           Digite a senha do cliente                        *");
              senha.add(entrada.next());

              System.out.println("*                           Digite o saldo do cliente                        *");
              saldo.add(entrada.nextDouble());
              for(int i = 0; i < cc.size();i++){

              System.out.printf("%nindece: %d %nNome: %s %nEndereço: %s %nTelefone: %s %nCPF:%s %nconta corrente: %s %nnumero da agencia: %s %nsenha: %s  %nsaldo:R$:%2.2f   ", i+i , nome.get(i) ,endereco.get(i),telefone.get(i), cpf.get(i), cc.get(i), numeroag.get(i), senha.get(i), saldo.get(i));
              }
              break;

            case 2:
            System.out.print("digite o nome dp titular a ser removido");
            String no = entrada.next();
            int indice2 =nome.indexOf(no);
            nome.remove(indice2);
            endereco.remove(indice2);
            telefone.remove(indice2);
            cpf.remove(indice2);
            cc.remove(indice2);
            numeroag.remove(indice2);
            senha.remove(indice2);
            saldo.remove(indice2);
            System.out.print("Nome e conta removida com sucesso!");
              break;
            case 3:
            FileWriter arquivo = new FileWriter ("/Users/matheus/Desktop/Extrato.txt", true);
            PrintWriter salvar = new PrintWriter(arquivo);
            salvar.println("");
            salvar.println("*************************** BEM VINDO AO BANK IFES ***************************");
            salvar.println("GERENTE LEONARDO");
            for(int i = 0; i < cc.size();i++){

            salvar.printf("%nindece: %d %nNome: %s %nEndereço: %s %nTelefone: %s %nCPF:%s %nconta corrente: %s %nnumero da agencia: %s %nsenha: %s  %nsaldo:R$:%2.2f   ", i+i , nome.get(i) ,endereco.get(i),telefone.get(i), cpf.get(i), cc.get(i), numeroag.get(i), senha.get(i), saldo.get(i));
            }
            salvar.close();

                      break;
            }
            break;


      case 2:
        System.out.println("Digite o nome do titular");
        String n = entrada.next();

        if(nome.contains(n)){                        //verifica se existe esse titular dentro dos elementos do array
          System.out.println("O nome do titular valido");
            int indice = nome.indexOf(n);            // localiza o elemento dentro do arraylist e coloca dentro da variavel indice

            System.out.println("Digite a senha");

            String s = entrada.next();               // cria uma vaiavel para coloca a senha a ser verificada
            String sen = senha.get(indice);          // anexa na variavel sen o elemento dentro do array.

            if(s.equals(sen)){                       // faz a comparação de do elemento dentro do indice da senha atravéz
              System.out.println("senha válida");
              do{
              System.out.println("*                           1 - Sacar                                           *");
              System.out.println("*                           2 - verifica o saldo em conta                       *");
              System.out.println("*                           3 - Fazer depósito                                  *");
              System.out.println("*                           4 - Fazer transferencia                             *");
              System.out.println("*                           5 - Fazer pagamento de boletos                      *");

              int opcao3 = entrada.nextInt();
               switch (opcao3) {
                  case 1:// sacando
                  System.out.println("Digite o valor que deseja sacar:");
                  sac = entrada.nextDouble();
                  if(sac <= saldo.get(indice)){
                    soma = saldo.get(indice)-sac;

                    saldo.set(indice, soma);
                    System.out.println("O saldo atual é de R$:"+saldo.get(indice));


                    }else{
                    System.out.println("saldo insuficiente");
                    }

                    break;

                  case 2: //consultdando saldo
                    System.out.printf("%nsaldo: %2.2f%n",saldo.get(indice));


                    break;

                  case 3: // deposintando
                    System.out.print("Deseja depositar dinheiro nesta conta Digite (s/n) para outra conta");
                    if (entrada.next().equals("s")) {

                      System.out.print("Quanto voce deseja depositar:");
                      double deposito = entrada.nextDouble();

                      soma = deposito + saldo.get(indice);
                      saldo.set(indice , soma);
                      System.out.println("saldo R$:"+saldo.get(indice));



                      } else{

                      System.out.println("Digite o nome da conta que deseja fazer depósito");
                      String n2 = entrada.next();

                            if(nome.contains(n2)){
                              System.out.println("Nome de conta para depósito valida!");
                              int indice2 = nome.indexOf(n2);
                              System.out.println("Digite a conta corrente");
                              int c3 = entrada.nextInt();
                              int cc1 = cc.get(indice2);
                                if(c3 == cc1){

                                  System.out.println("conta corrente numero: " + cc1);

                                  System.out.print("Quanto voce deseja depositar:");
                                  double dep = entrada.nextDouble();

                                  if(dep > saldo.get(indice)){
                                    System.out.println("saldo insuficiente");
                                    System.out.println("Favor repetir a operação");
                                  }else{
                                    soma =  saldo.get(indice) - saldo.get(indice2);
                                    saldo.set(indice , soma);
                                    System.out.println("saldo R$:"+saldo.get(indice));

                                  }

                                }else{
                              System.out.println("conta corrente numero inválida " );
                                }

                              }else{
                                System.out.println("Nome de conta para depósito inválida!");
                              }
                            }

                      break;


                  case 4: //transferencia
                          System.out.println("Digite o nome da conta que deseja fazer transferencia");
                          String n3 = entrada.next();

                          if(nome.contains(n3)){
                            System.out.println("Nome de conta para transferencia valida!");
                            int indice3 = nome.indexOf(n3);
                            System.out.println("Digite a conta corrente");

                            int c4 = entrada.nextInt();
                            int cc2 = cc.get(indice3);
                                if(c4 == cc2){

                                  System.out.println("conta corrente numero: " + cc2);

                                  System.out.print("Quanto voce deseja depositar:");
                                  double deposito = entrada.nextDouble();

                                  soma = deposito + saldo.get(indice3);
                                  saldo.set(indice3 , soma);
                                  System.out.println("saldo R$:"+saldo.get(indice3));

                                }else{
                                  System.out.println("conta corrente numero inválida " );
                                }

                            }else{
                              System.out.println("nome da conta corrente não cadastrada" );
                            }


                      break;

                  case 5://pangando boleto
                      System.out.println("favor Digitar a linha de código do Boleto");
                      int boleto = entrada.nextInt();
                      System.out.println("favor Digitar o valor a ser pago!");
                      double dinheiro = entrada.nextDouble();

                        if(dinheiro > saldo.get(indice)){
                          System.out.println("Saldo insuficiente!");
                        }else{

                          soma =  saldo.get(indice) - dinheiro;
                          saldo.set(indice , soma);
                          System.out.println("Pagamento de boleto pago!!");
                          System.out.println("saldo R$:"+saldo.get(indice));
                        }

                        break;

                  }
                  System.out.println("Deseja fazer outra operação se sim digite 1 se não digite 0");
                  b = entrada.nextInt();
                }while(b == 1);

              }else{
              System.out.println("Senha inválida");
              }
          }else{
	            System.out.println(" Não existe este titular");

              }

              break;

            }

        System.out.print("Deseja continuar digite 4 se nao 0");
        in = entrada.nextInt();
      }while (in == 4);


      }

  }
