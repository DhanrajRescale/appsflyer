package to;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class j implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f36277a;

    public j(float f10) {
        this.f36277a = f10;
    }

    @Override // to.c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f36277a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j) && this.f36277a == ((j) obj).f36277a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f36277a)});
    }
}
