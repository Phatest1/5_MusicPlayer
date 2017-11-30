package com.example.lephat.a5_musicplayer;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by Le Phat on 06-Nov-17.
 */

public class MusiService extends Service implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener,MediaPlayer.OnCompletionListener  {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onPrepared(MediaPlayer mp) {

    }

    @Override
    public void onCompletion(MediaPlayer mp) {

    }

    @Override
    public boolean onError(MediaPlayer mp, int what, int extra) {
        return false;
    }
}
