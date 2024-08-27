package n7;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f28350a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f28351b;

    /* renamed from: c, reason: collision with root package name */
    public final List f28352c;

    public e(List list, String str, boolean z10) {
        this.f28350a = str;
        this.f28351b = z10;
        this.f28352c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f28351b != eVar.f28351b || !this.f28352c.equals(eVar.f28352c)) {
            return false;
        }
        String str = this.f28350a;
        boolean startsWith = str.startsWith("index_");
        String str2 = eVar.f28350a;
        if (startsWith) {
            return str2.startsWith("index_");
        }
        return str.equals(str2);
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f28350a;
        if (str.startsWith("index_")) {
            hashCode = -1184239155;
        } else {
            hashCode = str.hashCode();
        }
        return this.f28352c.hashCode() + (((hashCode * 31) + (this.f28351b ? 1 : 0)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f28350a + "', unique=" + this.f28351b + ", columns=" + this.f28352c + UrlTreeKt.componentParamSuffixChar;
    }
}
