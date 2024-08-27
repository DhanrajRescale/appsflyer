package ls;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class e1 extends f1 {
    public static final Parcelable.Creator<e1> CREATOR = new zq.c(15);

    /* renamed from: a, reason: collision with root package name */
    public final a0 f25182a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25183b;

    public e1(Bundle bundle) {
        this.f25182a = (a0) bundle.getParcelable("com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.INAPP_KEY");
        this.f25183b = bundle.getInt("com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.HIGHLIGHT_KEY");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.INAPP_KEY", this.f25182a);
        bundle.putInt("com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.HIGHLIGHT_KEY", this.f25183b);
        parcel.writeBundle(bundle);
    }

    public e1(a0 a0Var, int i10) {
        this.f25182a = a0Var;
        this.f25183b = i10;
    }
}
