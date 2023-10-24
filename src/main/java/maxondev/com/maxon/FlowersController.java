package maxondev.com.maxon;

import maxondev.com.maxon.flowers.Flower;
import maxondev.com.maxon.flowers.FlowerColor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/flower")
public class FlowersController {
    @RequestMapping("/list/")
    public List<Flower> home() {
        return List.of(new Flower(FlowerColor.RED, 12, 3.1));
    }
}
