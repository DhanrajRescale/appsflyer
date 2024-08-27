package zp;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes2.dex */
public final class x extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<x> CREATOR = new com.google.android.material.datepicker.a(23);

    /* renamed from: a, reason: collision with root package name */
    public final String f42786a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42787b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f42788c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f42789d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri f42790e;

    public x(String str, String str2, boolean z10, boolean z11) {
        Uri parse;
        this.f42786a = str;
        this.f42787b = str2;
        this.f42788c = z10;
        this.f42789d = z11;
        if (TextUtils.isEmpty(str2)) {
            parse = null;
        } else {
            parse = Uri.parse(str2);
        }
        this.f42790e = parse;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f42786a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f42787b, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f42788c);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f42789d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
