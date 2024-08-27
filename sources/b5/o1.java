package b5;

/* loaded from: classes.dex */
public final class o1 implements k {

    /* renamed from: b, reason: collision with root package name */
    public static final o1 f3561b;

    /* renamed from: a, reason: collision with root package name */
    public final lp.o0 f3562a;

    static {
        lp.l0 l0Var = lp.o0.f25025b;
        f3561b = new o1(lp.j1.f24998e);
        int i10 = e5.x.f15050a;
        Integer.toString(0, 36);
    }

    public o1(lp.o0 o0Var) {
        this.f3562a = lp.o0.q(o0Var);
    }

    public final lp.o0 a() {
        return this.f3562a;
    }

    public final boolean b(int i10) {
        int i11 = 0;
        while (true) {
            lp.o0 o0Var = this.f3562a;
            if (i11 >= o0Var.size()) {
                return false;
            }
            n1 n1Var = (n1) o0Var.get(i11);
            if (n1Var.b() && n1Var.a() == i10) {
                return true;
            }
            i11++;
        }
    }

    public final boolean c() {
        int i10 = 0;
        while (true) {
            lp.o0 o0Var = this.f3562a;
            if (i10 >= o0Var.size()) {
                return false;
            }
            if (((n1) o0Var.get(i10)).a() == 2 && ((n1) o0Var.get(i10)).c()) {
                return true;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            return this.f3562a.equals(((o1) obj).f3562a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3562a.hashCode();
    }
}
