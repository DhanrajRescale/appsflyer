package qu;

import kotlin.Unit;
import ut.l;

/* loaded from: classes2.dex */
public final class u0 extends r1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f32276e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f32277f;

    public u0(Object obj, int i10) {
        this.f32276e = i10;
        this.f32277f = obj;
    }

    @Override // qu.l1
    public final void e(Throwable th2) {
        int i10 = this.f32276e;
        Object obj = this.f32277f;
        switch (i10) {
            case 0:
                ((t0) obj).a();
                return;
            case 1:
                ((l1) obj).e(th2);
                return;
            case 2:
                Object P = k().P();
                if (P instanceof t) {
                    l.Companion companion = ut.l.INSTANCE;
                    ((i) obj).resumeWith(ut.n.a(((t) P).f32267a));
                    return;
                } else {
                    l.Companion companion2 = ut.l.INSTANCE;
                    ((i) obj).resumeWith(y1.a(P));
                    return;
                }
            default:
                l.Companion companion3 = ut.l.INSTANCE;
                ((yt.a) obj).resumeWith(Unit.f23355a);
                return;
        }
    }
}
