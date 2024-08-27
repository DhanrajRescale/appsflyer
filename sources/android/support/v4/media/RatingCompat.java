package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import s0.g;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f806a;

    /* renamed from: b, reason: collision with root package name */
    public final float f807b;

    public RatingCompat(int i10, float f10) {
        this.f806a = i10;
        this.f807b = f10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f806a;
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.f806a);
        sb2.append(" rating=");
        float f10 = this.f807b;
        if (f10 < g.f34069a) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f10);
        }
        sb2.append(valueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f806a);
        parcel.writeFloat(this.f807b);
    }
}
