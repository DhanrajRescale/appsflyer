package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a(3);

    /* renamed from: a, reason: collision with root package name */
    public int f822a;

    /* renamed from: b, reason: collision with root package name */
    public int f823b;

    /* renamed from: c, reason: collision with root package name */
    public int f824c;

    /* renamed from: d, reason: collision with root package name */
    public int f825d;

    /* renamed from: e, reason: collision with root package name */
    public int f826e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f822a);
        parcel.writeInt(this.f824c);
        parcel.writeInt(this.f825d);
        parcel.writeInt(this.f826e);
        parcel.writeInt(this.f823b);
    }
}
