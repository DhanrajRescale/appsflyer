package jk;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* loaded from: classes.dex */
public final class e extends ok.c {

    /* renamed from: d, reason: collision with root package name */
    public final Handler f21433d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21434e;

    /* renamed from: f, reason: collision with root package name */
    public final long f21435f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f21436g;

    public e(Handler handler, int i10, long j10) {
        this.f21433d = handler;
        this.f21434e = i10;
        this.f21435f = j10;
    }

    @Override // ok.g
    public final void a(Object obj) {
        this.f21436g = (Bitmap) obj;
        Handler handler = this.f21433d;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f21435f);
    }

    @Override // ok.g
    public final void h(Drawable drawable) {
        this.f21436g = null;
    }
}
