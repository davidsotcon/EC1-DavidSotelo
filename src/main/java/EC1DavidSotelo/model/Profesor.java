package EC1DavidSotelo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name ="profesores")
public class Profesor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProfesor;
	private String profesor;
	
	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(
			name="profesor_Curso",
			joinColumns = @JoinColumn(
					name="id_profesor",
					nullable =false,
					unique=true,
					foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_profesor) references productos(id_producto)")
					
					),inverseJoinColumns =  @JoinColumn(
							name="id_cliente",
							nullable =false,
							unique=true,
							foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_cliente) references productos(id_cliente)")
							
							)
					
			)
	private List<Curso> cursos = new ArrayList<>();
	
	public Integer getIdProfesor() {
		return idProfesor;
	}
	public void setIdProfesor(Integer idProfesor) {
		this.idProfesor = idProfesor;
	}
	public String getProfesor() {
		return profesor;
	}
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	
	

}
