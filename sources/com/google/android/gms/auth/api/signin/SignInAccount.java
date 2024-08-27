package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import okhttp3.HttpUrl;

@SafeParcelable.Class(creator = "SignInAccountCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new zzd();

    @SafeParcelable.Field(defaultValue = HttpUrl.FRAGMENT_ENCODE_SET, id = 4)
    @Deprecated
    private String zzcd;

    @SafeParcelable.Field(getter = "getGoogleSignInAccount", id = 7)
    private GoogleSignInAccount zzce;

    @SafeParcelable.Field(defaultValue = HttpUrl.FRAGMENT_ENCODE_SET, id = 8)
    @Deprecated
    private String zzcf;

    @SafeParcelable.Constructor
    public SignInAccount(@SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 7) GoogleSignInAccount googleSignInAccount, @SafeParcelable.Param(id = 8) String str2) {
        this.zzce = googleSignInAccount;
        this.zzcd = Preconditions.checkNotEmpty(str, "8.3 and 8.4 SDKs require non-null email");
        this.zzcf = Preconditions.checkNotEmpty(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final GoogleSignInAccount getGoogleSignInAccount() {
        return this.zzce;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 4, this.zzcd, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzce, i10, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzcf, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
