import java.util.Scanner;

public class Uni6Exe04 {

    private int contVogais(String texto) { // Declara um método privado que conta vogais em uma string
        int vogais = 0; 
        for (int i = 0; i < texto.length(); i++) { // Loop que percorre cada caractere da string
            if (texto.charAt(i) == 'A' || texto.charAt(i) == 'E' || texto.charAt(i) == 'I' || texto.charAt(i) == 'O'
                    || texto.charAt(i) == 'U') { // Verifica se o caractere atual é uma vogal maiúscula
                vogais++; // Incrementa o contador de vogais
            } 
        } 
        return vogais; // Retorna o total de vogais encontradas
    } 

    private int contNumeros(String texto) { // Declara um método privado que tenta extrair números do início da string
        String numero = ""; // Cria uma string vazia para armazenar os dígitos encontrados
        for (int i = 0; i < texto.length(); i++) { // Loop que percorre cada caractere da string
            if (texto.charAt(i) >= '0' && texto.charAt(i) <= '9') { // Verifica se o caractere atual é um dígito numérico
                numero = numero + texto.charAt(i); // Acumula o dígito encontrado na string numero
            } else { 
                break; // Encerra o loop
            } 
        } 
        if (numero == "") { // Verifica se nenhum número foi encontrado
            numero = "0"; // Define o valor como 0 para evitar erro na conversão
        }
        return Integer.parseInt(numero); // Converte a string de números em um inteiro e retorna o valor
    } 

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        Uni6Exe04 exe = new Uni6Exe04(); // Cria um objeto da classe Uni6Exe04 para chamar seus métodos

        System.out.println("Digite uma frase: "); 
        String texto = tec.nextLine().toUpperCase(); // Lê a frase e converte tudo para maiúsculas

        int vogais = exe.contVogais(texto); // Chama o método contVogais e guarda o resultado em vogais
        int numero = exe.contNumeros(texto); // Chama o método contNumeros e guarda o resultado em numero

        System.out.println("Número de vogais é igual à: "); 
        System.out.println(vogais);

        System.out.println("Número é: "); 
        System.out.println(numero); 
    } 

} 
