package x7;

import android.os.Parcel;
import android.os.Parcelable;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import m.f3;

/* loaded from: classes.dex */
public final class g extends k4.b {
    public static final Parcelable.Creator<g> CREATOR = new f3(7);

    /* renamed from: c, reason: collision with root package name */
    public int f40087c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f40088d;

    /* renamed from: e, reason: collision with root package name */
    public final ClassLoader f40089e;

    public g(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? g.class.getClassLoader() : classLoader;
        this.f40087c = parcel.readInt();
        this.f40088d = parcel.readParcelable(classLoader);
        this.f40089e = classLoader;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" position=");
        return nn.d.m(sb2, this.f40087c, UrlTreeKt.componentParamSuffix);
    }

    @Override // k4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f22040a, i10);
        parcel.writeInt(this.f40087c);
        parcel.writeParcelable(this.f40088d, i10);
    }
}
