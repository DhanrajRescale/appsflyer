package lr;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final e f25099e = new e(f.f25104b, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f25100a;

    /* renamed from: b, reason: collision with root package name */
    public final f f25101b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25102c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25103d;

    public e(f fVar, int i10, int i11, int i12) {
        this.f25101b = fVar;
        this.f25100a = i10;
        this.f25102c = i11;
        this.f25103d = i12;
    }

    public final e a(int i10) {
        int i11;
        f fVar = this.f25101b;
        int i12 = this.f25100a;
        int i13 = this.f25103d;
        if (i12 == 4 || i12 == 2) {
            int[] iArr = c.f25093c[i12];
            i12 = 0;
            int i14 = iArr[0];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            fVar.getClass();
            i13 += i16;
            fVar = new d(fVar, i15, i16);
        }
        int i17 = this.f25102c;
        if (i17 != 0 && i17 != 31) {
            if (i17 == 62) {
                i11 = 9;
            } else {
                i11 = 8;
            }
        } else {
            i11 = 18;
        }
        int i18 = i17 + 1;
        e eVar = new e(fVar, i12, i18, i13 + i11);
        if (i18 == 2078) {
            return eVar.b(i10 + 1);
        }
        return eVar;
    }

    public final e b(int i10) {
        int i11 = this.f25102c;
        if (i11 == 0) {
            return this;
        }
        f fVar = this.f25101b;
        fVar.getClass();
        return new e(new a(fVar, i10 - i11, i11), this.f25100a, 0, this.f25103d);
    }

    public final boolean c(e eVar) {
        int i10;
        int i11 = this.f25103d + (c.f25093c[this.f25100a][eVar.f25100a] >> 16);
        int i12 = eVar.f25102c;
        if (i12 > 0 && ((i10 = this.f25102c) == 0 || i10 > i12)) {
            i11 += 10;
        }
        if (i11 <= eVar.f25103d) {
            return true;
        }
        return false;
    }

    public final e d(int i10, int i11) {
        int i12;
        int i13 = this.f25103d;
        f fVar = this.f25101b;
        int i14 = this.f25100a;
        if (i10 != i14) {
            int i15 = c.f25093c[i14][i10];
            int i16 = 65535 & i15;
            int i17 = i15 >> 16;
            fVar.getClass();
            i13 += i17;
            fVar = new d(fVar, i16, i17);
        }
        if (i10 == 2) {
            i12 = 4;
        } else {
            i12 = 5;
        }
        fVar.getClass();
        return new e(new d(fVar, i11, i12), i10, 0, i13 + i12);
    }

    public final e e(int i10, int i11) {
        int i12;
        int i13 = this.f25100a;
        if (i13 == 2) {
            i12 = 4;
        } else {
            i12 = 5;
        }
        int i14 = c.f25095e[i13][i10];
        f fVar = this.f25101b;
        fVar.getClass();
        return new e(new d(new d(fVar, i14, i12), i11, 5), i13, 0, this.f25103d + i12 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", c.f25092b[this.f25100a], Integer.valueOf(this.f25103d), Integer.valueOf(this.f25102c));
    }
}
