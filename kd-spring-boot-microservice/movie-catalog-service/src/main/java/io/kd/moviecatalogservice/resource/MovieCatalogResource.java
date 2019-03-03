package io.kd.moviecatalogservice.resource;

import java.util.List;
import java.util.Collections;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.kd.moviecatalogservice.models.CatalogItem;
import io.kd.moviecatalogservice.models.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	 @RequestMapping("/{userId}")
	    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
		 
		 return Collections.singletonList(
				 new CatalogItem("Transformers", "test", 4)
				);
		/*
		 * UserRating userRating =
		 * restTemplate.getForObject("http://ratings-data-service/ratingsdata/user/" +
		 * userId, UserRating.class);
		 * 
		 * return userRating.getRatings().stream() .map(rating -> { Movie movie =
		 * restTemplate.getForObject("http://movie-info-service/movies/" +
		 * rating.getMovieId(), Movie.class); return new CatalogItem(movie.getName(),
		 * movie.getDescription(), rating.getRating()); })
		 * .collect(Collectors.toList());
		 */
	    }
}
