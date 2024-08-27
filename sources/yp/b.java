package yp;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.icing.zzbp;

/* loaded from: classes2.dex */
public final class b extends AbstractSafeParcelable {
    public static final Parcelable.Creator<b> CREATOR = new com.google.android.material.datepicker.a(6);

    /* renamed from: a, reason: collision with root package name */
    public final String f41793a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41794b;

    /* renamed from: c, reason: collision with root package name */
    public final String f41795c;

    /* renamed from: d, reason: collision with root package name */
    public final String f41796d;

    /* renamed from: e, reason: collision with root package name */
    public final a f41797e;

    /* renamed from: f, reason: collision with root package name */
    public final String f41798f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f41799g;

    public b(String str, String str2, String str3, String str4, a aVar, String str5, Bundle bundle) {
        this.f41793a = str;
        this.f41794b = str2;
        this.f41795c = str3;
        this.f41796d = str4;
        this.f41797e = aVar;
        this.f41798f = str5;
        if (bundle != null) {
            this.f41799g = bundle;
        } else {
            this.f41799g = Bundle.EMPTY;
        }
        ClassLoader classLoader = b.class.getClassLoader();
        zzbp.zza(classLoader);
        this.f41799g.setClassLoader(classLoader);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionImpl { { actionType: '");
        sb2.append(this.f41793a);
        sb2.append("' } { objectName: '");
        sb2.append(this.f41794b);
        sb2.append("' } { objectUrl: '");
        sb2.append(this.f41795c);
        sb2.append("' } ");
        String str = this.f41796d;
        if (str != null) {
            sb2.append("{ objectSameAs: '");
            sb2.append(str);
            sb2.append("' } ");
        }
        a aVar = this.f41797e;
        if (aVar != null) {
            sb2.append("{ metadata: '");
            sb2.append(aVar.toString());
            sb2.append("' } ");
        }
        String str2 = this.f41798f;
        if (str2 != null) {
            sb2.append("{ actionStatus: '");
            sb2.append(str2);
            sb2.append("' } ");
        }
        Bundle bundle = this.f41799g;
        if (!bundle.isEmpty()) {
            sb2.append("{ ");
            sb2.append(bundle);
            sb2.append(" } ");
        }
        sb2.append(UrlTreeKt.componentParamSuffix);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f41793a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f41794b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f41795c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f41796d, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f41797e, i10, false);
        SafeParcelWriter.writeString(parcel, 6, this.f41798f, false);
        SafeParcelWriter.writeBundle(parcel, 7, this.f41799g, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
