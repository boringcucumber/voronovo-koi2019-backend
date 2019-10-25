package voronovo.koi2019.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import voronovo.koi2019.entity.Test;

@RepositoryRestResource
public interface TestRepository extends PagingAndSortingRepository<Test, Long> {

}
