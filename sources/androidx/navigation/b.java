package androidx.navigation;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends c0 {

    /* renamed from: k, reason: collision with root package name */
    public Intent f2152k;

    /* renamed from: l, reason: collision with root package name */
    public String f2153l;

    public static String m(Context context, String str) {
        if (str != null) {
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            return kotlin.text.s.n(str, "${applicationId}", packageName, false);
        }
        return null;
    }

    @Override // androidx.navigation.c0
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b) || !super.equals(obj)) {
            return false;
        }
        Intent intent = this.f2152k;
        if (intent != null) {
            if (!intent.filterEquals(((b) obj).f2152k)) {
                return false;
            }
        } else if (((b) obj).f2152k != null) {
            return false;
        }
        if (!Intrinsics.a(this.f2153l, ((b) obj).f2153l)) {
            return false;
        }
        return true;
    }

    @Override // androidx.navigation.c0
    public final int hashCode() {
        int i10;
        int hashCode = super.hashCode() * 31;
        Intent intent = this.f2152k;
        int i11 = 0;
        if (intent != null) {
            i10 = intent.filterHashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str = this.f2153l;
        if (str != null) {
            i11 = str.hashCode();
        }
        return i12 + i11;
    }

    @Override // androidx.navigation.c0
    public final void k(Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.k(context, attrs);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, y0.f2344a);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "context.resources.obtain…tyNavigator\n            )");
        String m10 = m(context, obtainAttributes.getString(4));
        if (this.f2152k == null) {
            this.f2152k = new Intent();
        }
        Intent intent = this.f2152k;
        Intrinsics.c(intent);
        intent.setPackage(m10);
        String string = obtainAttributes.getString(0);
        if (string != null) {
            if (string.charAt(0) == '.') {
                string = context.getPackageName() + string;
            }
            ComponentName componentName = new ComponentName(context, string);
            if (this.f2152k == null) {
                this.f2152k = new Intent();
            }
            Intent intent2 = this.f2152k;
            Intrinsics.c(intent2);
            intent2.setComponent(componentName);
        }
        String string2 = obtainAttributes.getString(1);
        if (this.f2152k == null) {
            this.f2152k = new Intent();
        }
        Intent intent3 = this.f2152k;
        Intrinsics.c(intent3);
        intent3.setAction(string2);
        String m11 = m(context, obtainAttributes.getString(2));
        if (m11 != null) {
            Uri parse = Uri.parse(m11);
            if (this.f2152k == null) {
                this.f2152k = new Intent();
            }
            Intent intent4 = this.f2152k;
            Intrinsics.c(intent4);
            intent4.setData(parse);
        }
        this.f2153l = m(context, obtainAttributes.getString(3));
        obtainAttributes.recycle();
    }

    @Override // androidx.navigation.c0
    public final String toString() {
        ComponentName componentName;
        Intent intent = this.f2152k;
        String str = null;
        if (intent != null) {
            componentName = intent.getComponent();
        } else {
            componentName = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (componentName != null) {
            sb2.append(" class=");
            sb2.append(componentName.getClassName());
        } else {
            Intent intent2 = this.f2152k;
            if (intent2 != null) {
                str = intent2.getAction();
            }
            if (str != null) {
                sb2.append(" action=");
                sb2.append(str);
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "sb.toString()");
        return sb3;
    }
}
