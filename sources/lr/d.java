package lr;

import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes2.dex */
public final class d extends f {

    /* renamed from: c, reason: collision with root package name */
    public final short f25097c;

    /* renamed from: d, reason: collision with root package name */
    public final short f25098d;

    public d(f fVar, int i10, int i11) {
        super(fVar);
        this.f25097c = (short) i10;
        this.f25098d = (short) i11;
    }

    @Override // lr.f
    public final void a(mr.a aVar, byte[] bArr) {
        aVar.b(this.f25097c, this.f25098d);
    }

    public final String toString() {
        short s7 = this.f25098d;
        return UrlTreeKt.configurablePathSegmentPrefix + Integer.toBinaryString((1 << s7) | (((1 << s7) - 1) & this.f25097c) | (1 << s7)).substring(1) + UrlTreeKt.configurablePathSegmentSuffixChar;
    }
}
