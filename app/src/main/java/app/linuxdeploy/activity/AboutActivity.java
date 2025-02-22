package app.linuxdeploy.activity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import app.linuxdeploy.PrefStore;
import app.linuxdeploy.R;

public class AboutActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PrefStore.setLocale(this);
        setContentView(R.layout.activity_about);
        TextView atv = findViewById(R.id.aboutTextView);
        atv.setMovementMethod(LinkMovementMethod.getInstance());
        TextView stv = findViewById(R.id.codeTextView);
        stv.setMovementMethod(LinkMovementMethod.getInstance());
        TextView vtv = findViewById(R.id.versionView);
        vtv.setText(getString(R.string.app_version, PrefStore.getVersion()));
    }

    @Override
    public void setTheme(int resId) {
        super.setTheme(PrefStore.getTheme(this));
    }

    @Override
    public void onResume() {
        super.onResume();
        setTitle(R.string.title_activity_about);
    }
}
