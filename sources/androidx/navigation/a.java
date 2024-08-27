package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2148a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f2149b = new Bundle();

    public a(int i10) {
        this.f2148a = i10;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        return this.f2149b;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return this.f2148a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.a(a.class, obj.getClass()) && this.f2148a == ((a) obj).f2148a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 31 + this.f2148a;
    }

    public final String toString() {
        return a3.a.i(new StringBuilder("ActionOnlyNavDirections(actionId="), this.f2148a, ')');
    }
}
