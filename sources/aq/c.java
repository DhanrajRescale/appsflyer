package aq;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class c extends zp.m {
    public static final Parcelable.Creator<c> CREATOR = new com.google.android.material.datepicker.a(9);

    /* renamed from: a, reason: collision with root package name */
    public final List f2684a;

    /* renamed from: b, reason: collision with root package name */
    public final d f2685b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2686c;

    /* renamed from: d, reason: collision with root package name */
    public final zp.d0 f2687d;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f2688e;

    /* renamed from: f, reason: collision with root package name */
    public final List f2689f;

    public c(ArrayList arrayList, d dVar, String str, zp.d0 d0Var, g0 g0Var, ArrayList arrayList2) {
        this.f2684a = (List) Preconditions.checkNotNull(arrayList);
        this.f2685b = (d) Preconditions.checkNotNull(dVar);
        this.f2686c = Preconditions.checkNotEmpty(str);
        this.f2687d = d0Var;
        this.f2688e = g0Var;
        this.f2689f = (List) Preconditions.checkNotNull(arrayList2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.f2684a, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f2685b, i10, false);
        SafeParcelWriter.writeString(parcel, 3, this.f2686c, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f2687d, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f2688e, i10, false);
        SafeParcelWriter.writeTypedList(parcel, 6, this.f2689f, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
