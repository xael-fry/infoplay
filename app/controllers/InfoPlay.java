package controllers;

import models.JavaInfo;
import models.PlayConf;
import play.mvc.*;

public class InfoPlay extends Controller {

    public static void InfoPlay() {
        JavaInfo javainfo = new JavaInfo();
        PlayConf playconf = new PlayConf();
        render( javainfo, playconf);
    }

}