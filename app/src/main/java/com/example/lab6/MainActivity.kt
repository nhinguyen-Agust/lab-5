package com.example.lab6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab6.ui.theme.Lab6Theme
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone


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
    }
}

@Composable
fun UserProfile(imageId: Int, name: String, title: String) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = imageId),
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


@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    Lab6Theme {
        BusinessCard()
    }
}
