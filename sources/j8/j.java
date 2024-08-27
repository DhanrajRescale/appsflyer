package j8;

import androidx.work.g0;
import androidx.work.h0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public String f21067a;

    /* renamed from: b, reason: collision with root package name */
    public g0 f21068b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.work.k f21069c;

    /* renamed from: d, reason: collision with root package name */
    public int f21070d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f21071e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f21072f;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, androidx.work.h0] */
    public final h0 a() {
        androidx.work.k kVar;
        ArrayList arrayList = this.f21072f;
        if (arrayList != null && !arrayList.isEmpty()) {
            kVar = (androidx.work.k) this.f21072f.get(0);
        } else {
            kVar = androidx.work.k.f2621c;
        }
        UUID fromString = UUID.fromString(this.f21067a);
        g0 g0Var = this.f21068b;
        androidx.work.k kVar2 = this.f21069c;
        ArrayList arrayList2 = this.f21071e;
        int i10 = this.f21070d;
        ?? obj = new Object();
        obj.f2576a = fromString;
        obj.f2577b = g0Var;
        obj.f2578c = kVar2;
        obj.f2579d = new HashSet(arrayList2);
        obj.f2580e = kVar;
        obj.f2581f = i10;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f21070d != jVar.f21070d) {
            return false;
        }
        String str = this.f21067a;
        if (str == null ? jVar.f21067a != null : !str.equals(jVar.f21067a)) {
            return false;
        }
        if (this.f21068b != jVar.f21068b) {
            return false;
        }
        androidx.work.k kVar = this.f21069c;
        if (kVar == null ? jVar.f21069c != null : !kVar.equals(jVar.f21069c)) {
            return false;
        }
        ArrayList arrayList = this.f21071e;
        if (arrayList == null ? jVar.f21071e != null : !arrayList.equals(jVar.f21071e)) {
            return false;
        }
        ArrayList arrayList2 = this.f21072f;
        ArrayList arrayList3 = jVar.f21072f;
        if (arrayList2 != null) {
            return arrayList2.equals(arrayList3);
        }
        if (arrayList3 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        String str = this.f21067a;
        int i14 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = i10 * 31;
        g0 g0Var = this.f21068b;
        if (g0Var != null) {
            i11 = g0Var.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        androidx.work.k kVar = this.f21069c;
        if (kVar != null) {
            i12 = kVar.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (((i16 + i12) * 31) + this.f21070d) * 31;
        ArrayList arrayList = this.f21071e;
        if (arrayList != null) {
            i13 = arrayList.hashCode();
        } else {
            i13 = 0;
        }
        int i18 = (i17 + i13) * 31;
        ArrayList arrayList2 = this.f21072f;
        if (arrayList2 != null) {
            i14 = arrayList2.hashCode();
        }
        return i18 + i14;
    }
}
