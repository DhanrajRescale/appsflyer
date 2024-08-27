package e1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import qu.i0;

/* loaded from: classes.dex */
public final class b extends c {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(int r6, e1.n r7) {
        /*
            r5 = this;
            java.lang.Object r0 = e1.p.f14905b
            monitor-enter(r0)
            java.util.List r1 = e1.p.f14911h     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)     // Catch: java.lang.Throwable -> L24
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L24
            r3 = 1
            r4 = 0
            if (r2 != r3) goto L18
            r2 = 0
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L24
            goto L19
        L18:
            r2 = r4
        L19:
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L26
            v.c r2 = new v.c     // Catch: java.lang.Throwable -> L24
            r3 = 4
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r6 = move-exception
            goto L2b
        L26:
            monitor-exit(r0)
            r5.<init>(r6, r7, r4, r2)
            return
        L2b:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.b.<init>(int, e1.n):void");
    }

    @Override // e1.c
    public final c B(Function1 function1, Function1 function12) {
        return (c) ((i) p.e(new v.c0(12, new a(function1, function12, 0))));
    }

    @Override // e1.c, e1.i
    public final void c() {
        synchronized (p.f14905b) {
            int i10 = this.f14883d;
            if (i10 >= 0) {
                p.s(i10);
                this.f14883d = -1;
            }
            Unit unit = Unit.f23355a;
        }
    }

    @Override // e1.c, e1.i
    public final void k() {
        vl.b.p0();
        throw null;
    }

    @Override // e1.c, e1.i
    public final void l() {
        vl.b.p0();
        throw null;
    }

    @Override // e1.c, e1.i
    public final void m() {
        p.e(o.f14901b);
    }

    @Override // e1.c, e1.i
    public final i t(Function1 function1) {
        return (i) p.e(new v.c0(12, new v.c0(11, function1)));
    }

    @Override // e1.c
    public final i0 v() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }
}
