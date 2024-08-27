package jh;

import jr.h;
import kotlin.jvm.internal.Intrinsics;
import nn.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f21368a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21369b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21370c;

    public a(int i10, String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f21368a = i10;
        this.f21369b = title;
        this.f21370c = description;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f21368a == aVar.f21368a && Intrinsics.a(this.f21369b, aVar.f21369b) && Intrinsics.a(this.f21370c, aVar.f21370c);
    }

    public final int hashCode() {
        return this.f21370c.hashCode() + h.g(this.f21369b, Integer.hashCode(this.f21368a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MaintenanceDataString(number=");
        sb2.append(this.f21368a);
        sb2.append(", title=");
        sb2.append(this.f21369b);
        sb2.append(", description=");
        return d.o(sb2, this.f21370c, ")");
    }
}
