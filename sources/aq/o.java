package aq;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class o extends AbstractSafeParcelable {
    public static final Parcelable.Creator<o> CREATOR = new com.google.android.material.datepicker.a(11);

    /* renamed from: a, reason: collision with root package name */
    public final List f2746a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2747b;

    public o(ArrayList arrayList, ArrayList arrayList2) {
        this.f2746a = arrayList == null ? new ArrayList() : arrayList;
        this.f2747b = arrayList2 == null ? new ArrayList() : arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.f2746a, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.f2747b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
