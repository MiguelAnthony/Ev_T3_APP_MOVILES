package com.example.ev_t3_app_moviles;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import android.widget.ImageView;

import com.example.ev_t3_app_moviles.adaptador.adapter;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv = findViewById(R.id.recivlerView);

        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Anime> anime = new ArrayList<>();
        anime.add(new Anime("https://vignette.wikia.nocookie.net/dbaf/images/a/a9/Vegeta.png/revision/latest?cb=20150202003917&path-prefix=es","VEGETA","Él es el orgulloso y arrogante príncipe de los Saiyajin, y entre él y Goku arde una intensa rivalidad. Hace un tiempo fue un guerrero cruel y malvado, pero después de luchar junto a Goku, comenzó a ser noble."));
        anime.add(new Anime("https://th.bing.com/th/id/OIP.FVDbwuCCxCXlXnPAYKzStAHaMx?pid=Api&rs=1","BROLY","Es uno de los pocos sobrevivientes del pueblo Saiyan. Ni Goku ni Vegeta vieron a este Saiyan antes. La razón de su llegada a la Tierra es…."));
        anime.add(new Anime("https://th.bing.com/th/id/OIP.Q6r9CVuCA_9W1DZpyW475QHaQB?pid=Api&rs=1","FREEZER","Él es el malvado emperador que una vez quiso tomar el control del espacio. Fue derrotado por Goku, cuando este se convirtió en Super Saiyan en el planeta Namek. Luego se dirigió a la Tierra para llevar a cabo su venganza, pero Trunks del Futuro lo eliminó. "));
        anime.add(new Anime("https://th.bing.com/th/id/OIP.IkcfsCFMWd2MesgxYtQb6wAAAA?pid=Api&rs=1","PICCOLO"," Es un guerrero tranquilo y solitario, originario del planeta Namek, donde se crearon las Bolas de Dragón. Originalmente fue un gran demonio malvado, que dividió su cuerpo con el Dios de la Tierra. Poco a poco desarrolló un corazón puro, especialmente cuando educó a Gohan, el hijo de Goku, para convertirse en un guerrero."));
        anime.add(new Anime("https://th.bing.com/th/id/OIP.biDaEEgMgzGtqEzqrM3aFwHaKz?pid=Api&rs=1","BEERUS","Es un Dios que controla el poder de la destrucción para preservar el equilibrio del Universo. Cuando pierde su estado de ánimo, puede destruir las estrellas y toda la vida circundante. Viajó a través del Universo para luchar contra el “Dios Super Saiyan”, y así conoció a Goku, quien lo influenció más o menos. Le gusta comer bien y dormir."));
        anime.add(new Anime("https://th.bing.com/th/id/OIP.-SQinlHxkjaxHjgRaIQXywHaMn?pid=Api&rs=1","TRUNKS","Es un mestizo entre humano terrícola y Saiyan nacido en la Tierra, e hijo de Bulma y Vegeta, el cual es introducido en el Arco de los Androides y Cell."));
        anime.add(new Anime("https://vignette.wikia.nocookie.net/animacion-y-ficcion/images/0/09/Goku.png/revision/latest?cb=20190721195210&path-prefix=es","GOKU","Este es un Saiyan que creció en la Tierra y que lo protegió de muchos enemigos. Su nombre de Saiyan es “Kakarotto”. Le gusta pelear, y cuanto más fuerte es el oponente, más emocionado está. "));
        anime.add(new Anime("https://www.ricedigital.co.uk/wp-content/uploads/2018/02/bardock-portrait.png","BARDOCK","es un saiyano de clase baja proveniente del Planeta Vegeta del Universo 7.Pertenece al Ejército Saiyano, que está bajo el liderazgo del Rey Vegeta, y es jefe de su escuadrón bélico durante la anexión del planeta por parte de las fuerzas coloniales del Imperio de Freeza."));
        anime.add(new Anime("https://vignette.wikia.nocookie.net/dragonball/images/d/da/Dragon_ball_minus_gine.png/revision/latest?cb=20170901154753&path-prefix=fr","GINE","Es la madre de Gokū, a diferencia de los demás saiyajin su personalidad era más apacible. No era considerada una guerrera por el bajo nivel de pelea que tenía, por lo que trabajaba ayudando en los quehaceres del planeta Vegeta."));
        anime.add(new Anime("https://vignette.wikia.nocookie.net/omnibattles/images/3/30/Whis.png/revision/latest?cb=20161126184800","WHIS","Un ángel que comparte la vida de Beerus. Él es también el maestro de Beerus, y su poder sigue siendo desconocida. El principio de que “los ángeles son siempre neutrales” significa que no tiene que intervenir en el combate. "));
        rv.setAdapter(new adapter(anime));
    }
    public class Anime {
        private String image;
        private String titulo;
        private String descripcion;

        public Anime(String image, String titulo, String descripcion) {
            this.image = image;
            this.titulo = titulo;
            this.descripcion = descripcion;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
    }
}