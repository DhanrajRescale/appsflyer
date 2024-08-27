package zp;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.p002firebaseauthapi.zzap;

/* loaded from: classes2.dex */
public final class f extends d {

    @NonNull
    public static final Parcelable.Creator<f> CREATOR = new com.google.android.material.datepicker.a(27);

    /* renamed from: a, reason: collision with root package name */
    public final String f42740a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42741b;

    /* renamed from: c, reason: collision with root package name */
    public final String f42742c;

    /* renamed from: d, reason: collision with root package name */
    public String f42743d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f42744e;

    public f(String str, String str2, String str3, String str4, boolean z10) {
        this.f42740a = Preconditions.checkNotEmpty(str);
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f42741b = str2;
        this.f42742c = str3;
        this.f42743d = str4;
        this.f42744e = z10;
    }

    public static boolean S(String str) {
        c cVar;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        zzap zzapVar = c.f42722d;
        Preconditions.checkNotEmpty(str);
        try {
            cVar = new c(str);
        } catch (IllegalArgumentException unused) {
            cVar = null;
        }
        if (cVar != null) {
            zzap zzapVar2 = c.f42722d;
            String str2 = cVar.f42724b;
            if (zzapVar2.containsKey(str2) && ((Integer) zzapVar2.get(str2)).intValue() == 4) {
                return true;
            }
        }
        return false;
    }

    @Override // zp.d
    public final String J() {
        return "password";
    }

    @Override // zp.d
    public final d R() {
        return new f(this.f42740a, this.f42741b, this.f42742c, this.f42743d, this.f42744e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f42740a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f42741b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f42742c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f42743d, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f42744e);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
