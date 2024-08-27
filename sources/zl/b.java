package zl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import zi.j;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new j(20);

    /* renamed from: a, reason: collision with root package name */
    public final String f42555a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f42556b;

    public b(Parcel parcel) {
        this.f42555a = parcel.readString();
        this.f42556b = parcel.readBundle(b.class.getClassLoader());
    }

    public final Bundle a() {
        return new Bundle(this.f42556b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            return this.f42555a.equals(((b) obj).f42555a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42555a.hashCode();
    }

    public final String toString() {
        return "IdpConfig{mProviderId='" + this.f42555a + "', mParams=" + this.f42556b + UrlTreeKt.componentParamSuffixChar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f42555a);
        parcel.writeBundle(this.f42556b);
    }
}
