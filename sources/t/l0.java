package t;

/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f34880a = new Object();

    public static final void a(k0 k0Var) {
        int i10 = k0Var.f34878d;
        int[] iArr = k0Var.f34876b;
        Object[] objArr = k0Var.f34877c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f34880a) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        k0Var.f34875a = false;
        k0Var.f34878d = i11;
    }
}
