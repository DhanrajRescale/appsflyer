package os;

import android.view.View;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f30292a;

    public b(View view, String str) {
        this.f30292a = view.hashCode() ^ str.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b) || this.f30292a != obj.hashCode()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f30292a;
    }
}
