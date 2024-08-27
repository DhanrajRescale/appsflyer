package zp;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.p002firebaseauthapi.zzaea;
import com.google.android.gms.internal.p002firebaseauthapi.zzvz;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c0 extends l {
    public static final Parcelable.Creator<c0> CREATOR = new com.google.android.material.datepicker.a(21);

    /* renamed from: a, reason: collision with root package name */
    public final String f42726a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42727b;

    /* renamed from: c, reason: collision with root package name */
    public final long f42728c;

    /* renamed from: d, reason: collision with root package name */
    public final zzaea f42729d;

    public c0(String str, String str2, long j10, zzaea zzaeaVar) {
        this.f42726a = Preconditions.checkNotEmpty(str);
        this.f42727b = str2;
        this.f42728c = j10;
        this.f42729d = (zzaea) Preconditions.checkNotNull(zzaeaVar, "totpInfo cannot not be null.");
    }

    @Override // zp.l
    public final String J() {
        return "totp";
    }

    @Override // zp.l
    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.f42726a);
            jSONObject.putOpt("displayName", this.f42727b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f42728c));
            jSONObject.putOpt("totpInfo", this.f42729d);
            return jSONObject;
        } catch (JSONException e10) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new zzvz(e10);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f42726a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f42727b, false);
        SafeParcelWriter.writeLong(parcel, 3, this.f42728c);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f42729d, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
