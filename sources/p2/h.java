package p2;

/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f30573a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30574b;

    public h(int i10, int i11) {
        this.f30573a = i10;
        this.f30574b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f A[LOOP:0: B:2:0x0003->B:13:0x002f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[EDGE_INSN: B:14:0x0032->B:15:0x0032 BREAK  A[LOOP:0: B:2:0x0003->B:13:0x002f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d A[LOOP:1: B:16:0x0033->B:27:0x006d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[EDGE_INSN: B:28:0x0070->B:29:0x0070 BREAK  A[LOOP:1: B:16:0x0033->B:27:0x006d], SYNTHETIC] */
    @Override // p2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(p2.k r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = r0
            r2 = r1
        L3:
            int r3 = r7.f30573a
            if (r1 >= r3) goto L32
            int r3 = r2 + 1
            int r4 = r8.f30583b
            if (r4 <= r3) goto L2a
            int r4 = r4 - r3
            int r4 = r4 + (-1)
            char r4 = r8.b(r4)
            int r5 = r8.f30583b
            int r5 = r5 - r3
            char r5 = r8.b(r5)
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L2a
            boolean r4 = java.lang.Character.isLowSurrogate(r5)
            if (r4 == 0) goto L2a
            int r2 = r2 + 2
            goto L2b
        L2a:
            r2 = r3
        L2b:
            int r3 = r8.f30583b
            if (r2 == r3) goto L32
            int r1 = r1 + 1
            goto L3
        L32:
            r1 = r0
        L33:
            int r3 = r7.f30574b
            if (r0 >= r3) goto L70
            int r3 = r1 + 1
            int r4 = r8.f30584c
            int r4 = r4 + r3
            p2.w r5 = r8.f30582a
            int r6 = r5.a()
            if (r4 >= r6) goto L63
            int r4 = r8.f30584c
            int r4 = r4 + r3
            int r4 = r4 + (-1)
            char r4 = r8.b(r4)
            int r6 = r8.f30584c
            int r6 = r6 + r3
            char r6 = r8.b(r6)
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L63
            boolean r4 = java.lang.Character.isLowSurrogate(r6)
            if (r4 == 0) goto L63
            int r1 = r1 + 2
            goto L64
        L63:
            r1 = r3
        L64:
            int r3 = r8.f30584c
            int r3 = r3 + r1
            int r4 = r5.a()
            if (r3 == r4) goto L70
            int r0 = r0 + 1
            goto L33
        L70:
            int r0 = r8.f30584c
            int r1 = r1 + r0
            r8.a(r0, r1)
            int r0 = r8.f30583b
            int r1 = r0 - r2
            r8.a(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.h.a(p2.k):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f30573a == hVar.f30573a && this.f30574b == hVar.f30574b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30573a * 31) + this.f30574b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb2.append(this.f30573a);
        sb2.append(", lengthAfterCursor=");
        return a3.a.i(sb2, this.f30574b, ')');
    }
}
