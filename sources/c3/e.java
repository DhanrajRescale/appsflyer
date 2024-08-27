package c3;

/* loaded from: classes.dex */
public class e implements c4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7921a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f7922b;

    /* renamed from: c, reason: collision with root package name */
    public int f7923c;

    public e(int i10, int i11) {
        this.f7921a = i11;
        if (i11 != 1) {
            if (i10 > 0) {
                this.f7922b = new Object[i10];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        if (i10 > 0) {
            this.f7922b = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // c4.e
    public boolean b(Object obj) {
        int i10 = this.f7921a;
        Object[] objArr = this.f7922b;
        switch (i10) {
            case 0:
                int i11 = this.f7923c;
                if (i11 >= objArr.length) {
                    return false;
                }
                objArr[i11] = obj;
                this.f7923c = i11 + 1;
                return true;
            default:
                int i12 = 0;
                while (true) {
                    int i13 = this.f7923c;
                    if (i12 < i13) {
                        if (objArr[i12] != obj) {
                            i12++;
                        } else {
                            throw new IllegalStateException("Already in the pool!");
                        }
                    } else {
                        if (i13 >= objArr.length) {
                            return false;
                        }
                        objArr[i13] = obj;
                        this.f7923c = i13 + 1;
                        return true;
                    }
                }
        }
    }

    @Override // c4.e
    public Object c() {
        int i10 = this.f7921a;
        Object[] objArr = this.f7922b;
        switch (i10) {
            case 0:
                int i11 = this.f7923c;
                if (i11 <= 0) {
                    return null;
                }
                int i12 = i11 - 1;
                Object obj = objArr[i12];
                objArr[i12] = null;
                this.f7923c = i12;
                return obj;
            default:
                int i13 = this.f7923c;
                if (i13 <= 0) {
                    return null;
                }
                int i14 = i13 - 1;
                Object obj2 = objArr[i14];
                objArr[i14] = null;
                this.f7923c = i14;
                return obj2;
        }
    }
}
