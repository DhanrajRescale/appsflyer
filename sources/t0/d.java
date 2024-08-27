package t0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f34969a;

    public d(int i10) {
        this.f34969a = i10;
    }

    public final boolean a() {
        return this.f34969a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{ location = ");
        return nn.d.m(sb2, this.f34969a, " }");
    }
}
