package com.ca.designsystem.components.buttons

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import atomicwords.core.designsystem.generated.resources.Res
import atomicwords.core.designsystem.generated.resources.add_24px
import com.ca.designsystem.theme.Theme
import org.jetbrains.compose.resources.painterResource

@ExperimentalMaterial3Api
@Composable
fun IconButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    Button(
        modifier = modifier
            .size(56.dp)
            .clip(Theme.shapes.round),
        colors = ButtonDefaults.buttonColors(
            containerColor = Theme.colors.primary,
            contentColor = Color.White
        ),
        onClick = onClick,
        contentPadding = PaddingValues(0.dp),
    ) {
        Icon(
            modifier = Modifier.size(24.dp),
            painter = painterResource(Res.drawable.add_24px),
            contentDescription = "Add"
        )
    }
}