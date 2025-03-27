package za.co.varsitycollege.st10476528.st10476528_assignment1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Variables
        val resetButton = findViewById<Button>(R.id.resetButton)
        val editTextView = findViewById<EditText>(R.id.editTextView)
        val AccButton = findViewById<Button>(R.id.AccButton)
        val textView2 = findViewById<TextView>(R.id.textView2)

        //button Response
        resetButton?.setOnClickListener {
            editTextView.text.clear()
        }

        //
        AccButton?.setOnClickListener {

            //when the text is correct the button reacts
            when {
                //responds for correct input text
                editTextView.text.toString() == "Morning" -> textView2.text =
                    "eggs and toast with coffee"

                editTextView.text.toString() == "Mid Morning" -> textView2.text = "Fruit and vegetable"
                editTextView.text.toString() == "Afternoon" -> textView2.text = "Sandwitch and a salad"
                editTextView.text.toString() == "Mid Afternoon" -> textView2.text = "Proteinshake"
                editTextView.text.toString() == "Dinner" -> textView2.text = "Pasta and chicken salad "
                //incorrect text response
                else -> Toast.makeText(this, "Incorrect input", Toast.LENGTH_LONG).show()
            }

            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
    }
}