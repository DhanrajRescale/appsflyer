package d0;

import kotlin.NoWhenBranchMatchedException;
import y.g1;

/* loaded from: classes.dex */
public final class n implements b2.g, a2.f {

    /* renamed from: g, reason: collision with root package name */
    public static final l f13184g = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final o f13185b;

    /* renamed from: c, reason: collision with root package name */
    public final k f13186c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13187d;

    /* renamed from: e, reason: collision with root package name */
    public final w2.k f13188e;

    /* renamed from: f, reason: collision with root package name */
    public final g1 f13189f;

    public n(o oVar, k kVar, boolean z10, w2.k kVar2, g1 g1Var) {
        this.f13185b = oVar;
        this.f13186c = kVar;
        this.f13187d = z10;
        this.f13188e = kVar2;
        this.f13189f = g1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0029, code lost:
    
        if (r3 == y.g1.f40723a) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0015, code lost:
    
        if (r3 == y.g1.f40724b) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(d0.j r5, int r6) {
        /*
            r4 = this;
            r0 = 5
            boolean r0 = a2.g1.c(r6, r0)
            r1 = 0
            r2 = 1
            y.g1 r3 = r4.f13189f
            if (r0 == 0) goto Lc
            goto L13
        Lc:
            r0 = 6
            boolean r0 = a2.g1.c(r6, r0)
            if (r0 == 0) goto L18
        L13:
            y.g1 r0 = y.g1.f40724b
            if (r3 != r0) goto L3a
            goto L2b
        L18:
            r0 = 3
            boolean r0 = a2.g1.c(r6, r0)
            if (r0 == 0) goto L20
            goto L27
        L20:
            r0 = 4
            boolean r0 = a2.g1.c(r6, r0)
            if (r0 == 0) goto L2c
        L27:
            y.g1 r0 = y.g1.f40723a
            if (r3 != r0) goto L3a
        L2b:
            return r1
        L2c:
            boolean r0 = a2.g1.c(r6, r2)
            if (r0 == 0) goto L33
            goto L3a
        L33:
            r0 = 2
            boolean r0 = a2.g1.c(r6, r0)
            if (r0 == 0) goto L53
        L3a:
            boolean r6 = r4.j(r6)
            if (r6 == 0) goto L4d
            int r5 = r5.f13170b
            d0.o r6 = r4.f13185b
            int r6 = r6.c()
            int r6 = r6 - r2
            if (r5 >= r6) goto L52
        L4b:
            r1 = r2
            goto L52
        L4d:
            int r5 = r5.f13169a
            if (r5 <= 0) goto L52
            goto L4b
        L52:
            return r1
        L53:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Lazy list does not support beyond bounds layout for the specified direction"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.n.d(d0.j, int):boolean");
    }

    @Override // b2.g
    public final b2.i getKey() {
        return a2.h.f66a;
    }

    @Override // b2.g
    public final Object getValue() {
        return this;
    }

    public final boolean j(int i10) {
        if (!a2.g1.c(i10, 1)) {
            if (a2.g1.c(i10, 2)) {
                return true;
            }
            boolean c10 = a2.g1.c(i10, 5);
            boolean z10 = this.f13187d;
            if (!c10) {
                if (a2.g1.c(i10, 6)) {
                    if (!z10) {
                        return true;
                    }
                } else {
                    boolean c11 = a2.g1.c(i10, 3);
                    w2.k kVar = this.f13188e;
                    if (c11) {
                        int ordinal = kVar.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                if (!z10) {
                                    return true;
                                }
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    } else if (a2.g1.c(i10, 4)) {
                        int ordinal2 = kVar.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (!z10) {
                            return true;
                        }
                    } else {
                        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction".toString());
                    }
                }
            }
            return z10;
        }
        return false;
    }
}
