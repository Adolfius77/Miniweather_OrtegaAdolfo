package ortega.adolfo.miniweather_ortegaadolfo

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var main: ConstraintLayout
    private lateinit var textView: TextView
    private lateinit var tvCity: TextView
    private lateinit var ivWeather: ImageView
    private lateinit var tvTemperature: TextView
    private lateinit var tvWeather: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        main = findViewById(R.id.main)
        textView = findViewById(R.id.textView)
        tvCity = findViewById(R.id.tvCity)
        ivWeather = findViewById(R.id.ivWeather)
        tvTemperature = findViewById(R.id.tvTemperature)
        tvWeather = findViewById(R.id.tvWeather)

        ViewCompat.setOnApplyWindowInsetsListener(main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}