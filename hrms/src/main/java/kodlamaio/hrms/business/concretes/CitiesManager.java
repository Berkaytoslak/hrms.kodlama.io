package kodlamaio.hrms.business.concretes;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CitiesServices;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccsess.abstracts.CitiesRepository;
import kodlamaio.hrms.entities.concretes.Cities;

@Service
@RequiredArgsConstructor
public class CitiesManager implements CitiesServices{
	
	private final CitiesRepository citiesRepository;

	@Override
	public DataResult<List<Cities>> getAll() {
		return new SuccessDataResult<List<Cities>>
		(this.citiesRepository.findAll(),"Şehirler Listelendi");
	}

}
