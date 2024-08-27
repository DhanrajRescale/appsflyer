package aq;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

/* loaded from: classes2.dex */
public final class d0 implements zp.e {
    public static final Parcelable.Creator<d0> CREATOR = new com.google.android.material.datepicker.a(13);

    /* renamed from: a, reason: collision with root package name */
    public g0 f2698a;

    /* renamed from: b, reason: collision with root package name */
    public c0 f2699b;

    /* renamed from: c, reason: collision with root package name */
    public zp.d0 f2700c;

    public d0(g0 g0Var) {
        g0 g0Var2 = (g0) Preconditions.checkNotNull(g0Var);
        this.f2698a = g0Var2;
        List list = g0Var2.f2720e;
        this.f2699b = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!TextUtils.isEmpty(((e0) list.get(i10)).f2710i)) {
                this.f2699b = new c0(((e0) list.get(i10)).f2703b, ((e0) list.get(i10)).f2710i, g0Var.f2725j);
            }
        }
        if (this.f2699b == null) {
            this.f2699b = new c0(g0Var.f2725j);
        }
        this.f2700c = g0Var.f2726k;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f2698a, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f2699b, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f2700c, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
