package tw.tsr.tfast

import tw.tsr.command.CommandReader;
import tw.tsr.logger.MainLogger;
import tw.tsr.killer.ServerKiller;

/**
 *
 *
 *
 *
 *
 *
 *
 * This is a new Server Core written by TSR.TW. Mostly code from TSRlightda.
 * Welcome to help us to finish this Server Core.
 * This will be the next stand just like DragonProxy,that PC and PE can join the same server!!
 **/

/**
 *
 *
 * @author TSRlightda(code) @ TFast Project
 * @author DockCreaTer Team(javadoc) @ Tfast Project
 * @since TFast 0.1 | TFast API 0.0.1
 *
 *
 **/

public class TFast {
  
  public final static String VERSION = "0.1 dev";
    public final static String API_VERSION = "1.0.0";
      public final static String CODENAME = "TSR(童話之星) TFast(星速)";
        public final static String MINECRAFT_PC_VERSION = "1.9";
          public final static String MINECRAFT_PE_VERSION = "0.16.0 alpha";
            public final static String MINECRAFT_PE_VERSION_NETWORK = "0.16.0";
              public final static String MINECRAFT_PC_VERSION_NETWORK = "1.9";
  
  public final static String PATH = System.getProperty("user.dir") + "/";
    public final static String DATA_PATH = System.getProperty("user.dir") + "/";
      public final static String PLUGIN_PATH = DATA_PATH + "Plugins";
        public static final long START_TIME = System.currentTimeMillis();
          public static boolean ANSI = true;
            public static boolean shortTitle = false;
              public static int DEBUG = 1;
  
