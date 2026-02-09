package learninginheritance;

import learninginheritance.mobile.Android;

public class LearningInheritance {

    public static void main(String[] args) {

        Android a = new Android();

        a.setOs("yes");
        a.setBrowser("chorme");
        a.setCall("yes");
        a.setCamera("dual camera");
        a.setGallary("yes");
        a.setGames("free fire");
        a.setMessage("massage");
        System.out.println(a);


    }

}
