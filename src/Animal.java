class Animal{

    public String nome; 
// com private da erro...

    // Criado os METODOS ACESSORES
    // Para acessar a variavel NOME
    public void setNome(String n){
        nome = n; 
           System.out.println(nome);
    }

    public String getNome(){
        return nome; 
    }

    public void Comer(){
        System.out.println("Eu gosto de comer.");
    }

}