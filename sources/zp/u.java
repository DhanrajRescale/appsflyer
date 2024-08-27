package zp;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes2.dex */
public final class u extends d {

    @NonNull
    public static final Parcelable.Creator<u> CREATOR = new com.google.android.material.datepicker.a(20);

    /* renamed from: a, reason: collision with root package name */
    public final String f42783a;

    public u(String str) {
        this.f42783a = Preconditions.checkNotEmpty(str);
    }

    @Override // zp.d
    public final String J() {
        return "playgames.google.com";
    }

    @Override // zp.d
    public final d R() {
        return new u(this.f42783a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f42783a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
