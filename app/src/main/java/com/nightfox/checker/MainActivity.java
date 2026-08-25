package com.nightfox.checker;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(30, 50, 30, 30);

        TextView title = new TextView(this);
        title.setText("NIGHT FOX");
        title.setTextSize(30);
        title.setTextColor(0xFF55FF55);

        TextView info = new TextView(this);
        info.setText("\\n> CHECKER BAN <\\n\\nNight Fox est prêt.\\nMode démonstration local.");
        info.setTextColor(0xFFAAFFAA);
        info.setTextSize(17);

        Button check = new Button(this);
        check.setText("CHECKER");

        TextView result = new TextView(this);
        result.setTextColor(0xFF55FF55);

        check.setOnClickListener(v ->
            result.setText("\\n[CHECK] Analyse terminée.\\n[INFO] Mode démonstration.")
        );

        layout.addView(title);
        layout.addView(info);
        layout.addView(check);
        layout.addView(result);

        setContentView(layout);
    }
}
