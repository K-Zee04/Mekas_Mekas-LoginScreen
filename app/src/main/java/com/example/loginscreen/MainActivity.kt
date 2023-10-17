import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.loginscreen.R
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameEditText = findViewById(R.id.username)
        passwordEditText = findViewById(R.id.password)
    }

    fun login(view: View) {
        val username = usernameEditText.text.toString()
        val password = passwordEditText.text.toString()

        if (username == "your_username" && password == "your_password") {
            // Successful login, you can navigate to another activity or perform further actions here.
            Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
        } else {
            // Invalid login
            Toast.makeText(this, "Invalid login", Toast.LENGTH_SHORT).show()
        }
    }
}
