package com.dhruvlimbachiya.mvvmnewsapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable


/**
 * Data class which acts as Table in Room Database.
 */
@Entity(tableName = "articles")
data class Article(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val author: String?,
    val content: String?,
    val description: String?,
    val publishedAt: String?,
    val source: Source?,
    val title: String?,
    val url: String?,
    val urlToImage: String?
): Serializable