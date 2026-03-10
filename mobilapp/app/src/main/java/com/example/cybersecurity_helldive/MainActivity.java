package com.example.cybersecurity_helldive;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        Button b4 = findViewById(R.id.b4);
        Button b5 = findViewById(R.id.b5);
        Button b6 = findViewById(R.id.b6);
        Button b7 = findViewById(R.id.b7);
        Button b8 = findViewById(R.id.b8);
        ArrayList<Button> buttons = new ArrayList<>();
        buttons.add(b1);
        buttons.add(b2);
        buttons.add(b3);
        buttons.add(b4);
        buttons.add(b5);
        buttons.add(b6);
        buttons.add(b7);
        buttons.add(b8);
        TextView displayText = findViewById(R.id.displayText);
        displayText.setVisibility(INVISIBLE);
        Button displayButton = findViewById(R.id.displayButton);
        displayButton.setVisibility(INVISIBLE);
        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Button button: buttons) {
                    button.setVisibility(VISIBLE);
                }
                displayText.setVisibility(INVISIBLE);
                displayText.setText("");
                displayButton.setVisibility(INVISIBLE);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Button button: buttons) {
                    button.setVisibility(INVISIBLE);
                }
                displayText.setVisibility(VISIBLE);
                displayText.setText("A csalók hivatalos személynek, cégnek vagy akár családtagnak adják ki magukat, hogy pénzt vagy személyes adatokat szerezzenek. Gyakran használnak félelemkeltést, például adótartozásra, banki problémára vagy sürgős vészhelyzetre hivatkoznak. A hívóazonosítót is képesek meghamisítani, így a hívás valódinak tűnik. A cél, hogy az áldozat gyorsan cselekedjen ellenőrzés nélkül.");
                displayButton.setVisibility(VISIBLE);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Button button: buttons) {
                    button.setVisibility(INVISIBLE);
                }
                displayText.setVisibility(VISIBLE);
                displayText.setText("A csalók játékosokat próbálnak megtéveszteni hamis ajánlatokkal, „item ellenőrzéssel” vagy Steam adminnak álcázva magukat. Gyakran küldenek adathalász linkeket, amelyek hivatalos Steam oldalaknak tűnnek. Ha az áldozat bejelentkezik vagy elküldi a tárgyakat, a csaló ellopja azokat vagy az egész fiókot.");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Button button: buttons) {
                    button.setVisibility(INVISIBLE);
                }
                displayText.setVisibility(VISIBLE);
                displayText.setText("Ide tartoznak a hamis weboldalak, adathalász oldalak és kamu webáruházak. A csalók olyan oldalakat készítenek, amelyek megtévesztően hasonlítanak valódi szolgáltatásokra, hogy megszerezzék a bejelentkezési adatokat, bankkártyaszámokat vagy fizetéseket. Gyakran hirdetésekkel, e-mailekkel vagy közösségi médiás linkekkel csalogatják az áldozatokat.\n");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Button button: buttons) {
                    button.setVisibility(INVISIBLE);
                }
                displayText.setVisibility(VISIBLE);
                displayText.setText("Az áldozat olyan e-mailt kap, amely banktól, futárszolgálattól vagy ismert szolgáltatótól származónak tűnik. A levélben található link vagy csatolmány adatlopásra vagy kártevő telepítésére szolgál. Gyakran sürgető hangvételű, például „A fiókja hamarosan megszűnik”.");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Button button: buttons) {
                    button.setVisibility(INVISIBLE);
                }
                displayText.setVisibility(VISIBLE);
                displayText.setText("A csalók irreálisan magas hozamot ígérnek minimális kockázattal. Hamis kereskedési platformokat, manipulált statisztikákat vagy „személyes menedzsereket” használnak. A befizetett pénz valójában soha nem kerül befektetésre, és a csaló eltűnik vagy blokkolja a kifizetéseket.");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Button button: buttons) {
                    button.setVisibility(INVISIBLE);
                }
                displayText.setVisibility(VISIBLE);
                displayText.setText("Gyakoriak olyan oldalakon, mint a Facebook Marketplace vagy apróhirdetési oldalak. A csalók eladhatatlan vagy nem létező termékeket hirdetnek, előre kérik a fizetést, vagy hamis fizetési visszaigazolást küldenek. Vevőként is csalhatnak, például ráveszik az eladót, hogy küldje el a terméket valódi fizetés nélkül.");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Button button: buttons) {
                    button.setVisibility(INVISIBLE);
                }
                displayText.setVisibility(VISIBLE);
                displayText.setText("A csalók technikai támogatásnak adják ki magukat, és ráveszik az áldozatot, hogy telepítsen távoli hozzáférést biztosító programot. Miután bejutnak a gépre, adatokat lopnak, fájlokat törölnek vagy pénzt követelnek a „javításért”. Előfordul, hogy zárolják a számítógépet vagy titkosítják a fájlokat.");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Button button: buttons) {
                    button.setVisibility(INVISIBLE);
                }
                displayText.setVisibility(VISIBLE);
                displayText.setText("Az áldozatot arról értesítik, hogy nyert valamit, de a „nyeremény átvételéhez” díjat kell fizetnie vagy személyes adatokat kell megadnia. A valódi nyereményjátékok soha nem kérnek pénzt az átvételhez.");
            }
        });



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}