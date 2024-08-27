package p9;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f30793c = new e("COMPOSITION");

    /* renamed from: a, reason: collision with root package name */
    public final List f30794a;

    /* renamed from: b, reason: collision with root package name */
    public f f30795b;

    public e(String... strArr) {
        this.f30794a = Arrays.asList(strArr);
    }

    public final boolean a(int i10, String str) {
        boolean z10;
        boolean z11;
        List list = this.f30794a;
        if (i10 >= list.size()) {
            return false;
        }
        if (i10 == list.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str2 = (String) list.get(i10);
        if (!str2.equals("**")) {
            if (!str2.equals(str) && !str2.equals("*")) {
                z11 = false;
            } else {
                z11 = true;
            }
            if ((!z10 && (i10 != list.size() - 2 || !((String) nn.d.g(list, 1)).equals("**"))) || !z11) {
                return false;
            }
            return true;
        }
        if (!z10 && ((String) list.get(i10 + 1)).equals(str)) {
            if (i10 != list.size() - 2 && (i10 != list.size() - 3 || !((String) nn.d.g(list, 1)).equals("**"))) {
                return false;
            }
            return true;
        }
        if (z10) {
            return true;
        }
        int i11 = i10 + 1;
        if (i11 < list.size() - 1) {
            return false;
        }
        return ((String) list.get(i11)).equals(str);
    }

    public final int b(int i10, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.f30794a;
        if (!((String) list.get(i10)).equals("**")) {
            return 1;
        }
        if (i10 == list.size() - 1 || !((String) list.get(i10 + 1)).equals(str)) {
            return 0;
        }
        return 2;
    }

    public final boolean c(int i10, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f30794a;
        if (i10 >= list.size()) {
            return false;
        }
        if (((String) list.get(i10)).equals(str) || ((String) list.get(i10)).equals("**") || ((String) list.get(i10)).equals("*")) {
            return true;
        }
        return false;
    }

    public final boolean d(int i10, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f30794a;
        if (i10 < list.size() - 1 || ((String) list.get(i10)).equals("**")) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f30794a.equals(eVar.f30794a)) {
            return false;
        }
        f fVar = this.f30795b;
        f fVar2 = eVar.f30795b;
        if (fVar != null) {
            return fVar.equals(fVar2);
        }
        if (fVar2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f30794a.hashCode() * 31;
        f fVar = this.f30795b;
        if (fVar != null) {
            i10 = fVar.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public final String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("KeyPath{keys=");
        sb2.append(this.f30794a);
        sb2.append(",resolved=");
        if (this.f30795b != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return v.e.k(sb2, z10, UrlTreeKt.componentParamSuffixChar);
    }

    public e(e eVar) {
        this.f30794a = new ArrayList(eVar.f30794a);
        this.f30795b = eVar.f30795b;
    }
}
