package hr;

import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f18684a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18685b;

    public a(String str, String str2) {
        if (str != null) {
            this.f18684a = str;
            if (str2 != null) {
                this.f18685b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f18684a.equals(aVar.f18684a) && this.f18685b.equals(aVar.f18685b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f18684a.hashCode() ^ 1000003) * 1000003) ^ this.f18685b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f18684a);
        sb2.append(", version=");
        return nn.d.o(sb2, this.f18685b, UrlTreeKt.componentParamSuffix);
    }
}
