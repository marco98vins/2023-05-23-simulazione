package it.polito.tdp.baseball.model;

import java.util.ArrayList;
import java.util.List;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

import it.polito.tdp.baseball.db.BaseballDAO;

public class Model {
	
	private Graph<Nodo, DefaultEdge> grafo = new SimpleGraph(DefaultEdge.class);
	private BaseballDAO dao = new BaseballDAO();
	private List<Nodo> listaNodi;
	
	
	
	



	public String creaGrafo(int anno, int salario) {
		
		listaNodi= dao.getPlayerYearSalary(anno, salario);
		
		//creo vertici
		
		Graphs.addAllVertices(this.grafo, this.listaNodi);
		
		//creo edges
		
		for(Nodo n1: this.listaNodi) {
			for(Nodo n2: this.listaNodi) {
				
				if(!n1.getIdgiocatore().equals(n2.getIdgiocatore()) && n1.getIdteam()==n2.getIdteam()) {
					Graphs.addEdgeWithVertices(this.grafo, n1, n2);
				}
			
			}	
			
		}
		
		int n = this.grafo.vertexSet().size();
		int m = this.grafo.edgeSet().size();
		return "Ci sono "+n +" vertici e "+ m +" archi.";
		
	}
	
	public void clearGraph() {
		this.listaNodi = new ArrayList<>();
		this.grafo = new SimpleGraph<>(DefaultEdge.class);			
	}
	
	
}