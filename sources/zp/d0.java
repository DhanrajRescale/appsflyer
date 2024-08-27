package zp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.p002firebaseauthapi.zzac;
import com.google.android.gms.internal.p002firebaseauthapi.zzaec;

/* loaded from: classes2.dex */
public final class d0 extends n {
    public static final Parcelable.Creator<d0> CREATOR = new com.google.android.material.datepicker.a(26);

    /* renamed from: a, reason: collision with root package name */
    public final String f42730a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42731b;

    /* renamed from: c, reason: collision with root package name */
    public final String f42732c;

    /* renamed from: d, reason: collision with root package name */
    public final zzaec f42733d;

    /* renamed from: e, reason: collision with root package name */
    public final String f42734e;

    /* renamed from: f, reason: collision with root package name */
    public final String f42735f;

    /* renamed from: g, reason: collision with root package name */
    public final String f42736g;

    public d0(String str, String str2, String str3, zzaec zzaecVar, String str4, String str5, String str6) {
        this.f42730a = zzac.zzc(str);
        this.f42731b = str2;
        this.f42732c = str3;
        this.f42733d = zzaecVar;
        this.f42734e = str4;
        this.f42735f = str5;
        this.f42736g = str6;
    }

    public static d0 S(zzaec zzaecVar) {
        Preconditions.checkNotNull(zzaecVar, "Must specify a non-null webSignInCredential");
        return new d0(null, null, null, zzaecVar, null, null, null);
    }

    @Override // zp.d
    public final String J() {
        return this.f42730a;
    }

    @Override // zp.d
    public final d R() {
        return new d0(this.f42730a, this.f42731b, this.f42732c, this.f42733d, this.f42734e, this.f42735f, this.f42736g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f42730a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f42731b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f42732c, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f42733d, i10, false);
        SafeParcelWriter.writeString(parcel, 5, this.f42734e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f42735f, false);
        SafeParcelWriter.writeString(parcel, 7, this.f42736g, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
