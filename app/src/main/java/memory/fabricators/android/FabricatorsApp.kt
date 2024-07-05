package memory.fabricators.android

import androidx.compose.runtime.Composable
import org.koin.compose.KoinApplication

@Composable
fun FabricatorsApp() {
    KoinApplication(
        application = {
            modules()
        },
    ) {

    }
}
