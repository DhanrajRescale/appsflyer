package rt;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f33997a;

    /* renamed from: b, reason: collision with root package name */
    public int f33998b;

    /* renamed from: c, reason: collision with root package name */
    public int f33999c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f34000d;

    public e(int i10) {
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(i10 - 1));
        this.f33997a = numberOfLeadingZeros - 1;
        this.f33999c = (int) (0.75f * numberOfLeadingZeros);
        this.f34000d = new Object[numberOfLeadingZeros];
    }

    public final void a(Object obj) {
        Object obj2;
        Object obj3;
        Object[] objArr = this.f34000d;
        int i10 = this.f33997a;
        int hashCode = obj.hashCode() * (-1640531527);
        int i11 = (hashCode ^ (hashCode >>> 16)) & i10;
        Object obj4 = objArr[i11];
        if (obj4 != null) {
            if (obj4.equals(obj)) {
                return;
            }
            do {
                i11 = (i11 + 1) & i10;
                obj3 = objArr[i11];
                if (obj3 == null) {
                }
            } while (!obj3.equals(obj));
            return;
        }
        objArr[i11] = obj;
        int i12 = this.f33998b + 1;
        this.f33998b = i12;
        if (i12 >= this.f33999c) {
            Object[] objArr2 = this.f34000d;
            int length = objArr2.length;
            int i13 = length << 1;
            int i14 = i13 - 1;
            Object[] objArr3 = new Object[i13];
            while (true) {
                int i15 = i12 - 1;
                if (i12 == 0) {
                    this.f33997a = i14;
                    this.f33999c = (int) (i13 * 0.75f);
                    this.f34000d = objArr3;
                    return;
                }
                do {
                    length--;
                    obj2 = objArr2[length];
                } while (obj2 == null);
                int hashCode2 = obj2.hashCode() * (-1640531527);
                int i16 = (hashCode2 ^ (hashCode2 >>> 16)) & i14;
                if (objArr3[i16] == null) {
                    objArr3[i16] = objArr2[length];
                    i12 = i15;
                }
                do {
                    i16 = (i16 + 1) & i14;
                } while (objArr3[i16] != null);
                objArr3[i16] = objArr2[length];
                i12 = i15;
            }
        }
    }

    public final void b(int i10, int i11, Object[] objArr) {
        int i12;
        Object obj;
        this.f33998b--;
        while (true) {
            int i13 = i10 + 1;
            while (true) {
                i12 = i13 & i11;
                obj = objArr[i12];
                if (obj == null) {
                    objArr[i10] = null;
                    return;
                }
                int hashCode = obj.hashCode() * (-1640531527);
                int i14 = (hashCode ^ (hashCode >>> 16)) & i11;
                if (i10 <= i12) {
                    if (i10 < i14 && i14 <= i12) {
                        i13 = i12 + 1;
                    }
                } else {
                    if (i10 >= i14 && i14 > i12) {
                        break;
                    }
                    i13 = i12 + 1;
                }
            }
            objArr[i10] = obj;
            i10 = i12;
        }
    }
}
