package zp;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes2.dex */
public final class b extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<b> CREATOR = new com.google.android.material.datepicker.a(24);

    /* renamed from: a, reason: collision with root package name */
    public final String f42712a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42713b;

    /* renamed from: c, reason: collision with root package name */
    public final String f42714c;

    /* renamed from: d, reason: collision with root package name */
    public final String f42715d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f42716e;

    /* renamed from: f, reason: collision with root package name */
    public final String f42717f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f42718g;

    /* renamed from: h, reason: collision with root package name */
    public String f42719h;

    /* renamed from: i, reason: collision with root package name */
    public int f42720i;

    /* renamed from: j, reason: collision with root package name */
    public final String f42721j;

    public b(String str, String str2, String str3, String str4, boolean z10, String str5, boolean z11, String str6, int i10, String str7) {
        this.f42712a = str;
        this.f42713b = str2;
        this.f42714c = str3;
        this.f42715d = str4;
        this.f42716e = z10;
        this.f42717f = str5;
        this.f42718g = z11;
        this.f42719h = str6;
        this.f42720i = i10;
        this.f42721j = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f42712a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f42713b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f42714c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f42715d, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f42716e);
        SafeParcelWriter.writeString(parcel, 6, this.f42717f, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f42718g);
        SafeParcelWriter.writeString(parcel, 8, this.f42719h, false);
        SafeParcelWriter.writeInt(parcel, 9, this.f42720i);
        SafeParcelWriter.writeString(parcel, 10, this.f42721j, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public b(a aVar) {
        this.f42712a = aVar.f42701a;
        this.f42713b = aVar.f42702b;
        this.f42714c = null;
        this.f42715d = aVar.f42703c;
        this.f42716e = aVar.f42704d;
        this.f42717f = aVar.f42705e;
        this.f42718g = aVar.f42706f;
        this.f42721j = null;
    }
}
