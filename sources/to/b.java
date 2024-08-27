package to;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f36227a;

    /* renamed from: b, reason: collision with root package name */
    public final float f36228b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f36227a;
            f10 += ((b) cVar).f36228b;
        }
        this.f36227a = cVar;
        this.f36228b = f10;
    }

    @Override // to.c
    public final float a(RectF rectF) {
        return Math.max(s0.g.f34069a, this.f36227a.a(rectF) + this.f36228b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f36227a.equals(bVar.f36227a) && this.f36228b == bVar.f36228b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f36227a, Float.valueOf(this.f36228b)});
    }
}
