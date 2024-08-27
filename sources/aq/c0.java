package aq;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes2.dex */
public final class c0 implements SafeParcelable {
    public static final Parcelable.Creator<c0> CREATOR = new com.google.android.material.datepicker.a(12);

    /* renamed from: a, reason: collision with root package name */
    public final String f2690a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2691b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2692c;

    public c0(boolean z10) {
        this.f2692c = z10;
        this.f2691b = null;
        this.f2690a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f2690a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f2691b, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f2692c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public c0(String str, String str2, boolean z10) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        this.f2690a = str;
        this.f2691b = str2;
        n.c(str2);
        this.f2692c = z10;
    }
}
