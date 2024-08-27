package p2;

import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class f implements i {
    @Override // p2.i
    public final void a(k kVar) {
        kVar.d(0, kVar.f30582a.a(), HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public final boolean equals(Object obj) {
        return obj instanceof f;
    }

    public final int hashCode() {
        return iu.a0.a(f.class).hashCode();
    }

    public final String toString() {
        return "DeleteAllCommand()";
    }
}
