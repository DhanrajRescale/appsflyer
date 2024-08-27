package n1;

import android.graphics.ColorFilter;
import ut.t;

/* loaded from: classes.dex */
public final class m extends u {

    /* renamed from: b, reason: collision with root package name */
    public final long f28153b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28154c;

    public m(long j10, int i10, ColorFilter colorFilter) {
        super(colorFilter);
        this.f28153b = j10;
        this.f28154c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (t.d(this.f28153b, mVar.f28153b) && s0.b(this.f28154c, mVar.f28154c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = t.f28178j;
        t.Companion companion = ut.t.INSTANCE;
        return Integer.hashCode(this.f28154c) + (Long.hashCode(this.f28153b) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BlendModeColorFilter(color=");
        v.e.t(this.f28153b, sb2, ", blendMode=");
        int i10 = this.f28154c;
        if (s0.b(i10, 0)) {
            str = "Clear";
        } else if (s0.b(i10, 1)) {
            str = "Src";
        } else if (s0.b(i10, 2)) {
            str = "Dst";
        } else if (s0.b(i10, 3)) {
            str = "SrcOver";
        } else if (s0.b(i10, 4)) {
            str = "DstOver";
        } else if (s0.b(i10, 5)) {
            str = "SrcIn";
        } else if (s0.b(i10, 6)) {
            str = "DstIn";
        } else if (s0.b(i10, 7)) {
            str = "SrcOut";
        } else if (s0.b(i10, 8)) {
            str = "DstOut";
        } else if (s0.b(i10, 9)) {
            str = "SrcAtop";
        } else if (s0.b(i10, 10)) {
            str = "DstAtop";
        } else if (s0.b(i10, 11)) {
            str = "Xor";
        } else if (s0.b(i10, 12)) {
            str = "Plus";
        } else if (s0.b(i10, 13)) {
            str = "Modulate";
        } else if (s0.b(i10, 14)) {
            str = "Screen";
        } else if (s0.b(i10, 15)) {
            str = "Overlay";
        } else if (s0.b(i10, 16)) {
            str = "Darken";
        } else if (s0.b(i10, 17)) {
            str = "Lighten";
        } else if (s0.b(i10, 18)) {
            str = "ColorDodge";
        } else if (s0.b(i10, 19)) {
            str = "ColorBurn";
        } else if (s0.b(i10, 20)) {
            str = "HardLight";
        } else if (s0.b(i10, 21)) {
            str = "Softlight";
        } else if (s0.b(i10, 22)) {
            str = "Difference";
        } else if (s0.b(i10, 23)) {
            str = "Exclusion";
        } else if (s0.b(i10, 24)) {
            str = "Multiply";
        } else if (s0.b(i10, 25)) {
            str = "Hue";
        } else if (s0.b(i10, 26)) {
            str = "Saturation";
        } else if (s0.b(i10, 27)) {
            str = "Color";
        } else if (s0.b(i10, 28)) {
            str = "Luminosity";
        } else {
            str = "Unknown";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
