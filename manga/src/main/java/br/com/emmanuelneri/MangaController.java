package br.com.emmanuelneri;

import com.google.common.collect.ImmutableMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/manga")
public class MangaController {

    private static final Map<Long, String> MANGA = ImmutableMap.of(
            1L, "Manga 1",
            2L, "Manga 2",
            3L, "Manga 3",
            4L, "Manga 4");

    @GetMapping
    public List<String> findAll() {
        return new ArrayList<>(MANGA.values());
    }

    @GetMapping(path = "/{id}")
    public String findById(@PathVariable("id") Long id) {
        return MANGA.get(id);
    }

}
