package u2;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final g f36677c = new g(f.f36675b, 17);

    /* renamed from: a, reason: collision with root package name */
    public final float f36678a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36679b;

    public g(float f10, int i10) {
        this.f36678a = f10;
        this.f36679b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        float f10 = gVar.f36678a;
        float f11 = f.f36674a;
        if (Float.compare(this.f36678a, f10) == 0) {
            if (this.f36679b == gVar.f36679b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        float f10 = f.f36674a;
        return Integer.hashCode(this.f36679b) + (Float.hashCode(this.f36678a) * 31);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("LineHeightStyle(alignment=");
        float f10 = this.f36678a;
        if (f10 == s0.g.f34069a) {
            float f11 = f.f36674a;
            str = "LineHeightStyle.Alignment.Top";
        } else if (f10 == f.f36674a) {
            str = "LineHeightStyle.Alignment.Center";
        } else if (f10 == f.f36675b) {
            str = "LineHeightStyle.Alignment.Proportional";
        } else if (f10 == f.f36676c) {
            str = "LineHeightStyle.Alignment.Bottom";
        } else {
            str = "LineHeightStyle.Alignment(topPercentage = " + f10 + ')';
        }
        sb2.append((Object) str);
        sb2.append(", trim=");
        int i10 = this.f36679b;
        if (i10 == 1) {
            str2 = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i10 == 16) {
            str2 = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i10 == 17) {
            str2 = "LineHeightStyle.Trim.Both";
        } else if (i10 == 0) {
            str2 = "LineHeightStyle.Trim.None";
        } else {
            str2 = "Invalid";
        }
        sb2.append((Object) str2);
        sb2.append(')');
        return sb2.toString();
    }
}
