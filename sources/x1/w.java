package x1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final long f39927a;

    /* renamed from: b, reason: collision with root package name */
    public final long f39928b;

    /* renamed from: c, reason: collision with root package name */
    public final long f39929c;

    /* renamed from: d, reason: collision with root package name */
    public final long f39930d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f39931e;

    /* renamed from: f, reason: collision with root package name */
    public final float f39932f;

    /* renamed from: g, reason: collision with root package name */
    public final int f39933g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f39934h;

    /* renamed from: i, reason: collision with root package name */
    public final List f39935i;

    /* renamed from: j, reason: collision with root package name */
    public final long f39936j;

    /* renamed from: k, reason: collision with root package name */
    public final long f39937k;

    public w(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, ArrayList arrayList, long j14, long j15) {
        this.f39927a = j10;
        this.f39928b = j11;
        this.f39929c = j12;
        this.f39930d = j13;
        this.f39931e = z10;
        this.f39932f = f10;
        this.f39933g = i10;
        this.f39934h = z11;
        this.f39935i = arrayList;
        this.f39936j = j14;
        this.f39937k = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return s.a(this.f39927a, wVar.f39927a) && this.f39928b == wVar.f39928b && m1.c.b(this.f39929c, wVar.f39929c) && m1.c.b(this.f39930d, wVar.f39930d) && this.f39931e == wVar.f39931e && Float.compare(this.f39932f, wVar.f39932f) == 0 && r.b(this.f39933g, wVar.f39933g) && this.f39934h == wVar.f39934h && Intrinsics.a(this.f39935i, wVar.f39935i) && m1.c.b(this.f39936j, wVar.f39936j) && m1.c.b(this.f39937k, wVar.f39937k);
    }

    public final int hashCode() {
        int c10 = v.e.c(this.f39928b, Long.hashCode(this.f39927a) * 31, 31);
        int i10 = m1.c.f27236e;
        return Long.hashCode(this.f39937k) + v.e.c(this.f39936j, nn.d.e(this.f39935i, v.e.d(this.f39934h, da.e.f(this.f39933g, v.e.a(this.f39932f, v.e.d(this.f39931e, v.e.c(this.f39930d, v.e.c(this.f39929c, c10, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PointerInputEventData(id=");
        sb2.append((Object) s.b(this.f39927a));
        sb2.append(", uptime=");
        sb2.append(this.f39928b);
        sb2.append(", positionOnScreen=");
        sb2.append((Object) m1.c.j(this.f39929c));
        sb2.append(", position=");
        sb2.append((Object) m1.c.j(this.f39930d));
        sb2.append(", down=");
        sb2.append(this.f39931e);
        sb2.append(", pressure=");
        sb2.append(this.f39932f);
        sb2.append(", type=");
        int i10 = this.f39933g;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        str = "Unknown";
                    } else {
                        str = "Eraser";
                    }
                } else {
                    str = "Stylus";
                }
            } else {
                str = "Mouse";
            }
        } else {
            str = "Touch";
        }
        sb2.append((Object) str);
        sb2.append(", issuesEnterExit=");
        sb2.append(this.f39934h);
        sb2.append(", historical=");
        sb2.append(this.f39935i);
        sb2.append(", scrollDelta=");
        sb2.append((Object) m1.c.j(this.f39936j));
        sb2.append(", originalEventPosition=");
        sb2.append((Object) m1.c.j(this.f39937k));
        sb2.append(')');
        return sb2.toString();
    }
}
