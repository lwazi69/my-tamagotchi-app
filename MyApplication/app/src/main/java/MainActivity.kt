import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val next = findViewById<button>(btnNext)
        next.setOnClickListner{
            val intent = Intent(packageConent this,MainActivity::class.java)
            startActivity(intent)
        }
    }