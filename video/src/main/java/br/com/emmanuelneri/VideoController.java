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
@RequestMapping("/video")
public class VideoController {

    private static final Map<Long, String> VIDEO = ImmutableMap.of(
            1L, "Video 1",
            2L, "Video 2",
            3L, "Video 3",
            4L, "Video 4");

    @GetMapping
    public List<String> findAll() {
        return new ArrayList<>(VIDEO.values());
    }

    @GetMapping(path = "/{id}")
    public String findById(@PathVariable("id") Long id) {
        return VIDEO.get(id);
    }

}
