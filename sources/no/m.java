package no;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import m.f3;

/* loaded from: classes2.dex */
public final class m extends k4.b {
    public static final Parcelable.Creator<m> CREATOR = new f3(14);

    /* renamed from: c, reason: collision with root package name */
    public Bundle f29069c;

    @Override // k4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f22040a, i10);
        parcel.writeBundle(this.f29069c);
    }
}
