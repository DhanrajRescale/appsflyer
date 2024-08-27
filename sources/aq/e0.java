package aq;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.p002firebaseauthapi.zzacv;
import com.google.android.gms.internal.p002firebaseauthapi.zzadj;
import com.google.android.gms.internal.p002firebaseauthapi.zzvz;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e0 extends AbstractSafeParcelable implements zp.w {
    public static final Parcelable.Creator<e0> CREATOR = new com.google.android.material.datepicker.a(14);

    /* renamed from: a, reason: collision with root package name */
    public final String f2702a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2703b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2704c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2705d;

    /* renamed from: e, reason: collision with root package name */
    public Uri f2706e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2707f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2708g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2709h;

    /* renamed from: i, reason: collision with root package name */
    public final String f2710i;

    public e0(zzacv zzacvVar) {
        Preconditions.checkNotNull(zzacvVar);
        Preconditions.checkNotEmpty("firebase");
        this.f2702a = Preconditions.checkNotEmpty(zzacvVar.zzo());
        this.f2703b = "firebase";
        this.f2707f = zzacvVar.zzn();
        this.f2704c = zzacvVar.zzm();
        Uri zzc = zzacvVar.zzc();
        if (zzc != null) {
            this.f2705d = zzc.toString();
            this.f2706e = zzc;
        }
        this.f2709h = zzacvVar.zzs();
        this.f2710i = null;
        this.f2708g = zzacvVar.zzp();
    }

    @Override // zp.w
    public final String b() {
        return this.f2703b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f2702a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f2703b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f2704c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f2705d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f2707f, false);
        SafeParcelWriter.writeString(parcel, 6, this.f2708g, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f2709h);
        SafeParcelWriter.writeString(parcel, 8, this.f2710i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zzb() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f2702a);
            jSONObject.putOpt("providerId", this.f2703b);
            jSONObject.putOpt("displayName", this.f2704c);
            jSONObject.putOpt("photoUrl", this.f2705d);
            jSONObject.putOpt(Scopes.EMAIL, this.f2707f);
            jSONObject.putOpt("phoneNumber", this.f2708g);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f2709h));
            jSONObject.putOpt("rawUserInfo", this.f2710i);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzvz(e10);
        }
    }

    public e0(zzadj zzadjVar) {
        Preconditions.checkNotNull(zzadjVar);
        this.f2702a = zzadjVar.zzd();
        this.f2703b = Preconditions.checkNotEmpty(zzadjVar.zzf());
        this.f2704c = zzadjVar.zzb();
        Uri zza = zzadjVar.zza();
        if (zza != null) {
            this.f2705d = zza.toString();
            this.f2706e = zza;
        }
        this.f2707f = zzadjVar.zzc();
        this.f2708g = zzadjVar.zze();
        this.f2709h = false;
        this.f2710i = zzadjVar.zzg();
    }

    public e0(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, String str7) {
        this.f2702a = str;
        this.f2703b = str2;
        this.f2707f = str3;
        this.f2708g = str4;
        this.f2704c = str5;
        this.f2705d = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.f2706e = Uri.parse(str6);
        }
        this.f2709h = z10;
        this.f2710i = str7;
    }
}
