package com.michaelcgood;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class AnimeProcessor implements ItemProcessor<AnimeDTO, AnimeDTO> {
	
    private static final Logger log = LoggerFactory.getLogger(AnimeProcessor.class);
    
    @Override
    public AnimeDTO process(final AnimeDTO AnimeDTO) throws Exception {
    	
    	final String id = AnimeDTO.getId();
        final String title = AnimeDTO.getTitle();
        final String description = AnimeDTO.getDescription();

        final AnimeDTO transformedAnimeDTO = new AnimeDTO(id, title, description);

        log.info("Converting (" + AnimeDTO + ") into (" + transformedAnimeDTO + ")");

        return transformedAnimeDTO;
    }

}
