package jp;

import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.google.android.youtube.player.YouTubePlayerView;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21551a;

    /* renamed from: b, reason: collision with root package name */
    public final h.f f21552b;

    /* renamed from: c, reason: collision with root package name */
    public IInterface f21553c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f21554d;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f21557g;

    /* renamed from: i, reason: collision with root package name */
    public l7.m f21559i;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f21555e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f21556f = false;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f21558h = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public boolean f21560j = false;

    public p(Context context, ip.f fVar, ip.g gVar) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Clients must be created on the UI thread.");
        }
        this.f21551a = context;
        ArrayList arrayList = new ArrayList();
        this.f21554d = arrayList;
        arrayList.add(fVar);
        ArrayList arrayList2 = new ArrayList();
        this.f21557g = arrayList2;
        arrayList2.add(gVar);
        this.f21552b = new h.f(this, 5);
    }

    public final void a() {
        this.f21552b.removeMessages(4);
        synchronized (this.f21557g) {
            try {
                ArrayList arrayList = this.f21557g;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (!this.f21560j) {
                        return;
                    }
                    if (this.f21557g.contains(arrayList.get(i10))) {
                        ip.g gVar = (ip.g) arrayList.get(i10);
                        gVar.getClass();
                        int i11 = YouTubePlayerView.f11614k;
                        YouTubePlayerView youTubePlayerView = gVar.f20478a;
                        youTubePlayerView.a();
                        youTubePlayerView.f11618d = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void b(g gVar, o oVar);

    public final void c() {
        l7.m mVar = this.f21559i;
        if (mVar != null) {
            try {
                this.f21551a.unbindService(mVar);
            } catch (IllegalArgumentException e10) {
                Log.w("YouTubeClient", "Unexpected error from unbindService()", e10);
            }
        }
        this.f21553c = null;
        this.f21559i = null;
    }

    public final void d() {
        synchronized (this.f21554d) {
            try {
                if (!this.f21556f) {
                    this.f21552b.removeMessages(4);
                    this.f21556f = true;
                    if (this.f21555e.size() == 0) {
                        ArrayList arrayList = this.f21554d;
                        int size = arrayList.size();
                        for (int i10 = 0; i10 < size && this.f21560j && this.f21553c != null; i10++) {
                            if (!this.f21555e.contains(arrayList.get(i10))) {
                                ((ip.f) arrayList.get(i10)).a();
                            }
                        }
                        this.f21555e.clear();
                        this.f21556f = false;
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        this.f21552b.removeMessages(4);
        synchronized (this.f21554d) {
            try {
                this.f21556f = true;
                ArrayList arrayList = this.f21554d;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size && this.f21560j; i10++) {
                    if (this.f21554d.contains(arrayList.get(i10))) {
                        ((ip.f) arrayList.get(i10)).b();
                    }
                }
                this.f21556f = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f() {
        if (this.f21553c != null) {
        } else {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }
}
