package com.stevesun.andrew.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.stevesun.andrew.model.Article;

@Database(entities = {Article.class}, version = 1, exportSchema = false)
public abstract class AndrewNewsDatabase extends RoomDatabase {

    public abstract ArticleDao articleDao();
}
