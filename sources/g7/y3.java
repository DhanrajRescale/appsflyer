package g7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y3 {

    /* renamed from: a, reason: collision with root package name */
    public final List f17148a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f17149b;

    /* renamed from: c, reason: collision with root package name */
    public final b3 f17150c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17151d;

    public y3(List pages, Integer num, b3 config, int i10) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f17148a = pages;
        this.f17149b = num;
        this.f17150c = config;
        this.f17151d = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y3) {
            y3 y3Var = (y3) obj;
            if (Intrinsics.a(this.f17148a, y3Var.f17148a) && Intrinsics.a(this.f17149b, y3Var.f17149b) && Intrinsics.a(this.f17150c, y3Var.f17150c) && this.f17151d == y3Var.f17151d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f17148a.hashCode();
        Integer num = this.f17149b;
        if (num != null) {
            i10 = num.hashCode();
        } else {
            i10 = 0;
        }
        return Integer.hashCode(this.f17151d) + this.f17150c.hashCode() + hashCode + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PagingState(pages=");
        sb2.append(this.f17148a);
        sb2.append(", anchorPosition=");
        sb2.append(this.f17149b);
        sb2.append(", config=");
        sb2.append(this.f17150c);
        sb2.append(", leadingPlaceholderCount=");
        return a3.a.i(sb2, this.f17151d, ')');
    }
}
