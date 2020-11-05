package kr.hs.emirim.s2019w34.mirijmviewcontainer;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class TabActivityTest2 extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_test2);
        TabHost tabHost = getTabHost();


        TabHost.TabSpec tabSpecPark = tabHost.newTabSpec("PARK").setIndicator("박서준");
        tabSpecPark.setContent(R.id.linear_Park);
        tabHost.addTab(tabSpecPark);

        TabHost.TabSpec tabSpecHama = tabHost.newTabSpec("HAMA").setIndicator("우주하마");
        tabSpecHama.setContent(R.id.linear_hama);
        tabHost.addTab(tabSpecHama);

        TabHost.TabSpec tabSpecExo = tabHost.newTabSpec("EXO").setIndicator("엑소");
        tabSpecExo.setContent(R.id.linear_exo);
        tabHost.addTab(tabSpecExo);

        TabHost.TabSpec tabSpecHowl = tabHost.newTabSpec("HOWL").setIndicator("하울");
        tabSpecHowl.setContent(R.id.linear_howl);
        tabHost.addTab(tabSpecHowl);

        tabHost.setCurrentTab(0);
    }
}