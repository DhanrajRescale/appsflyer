package wu;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ut.l;
import ut.n;
import vu.i;
import zt.f;

/* loaded from: classes2.dex */
public abstract class a {
    public static void a(Function2 function2, qu.a aVar, qu.a aVar2) {
        try {
            yt.a b10 = f.b(f.a(aVar, aVar2, function2));
            l.Companion companion = l.INSTANCE;
            i.a(b10, Unit.f23355a, null);
        } catch (Throwable th2) {
            l.Companion companion2 = l.INSTANCE;
            aVar2.resumeWith(n.a(th2));
            throw th2;
        }
    }
}
