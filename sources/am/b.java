package am;

import android.os.Parcel;
import android.os.Parcelable;
import el.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import zi.j;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new j(23);

    /* renamed from: a, reason: collision with root package name */
    public final String f741a;

    /* renamed from: b, reason: collision with root package name */
    public final List f742b;

    /* renamed from: c, reason: collision with root package name */
    public final zl.b f743c;

    /* renamed from: d, reason: collision with root package name */
    public final int f744d;

    /* renamed from: e, reason: collision with root package name */
    public final int f745e;

    /* renamed from: f, reason: collision with root package name */
    public final String f746f;

    /* renamed from: g, reason: collision with root package name */
    public final String f747g;

    /* renamed from: h, reason: collision with root package name */
    public String f748h;

    /* renamed from: i, reason: collision with root package name */
    public final zp.b f749i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f750j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f751k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f752l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f753m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f754n;

    /* renamed from: o, reason: collision with root package name */
    public final zl.a f755o;

    public b(String str, ArrayList arrayList, zl.b bVar, int i10, int i11, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String str4, zp.b bVar2, zl.a aVar) {
        l.A("appName cannot be null", str, new Object[0]);
        this.f741a = str;
        l.A("providers cannot be null", arrayList, new Object[0]);
        this.f742b = Collections.unmodifiableList(arrayList);
        this.f743c = bVar;
        this.f744d = i10;
        this.f745e = i11;
        this.f746f = str2;
        this.f747g = str3;
        this.f750j = z10;
        this.f751k = z11;
        this.f752l = z12;
        this.f753m = z13;
        this.f754n = z14;
        this.f748h = str4;
        this.f749i = bVar2;
        this.f755o = aVar;
    }

    public final boolean a() {
        if (this.f743c == null && (this.f742b.size() != 1 || this.f753m)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f741a);
        parcel.writeTypedList(this.f742b);
        parcel.writeParcelable(this.f743c, i10);
        parcel.writeInt(this.f744d);
        parcel.writeInt(this.f745e);
        parcel.writeString(this.f746f);
        parcel.writeString(this.f747g);
        parcel.writeInt(this.f750j ? 1 : 0);
        parcel.writeInt(this.f751k ? 1 : 0);
        parcel.writeInt(this.f752l ? 1 : 0);
        parcel.writeInt(this.f753m ? 1 : 0);
        parcel.writeInt(this.f754n ? 1 : 0);
        parcel.writeString(this.f748h);
        parcel.writeParcelable(this.f749i, i10);
        parcel.writeParcelable(this.f755o, i10);
    }
}
