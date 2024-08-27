package za;

import android.os.Bundle;
import androidx.navigation.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f42210a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f42211b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f42212c;

    public /* synthetic */ c(boolean z10, int i10) {
        this((i10 & 1) == 0, (i10 & 2) != 0 ? false : z10, false);
    }

    @NotNull
    public static final c fromBundle(@NotNull Bundle bundle) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (da.e.y(bundle, "bundle", c.class, "skipIntro")) {
            z10 = bundle.getBoolean("skipIntro");
        } else {
            z10 = false;
        }
        if (bundle.containsKey("isForcedLogout")) {
            z11 = bundle.getBoolean("isForcedLogout");
        } else {
            z11 = false;
        }
        if (bundle.containsKey("invalidSession")) {
            z12 = bundle.getBoolean("invalidSession");
        }
        return new c(z10, z11, z12);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("skipIntro", this.f42210a);
        bundle.putBoolean("isForcedLogout", this.f42211b);
        bundle.putBoolean("invalidSession", this.f42212c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f42210a == cVar.f42210a && this.f42211b == cVar.f42211b && this.f42212c == cVar.f42212c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42212c) + v.e.d(this.f42211b, Boolean.hashCode(this.f42210a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntroFragmentArgs(skipIntro=");
        sb2.append(this.f42210a);
        sb2.append(", isForcedLogout=");
        sb2.append(this.f42211b);
        sb2.append(", invalidSession=");
        return da.e.o(sb2, this.f42212c, ")");
    }

    public c(boolean z10, boolean z11, boolean z12) {
        this.f42210a = z10;
        this.f42211b = z11;
        this.f42212c = z12;
    }
}
