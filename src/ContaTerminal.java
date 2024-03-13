public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a class Scanner.

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        // TODO: Exibir mensagem para nosso usuário.
        System.out.println("Digite o numero da Conta: ");
        int accountNumber = sc.nextInt();

        System.out.println("Digite o numero da Agência: ");
        String agency = sc.next();

        System.out.println("Digite o nome do cliente: ");
        String name = sc.next();

        System.out.println("Digite o sobrenome do cliente: ");
        String lastName = sc.next();

        System.out.println("Digite o saldo do cliente: ");
        Double accountBalance = sc.nextDouble();

        // TODO: Obter pelo Scanner os valores digitados pelo Terminal.
        System.out.println("\n**********************");
        System.out.println("** DADOS DO CLIENTE **");
        System.out.println("**********************\n");

        System.out.println("Número da conta: " + accountNumber);
        System.out.println("\nAgência da conta: " + agency);
        System.out.println("\nNome do cliente: " + name + " " + lastName);
        System.out.println("\n Saldo conta bancaria: " + accountBalance);

        // TODO: Exibir a mensagem da conta criada.
        
        System.out.println(
        "Olá" + name + " " + lastName, + "obrigado por criar uma conta em 
        nosso banco, sua agência é " + agency +," conta " + accountNumber + 
        " e seu saldo " + accountBalance + 
        "já está disponível para saque.");
    }
}
