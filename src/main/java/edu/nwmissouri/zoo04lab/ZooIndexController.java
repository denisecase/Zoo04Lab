package edu.nwmissouri.zoo04lab;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controller that handles the default request ("/").
 *
 * Use the new Java 15 text blocks to provide our menu. Thymeleaf:
 * https://spring.io/guides/gs/serving-web-content/
 *
 * @author Denise Case
 */
@Controller
public class ZooIndexController {

    private static final String GREETING_MESSAGE = "Welcome to our 542 Zoo!";
    private static final String GOODBYE_MESSAGE = "Thank you for visiting our zoo!";
    private static final int NUMBER_ANIMAL_TYPES = 60;

    /**
     * The @GetMapping annotation ensures that HTTP GET requests to / are mapped
     * to the index() method.Example:
     * https://spring.io/guides/gs/serving-web-content/
     *
     *
     * @param idParam - the id provided in the URL
     * @param model - the model that holds information from controller to view
     * @return
     */
    @GetMapping(path = "/")
    public String index(
            @RequestParam(name = "id", required = false, defaultValue = "0") String idParam,
            Model model) {
        model.addAttribute("id", idParam);
        model.addAttribute("name", "World");
        model.addAttribute("greeting", GREETING_MESSAGE);
        model.addAttribute("animalMap", ZooBuildSwitch.getAllAnimalMap());
        model.addAttribute("customAnimalGroup", getCustomAnimalGroup(idParam));
        // associated with index.hmtl in src/main/resources/templates
        return "index";
    }

    /**
     * Map GET request to "/about" to about().
     *
     * @return filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/about")
    public String about() {
        return "about";
    }

    private String getCustomAnimalGroup(String id) {
        // Create a stream to hold the output
        var newStream = new ByteArrayOutputStream();
        var newPrintStream = new PrintStream(newStream);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(newPrintStream);
        
        var intID = Integer.parseInt(id);

        switch (intID) {

            case 1 -> {
                AardvarkGroup.create();
                AardvarkGroup.run();
            }
            case 2 -> {
                AbyssinianGroup.create();
                AbyssinianGroup.run();
            }
            case 3 -> {
                ArvicolinaeGroup.create();
                ArvicolinaeGroup.run();
            }
            case 4 -> {
                AspGroup.create();
                AspGroup.run();
            }
            case 5 -> {
                BearcatGroup.create();
                BearcatGroup.run();
            }
            case 6 -> {
                BengalTigerGroup.create();
                BengalTigerGroup.run();
            }
            case 7 -> {
                BlackJaguarGroup.create();
                BlackJaguarGroup.run();
            }
            case 8 -> {
               // BlackPantherGroup.create();
               // BlackPantherGroup.run();
            }
            case 9 -> {
              //  BrachiosaurusGroup.create();
              //  BrachiosaurusGroup.run();
            }
            case 10 -> {
                BuffaloGroup.create();
                BuffaloGroup.run();
            }
            case 11 -> {
                CatGroup.create();
                CatGroup.run();
            }
            case 12 -> {
                CheetahGroup.create();
                CheetahGroup.run();
            }
            case 13 -> {
                CongoLionGroup.create();
                CongoLionGroup.run();
            }
            case 14 -> {
                CowGroup.create();
                CowGroup.run();
            }
            case 15 -> {
                CrocodileGroup.create();
                CrocodileGroup.run();
            }
            case 16 -> {
                DalmatianGroup.create();
                DalmatianGroup.run();
            }
            case 17 -> {
                DeerGroup.create();
                DeerGroup.run();
            }
            case 18 -> {
                DinosaurGroup.create();
                DinosaurGroup.run();
            }
            case 19 -> {
                DuckGroup.create();
                DuckGroup.run();
            }
            case 20 -> {
                ElephantBirdGroup.create();
                ElephantBirdGroup.run();
            }
            case 21 -> {
                ElephantGroup.create();
                ElephantGroup.run();
            }
            case 22 -> {
                EmuGroup.create();
                EmuGroup.run();
            }
            case 23 -> {
                FerociousTigerGroup.create();
                FerociousTigerGroup.run();
            }
            case 24 -> {
                FloppyGroup.create();
                FloppyGroup.run();
            }
            case 25 -> {
                FrogGroup.create();
                FrogGroup.run();
            }
            case 26 -> {
                GerenukGroup.create();
                GerenukGroup.run();
            }
            case 27 -> {
                GiraffeGroup.create();
                GiraffeGroup.run();
            }
            case 28 -> {
                GlyptodonGroup.create();
                GlyptodonGroup.run();
            }
            case 29 -> {
                GoatGroup.create();
                GoatGroup.run();
            }
            case 30 -> {
                GriffinGroup.create();
                GriffinGroup.run();
            }
            case 31 -> {
                HarpSealGroup.create();
                HarpSealGroup.run();
            }
            case 32 -> {
                HippopotamusGroup.create();
                HippopotamusGroup.run();
            }
            case 33 -> {
                KangarooGroup.create();
                KangarooGroup.run();
            }
            case 34 -> {
                KangaroovGroup.create();
                KangaroovGroup.run();
            }
            case 35 -> {
                KoalaGroup.create();
                KoalaGroup.run();
            }
            case 36 -> {
                LigerGroup.create();
                LigerGroup.run();
            }
            case 37 -> {
                LionessGroup.create();
                LionessGroup.run();
            }
            case 38 -> {
                LionGroup.create();
                LionGroup.run();
            }
            case 39 -> {
                MightyLionGroup.create();
                MightyLionGroup.run();
            }
            case 40 -> {
                MuleDeerGroup.create();
                MuleDeerGroup.run();
            }
            case 41 -> {
                OkapiGroup.create();
                OkapiGroup.run();
            }
            case 42 -> {
                PandaGroup.create();
                PandaGroup.run();
            }
            case 43 -> {
                PantheraGroup.create();
                PantheraGroup.run();
            }
            case 44 -> {
                PolarBearGroup.create();
                PolarBearGroup.run();
            }
            case 45 -> {
                ProngHornGroup.create();
                ProngHornGroup.run();
            }
            case 46 -> {
                PumaGroup.create();
                PumaGroup.run();
            }
            case 47 -> {
                RabbitGroup.create();
                RabbitGroup.run();
            }
            case 48 -> {
                RelayHorseGroup.create();
                RelayHorseGroup.run();
            }
            case 49 -> {
                RoaringLionGroup.create();
                RoaringLionGroup.run();
            }
            case 50 -> {
                ShoebillGroup.create();
                ShoebillGroup.run();
            }
            case 51 -> {
                SiberianTigerGroup.create();
                SiberianTigerGroup.run();
            }
            case 52 -> {
                SquirrelGroup.create();
                SquirrelGroup.run();
            }
            case 53 -> {
                StagGroup.create();
                StagGroup.run();
            }
            case 54 -> {
                StringRayGroup.create();
                StringRayGroup.run();
            }
            case 55 -> {
                SunBearGroup.create();
                SunBearGroup.run();
            }
            case 56 -> {
                TauntingTigerGroup.create();
                TauntingTigerGroup.run();
            }
            case 57 -> {
                UnicornGroup.create();
                UnicornGroup.run();
            }
            case 58 -> {
                WalrusGroup.create();
                WalrusGroup.run();
            }
            case 59 -> {
                XraytetraGroup.create();
                XraytetraGroup.run();
            }
            case 60 -> {
                YukonMooseGroup.create();
                YukonMooseGroup.run();
            }
            default -> {
            }
        }

        // Put things back
        System.out.flush();
        System.setOut(old);
        String stringOutput = newStream.toString();
        return stringOutput;
    }
}
