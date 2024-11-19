package com.example.shayariapp

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shayariapp.Model.ShayariModel
import com.example.shayariapp.ui.theme.purpleColor


@Composable
@Preview
fun mainTol() {
    MainToolBar(title = "Hello buddddy ", {})
}

@Composable
fun MainToolBar(title: String, onclick: () -> Unit) {
    val context = LocalContext.current  // Get the current context
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
            .height(60.dp), verticalAlignment = Alignment.CenterVertically
    ) {
        Card(
            modifier = Modifier
                .size(45.dp)
                .clickable { onclick.invoke()
                    Toast.makeText(context,"Clicked",Toast.LENGTH_SHORT).show()
                    // Go back to the previous screen
                    (context as? android.app.Activity)?.onBackPressed()

                },
            colors = CardDefaults.cardColors(containerColor = purpleColor),
            shape = RoundedCornerShape(200.dp)
        ) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Icon(
                    painterResource(id = R.drawable.ic_back),
                    contentDescription = null,
                    tint = Color.White,
                )
            }

        }


        Text(
            text = title,
            style = TextStyle(fontSize = 26.sp, fontWeight = FontWeight.Bold),
            color = Color.White,
            modifier = Modifier.padding(start = 16.dp)
        )
    }
}

fun getList(): List<ShayariModel> {
    return listOf<ShayariModel>(
        ShayariModel(
            "Love Shayari", listOf(
                "Love is not about how many days, months, or years you have been together. Love is about how much you love each other every single day.",
                "Your love is all I need to feel complete.",
                "Every moment spent with you is like a beautiful dream come true.",
                "I never knew what love was until I met you.",
                "You are the reason for my smile and my happiness.",
                "In your eyes, I have found my home.",
                "Love is when the other person's happiness is more important than your own.",
                "I fall in love with you every single day.",
                "You're not just my love, you're my heartbeat.",
                "When I look at you, I see the rest of my life in front of my eyes.",
                "You are my today and all of my tomorrows.",
                "True love never fades, it only grows stronger with time.",
                "Your love is the only thing that keeps me going.",
                "My heart beats for you and only you.",
                "With you, I have everything I ever need."
            )
        ), ShayariModel(
            "Friendship Shayari", listOf(
                "A true friend sees the first tear, catches the second, and stops the third.",
                "Friendship is born at that moment when one person says to another, 'What! You too? I thought I was the only one.'",
                "Good friends are like stars. You don’t always see them, but you know they’re always there.",
                "A friend is someone who knows all about you and still loves you.",
                "Life is better with true friends.",
                "Friends are the family you choose for yourself.",
                "A day without a friend is like a pot without a single drop of honey.",
                "True friends are never apart, maybe in distance but never in heart.",
                "Friendship isn’t about whom you have known the longest. It’s about who walked into your life and said, 'I’m here for you.'",
                "Real friends are the ones who walk in when the rest of the world walks out.",
                "Friendship is the only cement that will ever hold the world together.",
                "Good friends are hard to find, harder to leave, and impossible to forget.",
                "Friends make the bad times good and the good times unforgettable.",
                "Your vibe attracts your tribe.",
                "A friend is someone who makes it easy to believe in yourself."
            )
        ), ShayariModel(
            "Motivational Shayari", listOf(
                "Success is not final, failure is not fatal: It is the courage to continue that counts.",
                "Don’t stop when you’re tired. Stop when you’re done.",
                "Hard times may test you, but they will also make you stronger.",
                "Don’t watch the clock; do what it does. Keep going.",
                "Your limitation—it’s only your imagination.",
                "Push yourself, because no one else is going to do it for you.",
                "Great things never come from comfort zones.",
                "Dream it. Wish it. Do it.",
                "Success doesn’t just find you. You have to go out and get it.",
                "The harder you work for something, the greater you’ll feel when you achieve it.",
                "Don’t wait for opportunity. Create it.",
                "It’s going to be hard, but hard does not mean impossible.",
                "Sometimes we’re tested not to show our weaknesses, but to discover our strengths.",
                "The key to success is to focus on goals, not obstacles.",
                "Believe in yourself and all that you are. Know that there is something inside you that is greater than any obstacle."
            )
        ), ShayariModel(
            "Sad Shayari", listOf(
                "Sometimes, it's not the person you miss, but the feelings and moments you shared.",
                "The worst kind of pain is when you're smiling just to stop the tears from falling.",
                "My silence doesn’t mean I don’t care; it just means I don’t want to show my pain.",
                "Tears come from the heart, not from the brain.",
                "I’m not okay, but I smile anyway.",
                "Sometimes, the people who are thousands of miles away from you can make you feel better than the people who are right beside you.",
                "I never stopped loving you, I just stopped showing it.",
                "It hurts when you realize you aren’t as important to someone as you thought you were.",
                "You can’t stop the tears falling, but you can learn to hide them.",
                "It’s hard to forget someone who gave you so much to remember.",
                "Pain is inevitable. Suffering is optional.",
                "Behind every smile, there’s a story you’ll never understand.",
                "I wish I could go back to the day I met you and just walk away.",
                "I’m surrounded by people, but I still feel alone.",
                "Broken hearts still beat, but that doesn’t mean they don’t hurt."
            )
        ), ShayariModel(
            "Life Shayari", listOf(
                "Life is a journey, not a destination.",
                "The purpose of life is not to be happy. It is to be useful, to be honorable, to be compassionate, to have it make some difference that you have lived and lived well.",
                "Life is 10% what happens to us and 90% how we react to it.",
                "In the middle of every difficulty lies opportunity.",
                "Life isn’t about waiting for the storm to pass. It’s about learning to dance in the rain.",
                "The best way to predict your future is to create it.",
                "Life is what happens when you’re busy making other plans.",
                "Do not dwell in the past, do not dream of the future, concentrate the mind on the present moment.",
                "Life is short, and it’s up to you to make it sweet.",
                "Your life does not get better by chance; it gets better by change.",
                "Sometimes you will never know the value of a moment until it becomes a memory.",
                "Life is too important to be taken seriously.",
                "Happiness is not something ready-made. It comes from your own actions.",
                "Enjoy the little things in life, for one day you may look back and realize they were the big things.",
                "Life is a balance of holding on and letting go."
            )
        )
    )
}