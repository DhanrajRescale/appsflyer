package xn;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import zi.j;

/* loaded from: classes2.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new j(28);

    /* renamed from: a, reason: collision with root package name */
    public int f40502a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f40503b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f40504c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f40505d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f40506e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f40507f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f40508g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f40509h;

    /* renamed from: l, reason: collision with root package name */
    public Locale f40513l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f40514m;

    /* renamed from: n, reason: collision with root package name */
    public int f40515n;

    /* renamed from: o, reason: collision with root package name */
    public int f40516o;

    /* renamed from: p, reason: collision with root package name */
    public Integer f40517p;

    /* renamed from: r, reason: collision with root package name */
    public Integer f40519r;

    /* renamed from: s, reason: collision with root package name */
    public Integer f40520s;

    /* renamed from: t, reason: collision with root package name */
    public Integer f40521t;

    /* renamed from: u, reason: collision with root package name */
    public Integer f40522u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f40523v;

    /* renamed from: w, reason: collision with root package name */
    public Integer f40524w;

    /* renamed from: i, reason: collision with root package name */
    public int f40510i = 255;

    /* renamed from: j, reason: collision with root package name */
    public int f40511j = -2;

    /* renamed from: k, reason: collision with root package name */
    public int f40512k = -2;

    /* renamed from: q, reason: collision with root package name */
    public Boolean f40518q = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String charSequence;
        parcel.writeInt(this.f40502a);
        parcel.writeSerializable(this.f40503b);
        parcel.writeSerializable(this.f40504c);
        parcel.writeSerializable(this.f40505d);
        parcel.writeSerializable(this.f40506e);
        parcel.writeSerializable(this.f40507f);
        parcel.writeSerializable(this.f40508g);
        parcel.writeSerializable(this.f40509h);
        parcel.writeInt(this.f40510i);
        parcel.writeInt(this.f40511j);
        parcel.writeInt(this.f40512k);
        CharSequence charSequence2 = this.f40514m;
        if (charSequence2 == null) {
            charSequence = null;
        } else {
            charSequence = charSequence2.toString();
        }
        parcel.writeString(charSequence);
        parcel.writeInt(this.f40515n);
        parcel.writeSerializable(this.f40517p);
        parcel.writeSerializable(this.f40519r);
        parcel.writeSerializable(this.f40520s);
        parcel.writeSerializable(this.f40521t);
        parcel.writeSerializable(this.f40522u);
        parcel.writeSerializable(this.f40523v);
        parcel.writeSerializable(this.f40524w);
        parcel.writeSerializable(this.f40518q);
        parcel.writeSerializable(this.f40513l);
    }
}
