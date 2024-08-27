package u3;

import android.graphics.Insets;
import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f36703e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f36704a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36705b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36706c;

    /* renamed from: d, reason: collision with root package name */
    public final int f36707d;

    public c(int i10, int i11, int i12, int i13) {
        this.f36704a = i10;
        this.f36705b = i11;
        this.f36706c = i12;
        this.f36707d = i13;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f36704a, cVar2.f36704a), Math.max(cVar.f36705b, cVar2.f36705b), Math.max(cVar.f36706c, cVar2.f36706c), Math.max(cVar.f36707d, cVar2.f36707d));
    }

    public static c b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return f36703e;
        }
        return new c(i10, i11, i12, i13);
    }

    public static c c(Insets insets) {
        int i10;
        int i11;
        int i12;
        int i13;
        i10 = insets.left;
        i11 = insets.top;
        i12 = insets.right;
        i13 = insets.bottom;
        return b(i10, i11, i12, i13);
    }

    public final Insets d() {
        return b.a(this.f36704a, this.f36705b, this.f36706c, this.f36707d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f36707d == cVar.f36707d && this.f36704a == cVar.f36704a && this.f36706c == cVar.f36706c && this.f36705b == cVar.f36705b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f36704a * 31) + this.f36705b) * 31) + this.f36706c) * 31) + this.f36707d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f36704a);
        sb2.append(", top=");
        sb2.append(this.f36705b);
        sb2.append(", right=");
        sb2.append(this.f36706c);
        sb2.append(", bottom=");
        return a3.a.i(sb2, this.f36707d, UrlTreeKt.componentParamSuffixChar);
    }
}
