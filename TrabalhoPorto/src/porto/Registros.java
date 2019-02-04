package porto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class Registros {

	//Cadastro Navio TXT
	public void cadastraNavio(ArrayList<Navio> navios) throws IOException {
		File arquivo = new File("Pasta/navios.txt");
		FileWriter escritor = new FileWriter(arquivo,false);
		BufferedWriter buffer = new BufferedWriter(escritor);
		String conteudo = "";

		for (int i = 0; i < navios.size(); i++) {
			conteudo = navios.get(i).getMatricula()+","+navios.get(i).getTransportadora()+","+navios.get(i).getComandante()+"\n";
			buffer.write(conteudo);
		}
		buffer.close();
		escritor.close();
		System.out.println("Cadastrar txt Navio");
	}


	//Ler Navio TXT
	public void lerNavio(ArrayList<Navio> navios)throws IOException {
		File arquivo2 = new File("Pasta/navios.txt");	
		FileReader leitor = new FileReader(arquivo2);
		InputStreamReader sr = new InputStreamReader(System.in);   
		BufferedReader ler = new BufferedReader(leitor); 


		String linha = " ";
		while((linha = ler.readLine())!=null) {
			String n1 [] = linha.split(",");
			Navio n = new Navio(n1[0], n1[1],n1[2]);
			navios.add(n);
		}
		sr.close();
		ler.close();
		System.out.println("Leitura txt Navio");

	}	

	//Cadastro Caminhao TXT
	public void cadastraCaminhao(ArrayList<Caminhao> caminhoes) throws IOException {
		File arquivo = new File("Pasta/caminhoes.txt");
		FileWriter escritor = new FileWriter(arquivo,false);
		BufferedWriter buffer = new BufferedWriter(escritor);

		String conteudo = "";
		for (int i = 0; i < caminhoes.size(); i++) {
			conteudo = caminhoes.get(i).getPlaca()+","+caminhoes.get(i).getTransportadora()+","+caminhoes.get(i).getMotorista()+"\n";
			buffer.write(conteudo);
		}
		buffer.close();
		escritor.close();
		System.out.println("Cadastrar txt Caminhão");
	}

	//Ler Caminhão TXT
	public void lerCaminhao(ArrayList<Caminhao> caminhoes)throws IOException {
		File arquivo2 = new File("Pasta/caminhoes.txt");	
		FileReader leitor = new FileReader(arquivo2);
		InputStreamReader sr = new InputStreamReader(System.in);   
		BufferedReader ler = new BufferedReader(leitor); 


		String linha = " ";
		while((linha = ler.readLine())!=null) {
			String c1 [] = linha.split(",");
			Caminhao c = new Caminhao(c1[0], c1[1],c1[2]);
			caminhoes.add(c);
		}
		sr.close();
		ler.close();
		System.out.println("Leitura txt Caminhao");

	}	

	//Cadastro Container TXT
	public void cadastraContainer(ArrayList<Container> containers) throws IOException {
		File arquivo = new File("Pasta/containers.txt");
		FileWriter escritor = new FileWriter(arquivo,false);
		BufferedWriter buffer = new BufferedWriter(escritor);

		String conteudo = "";
		for (int i = 0; i < containers.size(); i++) {
			conteudo = containers.get(i).getCodigo()+","+containers.get(i).getDescricao()+","+containers.get(i).getLocalizacao()+"," +
					containers.get(i).getOrigem()+","+containers.get(i).getDestino()+","+containers.get(i).getDataEntrada()+","+
					containers.get(i).getDataSaida()+"\n";
			buffer.write(conteudo);
		}
		buffer.close();
		escritor.close();
		System.out.println("Cadastrar txt Container");
	}

	//Ler Container TXT
	public void lerContainer(ArrayList<Container> containers)throws IOException {
		File arquivo2 = new File("Pasta/containers.txt");	
		FileReader leitor = new FileReader(arquivo2);
		InputStreamReader sr = new InputStreamReader(System.in);   
		BufferedReader ler = new BufferedReader(leitor); 


		String linha = " ";
		while((linha = ler.readLine())!=null) {
			String co1 [] = linha.split(",");
			Container c1 = new Container(co1[0], co1[1],co1[2],co1[3], co1[4],co1[5], co1[6]);
			containers.add(c1);
		}
		sr.close();
		ler.close();
		System.out.println("Leitura txt Container");

	}

	//Cadastro Saida TXT
	public void cadastraSaida(ArrayList<Saida> saidas) throws IOException {
		File arquivo = new File("Pasta/saidas.txt");
		FileWriter escritor = new FileWriter(arquivo,false);
		BufferedWriter buffer = new BufferedWriter(escritor);

		String conteudo = "";
		for (int i = 0; i < saidas.size(); i++) {
			conteudo = saidas.get(i).getDestino()+","+saidas.get(i).getCodigo()+","+saidas.get(i).getDataSaida()+"\n";
			buffer.write(conteudo);
		}
		buffer.close();
		escritor.close();
		System.out.println("Cadastrar txt Saida");
	}

	//Ler Saida TXT
	public void lerSaida(ArrayList<Saida> saidas)throws IOException {
		File arquivo2 = new File("Pasta/saidas.txt");	
		FileReader leitor = new FileReader(arquivo2);
		InputStreamReader sr = new InputStreamReader(System.in);   
		BufferedReader ler = new BufferedReader(leitor); 


		String linha = " ";
		while((linha = ler.readLine())!=null) {
			String s1 [] = linha.split(",");
			Saida s = new Saida(s1[0], s1[1],s1[2]);
			saidas.add(s);
		}
		sr.close();
		ler.close();
		System.out.println("Leitura txt Saida");



	}	
}
