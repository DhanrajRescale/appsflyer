package d4;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.UUID;

/* loaded from: classes.dex */
public final class i2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13764c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13766e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f13767f;

    public /* synthetic */ i2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f13762a = i10;
        this.f13767f = obj;
        this.f13763b = obj2;
        this.f13764c = obj3;
        this.f13765d = obj4;
        this.f13766e = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13762a) {
            case 0:
                k2.h((View) this.f13763b, (p2) this.f13764c, (tr.e) this.f13765d);
                ((ValueAnimator) this.f13766e).start();
                return;
            default:
                try {
                    if (!(((l8.j) this.f13763b).f24227a instanceof l8.a)) {
                        String uuid = ((UUID) this.f13764c).toString();
                        androidx.work.g0 m10 = ((k8.o) this.f13767f).f22700c.m(uuid);
                        if (m10 != null && !m10.a()) {
                            ((b8.b) ((k8.o) this.f13767f).f22699b).f(uuid, (androidx.work.m) this.f13765d);
                            ((Context) this.f13766e).startService(i8.c.a((Context) this.f13766e, uuid, (androidx.work.m) this.f13765d));
                        } else {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                    }
                    ((l8.j) this.f13763b).j(null);
                    return;
                } catch (Throwable th2) {
                    ((l8.j) this.f13763b).k(th2);
                    return;
                }
        }
    }
}
