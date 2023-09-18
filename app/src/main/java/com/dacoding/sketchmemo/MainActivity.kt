package com.dacoding.sketchmemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.dacoding.sketchmemo.ui.theme.SketchMemoTheme

class MainActivity : ComponentActivity() {

//    private val viewModel: MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SketchMemoTheme {
//                val context = LocalContext.current
//                var hasStoragePermission by remember {
//                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
//                        mutableStateOf(
//                            ContextCompat.checkSelfPermission(
//                                context,
//                                Manifest.permission.MANAGE_EXTERNAL_STORAGE
//                            ) == PackageManager.PERMISSION_GRANTED
//                        )
//                    } else {
//                        mutableStateOf(true)
//                    }
//                    mutableStateOf(
//                        ContextCompat.checkSelfPermission(
//                            context,
//                            Manifest.permission.WRITE_EXTERNAL_STORAGE
//                        ) == PackageManager.PERMISSION_GRANTED
//                    )
//                }
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    val permissionLauncher = rememberLauncherForActivityResult(
//                        contract = ActivityResultContracts.RequestPermission(),
//                        onResult = { isGranted ->
//                            hasStoragePermission = isGranted
//                        }
//                    )
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        DrawingScreen()
                    }
                }
            }
        }
    }
}



