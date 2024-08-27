package zp;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.p002firebaseauthapi.zzvz;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class t extends l {

    @NonNull
    public static final Parcelable.Creator<t> CREATOR = new com.google.android.material.datepicker.a(19);

    /* renamed from: a, reason: collision with root package name */
    public final String f42779a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42780b;

    /* renamed from: c, reason: collision with root package name */
    public final long f42781c;

    /* renamed from: d, reason: collision with root package name */
    public final String f42782d;

    public t(long j10, String str, String str2, String str3) {
        this.f42779a = Preconditions.checkNotEmpty(str);
        this.f42780b = str2;
        this.f42781c = j10;
        this.f42782d = Preconditions.checkNotEmpty(str3);
    }

    @Override // zp.l
    public final String J() {
        return "phone";
    }

    @Override // zp.l
    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f42779a);
            jSONObject.putOpt("displayName", this.f42780b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f42781c));
            jSONObject.putOpt("phoneNumber", this.f42782d);
            return jSONObject;
        } catch (JSONException e10) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzvz(e10);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f42779a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f42780b, false);
        SafeParcelWriter.writeLong(parcel, 3, this.f42781c);
        SafeParcelWriter.writeString(parcel, 4, this.f42782d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
