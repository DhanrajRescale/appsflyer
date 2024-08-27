package su;

import iu.a0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* loaded from: classes2.dex */
public final class l extends c {

    /* renamed from: l, reason: collision with root package name */
    public final a f34820l;

    public l(int i10, a aVar, Function1 function1) {
        super(i10, function1);
        this.f34820l = aVar;
        if (aVar != a.f34776a) {
            if (i10 >= 1) {
            } else {
                throw new IllegalArgumentException(jr.h.o("Buffered channel capacity must be at least 1, but ", i10, " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + a0.a(c.class).b() + " instead").toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return kotlin.Unit.f23355a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object G(java.lang.Object r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.l.G(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // su.c, su.p
    public final Object h(Object obj, yt.a aVar) {
        UndeliveredElementException y10;
        Object G = G(obj, true);
        boolean z10 = G instanceof h;
        if (z10) {
            if (z10) {
            }
            Function1 function1 = this.f34793b;
            if (function1 != null && (y10 = el.l.y(function1, obj, null)) != null) {
                ut.c.a(y10, s());
                throw y10;
            }
            throw s();
        }
        return Unit.f23355a;
    }

    @Override // su.c, su.p
    public final Object o(Object obj) {
        return G(obj, false);
    }

    @Override // su.c
    public final boolean w() {
        if (this.f34820l == a.f34777b) {
            return true;
        }
        return false;
    }
}
