package g2;

import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Resources.Theme f16431a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16432b;

    public c(int i10, Resources.Theme theme) {
        this.f16431a = theme;
        this.f16432b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.a(this.f16431a, cVar.f16431a) && this.f16432b == cVar.f16432b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16432b) + (this.f16431a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Key(theme=");
        sb2.append(this.f16431a);
        sb2.append(", id=");
        return a3.a.i(sb2, this.f16432b, ')');
    }
}
