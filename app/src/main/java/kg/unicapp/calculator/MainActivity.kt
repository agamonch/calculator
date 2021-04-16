package kg.unicapp.calculator
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val number1  = findViewById<EditText>(R.id.editTextTextPersonName2)
        val number2 = findViewById<EditText>(R.id.editTextTextPersonName3)
        val plusBtn = findViewById<Button>(R.id.button3)
        val minusBtn = findViewById<Button>(R.id.button4)
        val timesBtn = findViewById<Button>(R.id.button5)
        val divBtn = findViewById<Button>(R.id.button6)
        val result = findViewById<TextView>(R.id.textView4)

        plusBtn.setOnClickListener {
            val a = number1.text.toString().toDouble()
            val b = number2.text.toString().toDouble()
            val plusRes = a+b
            result.text = "$a + $b = $plusRes "
        }

        minusBtn.setOnClickListener {
            val a = number1.text.toString().toDouble()
            val b = number2.text.toString().toDouble()
            val minusRes = a - b
            result.text = "$a - $b = $minusRes"
        }

        timesBtn.setOnClickListener {
            val a = number1.text.toString().toDouble()
            val b = number2.text.toString().toDouble()
            val timesRes = a*b
            result.text = "$a * $b = $timesRes "
        }

        divBtn.setOnClickListener {
            val a = number1.text.toString().toDouble()
            val b = number2.text.toString().toDouble()
            val divRes = a/b
            when (b){
                0.0 -> result.text ="На ноль делить нельзя!"
                else ->result.text = "$a / $b = $divRes "
            }



        }





    }
}