package com.github.reza_sameei.maven_project_template.launcher;

import com.github.reza_sameei.maven_project_template.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Launcher {

    public static void main(String [] args) {

        ReleaseId releaseId = new ReleaseId("io.tb" , "what", "1.0");

        Logger logger = LoggerFactory.getLogger(Launcher.class);

        logger.info("The object {}", releaseId);
    }

}
