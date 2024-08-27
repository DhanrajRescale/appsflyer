package aq;

import android.os.HandlerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p002firebaseauthapi.zzc;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f2711e = new Logger("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a, reason: collision with root package name */
    public volatile long f2712a;

    /* renamed from: b, reason: collision with root package name */
    public volatile long f2713b;

    /* renamed from: c, reason: collision with root package name */
    public final zzc f2714c;

    /* renamed from: d, reason: collision with root package name */
    public final m.j f2715d;

    public f(pp.g gVar) {
        f2711e.v("Initializing TokenRefresher", new Object[0]);
        pp.g gVar2 = (pp.g) Preconditions.checkNotNull(gVar);
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        handlerThread.start();
        this.f2714c = new zzc(handlerThread.getLooper());
        gVar2.a();
        this.f2715d = new m.j(this, gVar2.f31272b);
    }
}
