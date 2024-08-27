package v1;

import android.view.KeyEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final KeyEvent f37671a;

    public /* synthetic */ b(KeyEvent keyEvent) {
        this.f37671a = keyEvent;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (!Intrinsics.a(this.f37671a, ((b) obj).f37671a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f37671a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f37671a + ')';
    }
}
