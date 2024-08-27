package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f1 implements Parcelable {
    public static final Parcelable.Creator<f1> CREATOR = new b(3);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f1688a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1689b;

    /* renamed from: c, reason: collision with root package name */
    public c[] f1690c;

    /* renamed from: d, reason: collision with root package name */
    public int f1691d;

    /* renamed from: e, reason: collision with root package name */
    public String f1692e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f1693f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f1694g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f1695h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f1688a);
        parcel.writeStringList(this.f1689b);
        parcel.writeTypedArray(this.f1690c, i10);
        parcel.writeInt(this.f1691d);
        parcel.writeString(this.f1692e);
        parcel.writeStringList(this.f1693f);
        parcel.writeTypedList(this.f1694g);
        parcel.writeTypedList(this.f1695h);
    }
}
