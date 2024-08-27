package w;

/* loaded from: classes.dex */
public final class z implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f38736a;

    /* renamed from: b, reason: collision with root package name */
    public final float f38737b;

    public z(float f10, float f11) {
        this.f38736a = f10;
        this.f38737b = f11;
        if (!Float.isNaN(f10) && !Float.isNaN(s0.g.f34069a) && !Float.isNaN(f11) && !Float.isNaN(1.0f)) {
            return;
        }
        e.w("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f10 + ", 0.0, " + f11 + ", 1.0.");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01df, code lost:
    
        if (r0 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01eb, code lost:
    
        if (r0 <= 1.0000008f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x020b, code lost:
    
        if (r0 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0217, code lost:
    
        if (r0 <= 1.0000008f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
    
        if (r0 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        r15 = s0.g.f34069a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        if (r0 <= 1.0000008f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        r15 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c3, code lost:
    
        if (r0 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ce, code lost:
    
        if (r0 <= 1.0000008f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0199, code lost:
    
        if (r0 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a5, code lost:
    
        if (r0 <= 1.0000008f) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0182  */
    @Override // w.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float b(float r23) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.z.b(float):float");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f38736a == zVar.f38736a && this.f38737b == zVar.f38737b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + v.e.a(this.f38737b, v.e.a(s0.g.f34069a, Float.hashCode(this.f38736a) * 31, 31), 31);
    }

    public final String toString() {
        return "CubicBezierEasing(a=" + this.f38736a + ", b=0.0, c=" + this.f38737b + ", d=1.0)";
    }
}
