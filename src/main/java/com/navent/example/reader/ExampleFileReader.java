package com.navent.example.reader;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.navent.example.model.Posting;
import com.navent.example.model.PostingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.Paths;
import java.util.List;

@Service
public class ExampleFileReader {
    @Autowired
    private ExampleFileReaderConfiguration configuration;

    @Autowired
    private ObjectMapper mapper;

    public List<Posting> getPostingFromJson() {
        try {
            PostingResult result = mapper.readValue(Paths.get(configuration.getFileName()).toFile(), PostingResult.class);
            return result.getResult();
        } catch (Exception exception) {
            throw new RuntimeException("Error reading file", exception);
        }
    }

}
