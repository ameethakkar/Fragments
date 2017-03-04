package fragments.lab.fragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Activity;
import android.view.Display;
import android.view.WindowManager;

public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        WindowManager wm = getWindowManager();
        Display d = wm.getDefaultDisplay();
        if(d.getWidth() > d.getHeight()){
            Fragment1 fragment1 = new Fragment1();
            fragmentTransaction.replace(android.R.id.content,fragment1);
        }
        else {
            Fragment2 fragment2 = new Fragment2();
            fragmentTransaction.replace(android.R.id.content,fragment2);
        }
        fragmentTransaction.commit();
        setContentView(R.layout.main);
    }
}
