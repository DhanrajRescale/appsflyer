package aq;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

/* loaded from: classes2.dex */
public final class d extends zp.m {
    public static final Parcelable.Creator<d> CREATOR = new com.google.android.material.datepicker.a(10);

    /* renamed from: a, reason: collision with root package name */
    public String f2693a;

    /* renamed from: b, reason: collision with root package name */
    public String f2694b;

    /* renamed from: c, reason: collision with root package name */
    public List f2695c;

    /* renamed from: d, reason: collision with root package name */
    public List f2696d;

    /* renamed from: e, reason: collision with root package name */
    public g0 f2697e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f2693a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f2694b, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f2695c, false);
        SafeParcelWriter.writeTypedList(parcel, 4, this.f2696d, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f2697e, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
