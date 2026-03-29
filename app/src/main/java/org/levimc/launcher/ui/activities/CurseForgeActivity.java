package org.levimc.launcher.ui.activities;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import org.levimc.launcher.R;
import org.levimc.launcher.core.curseforge.CurseForgeClient;

public class CurseForgeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curseforge);

        initViews();
    }

    private void initViews() {
        // Логика инициализации списка модов
        
        // Фикс ошибки: закомментировано, так как ID header_logo отсутствует в XML
        /*
        View logoView = findViewById(R.id.header_logo);
        if (logoView instanceof android.widget.ImageView) {
            ((android.widget.ImageView) logoView).setImageResource(R.drawable.ic_launcher_foreground);
        }
        */
    }
}
