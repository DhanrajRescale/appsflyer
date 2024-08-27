package j5;

import b5.i1;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final String f21020a;

    /* renamed from: b, reason: collision with root package name */
    public int f21021b;

    /* renamed from: c, reason: collision with root package name */
    public long f21022c;

    /* renamed from: d, reason: collision with root package name */
    public final r5.w f21023d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21024e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21025f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y f21026g;

    public x(y yVar, String str, int i10, r5.w wVar) {
        long j10;
        this.f21026g = yVar;
        this.f21020a = str;
        this.f21021b = i10;
        if (wVar == null) {
            j10 = -1;
        } else {
            j10 = wVar.f3559d;
        }
        this.f21022c = j10;
        if (wVar != null && wVar.a()) {
            this.f21023d = wVar;
        }
    }

    public final boolean a(b bVar) {
        r5.w wVar = bVar.f20966d;
        if (wVar == null) {
            if (this.f21021b != bVar.f20965c) {
                return true;
            }
            return false;
        }
        long j10 = this.f21022c;
        if (j10 == -1) {
            return false;
        }
        if (wVar.f3559d > j10) {
            return true;
        }
        r5.w wVar2 = this.f21023d;
        if (wVar2 == null) {
            return false;
        }
        i1 i1Var = bVar.f20964b;
        int b10 = i1Var.b(wVar.f3556a);
        int b11 = i1Var.b(wVar2.f3556a);
        if (wVar.f3559d < wVar2.f3559d || b10 < b11) {
            return false;
        }
        if (b10 > b11) {
            return true;
        }
        boolean a10 = wVar.a();
        int i10 = wVar2.f3557b;
        if (a10) {
            int i11 = wVar.f3557b;
            if (i11 > i10) {
                return true;
            }
            if (i11 == i10) {
                if (wVar.f3558c > wVar2.f3558c) {
                    return true;
                }
            }
            return false;
        }
        int i12 = wVar.f3560e;
        if (i12 == -1 || i12 > i10) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.p()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(b5.i1 r7, b5.i1 r8) {
        /*
            r6 = this;
            int r0 = r6.f21021b
            int r1 = r7.p()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L11
            int r7 = r8.p()
            if (r0 >= r7) goto L36
            goto L37
        L11:
            j5.y r1 = r6.f21026g
            b5.h1 r4 = r1.f21029a
            r7.o(r0, r4)
            b5.h1 r0 = r1.f21029a
            int r4 = r0.f3346o
        L1c:
            int r5 = r0.f3347p
            if (r4 > r5) goto L36
            java.lang.Object r5 = r7.m(r4)
            int r5 = r8.b(r5)
            if (r5 == r3) goto L33
            b5.g1 r7 = r1.f21030b
            b5.g1 r7 = r8.g(r5, r7, r2)
            int r0 = r7.f3318c
            goto L37
        L33:
            int r4 = r4 + 1
            goto L1c
        L36:
            r0 = r3
        L37:
            r6.f21021b = r0
            if (r0 != r3) goto L3c
            return r2
        L3c:
            r5.w r7 = r6.f21023d
            r0 = 1
            if (r7 != 0) goto L42
            return r0
        L42:
            java.lang.Object r7 = r7.f3556a
            int r7 = r8.b(r7)
            if (r7 == r3) goto L4b
            r2 = r0
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.x.b(b5.i1, b5.i1):boolean");
    }
}
