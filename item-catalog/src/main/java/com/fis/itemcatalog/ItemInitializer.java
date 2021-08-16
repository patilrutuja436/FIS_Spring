package com.fis.itemcatalog;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ItemInitializer implements CommandLineRunner {

    private final ItemRepository itemRepository;

    ItemInitializer(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
   // 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
//list of Items
    @Override
    public void run(String... args) throws Exception {
        Stream.of("Lining", "PUMA", "Bad Boy", "Air Jordan", "Nike", "Adidas", "Reebok")
                .forEach(item -> itemRepository.save(new Item(item)));

        itemRepository.findAll().forEach(System.out::println);
    }
}
