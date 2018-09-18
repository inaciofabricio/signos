package signos.cursoandroid.com.signos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listaSignos;
    private String[] signos = {
                                "Áries","Leão","Sagitário","Touro",
                                "Virgem","Capricórnio","Gêmeos","Libra",
                                "Aquário","Câncer","Escorpião","Peixes"};

    private String[] perfis = {
            "Corajoso, determinado, confiante, entusiasmado, otimista, honesto, passional",
            "Criativo, apaixonado, generoso, caloroso, alegre, bem-humorado",
            "Generoso, idealista, grande senso de humor",
            "Confiável, paciente, prático, dedicado, responsável, estável",
            "Fiel, analítico, gentil, trabalhador, prático",
            "Responsável, disciplinado, autocontrole, bom gerente",
            "Gentil, carinhoso, curioso, adaptável, habilidade de rápido aprendizado e troca de ideias",
            "Cooperativo, diplomático, gracioso, justo, social",
            "Progressivo, original, independente, humanitário",
            "Tenaz, altamente criativo, leal, emocional, simpático, persuasivo",
            "Versátil, corajoso, apaixonado, teimoso, amigo verdadeiro",
            "Compassivo, artístico, intuitivo, gentil, sábio, musical"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = (ListView) findViewById(R.id.listViewId);

        ArrayAdapter<String> adapatador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos
        );

        listaSignos.setAdapter(adapatador);

        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int codigoPosicao = position;

                Toast.makeText(getApplicationContext(),perfis[codigoPosicao],Toast.LENGTH_LONG).show();
            }
        });
    }
}
