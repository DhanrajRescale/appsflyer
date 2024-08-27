package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1592a;

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.fragment.app.y0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, androidx.fragment.app.f1] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1592a) {
            case 0:
                return new c(parcel);
            case 1:
                return new d(parcel);
            case 2:
                ?? obj = new Object();
                obj.f1858a = parcel.readString();
                obj.f1859b = parcel.readInt();
                return obj;
            case 3:
                ?? obj2 = new Object();
                obj2.f1692e = null;
                obj2.f1693f = new ArrayList();
                obj2.f1694g = new ArrayList();
                obj2.f1688a = parcel.createStringArrayList();
                obj2.f1689b = parcel.createStringArrayList();
                obj2.f1690c = (c[]) parcel.createTypedArray(c.CREATOR);
                obj2.f1691d = parcel.readInt();
                obj2.f1692e = parcel.readString();
                obj2.f1693f = parcel.createStringArrayList();
                obj2.f1694g = parcel.createTypedArrayList(d.CREATOR);
                obj2.f1695h = parcel.createTypedArrayList(y0.CREATOR);
                return obj2;
            default:
                return new k1(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f1592a) {
            case 0:
                return new c[i10];
            case 1:
                return new d[i10];
            case 2:
                return new y0[i10];
            case 3:
                return new f1[i10];
            default:
                return new k1[i10];
        }
    }
}
