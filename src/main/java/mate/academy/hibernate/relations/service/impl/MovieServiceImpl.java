package mate.academy.hibernate.relations.service.impl;

import java.util.Optional;
import mate.academy.hibernate.relations.dao.MovieDao;
import mate.academy.hibernate.relations.dao.impl.MovieDaoImpl;
import mate.academy.hibernate.relations.model.Movie;
import mate.academy.hibernate.relations.service.MovieService;
import org.hibernate.SessionFactory;

public class MovieServiceImpl implements MovieService {
    private MovieDao movieDao;

    public MovieServiceImpl(SessionFactory factory) {
        movieDao = new MovieDaoImpl(factory);
    }

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        Optional<Movie> optionalMovie = movieDao.get(id);
        return optionalMovie.orElse(null);
    }
}
