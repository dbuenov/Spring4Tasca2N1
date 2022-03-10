package cat.dbuenov.repository;

import java.util.ArrayList;
import java.util.Iterator;

import cat.dbuenov.bean.*;

public class BaseDades {
	
	ArrayList<Treballador> treballadors = new ArrayList<Treballador>();
	int id=1;
		
	public BaseDades() {
		
		treballadors.add(new Treballador(getId(),"Pep",1));
		treballadors.add(new Treballador(getId(),"Lluis",2));
		treballadors.add(new Treballador(getId(),"Marc",1));
		treballadors.add(new Treballador(getId(),"Carla",2));
		treballadors.add(new Treballador(getId(),"Maria",2));
		treballadors.add(new Treballador(getId(),"Joan",1));
		treballadors.add(new Treballador(getId(),"Dani",1));
		treballadors.add(new Treballador(getId(),"Josep",3));
		treballadors.add(new Treballador(getId(),"Natalia",1));
		treballadors.add(new Treballador(getId(),"Monica",1));
		
	}

	public ArrayList<Treballador> getTreballadors() {
		return treballadors;
	}

	public void setTreballadors(ArrayList<Treballador> treballadors) {
		this.treballadors = treballadors;
	}
	
	public int getId() {
		int idRes;
		idRes = this.id;
		this.id++;
		return idRes;
	}	

	public void insert(Treballador treballador) {
		treballadors.add(treballador);
	}
	
	public void delete(int id) {
		//elimina els que tenen la mateixa id... he de controlar les id's uniques
		Iterator<Treballador> it = treballadors.iterator();
		while (it.hasNext()) {
			Treballador treballador2 = it.next();
			if (treballador2.getId()==id) {
				it.remove();
			}
		}		
	}	
	
	public Treballador getTreballador(int id) {
		Iterator<Treballador> it = treballadors.iterator();
		Treballador treballador=null;
		Treballador treballador2=null;
		while (it.hasNext()) {	
			treballador2=it.next();
			if (treballador2.getId()==id) {
				treballador=treballador2;
			}
		}		
		return treballador;
	}
	
	public void update(Treballador treballador) {
		Iterator<Treballador> it = treballadors.iterator();
		Treballador treballador2=null;
		while (it.hasNext()) {	
			treballador2=it.next();
			if (treballador2.getId()==treballador.getId()) {
				treballador2.setNom(treballador.getNom());
				treballador2.setIdFeina(treballador.getIdFeina());
			}
		}		
	}
/*	
	
<form th:action="/update" method="put">
	<br> 
		ID: <input type=text name=id th:value="${treballador?.id}">
		NOM: <input type=text name=nom th:value="${treballador?.nom}">
		ID FEINA: <input type=text name=idFeina th:value="${treballador?.idFeina}">
		<input type=submit name=submit th:value="${boton}">				
</form>	
*/
}
