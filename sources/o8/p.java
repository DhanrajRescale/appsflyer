package o8;

import android.os.Trace;
import d2.f2;
import kotlin.jvm.functions.Function1;
import n1.h0;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final o f29828a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final w f29829b = new Object();

    public static final n a(y8.j jVar, n8.i iVar, Function1 function1, Function1 function12, a2.l lVar, int i10, w wVar, t0.n nVar, int i11, int i12) {
        t0.r rVar = (t0.r) nVar;
        rVar.b0(1645646697);
        if ((i12 & 4) != 0) {
            function1 = n.f29812t;
        }
        if ((i12 & 8) != 0) {
            function12 = null;
        }
        if ((i12 & 16) != 0) {
            lVar = a2.k.f97b;
        }
        if ((i12 & 32) != 0) {
            p1.h.S.getClass();
            i10 = p1.g.f30508c;
        }
        if ((i12 & 64) != 0) {
            wVar = f29829b;
        }
        n b10 = b(new q(jVar, wVar, iVar), function1, function12, lVar, i10, rVar);
        rVar.s(false);
        return b10;
    }

    public static final n b(q qVar, Function1 function1, Function1 function12, a2.l lVar, int i10, t0.n nVar) {
        t0.r rVar = (t0.r) nVar;
        rVar.b0(952940650);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            y8.j a10 = a0.a(qVar.f29830a, rVar);
            d(a10);
            rVar.b0(1094691773);
            Object Q = rVar.Q();
            to.e eVar = t0.m.f35080a;
            n8.i iVar = qVar.f29832c;
            if (Q == eVar) {
                Q = new n(a10, iVar);
                rVar.k0(Q);
            }
            n nVar2 = (n) Q;
            rVar.s(false);
            nVar2.f29820l = function1;
            nVar2.f29821m = function12;
            nVar2.f29822n = lVar;
            nVar2.f29823o = i10;
            nVar2.f29824p = ((Boolean) rVar.m(f2.f13414a)).booleanValue();
            nVar2.f29827s.setValue(iVar);
            nVar2.f29826r.setValue(a10);
            nVar2.d();
            rVar.s(false);
            Trace.endSection();
            return nVar2;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public static void c(String str) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + nn.d.k("If you wish to display this ", str, ", use androidx.compose.foundation.Image."));
    }

    public static final void d(y8.j jVar) {
        Object obj = jVar.f41363b;
        if (!(obj instanceof y8.h)) {
            if (!(obj instanceof h0)) {
                if (!(obj instanceof r1.f)) {
                    if (!(obj instanceof q1.b)) {
                        if (jVar.f41364c == null) {
                            return;
                        } else {
                            throw new IllegalArgumentException("request.target must be null.".toString());
                        }
                    } else {
                        c("Painter");
                        throw null;
                    }
                }
                c("ImageVector");
                throw null;
            }
            c("ImageBitmap");
            throw null;
        }
        throw new IllegalArgumentException("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
    }
}
