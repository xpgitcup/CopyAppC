/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copyappc;

/**
 *
 * @author LiXiaoping
 */
public class TargetApplication {

    String appName;
    String appPath;
    String systemDB;
    String userDB;

    public TargetApplication() {
        appPath = CopyAppC.getCurrentRunPath();
        appName = "NoNamed";
        systemDB = "NoNamed";
        userDB = "NoNamed";
    }

    @Override
    public String toString() {
        return "${appName}/(${systemDB},${userDB})@${appPath}";
    }

}
