package to;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f36226a;

    public a(float f10) {
        this.f36226a = f10;
    }

    @Override // to.c
    public final float a(RectF rectF) {
        return this.f36226a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.f36226a == ((a) obj).f36226a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f36226a)});
    }
}
