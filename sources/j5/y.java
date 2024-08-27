package j5;

import b5.g1;
import b5.h1;
import b5.i1;
import b5.o0;
import java.util.HashMap;
import java.util.Random;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: h, reason: collision with root package name */
    public static final i5.p f21027h = new i5.p(1);

    /* renamed from: i, reason: collision with root package name */
    public static final Random f21028i = new Random();

    /* renamed from: d, reason: collision with root package name */
    public b0 f21032d;

    /* renamed from: f, reason: collision with root package name */
    public String f21034f;

    /* renamed from: a, reason: collision with root package name */
    public final h1 f21029a = new h1();

    /* renamed from: b, reason: collision with root package name */
    public final g1 f21030b = new g1();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f21031c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public i1 f21033e = i1.f3357a;

    /* renamed from: g, reason: collision with root package name */
    public long f21035g = -1;

    public final void a(x xVar) {
        long j10 = xVar.f21022c;
        if (j10 != -1) {
            this.f21035g = j10;
        }
        this.f21034f = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if (r13 != (-1)) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j5.x b(int r16, r5.w r17) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            java.util.HashMap r3 = r0.f21031c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L15:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L9b
            java.lang.Object r8 = r4.next()
            j5.x r8 = (j5.x) r8
            long r9 = r8.f21022c
            r11 = -1
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L51
            int r9 = r8.f21021b
            if (r1 != r9) goto L51
            if (r2 == 0) goto L51
            j5.y r9 = r8.f21026g
            java.util.HashMap r10 = r9.f21031c
            java.lang.String r13 = r9.f21034f
            java.lang.Object r10 = r10.get(r13)
            j5.x r10 = (j5.x) r10
            if (r10 == 0) goto L44
            long r13 = r10.f21022c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 == 0) goto L44
            goto L49
        L44:
            long r9 = r9.f21035g
            r13 = 1
            long r13 = r13 + r9
        L49:
            long r9 = r2.f3559d
            int r13 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r13 < 0) goto L51
            r8.f21022c = r9
        L51:
            r5.w r9 = r8.f21023d
            if (r2 != 0) goto L5a
            int r10 = r8.f21021b
            if (r1 != r10) goto L15
            goto L7d
        L5a:
            long r13 = r2.f3559d
            if (r9 != 0) goto L6b
            boolean r10 = r17.a()
            if (r10 != 0) goto L15
            long r11 = r8.f21022c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L15
            goto L7d
        L6b:
            long r10 = r9.f3559d
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 != 0) goto L15
            int r10 = r2.f3557b
            int r11 = r9.f3557b
            if (r10 != r11) goto L15
            int r10 = r2.f3558c
            int r11 = r9.f3558c
            if (r10 != r11) goto L15
        L7d:
            long r10 = r8.f21022c
            r12 = -1
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 == 0) goto L97
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 >= 0) goto L8a
            goto L97
        L8a:
            if (r12 != 0) goto L15
            int r10 = e5.x.f15050a
            r5.w r10 = r5.f21023d
            if (r10 == 0) goto L15
            if (r9 == 0) goto L15
            r5 = r8
            goto L15
        L97:
            r5 = r8
            r6 = r10
            goto L15
        L9b:
            if (r5 != 0) goto Lad
            i5.p r4 = j5.y.f21027h
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            j5.x r5 = new j5.x
            r5.<init>(r15, r4, r1, r2)
            r3.put(r4, r5)
        Lad:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.y.b(int, r5.w):j5.x");
    }

    public final synchronized String c(i1 i1Var, r5.w wVar) {
        return b(i1Var.h(wVar.f3556a, this.f21030b).f3318c, wVar).f21020a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [b5.o0, r5.w] */
    public final void d(b bVar) {
        r5.w wVar;
        boolean q10 = bVar.f20964b.q();
        HashMap hashMap = this.f21031c;
        if (q10) {
            String str = this.f21034f;
            if (str != null) {
                x xVar = (x) hashMap.get(str);
                xVar.getClass();
                a(xVar);
                return;
            }
            return;
        }
        x xVar2 = (x) hashMap.get(this.f21034f);
        int i10 = bVar.f20965c;
        r5.w wVar2 = bVar.f20966d;
        this.f21034f = b(i10, wVar2).f21020a;
        e(bVar);
        if (wVar2 != null && wVar2.a()) {
            long j10 = wVar2.f3559d;
            if (xVar2 == null || xVar2.f21022c != j10 || (wVar = xVar2.f21023d) == null || wVar.f3557b != wVar2.f3557b || wVar.f3558c != wVar2.f3558c) {
                b(i10, new o0(j10, wVar2.f3556a));
                this.f21032d.getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036 A[Catch: all -> 0x0050, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0010, B:10:0x0014, B:12:0x0024, B:19:0x0036, B:21:0x0042, B:23:0x0048, B:27:0x002b, B:29:0x0053, B:31:0x005f, B:32:0x0063, B:34:0x0068, B:36:0x006e, B:38:0x0085, B:39:0x00b3, B:41:0x00b7, B:42:0x00be, B:44:0x00c8, B:46:0x00cc, B:48:0x00db, B:51:0x00e2), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void e(j5.b r10) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.y.e(j5.b):void");
    }
}
