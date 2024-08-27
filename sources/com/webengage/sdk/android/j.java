package com.webengage.sdk.android;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class j extends Handler {

    /* renamed from: a, reason: collision with root package name */
    WeakReference<w> f12596a;

    public j(WeakReference<w> weakReference, Looper looper) {
        super(looper);
        this.f12596a = weakReference;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Logger.d("WebEngage", "YAIS: Received bound message service YetAnotherIntentService  start-id: " + message.arg1 + ", thread-id: " + Thread.currentThread().getId());
        try {
            Message obtain = Message.obtain();
            obtain.copyFrom(message);
            obtain.what = 0;
            this.f12596a.get().sendMessage(obtain);
        } catch (Exception e10) {
            Logger.e("WebEngage", "YAIS: Exception while sending message from Messenger to Service: " + e10.toString(), e10);
        }
    }
}
