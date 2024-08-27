package o8;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f29784a = hl.f.Q(0, 0, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final z8.e f29785b;

    static {
        z8.g gVar = z8.g.f42186c;
        f29785b = new z8.e();
    }

    public static final y8.j a(Object obj, t0.n nVar) {
        t0.r rVar = (t0.r) nVar;
        rVar.b0(1087186730);
        if (obj instanceof y8.j) {
            y8.j jVar = (y8.j) obj;
            rVar.s(false);
            return jVar;
        }
        Context context = (Context) rVar.m(AndroidCompositionLocals_androidKt.f1428b);
        rVar.b0(-1245195153);
        boolean h10 = rVar.h(context) | rVar.h(obj);
        Object Q = rVar.Q();
        if (h10 || Q == t0.m.f35080a) {
            y8.h hVar = new y8.h(context);
            hVar.f41338c = obj;
            Q = hVar.a();
            rVar.k0(Q);
        }
        y8.j jVar2 = (y8.j) Q;
        rVar.s(false);
        rVar.s(false);
        return jVar2;
    }
}
