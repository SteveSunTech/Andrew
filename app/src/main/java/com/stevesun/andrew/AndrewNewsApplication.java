package com.stevesun.andrew;

import android.app.Application;

import androidx.room.Room;

import com.ashokvarma.gander.Gander;
import com.ashokvarma.gander.imdb.GanderIMDB;
import com.facebook.stetho.Stetho;
import com.stevesun.andrew.database.AndrewNewsDatabase;

public class AndrewNewsApplication extends Application {

    private AndrewNewsDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
        // TODO: new code here.
        Gander.setGanderStorage(GanderIMDB.getInstance());
        Stetho.initializeWithDefaults(this);
        database = Room.databaseBuilder(this, AndrewNewsDatabase.class, "tinnews_db").build();



    }

    public AndrewNewsDatabase getDatabase() {
        return database;
    }
}
