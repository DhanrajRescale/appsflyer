package aq;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes2.dex */
public final class h0 implements SafeParcelable {
    public static final Parcelable.Creator<h0> CREATOR = new com.google.android.material.datepicker.a(8);

    /* renamed from: a, reason: collision with root package name */
    public final long f2728a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2729b;

    public h0(long j10, long j11) {
        this.f2728a = j10;
        this.f2729b = j11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.f2728a);
        SafeParcelWriter.writeLong(parcel, 2, this.f2729b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
