package com.example.lab6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
<<<<<<< HEAD
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
=======
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
>>>>>>> 2b79f49432d65598ee6ba7147141cbc5252a5a7a
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
<<<<<<< HEAD
import androidx.compose.ui.unit.sp
import com.example.lab6.ui.theme.Lab6Theme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.ui.draw.scale
=======
import com.example.lab6.ui.theme.Lab6Theme
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone

>>>>>>> 2b79f49432d65598ee6ba7147141cbc5252a5a7a

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab6Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
<<<<<<< HEAD
    var scale by remember { mutableStateOf(0.8f) }
    val animatedScale by animateFloatAsState(
        targetValue = scale,
        animationSpec = tween(durationMillis = 500)
    )

    LaunchedEffect(Unit) {
        scale = 1f
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF0F4F8))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ElevatedCard(
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .scale(animatedScale)
                    .shadow(12.dp, MaterialTheme.shapes.large),
                shape = MaterialTheme.shapes.large,
                colors = CardDefaults.elevatedCardColors(
                    containerColor = Color.Transparent
                )
            ) {
                Box(
                    modifier = Modifier
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(
                                    Color(0xFF6200EA),
                                    Color(0xFF03DAC5)
                                )
                            )
                        )
                        .padding(24.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        UserProfile(
                            imageId = R.drawable.anh,
                            name = "Nguyễn Hà Nhi",
                            title = "Sinh viên"
                        )
                        Spacer(modifier = Modifier.height(32.dp))
                        ContactInfo(
                            email = "nnhi02108@gmail.com",
                            phone = "0818943707",
                            website = "www.augustd.com"
                        )
                    }
                }
            }
        }
=======
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        UserProfile(
            imageId = R.drawable.image1,
            name = "Nguyễn Minh Toàn",
            title = "Sinh Viên"
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Phần 2: Thông tin liên hệ
        ContactInfo(
            email = "cthn2222@gmail.com.com",
            phone = "0832250005",
            website = "www.Bomvipqb.com"
        )
>>>>>>> 2b79f49432d65598ee6ba7147141cbc5252a5a7a
    }
}

@Composable
fun UserProfile(imageId: Int, name: String, title: String) {
<<<<<<< HEAD
=======

>>>>>>> 2b79f49432d65598ee6ba7147141cbc5252a5a7a
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = imageId),
<<<<<<< HEAD
            contentDescription = "Hình đại diện",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
                .border(3.dp, Color.White, CircleShape)
                .shadow(8.dp, CircleShape)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = name,
            style = MaterialTheme.typography.headlineMedium.copy(
                fontWeight = FontWeight.Bold,
                fontSize = 28.sp,
                color = Color.White
            )
        )
        Text(
            text = title,
            style = MaterialTheme.typography.titleMedium.copy(
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp,
                color = Color.White.copy(alpha = 0.9f)
            )
        )
    }
}

@Composable
fun ContactInfo(email: String, phone: String, website: String) {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        ContactRow(
            icon = { Icon(Icons.Default.Email, contentDescription = "Email", tint = Color.White) },
            text = email
        )
        Spacer(modifier = Modifier.height(12.dp))
        ContactRow(
            icon = { Icon(Icons.Default.Phone, contentDescription = "Điện thoại", tint = Color.White) },
            text = phone
        )
        Spacer(modifier = Modifier.height(12.dp))
        ContactRow(
            icon = {
                Image(
                    painter = painterResource(id = R.drawable.home),
                    contentDescription = "Website",
                    modifier = Modifier.size(24.dp)
                )
            },
            text = website
        )
    }
}

@Composable
fun ContactRow(icon: @Composable () -> Unit, text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        icon()
        Spacer(modifier = Modifier.width(12.dp))
        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge.copy(
                fontSize = 16.sp,
                color = Color.White,
                fontWeight = FontWeight.Medium
            )
        )
    }
}
=======
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(180.dp)
                .padding(bottom = 16.dp)
        )
        Text(
            text = name,
            style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
        )
        Text(
            text = title,
            style = MaterialTheme.typography.bodySmall.copy(fontWeight = FontWeight.Bold)
        )
    }
}
@Composable
fun ContactInfo(email: String, phone: String, website: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(16.dp)
    ) {
        // Biểu tượng email
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(vertical = 4.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "Email",
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = email,
                style = MaterialTheme.typography.bodySmall
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(vertical = 4.dp,).offset(x = (-40).dp)
        ) {
            Icon(
                imageVector = Icons.Default.Phone,
                contentDescription = "Phone",
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = phone,
                style = MaterialTheme.typography.bodySmall
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(vertical = 4.dp).offset(x = (-15).dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.home),
                contentDescription = "Website",
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.size(16.dp))
            Text(
                text = website,
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}

>>>>>>> 2b79f49432d65598ee6ba7147141cbc5252a5a7a

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    Lab6Theme {
        BusinessCard()
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 2b79f49432d65598ee6ba7147141cbc5252a5a7a
