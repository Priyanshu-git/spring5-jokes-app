package spring.framework.spring5jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        chuckNorrisQuotes=new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
