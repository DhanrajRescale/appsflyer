package nr;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f29113a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f29114b;

    public b(a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f29113a = aVar;
            int length = iArr.length;
            int i10 = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i10 < length && iArr[i10] == 0) {
                    i10++;
                }
                if (i10 == length) {
                    this.f29114b = new int[]{0};
                    return;
                }
                int i11 = length - i10;
                int[] iArr2 = new int[i11];
                this.f29114b = iArr2;
                System.arraycopy(iArr, i10, iArr2, 0, i11);
                return;
            }
            this.f29114b = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final b a(b bVar) {
        a aVar = bVar.f29113a;
        a aVar2 = this.f29113a;
        if (aVar2.equals(aVar)) {
            int[] iArr = this.f29114b;
            if (iArr[0] == 0) {
                return bVar;
            }
            int[] iArr2 = bVar.f29114b;
            if (iArr2[0] == 0) {
                return this;
            }
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i10 = length; i10 < iArr.length; i10++) {
                iArr3[i10] = iArr2[i10 - length] ^ iArr[i10];
            }
            return new b(aVar2, iArr3);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public final int b() {
        return this.f29114b.length - 1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(b() * 8);
        for (int b10 = b(); b10 >= 0; b10--) {
            int[] iArr = this.f29114b;
            int i10 = iArr[(iArr.length - 1) - b10];
            if (i10 != 0) {
                if (i10 < 0) {
                    sb2.append(" - ");
                    i10 = -i10;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (b10 == 0 || i10 != 1) {
                    a aVar = this.f29113a;
                    if (i10 != 0) {
                        int i11 = aVar.f29108b[i10];
                        if (i11 == 0) {
                            sb2.append('1');
                        } else if (i11 == 1) {
                            sb2.append('a');
                        } else {
                            sb2.append("a^");
                            sb2.append(i11);
                        }
                    } else {
                        aVar.getClass();
                        throw new IllegalArgumentException();
                    }
                }
                if (b10 != 0) {
                    if (b10 == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(b10);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
