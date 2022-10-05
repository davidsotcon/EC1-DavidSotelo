package EC1DavidSotelo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EC1DavidSotelo.model.Profesor;
import EC1DavidSotelo.repository.ProfesorRepository;

@Service
public class ProfesorServiceImp implements ProfesorService {

	@Autowired
	private ProfesorRepository repositorio;
	@Override
	public void guardar(Profesor profesor) {
		// TODO Auto-generated method stub
		repositorio.save(profesor);

	}

	@Override
	public void actualizar(Profesor profesor) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(profesor);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public List<Profesor> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Profesor obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

}
