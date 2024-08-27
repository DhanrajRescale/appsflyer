package zp;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.facebook.FacebookSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes2.dex */
public final class g extends d {

    @NonNull
    public static final Parcelable.Creator<g> CREATOR = new com.google.android.material.datepicker.a(28);

    /* renamed from: a, reason: collision with root package name */
    public final String f42748a;

    public g(String str) {
        this.f42748a = Preconditions.checkNotEmpty(str);
    }

    @Override // zp.d
    public final String J() {
        return FacebookSdk.FACEBOOK_COM;
    }

    @Override // zp.d
    public final d R() {
        return new g(this.f42748a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f42748a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
