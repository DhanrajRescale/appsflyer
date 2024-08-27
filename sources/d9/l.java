package d9;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import n8.o;

/* loaded from: classes.dex */
public final class l implements ComponentCallbacks2, x8.f {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f14239a;

    /* renamed from: b, reason: collision with root package name */
    public Context f14240b;

    /* renamed from: c, reason: collision with root package name */
    public x8.g f14241c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14242d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14243e = true;

    public l(o oVar) {
        this.f14239a = new WeakReference(oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v5, types: [x8.g] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final synchronized void a() {
        ?? r02;
        try {
            o oVar = (o) this.f14239a.get();
            if (oVar != null) {
                if (this.f14241c == null) {
                    if (oVar.f28399d.f14232b) {
                        r02 = yk.g.a(oVar.f28396a, this);
                    } else {
                        r02 = new Object();
                    }
                    this.f14241c = r02;
                    this.f14243e = r02.e();
                }
            } else {
                b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b() {
        try {
            if (this.f14242d) {
                return;
            }
            this.f14242d = true;
            Context context = this.f14240b;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            x8.g gVar = this.f14241c;
            if (gVar != null) {
                gVar.shutdown();
            }
            this.f14239a.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (((o) this.f14239a.get()) == null) {
            b();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i10) {
        w8.f fVar;
        o oVar = (o) this.f14239a.get();
        if (oVar != null) {
            ut.g gVar = oVar.f28398c;
            if (gVar != null && (fVar = (w8.f) gVar.getValue()) != null) {
                fVar.f38860a.a(i10);
                fVar.f38861b.a(i10);
            }
        } else {
            b();
        }
    }
}
