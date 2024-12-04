package ishoot.shortcuts.radioinfo

import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent().apply {
            component = ComponentName("com.android.phone", "com.android.phone.settings.RadioInfo")
        }
        startActivity(intent)
        finish()
    }
}