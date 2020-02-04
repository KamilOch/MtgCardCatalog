package com.catalog.MTGCardCatalog.card;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CardService {

    private CardEntityRepository cardEntityRepository;

    @Autowired
    public CardService(CardEntityRepository cardEntityRepository) {
        this.cardEntityRepository = cardEntityRepository;
    }

    public void addCard(String name){
        CardEntity newCard = CardEntity.builder().name(name).build();
        cardEntityRepository.save(newCard);
    }
}
