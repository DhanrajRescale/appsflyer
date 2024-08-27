package jp;

import android.os.IBinder;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public Object f21546a = Boolean.TRUE;

    /* renamed from: b, reason: collision with root package name */
    public final ip.d f21547b;

    /* renamed from: c, reason: collision with root package name */
    public final IBinder f21548c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f21549d;

    public n(p pVar, String str, IBinder iBinder) {
        this.f21549d = pVar;
        synchronized (pVar.f21558h) {
            pVar.f21558h.add(this);
        }
        ip.d dVar = ip.d.f20469b;
        try {
            dVar = ip.d.valueOf(str);
        } catch (IllegalArgumentException | NullPointerException unused) {
        }
        this.f21547b = dVar;
        this.f21548c = iBinder;
    }
}
