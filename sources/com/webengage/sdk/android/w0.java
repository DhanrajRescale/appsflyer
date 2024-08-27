package com.webengage.sdk.android;

import android.app.Service;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
abstract class w0 extends Service {

    /* renamed from: a, reason: collision with root package name */
    private w f12995a = null;

    /* renamed from: b, reason: collision with root package name */
    private HandlerThread f12996b = null;

    /* renamed from: c, reason: collision with root package name */
    private Messenger f12997c = null;

    /* renamed from: d, reason: collision with root package name */
    private j f12998d = null;

    public abstract void a(Intent intent);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Logger.d("WebEngage", "YAIS: Inside serivce onBind: " + this.f12997c.getBinder());
        return this.f12997c.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread(getClass().getSimpleName());
        this.f12996b = handlerThread;
        handlerThread.start();
        this.f12995a = new w(this.f12996b.getLooper(), new WeakReference(this));
        this.f12998d = new j(new WeakReference(this.f12995a), Looper.getMainLooper());
        this.f12997c = new Messenger(this.f12998d);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f12996b.quit();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        Message obtain = Message.obtain();
        obtain.arg1 = i11;
        obtain.obj = intent;
        obtain.what = 1;
        this.f12995a.sendMessage(obtain);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }
}
