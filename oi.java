import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
public class oi {

 public static void main(String[]args){
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
  int i;

  do{
    int opcao;
    int opcao2;

   System.out.println("1 - Gerente");
   System.out.println("2 - Cliente");


   opcao = entrada.nextInt();
    switch (opcao) {

      case 1:
      System.out.println("1 - para cadastrar o cliente");
      System.out.println("2 - para remover o cliente");
      opcao2 = entrada.nextInt();
       switch (opcao2) {
          case 1:

              System.out.println("Digite o nome do cliente ");
              nome.add(entrada.next());

              System.out.println("Digite o endereço do cliente");
              endereco.add(entrada.next());

              System.out.println("Digite o telefone do cliente");
              telefone.add(entrada.next());

              System.out.println("Digite o CPF do cliente");
              cpf.add(entrada.next());

              System.out.println("Digite a conta corrente do cliente");
              cc.add(entrada.nextInt());

              System.out.println("Digite o numero da agencia do cliente ");
              numeroag.add(entrada.nextInt());

              System.out.println("Digite a senha do cliente");
              senha.add(entrada.next());

              System.out.println("Digite o saldo do cliente");
              saldo.add(entrada.nextDouble());
              break;

            case 2:

              break;

            }
            break;


      case 2:
        System.out.println("Digite o nome do titular");
        String n = entrada.next();
        if(nome.contains(n)){
          System.out.println("O nome do titular valido");
            
        }else{
	           System.out.println(" Não existe este titular");

            }














        break;

      }
        System.out.print("Deseja continuar digite 4 se nao 0");
        i = entrada.nextInt();
        }while (i == 4);
      }

  }
