package lr;

import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes2.dex */
public final class a extends f {

    /* renamed from: c, reason: collision with root package name */
    public final short f25089c;

    /* renamed from: d, reason: collision with root package name */
    public final short f25090d;

    public a(f fVar, int i10, int i11) {
        super(fVar);
        this.f25089c = (short) i10;
        this.f25090d = (short) i11;
    }

    @Override // lr.f
    public final void a(mr.a aVar, byte[] bArr) {
        int i10 = 0;
        while (true) {
            short s7 = this.f25090d;
            if (i10 < s7) {
                if (i10 == 0 || (i10 == 31 && s7 <= 62)) {
                    aVar.b(31, 5);
                    if (s7 > 62) {
                        aVar.b(s7 - 31, 16);
                    } else if (i10 == 0) {
                        aVar.b(Math.min((int) s7, 31), 5);
                    } else {
                        aVar.b(s7 - 31, 5);
                    }
                }
                aVar.b(bArr[this.f25089c + i10], 8);
                i10++;
            } else {
                return;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(UrlTreeKt.configurablePathSegmentPrefix);
        sb2.append((int) this.f25089c);
        sb2.append("::");
        sb2.append((r1 + this.f25090d) - 1);
        sb2.append(UrlTreeKt.configurablePathSegmentSuffixChar);
        return sb2.toString();
    }
}
