package lp;

/* loaded from: classes2.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f25031a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f25032b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f25033c;

    public p0(Object obj, Object obj2, Object obj3) {
        this.f25031a = obj;
        this.f25032b = obj2;
        this.f25033c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f25031a;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.f25032b);
        String valueOf3 = String.valueOf(obj);
        String valueOf4 = String.valueOf(this.f25033c);
        StringBuilder sb2 = new StringBuilder(valueOf4.length() + valueOf3.length() + valueOf2.length() + valueOf.length() + 39);
        sb2.append("Multiple entries with same key: ");
        sb2.append(valueOf);
        sb2.append("=");
        sb2.append(valueOf2);
        return new IllegalArgumentException(a3.a.k(sb2, " and ", valueOf3, "=", valueOf4));
    }
}
