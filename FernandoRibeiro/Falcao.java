/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FernandoRibeiro;
import javax.swing.JOptionPane;

//@author fernando.ribeiro
//Classe que instancia o animal
public class Falcao {
    
    public static void main(String[] args) {
       
       //Instanciando o objeto da classe Animal
       Animal falc01 = new Animal ();
       
        //Usando "Set" pra definir características do objeto
        falc01.setCor("Azul-Acizentada");
        falc01.setnomeCientifico("Falco Peregrinus");
        falc01.setclasse("Aves");
        falc01.sethabitat("Pântanos e praias");
        falc01.setnomeComum("Falcão Peregrino");
        falc01.setdistribuicao("América do Norte, África, Europa, Ásia e Austrália");
        falc01.setvelocidadeVoo(288);
       
        //Instanciando segundo objeto da classe Animal   
        Animal falc02 = new Animal();
        
        //Usando "Set" pra definir cara. do segundo objeto
        falc02.setCor("Preto");
        falc02.setnomeCientifico("Caracara plancus");
        falc02.setclasse("Aves");
        falc02.sethabitat("Savanas e Campos");
        falc02.setnomeComum("Falcão Carcará");
        falc02.setdistribuicao("América do Sul e do Norte");
        falc02.setvelocidadeVoo(150);
  
        //As duas classes String usam o "Get" pra armazenar as características de cada objeto
        String mensagem01 = "\nNome Comum: " + falc01.getnomeComum() + "\nCor: " + falc01.getCor() + "\nVelocidade: " + falc01.getvelocidadeVoo()+"km/h" + "\nNome cientifíco: " + falc01.getnomeCientifico() + "\nClasse: " + falc02.getclasse() + "\nHabitat: " + falc01.gethabitat() + "\nDistribuição: " + falc01.getdistribuicao();
        String message = "\nNome Comum: " + falc02.getnomeComum() + "\nCor: " + falc02.getCor() + "\nVelocidade: " + falc02.getvelocidadeVoo()+"km/h" + "\nNome cientifíco: "  + falc02.getnomeCientifico() + "\nClasse: " + falc02.getclasse() + "\nHabitat: " + falc02.gethabitat() + "\nDistribuição: " + falc02.getdistribuicao();
        
        //Trecho que irá exibir as mensagens armazenadas nas Strings. "null" para centralizar a mensagem na Tela do User
        JOptionPane.showMessageDialog(null, mensagem01);
        JOptionPane.showMessageDialog(null, message);
    }  
}

