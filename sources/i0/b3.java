package i0;

/* loaded from: classes.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f18800a = 100000;

    /* renamed from: b, reason: collision with root package name */
    public tr.e f18801b;

    /* renamed from: c, reason: collision with root package name */
    public tr.e f18802c;

    /* renamed from: d, reason: collision with root package name */
    public int f18803d;

    /* renamed from: e, reason: collision with root package name */
    public Long f18804e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18805f;

    public static void b(b3 b3Var, p2.c0 c0Var) {
        long j10;
        long currentTimeMillis = System.currentTimeMillis();
        if (!b3Var.f18805f) {
            Long l10 = b3Var.f18804e;
            if (l10 != null) {
                j10 = l10.longValue();
            } else {
                j10 = 0;
            }
            if (currentTimeMillis <= j10 + 5000) {
                return;
            }
        }
        b3Var.f18804e = Long.valueOf(currentTimeMillis);
        b3Var.a(c0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0071 A[LOOP:0: B:26:0x0061->B:31:0x0071, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076 A[EDGE_INSN: B:32:0x0076->B:33:0x0076 BREAK  A[LOOP:0: B:26:0x0061->B:31:0x0071], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(p2.c0 r5) {
        /*
            r4 = this;
            r0 = 0
            r4.f18805f = r0
            tr.e r0 = r4.f18801b
            r1 = 0
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r0.f36362c
            p2.c0 r0 = (p2.c0) r0
            goto Le
        Ld:
            r0 = r1
        Le:
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r5, r0)
            if (r0 == 0) goto L15
            return
        L15:
            j2.e r0 = r5.f30522a
            java.lang.String r0 = r0.f20699a
            tr.e r2 = r4.f18801b
            if (r2 == 0) goto L28
            java.lang.Object r2 = r2.f36362c
            p2.c0 r2 = (p2.c0) r2
            if (r2 == 0) goto L28
            j2.e r2 = r2.f30522a
            java.lang.String r2 = r2.f20699a
            goto L29
        L28:
            r2 = r1
        L29:
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r0, r2)
            if (r0 == 0) goto L37
            tr.e r0 = r4.f18801b
            if (r0 != 0) goto L34
            goto L36
        L34:
            r0.f36362c = r5
        L36:
            return
        L37:
            tr.e r0 = r4.f18801b
            tr.e r2 = new tr.e
            r3 = 4
            r2.<init>(r3, r0, r5)
            r4.f18801b = r2
            r4.f18802c = r1
            int r0 = r4.f18803d
            j2.e r5 = r5.f30522a
            java.lang.String r5 = r5.f20699a
            int r5 = r5.length()
            int r5 = r5 + r0
            r4.f18803d = r5
            int r0 = r4.f18800a
            if (r5 <= r0) goto L7b
            tr.e r5 = r4.f18801b
            if (r5 == 0) goto L5d
            java.lang.Object r0 = r5.f36361b
            tr.e r0 = (tr.e) r0
            goto L5e
        L5d:
            r0 = r1
        L5e:
            if (r0 != 0) goto L61
            goto L7b
        L61:
            if (r5 == 0) goto L6e
            java.lang.Object r0 = r5.f36361b
            tr.e r0 = (tr.e) r0
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r0.f36361b
            tr.e r0 = (tr.e) r0
            goto L6f
        L6e:
            r0 = r1
        L6f:
            if (r0 == 0) goto L76
            java.lang.Object r5 = r5.f36361b
            tr.e r5 = (tr.e) r5
            goto L61
        L76:
            if (r5 != 0) goto L79
            goto L7b
        L79:
            r5.f36361b = r1
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.b3.a(p2.c0):void");
    }
}
