package cat.dbuenov.bean;

public class Treballador {
	
	private int id;
	private String nom;
	private int idFeina;
	private String nomFeina;
	private float sou;	
		
	public Treballador(int id, String nom, int idFeina) {
		this.id = id;
		this.nom = nom;
		this.idFeina = idFeina;
		setIdFeina(idFeina);
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getIdFeina() {
		return idFeina;
	}


	public void setIdFeina(int idFeina) {
		this.idFeina = idFeina;
		switch (idFeina) {
		case 1:
			this.nomFeina = "tecnic";
			this.sou=1600F;
		break;
		case 2:
			this.nomFeina = "comercial";
			this.sou=1800F;
		break;
		case 3:
			this.nomFeina = "gerent";
			this.sou=2000F;
		break;
		}
	}


	public String getNomFeina() {
		return nomFeina;
	}


	public void setNomFeina(String nomFeina) {
		this.nomFeina = nomFeina;
	}


	public float getSou() {
		return sou;
	}


	public void setSou(float sou) {
		this.sou = sou;
	}


	@Override
	public String toString() {
		return "id=" + id + ", nom=" + nom + ", idFeina=" + idFeina + ", nomFeina=" + nomFeina + ", sou="
				+ sou + "<br/>";
	}

	
	
}
