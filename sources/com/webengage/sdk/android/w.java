package com.webengage.sdk.android;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class w extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<w0> f12994a;

    public w(Looper looper, WeakReference<w0> weakReference) {
        super(looper);
        this.f12994a = weakReference;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        this.f12994a.get().a((Intent) message.obj);
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                return;
            }
            this.f12994a.get().stopSelf(message.arg1);
        } else if (message.replyTo != null) {
            try {
                Message obtain = Message.obtain();
                obtain.what = 2;
                obtain.arg1 = message.arg1;
                message.replyTo.send(obtain);
            } catch (Exception e10) {
                Logger.e("WebEngage", "YAIS: Exception while replying to remote service", e10);
            }
        }
    }
}
