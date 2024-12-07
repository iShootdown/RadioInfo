package ishoot.shortcuts.radioinfo

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(null)
        val intent = Intent().setClassName("com.android.phone", "com.android.phone.settings.RadioInfo")
        startActivity(intent)
        finish()
    }
}