package com.assetgro.stockgro.ui.chat.utils;

import android.app.Activity;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import ba.g2;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import jd.a;
import m4.d;
import ue.p;

/* loaded from: classes.dex */
public class MediaPlayerActivity extends Activity implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public MediaPlayer f9457a;

    /* renamed from: b, reason: collision with root package name */
    public SurfaceHolder f9458b;

    /* renamed from: c, reason: collision with root package name */
    public String f9459c;

    /* renamed from: d, reason: collision with root package name */
    public View f9460d;

    /* renamed from: e, reason: collision with root package name */
    public int f9461e;

    /* renamed from: f, reason: collision with root package name */
    public int f9462f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9463g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9464h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9465i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9466j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9467k = false;

    /* renamed from: l, reason: collision with root package name */
    public int f9468l = -1;

    /* renamed from: m, reason: collision with root package name */
    public g2 f9469m;

    public final void a() {
        try {
            float videoWidth = this.f9457a.getVideoWidth() / this.f9457a.getVideoHeight();
            int width = this.f9460d.getWidth();
            int height = this.f9460d.getHeight();
            float f10 = width;
            float f11 = height;
            float f12 = f10 / f11;
            ViewGroup.LayoutParams layoutParams = this.f9469m.f4777v.getLayoutParams();
            if (videoWidth > f12) {
                layoutParams.width = width;
                layoutParams.height = (int) (f10 / videoWidth);
            } else {
                layoutParams.width = (int) (videoWidth * f11);
                layoutParams.height = height;
            }
            this.f9469m.f4777v.setLayoutParams(layoutParams);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void b() {
        if (this.f9463g && this.f9464h && this.f9465i) {
            this.f9469m.f4776u.setVisibility(4);
            if (!this.f9457a.isPlaying()) {
                this.f9458b.setFixedSize(this.f9461e, this.f9462f);
                a();
                if (this.f9467k) {
                    this.f9457a.seekTo(this.f9468l);
                    this.f9467k = false;
                }
                this.f9457a.start();
            }
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.f9469m.f4775t.setVisibility(0);
        this.f9466j = true;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f9460d.getViewTreeObserver().addOnGlobalLayoutListener(new p(this, true, 0));
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
        setContentView(R.layout.activity_media_player);
        g2 g2Var = (g2) d.a((ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content), 0, R.layout.activity_media_player);
        this.f9469m = g2Var;
        SurfaceHolder holder = g2Var.f4777v.getHolder();
        this.f9458b = holder;
        holder.addCallback(this);
        this.f9458b.setType(3);
        Bundle extras = getIntent().getExtras();
        this.f9459c = extras.getString("url");
        extras.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f9469m.f4776u.setVisibility(0);
        View findViewById = findViewById(R.id.layout_media_player);
        this.f9460d = findViewById;
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new p(this, false, 0));
        this.f9469m.f4774s.setOnClickListener(new a(this, 18));
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        MediaPlayer mediaPlayer = this.f9457a;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f9457a = null;
        }
        this.f9461e = 0;
        this.f9462f = 0;
        this.f9463g = false;
        this.f9464h = false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.f9457a.isPlaying()) {
            this.f9457a.pause();
            this.f9468l = this.f9457a.getCurrentPosition();
            this.f9467k = true;
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.f9463g = true;
        b();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        if (i10 != 0 && i11 != 0) {
            this.f9461e = i10;
            this.f9462f = i11;
            this.f9464h = true;
            b();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f9469m.f4776u.setVisibility(0);
        this.f9469m.f4775t.setVisibility(8);
        this.f9461e = 0;
        this.f9462f = 0;
        this.f9463g = false;
        this.f9464h = false;
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f9457a = mediaPlayer;
            mediaPlayer.setDataSource(this.f9459c);
            this.f9457a.setDisplay(this.f9458b);
            this.f9457a.prepareAsync();
            this.f9457a.setOnBufferingUpdateListener(this);
            this.f9457a.setOnCompletionListener(this);
            this.f9457a.setOnPreparedListener(this);
            this.f9457a.setOnVideoSizeChangedListener(this);
            this.f9457a.setAudioStreamType(3);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }
}
