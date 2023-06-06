import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen() {
    Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
        val usernameState = remember { mutableStateOf("") }
        TextField(
            value = usernameState.value,
            onValueChange = { usernameState.value = it },
            label = { Text("Username") },
            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)
        )

        val emailState = remember { mutableStateOf("") }
        TextField(
            value = emailState.value,
            onValueChange = { emailState.value = it },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)
        )

        val passwordState = remember { mutableStateOf("") }
        TextField(
            value = passwordState.value,
            onValueChange = { passwordState.value = it },
            label = { Text("Password") },
            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)
        )

        val confirmPasswordState = remember { mutableStateOf("") }
        TextField(
            value = confirmPasswordState.value,
            onValueChange = { confirmPasswordState.value = it },
            label = { Text("Confirm Password") },
            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)
        )

        Button(
            onClick = {
                // Handle sign up button click
            },
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp)
        ) {
            Text(text = "Sign Up")
        }
    }
}
