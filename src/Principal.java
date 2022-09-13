package br.edu.ifms.conexaoBD;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal 
{
    Scanner sc = new Scanner(System.in);
    ArrayList<Livro> listaLivro = new ArrayList<Livro>();
    EditoraBanco eb = new EditoraBanco();
    LivroBanco lb = new LivroBanco();
    public static void main(String[] args)
    {
        int opcao = 0;
        do{
            opcao = menu();
            switch(opcao){
                case 1:{
                    Editora editoraAdd = new Editora();
                    System.out.println("Informe o nome:");
                    editoraAdd.setNome(sc.nextLine());
                    System.out.println("Informe o código:");
                    editoraAdd.setCodigo(Integer.parseInt(sc.nextLine()));
                    eb.adicionar(editoraAdd);
                    break;
                }
                case 2:{
                    Livro livroAdd = new Livro();
                    System.out.println("Informe o nome:");
                    livroAdd.setNome(sc.nextLine());
                    System.out.println("Informe o ano de publicação:");
                    livroAdd.setAnoPublicacao(Integer.parseInt(sc.nextLine()));
                    System.out.println("Informe o nome da editora:");
                    livroAdd.setEditora(eb.get())
                    lb.adicionar(livroAdd);
                    break;
                }
                case 3:{
                    lb.buscarPorEditora();
                }
            }
        }while(opcao!=0);
    }
    public static int menu(){
        System.out.print("////////////////// Sistema Biblioteca° ////////////////////\n"+
                         "1 - Cadastro de Editora\n"+
                         "2 - Cadastro de Livro\n"+
                         "3 - Busca de Editora Específica\n"+
                         "4 - Sair\n");
        return Integer.parseInt(sc.nextLine());
    }
}