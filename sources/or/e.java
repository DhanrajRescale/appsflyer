package or;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: i, reason: collision with root package name */
    public static final e[] f30274i = {new e(false, 3, 5, 8, 8, 1, 3, 5), new e(false, 5, 7, 10, 10, 1, 5, 7), new e(true, 5, 7, 16, 6, 1, 5, 7), new e(false, 8, 10, 12, 12, 1, 8, 10), new e(true, 10, 11, 14, 6, 2, 10, 11), new e(false, 12, 12, 14, 14, 1, 12, 12), new e(true, 16, 14, 24, 10, 1, 16, 14), new e(false, 18, 14, 16, 16, 1, 18, 14), new e(false, 22, 18, 18, 18, 1, 22, 18), new e(true, 22, 18, 16, 10, 2, 22, 18), new e(false, 30, 20, 20, 20, 1, 30, 20), new e(true, 32, 24, 16, 14, 2, 32, 24), new e(false, 36, 24, 22, 22, 1, 36, 24), new e(false, 44, 28, 24, 24, 1, 44, 28), new e(true, 49, 28, 22, 14, 2, 49, 28), new e(false, 62, 36, 14, 14, 4, 62, 36), new e(false, 86, 42, 16, 16, 4, 86, 42), new e(false, 114, 48, 18, 18, 4, 114, 48), new e(false, 144, 56, 20, 20, 4, 144, 56), new e(false, 174, 68, 22, 22, 4, 174, 68), new e(false, 204, 84, 24, 24, 4, 102, 42), new e(false, 280, 112, 14, 14, 16, 140, 56), new e(false, 368, 144, 16, 16, 16, 92, 36), new e(false, 456, 192, 18, 18, 16, 114, 48), new e(false, 576, 224, 20, 20, 16, 144, 56), new e(false, 696, 272, 22, 22, 16, 174, 68), new e(false, 816, 336, 24, 24, 16, 136, 56), new e(false, 1050, 408, 18, 18, 36, 175, 68), new e(false, 1304, 496, 20, 20, 36, 163, 62), new e(false, 1558, 620, 22, 22, 36, -1, 62)};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f30275a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30276b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30277c;

    /* renamed from: d, reason: collision with root package name */
    public final int f30278d;

    /* renamed from: e, reason: collision with root package name */
    public final int f30279e;

    /* renamed from: f, reason: collision with root package name */
    public final int f30280f;

    /* renamed from: g, reason: collision with root package name */
    public final int f30281g;

    /* renamed from: h, reason: collision with root package name */
    public final int f30282h;

    public e(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f30275a = z10;
        this.f30276b = i10;
        this.f30277c = i11;
        this.f30278d = i12;
        this.f30279e = i13;
        this.f30280f = i14;
        this.f30281g = i15;
        this.f30282h = i16;
    }

    public static e e(int i10, f fVar) {
        e[] eVarArr = f30274i;
        for (int i11 = 0; i11 < 30; i11++) {
            e eVar = eVarArr[i11];
            if ((fVar != f.f30284b || !eVar.f30275a) && ((fVar != f.f30285c || eVar.f30275a) && i10 <= eVar.f30276b)) {
                return eVar;
            }
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i10)));
    }

    public int a(int i10) {
        return this.f30281g;
    }

    public final int b() {
        int i10 = 1;
        int i11 = this.f30280f;
        if (i11 != 1) {
            i10 = 2;
            if (i11 != 2 && i11 != 4) {
                if (i11 == 16) {
                    return 4;
                }
                if (i11 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i10;
    }

    public int c() {
        return this.f30276b / this.f30281g;
    }

    public final int d() {
        int i10 = this.f30280f;
        if (i10 == 1 || i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f30275a) {
            str = "Rectangular Symbol:";
        } else {
            str = "Square Symbol:";
        }
        sb2.append(str);
        sb2.append(" data region ");
        int i10 = this.f30278d;
        sb2.append(i10);
        sb2.append('x');
        int i11 = this.f30279e;
        sb2.append(i11);
        sb2.append(", symbol size ");
        sb2.append((b() * i10) + (b() << 1));
        sb2.append('x');
        sb2.append((d() * i11) + (d() << 1));
        sb2.append(", symbol data size ");
        sb2.append(b() * i10);
        sb2.append('x');
        sb2.append(d() * i11);
        sb2.append(", codewords ");
        sb2.append(this.f30276b);
        sb2.append('+');
        sb2.append(this.f30277c);
        return sb2.toString();
    }
}
