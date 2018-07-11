package com.codingdojo.language.services;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.codingdojo.language.models.Language;
import com.codingdojo.language.repositories.LanguageRepository;

@Service
public class LanguageService {

    private LanguageRepository languageRepository;

    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    public ArrayList<Language> all() {
        return (ArrayList<Language>) languageRepository.findAll();
    }

    public Language findOne(Long id) {
        return languageRepository.findById(id).get();
    }

    public void create(Language language) {
        languageRepository.save(language);
    }

    public void destroy(Long id) {
        languageRepository.deleteById(id);
    }

    public void update(Language language) {
        languageRepository.save(language);
    }
}
