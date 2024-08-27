package gl;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f17486a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17487b;

    public n(String str, boolean z10) {
        this.f17486a = str;
        this.f17487b = z10;
    }

    public final String toString() {
        String str;
        if (this.f17487b) {
            str = "Applink";
        } else {
            str = "Unclassified";
        }
        String str2 = this.f17486a;
        if (str2 != null) {
            return str + '(' + ((Object) str2) + ')';
        }
        return str;
    }
}
