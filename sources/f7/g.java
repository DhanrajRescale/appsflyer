package f7;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.c0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends c0 {

    /* renamed from: k, reason: collision with root package name */
    public String f15971k;

    @Override // androidx.navigation.c0
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof g) || !super.equals(obj) || !Intrinsics.a(this.f15971k, ((g) obj).f15971k)) {
            return false;
        }
        return true;
    }

    @Override // androidx.navigation.c0
    public final int hashCode() {
        int i10;
        int hashCode = super.hashCode() * 31;
        String str = this.f15971k;
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
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, j.f15977b);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
        String className = obtainAttributes.getString(0);
        if (className != null) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.f15971k = className;
        }
        Unit unit = Unit.f23355a;
        obtainAttributes.recycle();
    }

    @Override // androidx.navigation.c0
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" class=");
        String str = this.f15971k;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "sb.toString()");
        return sb3;
    }
}
