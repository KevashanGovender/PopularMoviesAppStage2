package govender.kevashan.com.popularmoviesapp.viewmovies.task;

import govender.kevashan.com.popularmoviesapp.viewmovies.repo.IViewMoviesRepo;
import govender.kevashan.com.popularmoviesapp.viewmovies.viewmodel.IViewMovies;

public class ViewMoviesTaskFactory {

    private IViewMoviesRepo repo;
    private String key;
    private IViewMovies view;

    public ViewMoviesTaskFactory(IViewMoviesRepo repo, String key, IViewMovies view) {
        this.repo = repo;
        this.key = key;
        this.view = view;
    }

    public GetPopularMoviesTask getPopularMoviesTask(){
       return new GetPopularMoviesTask(repo, key, view);
    }

    public GetTopRatedMoviesTask getTopRatedMovieTask(){
        return new GetTopRatedMoviesTask(repo, key, view);
    }

    public GetFavoriteMovieTask getFavoriteMovieTask(){
        return new GetFavoriteMovieTask(repo, view);
    }
}
