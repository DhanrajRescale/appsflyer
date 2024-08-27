package com.assetgro.stockgro.ui.hedwig.utils;

import android.app.Activity;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ue.p;

/* loaded from: classes.dex */
public class MediaPlayerActivity extends Activity implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public MediaPlayer f9519a;

    /* renamed from: b, reason: collision with root package name */
    public SurfaceView f9520b;

    /* renamed from: c, reason: collision with root package name */
    public SurfaceHolder f9521c;

    /* renamed from: d, reason: collision with root package name */
    public String f9522d;

    /* renamed from: e, reason: collision with root package name */
    public ProgressBar f9523e;

    /* renamed from: f, reason: collision with root package name */
    public View f9524f;

    /* renamed from: g, reason: collision with root package name */
    public int f9525g;

    /* renamed from: h, reason: collision with root package name */
    public int f9526h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9527i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9528j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9529k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9530l = false;

    /* renamed from: m, reason: collision with root package name */
    public int f9531m = -1;

    public final void a() {
        try {
            float videoWidth = this.f9519a.getVideoWidth() / this.f9519a.getVideoHeight();
            int width = this.f9524f.getWidth();
            int height = this.f9524f.getHeight();
            float f10 = width;
            float f11 = height;
            float f12 = f10 / f11;
            ViewGroup.LayoutParams layoutParams = this.f9520b.getLayoutParams();
            if (videoWidth > f12) {
                layoutParams.width = width;
                layoutParams.height = (int) (f10 / videoWidth);
            } else {
                layoutParams.width = (int) (videoWidth * f11);
                layoutParams.height = height;
            }
            this.f9520b.setLayoutParams(layoutParams);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void b() {
        if (this.f9527i && this.f9528j && this.f9529k) {
            this.f9523e.setVisibility(4);
            if (!this.f9519a.isPlaying()) {
                this.f9521c.setFixedSize(this.f9525g, this.f9526h);
                a();
                if (this.f9530l) {
                    this.f9519a.seekTo(this.f9531m);
                    this.f9530l = false;
                }
                this.f9519a.start();
            }
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        finish();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f9524f.getViewTreeObserver().addOnGlobalLayoutListener(new p(this, true, 1));
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_media_player);
        this.f9520b = (SurfaceView) findViewById(R.id.surface);
        this.f9523e = (ProgressBar) findViewById(R.id.progress_bar);
        SurfaceHolder holder = this.f9520b.getHolder();
        this.f9521c = holder;
        holder.addCallback(this);
        this.f9521c.setType(3);
        Bundle extras = getIntent().getExtras();
        this.f9522d = extras.getString("url");
        extras.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f9523e.setVisibility(0);
        View findViewById = findViewById(R.id.layout_media_player);
        this.f9524f = findViewById;
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new p(this, false, 1));
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        MediaPlayer mediaPlayer = this.f9519a;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f9519a = null;
        }
        this.f9525g = 0;
        this.f9526h = 0;
        this.f9527i = false;
        this.f9528j = false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.f9519a.isPlaying()) {
            this.f9519a.pause();
            this.f9531m = this.f9519a.getCurrentPosition();
            this.f9530l = true;
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.f9527i = true;
        b();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        if (i10 != 0 && i11 != 0) {
            this.f9525g = i10;
            this.f9526h = i11;
            this.f9528j = true;
            b();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f9523e.setVisibility(0);
        this.f9525g = 0;
        this.f9526h = 0;
        this.f9527i = false;
        this.f9528j = false;
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f9519a = mediaPlayer;
            mediaPlayer.setDataSource(this.f9522d);
            this.f9519a.setDisplay(this.f9521c);
            this.f9519a.prepareAsync();
            this.f9519a.setOnBufferingUpdateListener(this);
            this.f9519a.setOnCompletionListener(this);
            this.f9519a.setOnPreparedListener(this);
            this.f9519a.setOnVideoSizeChangedListener(this);
            this.f9519a.setAudioStreamType(3);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }
}
