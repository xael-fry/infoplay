package controllers.infoplay;

import models.infoplay.JavaInfo;
import models.infoplay.PlayConf;
import play.mvc.*;

public class InfoPlay extends Controller {

    public static void InfoPlay() {
        JavaInfo javainfo = new JavaInfo();
        PlayConf playconf = new PlayConf();
        render( javainfo, playconf);
    }

}