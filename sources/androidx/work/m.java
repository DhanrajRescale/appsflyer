package androidx.work;

import android.app.Notification;
import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f2628a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2629b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f2630c;

    public m(int i10, int i11, Notification notification) {
        this.f2628a = i10;
        this.f2630c = notification;
        this.f2629b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f2628a != mVar.f2628a || this.f2629b != mVar.f2629b) {
            return false;
        }
        return this.f2630c.equals(mVar.f2630c);
    }

    public final int hashCode() {
        return this.f2630c.hashCode() + (((this.f2628a * 31) + this.f2629b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f2628a + ", mForegroundServiceType=" + this.f2629b + ", mNotification=" + this.f2630c + UrlTreeKt.componentParamSuffixChar;
    }
}
