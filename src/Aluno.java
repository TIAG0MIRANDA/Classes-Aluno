//T.M
import java.util.Scanner; //Emtrada de dados

public class Aluno{ // classe
    
    public String Nome, Sobrenome, Disciplina, Situacao;
    public int Idade, Turma;
    public double Media;
    
                    //metodos
//-------------------------------------------------
    public void setNome(String nome){
        Nome = nome;
    }
    public String getNome(){
        return Nome;
    }
//-------------------------------------------------
    public void setSobrenome(String sobrenome){
        Sobrenome = sobrenome;
    }
    public String getSobrenome(){
        return Sobrenome;
    }
//-------------------------------------------------
    public void setIdade(int idade){
        Idade = idade;
    }
    public int getIdade(){
    return Idade;    
    }
//-------------------------------------------------
    public void setTurma(int turma) {
        Turma = turma;
    }
    public int getTurma() {
        return Turma;
    }
//-------------------------------------------------
    public void setMediaAluno(double media){
        Media = media;
    }
    public double getMediaAluno(){
        return Media;
    }
//-------------------------------------------------
    public void setDisciplina(String disciplina){
        Disciplina = disciplina;
    }
    public String getDisciplina(){
        return Disciplina;
    }
//-------------------------------------------------
    public void setSituacao(String situacao) {
        Situacao = situacao;
    }
    public String getSituacao() {
        return Situacao;
    }
//-------------------------------------------------
 
    public void preencherDados(){
        Scanner ler = new Scanner(System.in);

        System.out.printf("Nome: ");
        this.Nome = ler.nextLine();

        System.out.printf("Sobrenome: ");
        this.Sobrenome = ler.nextLine();
        
        System.out.printf("Sua Disciplina: ");
        this.Disciplina = ler.next();

        System.out.printf("Sua idade: ");
        this.Idade = ler.nextInt();

        System.out.printf("Seu Turma: ");
        this.Turma = ler.nextInt();

        System.out.printf("sua média: ");
        this.Media = ler.nextDouble();

        Nome = Nome.toUpperCase();
        Sobrenome = Sobrenome.toUpperCase();

        }

    public void detalhe() {
        System.out.println("O aluno " + this.Nome + " " + this.Sobrenome + "\n" + this.Idade + " anos "+"\nTurma: "+ this.Turma + "\n tirou " + 
                                        this.Media + "\n Disciplina: " + this.Disciplina);

        if(this.Media < 6) {
            System.out.println("Você reprovou de ano!");
        }else{
            System.out.println("Você passou de ano!");
        }

    }
    public static void main (String[] args) {

        Aluno aluno =  new Aluno();
        aluno.preencherDados();
        aluno.detalhe();
    }
}