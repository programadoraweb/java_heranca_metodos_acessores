public class App {
    public static void main(String[] args) throws Exception {
Cachorro c = new Cachorro(); 
// c.nome = "Pacoaca";  
c.setNome("Bidu");

Gato g = new Gato();
g.setNome("Lila");

c.Mostrar();
g.Mostrar();
c.Comer();
g.Comer();
    }
}
