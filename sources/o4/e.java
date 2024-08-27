package o4;

import android.os.Parcel;
import android.os.Parcelable;
import m.f3;

/* loaded from: classes.dex */
public final class e extends k4.b {
    public static final Parcelable.Creator<e> CREATOR = new f3(5);

    /* renamed from: c, reason: collision with root package name */
    public int f29572c;

    /* renamed from: d, reason: collision with root package name */
    public int f29573d;

    /* renamed from: e, reason: collision with root package name */
    public int f29574e;

    /* renamed from: f, reason: collision with root package name */
    public int f29575f;

    /* renamed from: g, reason: collision with root package name */
    public int f29576g;

    public e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f29572c = 0;
        this.f29572c = parcel.readInt();
        this.f29573d = parcel.readInt();
        this.f29574e = parcel.readInt();
        this.f29575f = parcel.readInt();
        this.f29576g = parcel.readInt();
    }

    @Override // k4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f22040a, i10);
        parcel.writeInt(this.f29572c);
        parcel.writeInt(this.f29573d);
        parcel.writeInt(this.f29574e);
        parcel.writeInt(this.f29575f);
        parcel.writeInt(this.f29576g);
    }
}
