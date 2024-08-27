package z8;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.Intrinsics;
import n8.l;

/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: b, reason: collision with root package name */
    public final Context f42177b;

    public c(Context context) {
        this.f42177b = context;
    }

    @Override // z8.h
    public final Object d(l lVar) {
        DisplayMetrics displayMetrics = this.f42177b.getResources().getDisplayMetrics();
        a aVar = new a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new g(aVar, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            if (Intrinsics.a(this.f42177b, ((c) obj).f42177b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f42177b.hashCode();
    }
}
