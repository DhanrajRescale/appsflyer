package f7;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.c0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends c0 implements androidx.navigation.f {

    /* renamed from: k, reason: collision with root package name */
    public String f15960k;

    @Override // androidx.navigation.c0
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b) || !super.equals(obj) || !Intrinsics.a(this.f15960k, ((b) obj).f15960k)) {
            return false;
        }
        return true;
    }

    @Override // androidx.navigation.c0
    public final int hashCode() {
        int i10;
        int hashCode = super.hashCode() * 31;
        String str = this.f15960k;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    @Override // androidx.navigation.c0
    public final void k(Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.k(context, attrs);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, j.f15976a);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "context.resources.obtain…ntNavigator\n            )");
        String className = obtainAttributes.getString(0);
        if (className != null) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.f15960k = className;
        }
        obtainAttributes.recycle();
    }
}
