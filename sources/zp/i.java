package zp;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes2.dex */
public final class i extends d {

    @NonNull
    public static final Parcelable.Creator<i> CREATOR = new com.google.android.material.datepicker.a(16);

    /* renamed from: a, reason: collision with root package name */
    public final String f42759a;

    public i(String str) {
        this.f42759a = Preconditions.checkNotEmpty(str);
    }

    @Override // zp.d
    public final String J() {
        return "github.com";
    }

    @Override // zp.d
    public final d R() {
        return new i(this.f42759a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f42759a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
