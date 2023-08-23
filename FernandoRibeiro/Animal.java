/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FernandoRibeiro;

//@author fernando.ribeiro

public class Animal {

    //Atributos da Classe 
    private  String nomeComum;
    private String cor;
    private String nomeCientifico;
    private String classe;
    private String habitat;
    private String distribuicao;
    private int velocidadeVoo;

    //Construtor padrão, definindo que a cor de novos obj. por padrão, será "preto"
    public Animal() {
        this.cor = "Preto";
    }
    
    //Construtor com parâmetros
    public Animal(String cor, String nomeCientifico, String classe, String habitat, String nomeComum, String distribuicao, int velocidadeVoo) {
        
        /*Atribuição de valor do parâmetro ao valor da variavel
          Ex: this.cor(parâmetro) = cor(variável)
        */ 
        this.cor = cor;
        this.nomeCientifico = nomeCientifico;
        this.classe = classe;
        this.habitat = habitat;
        this.distribuicao = distribuicao;
    }
    
    //Métodos Get-Set, para definir(Set) e retornar(Get) valores das variáveis
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getnomeCientifico() {
        return nomeCientifico;
    }

    public void setnomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getclasse() {
        return classe;
    }

    public void setclasse(String classe) {
        this.classe = classe;
    }

    public String gethabitat() {
        return habitat;
    }

    public void sethabitat(String habitat) {
        this.habitat = habitat;
    }
    
     public String getnomeComum() {
        return nomeComum;
    }

    public void setnomeComum(String nomeComum) {
        this.nomeComum = nomeComum;
    }

    public String getdistribuicao() {
        return distribuicao;
    }

    public void setdistribuicao(String distribuicao) {
        this.distribuicao = distribuicao;
    }

    public int getvelocidadeVoo() {
        return velocidadeVoo;
    }

    public void setvelocidadeVoo(int velocidadeVoo) {
        this.velocidadeVoo = velocidadeVoo;
    }
}
