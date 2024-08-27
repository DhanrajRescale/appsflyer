package h0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends a {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!Intrinsics.a(this.f17794a, gVar.f17794a)) {
            return false;
        }
        if (!Intrinsics.a(this.f17795b, gVar.f17795b)) {
            return false;
        }
        if (!Intrinsics.a(this.f17796c, gVar.f17796c)) {
            return false;
        }
        if (Intrinsics.a(this.f17797d, gVar.f17797d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17797d.hashCode() + ((this.f17796c.hashCode() + ((this.f17795b.hashCode() + (this.f17794a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f17794a + ", topEnd = " + this.f17795b + ", bottomEnd = " + this.f17796c + ", bottomStart = " + this.f17797d + ')';
    }
}
