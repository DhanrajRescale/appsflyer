package no;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import m.f3;

/* loaded from: classes2.dex */
public final class j extends k4.b {
    public static final Parcelable.Creator<j> CREATOR = new f3(13);

    /* renamed from: c, reason: collision with root package name */
    public Bundle f29062c;

    public j(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f29062c = parcel.readBundle(classLoader == null ? j.class.getClassLoader() : classLoader);
    }

    @Override // k4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f22040a, i10);
        parcel.writeBundle(this.f29062c);
    }
}
