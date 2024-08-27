package ek;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f15612a;

    public o(String str) {
        this.f15612a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f15612a.equals(((o) obj).f15612a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15612a.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("StringHeaderFactory{value='"), this.f15612a, "'}");
    }
}
