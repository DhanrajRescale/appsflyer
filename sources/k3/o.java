package k3;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class o implements q6.e {

    /* renamed from: d, reason: collision with root package name */
    public int f22021d;

    /* renamed from: a, reason: collision with root package name */
    public int f22018a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f22019b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f22020c = 0;

    /* renamed from: e, reason: collision with root package name */
    public Object f22022e = new int[16];

    public o() {
        this.f22021d = r0.length - 1;
    }

    @Override // q6.e
    public int a() {
        return -1;
    }

    @Override // q6.e
    public int b() {
        return this.f22018a;
    }

    @Override // q6.e
    public int c() {
        int i10 = this.f22019b;
        if (i10 == 8) {
            return ((e5.p) this.f22022e).u();
        }
        if (i10 == 16) {
            return ((e5.p) this.f22022e).z();
        }
        int i11 = this.f22020c;
        this.f22020c = i11 + 1;
        if (i11 % 2 == 0) {
            int u10 = ((e5.p) this.f22022e).u();
            this.f22021d = u10;
            return (u10 & 240) >> 4;
        }
        return this.f22021d & 15;
    }

    public void d(int i10) {
        int i11 = this.f22020c;
        Object obj = this.f22022e;
        if (i11 == ((int[]) obj).length) {
            int[] iArr = (int[]) obj;
            int length = iArr.length << 1;
            if (length >= 0) {
                int[] iArr2 = new int[length];
                int length2 = iArr.length;
                int i12 = this.f22018a;
                int i13 = length2 - i12;
                System.arraycopy(iArr, i12, iArr2, 0, i13);
                System.arraycopy((int[]) this.f22022e, 0, iArr2, i13, i12);
                this.f22018a = 0;
                this.f22019b = this.f22020c - 1;
                this.f22022e = iArr2;
                this.f22021d = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i14 = (this.f22019b + 1) & this.f22021d;
        this.f22019b = i14;
        ((int[]) this.f22022e)[i14] = i10;
        this.f22020c++;
    }

    public void e() {
        this.f22018a = 0;
        this.f22019b = -1;
        this.f22020c = 0;
    }

    public int f() {
        int i10 = this.f22020c;
        if (i10 != 0) {
            int[] iArr = (int[]) this.f22022e;
            int i11 = this.f22018a;
            int i12 = iArr[i11];
            this.f22018a = (i11 + 1) & this.f22021d;
            this.f22020c = i10 - 1;
            return i12;
        }
        throw new NoSuchElementException();
    }
}
