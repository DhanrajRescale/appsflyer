package os;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f30358a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f30359b;

    /* renamed from: c, reason: collision with root package name */
    public final q.h f30360c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30361d;

    public m(String str, Class cls, q.h hVar, String str2) {
        this.f30358a = str;
        this.f30359b = cls;
        this.f30360c = hVar;
        this.f30361d = str2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[PropertyDescription ");
        sb2.append(this.f30358a);
        sb2.append(",");
        sb2.append(this.f30359b);
        sb2.append(", ");
        sb2.append(this.f30360c);
        sb2.append("/");
        return nn.d.o(sb2, this.f30361d, "]");
    }
}
