package o8;

import android.graphics.ColorSpace;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Object f29830a;

    /* renamed from: b, reason: collision with root package name */
    public final w f29831b;

    /* renamed from: c, reason: collision with root package name */
    public final n8.i f29832c;

    public q(Object obj, w wVar, n8.i iVar) {
        this.f29830a = obj;
        this.f29831b = wVar;
        this.f29832c = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c3, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r2.D, r1.D) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ca, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r2, r1) != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof o8.q
            if (r1 == 0) goto Ld7
            o8.q r6 = (o8.q) r6
            java.lang.Object r1 = r6.f29830a
            o8.w r2 = r5.f29831b
            r2.getClass()
            java.lang.Object r2 = r5.f29830a
            if (r2 != r1) goto L17
            goto Lcc
        L17:
            boolean r3 = r2 instanceof y8.j
            if (r3 == 0) goto Lc6
            boolean r3 = r1 instanceof y8.j
            if (r3 != 0) goto L21
            goto Lc6
        L21:
            y8.j r2 = (y8.j) r2
            android.content.Context r3 = r2.f41362a
            y8.j r1 = (y8.j) r1
            android.content.Context r4 = r1.f41362a
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r3, r4)
            if (r3 == 0) goto Ld7
            java.lang.Object r3 = r2.f41363b
            java.lang.Object r4 = r1.f41363b
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r3, r4)
            if (r3 == 0) goto Ld7
            w8.c r3 = r2.E
            w8.c r4 = r1.E
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r3, r4)
            if (r3 == 0) goto Ld7
            w8.c r3 = r2.f41366e
            w8.c r4 = r1.f41366e
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r3, r4)
            if (r3 == 0) goto Ld7
            java.lang.String r3 = r2.f41367f
            java.lang.String r4 = r1.f41367f
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r3, r4)
            if (r3 == 0) goto Ld7
            android.graphics.Bitmap$Config r3 = r2.f41368g
            android.graphics.Bitmap$Config r4 = r1.f41368g
            if (r3 != r4) goto Ld7
            android.graphics.ColorSpace r3 = r2.f41369h
            android.graphics.ColorSpace r4 = r1.f41369h
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r3, r4)
            if (r3 == 0) goto Ld7
            java.util.List r3 = r2.f41373l
            java.util.List r4 = r1.f41373l
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r3, r4)
            if (r3 == 0) goto Ld7
            okhttp3.Headers r3 = r2.f41375n
            okhttp3.Headers r4 = r1.f41375n
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r3, r4)
            if (r3 == 0) goto Ld7
            boolean r3 = r2.f41377p
            boolean r4 = r1.f41377p
            if (r3 != r4) goto Ld7
            boolean r3 = r2.f41378q
            boolean r4 = r1.f41378q
            if (r3 != r4) goto Ld7
            boolean r3 = r2.f41379r
            boolean r4 = r1.f41379r
            if (r3 != r4) goto Ld7
            boolean r3 = r2.f41380s
            boolean r4 = r1.f41380s
            if (r3 != r4) goto Ld7
            y8.b r3 = r2.f41381t
            y8.b r4 = r1.f41381t
            if (r3 != r4) goto Ld7
            y8.b r3 = r2.f41382u
            y8.b r4 = r1.f41382u
            if (r3 != r4) goto Ld7
            y8.b r3 = r2.f41383v
            y8.b r4 = r1.f41383v
            if (r3 != r4) goto Ld7
            z8.h r3 = r2.B
            z8.h r4 = r1.B
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r3, r4)
            if (r3 == 0) goto Ld7
            z8.f r3 = r2.C
            z8.f r4 = r1.C
            if (r3 != r4) goto Ld7
            z8.d r3 = r2.f41370i
            z8.d r4 = r1.f41370i
            if (r3 != r4) goto Ld7
            y8.n r2 = r2.D
            y8.n r1 = r1.D
            boolean r1 = kotlin.jvm.internal.Intrinsics.a(r2, r1)
            if (r1 == 0) goto Ld7
            goto Lcc
        Lc6:
            boolean r1 = kotlin.jvm.internal.Intrinsics.a(r2, r1)
            if (r1 == 0) goto Ld7
        Lcc:
            n8.i r1 = r5.f29832c
            n8.i r6 = r6.f29832c
            boolean r6 = kotlin.jvm.internal.Intrinsics.a(r1, r6)
            if (r6 == 0) goto Ld7
            goto Ld8
        Ld7:
            r0 = 0
        Ld8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.q.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        this.f29831b.getClass();
        Object obj = this.f29830a;
        int i13 = 0;
        if (!(obj instanceof y8.j)) {
            if (obj != null) {
                i13 = obj.hashCode();
            }
        } else {
            y8.j jVar = (y8.j) obj;
            int hashCode = (jVar.f41363b.hashCode() + (jVar.f41362a.hashCode() * 31)) * 31;
            w8.c cVar = jVar.E;
            if (cVar != null) {
                i10 = cVar.hashCode();
            } else {
                i10 = 0;
            }
            int i14 = (hashCode + i10) * 31;
            w8.c cVar2 = jVar.f41366e;
            if (cVar2 != null) {
                i11 = cVar2.hashCode();
            } else {
                i11 = 0;
            }
            int i15 = (i14 + i11) * 31;
            String str = jVar.f41367f;
            if (str != null) {
                i12 = str.hashCode();
            } else {
                i12 = 0;
            }
            int hashCode2 = (jVar.f41368g.hashCode() + ((i15 + i12) * 31)) * 31;
            ColorSpace colorSpace = jVar.f41369h;
            if (colorSpace != null) {
                i13 = colorSpace.hashCode();
            }
            i13 = jVar.D.f41405a.hashCode() + ((jVar.f41370i.hashCode() + ((jVar.C.hashCode() + ((jVar.B.hashCode() + ((jVar.f41383v.hashCode() + ((jVar.f41382u.hashCode() + ((jVar.f41381t.hashCode() + v.e.d(jVar.f41380s, v.e.d(jVar.f41379r, v.e.d(jVar.f41378q, v.e.d(jVar.f41377p, (jVar.f41375n.hashCode() + nn.d.e(jVar.f41373l, (hashCode2 + i13) * 31, 31)) * 31, 31), 31), 31), 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }
        return this.f29832c.hashCode() + (i13 * 31);
    }
}
