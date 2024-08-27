package e5;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f15017a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15018b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15019c;

    public /* synthetic */ g(int i10, int i11, String str) {
        this.f15017a = i10;
        this.f15018b = i11;
        this.f15019c = str;
    }

    public static g a(p pVar) {
        String str;
        pVar.G(2);
        int u10 = pVar.u();
        int i10 = u10 >> 1;
        int u11 = ((pVar.u() >> 3) & 31) | ((u10 & 1) << 5);
        if (i10 != 4 && i10 != 5 && i10 != 7) {
            if (i10 == 8) {
                str = "hev1";
            } else if (i10 == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str2 = ".0";
        sb2.append(".0");
        sb2.append(i10);
        if (u11 >= 10) {
            str2 = ".";
        }
        sb2.append(str2);
        sb2.append(u11);
        return new g(i10, u11, sb2.toString());
    }

    public g(String str, int i10, int i11) {
        this.f15019c = str;
        this.f15017a = i10;
        this.f15018b = i11;
    }
}
